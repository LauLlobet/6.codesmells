package divergentchange;

import java.util.List;

public class OnDemandAgentService {
    public List<String> log;
    public String username;
    public String password;

    public OnDemandAgent startNewOnDemandMachine() {
        logInfo("Starting on-demand agent startup logic");

        try {
            if (isAuthorized(username, password)) {
                logInfo(String.format("User %s will attempt to start a new on-demand agent.", username));
                OnDemandAgent agent = startNewAmazonServer();
                sendEmailToAdmin(String.format("User %s has successfully started a machine with ip %s.", username, agent.ip));

                return agent;
            }

            logWarning(String.format("User %s attempted to start a new on-demand agent.", username));
            throw new UnauthorizedAccessException("Unauthorized access to StartNewOnDemandMachine method.");
        } catch (UnauthorizedAccessException e) {
            logError("Exception in on-demand agent creation logic");
            throw e;
        }
    }

    private void sendEmailToAdmin(String format) {
        String emailHost = "email.mycompany.com";
        String recipient = "admin@mycompany.com";

        // actual email sending implementation omitted
    }

    private OnDemandAgent startNewAmazonServer() {
        // Call Amazon API and start a new EC2 instance, implementation omitted
        OnDemandAgent amazonAgent = new OnDemandAgent();
        amazonAgent.host = "usweav-ec2.mycompany.local";
        amazonAgent.ip = "54.653.234.23";
        amazonAgent.imageId = "ami-784930";

        return amazonAgent;
    }

    private boolean isAuthorized(String username, String password) {
        return username.equals("admin") && password.equals("passw0rd");
    }

    private void logInfo(String info) {
        log.add("INFO: " + info);
    }

    private void logWarning(String warning) {
        log.add("WARNING: " + warning);
    }

    private void logError(String error) {
        log.add("ERROR: " + error);
    }
}
