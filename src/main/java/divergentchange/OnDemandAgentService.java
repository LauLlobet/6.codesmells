package divergentchange;

public class OnDemandAgentService {

    public UserOD2 user;
    public LoggerOD2 logger = new LoggerOD2();

    public OnDemandAgent startNewOnDemandMachine(String username, String password) {
        logger.logInfo("Starting on-demand agent startup logic");
        try {
            return tryToGetUserAndCreateServiceAndNotifyViaEmail(username,password);
        } catch (UnauthorizedAccessException e) {
            logger.logError("Exception in on-demand agent creation logic");
            throw e;
        }
    }

    private OnDemandAgent tryToGetUserAndCreateServiceAndNotifyViaEmail(String username, String password) {
        user = getUserFrom(username,password);
        return sendEmailAndReturnAgent();
    }

    public UserOD2 getUserFrom(String username, String password) {
        UserOD2 user = UserService.getUser(username,password);
        logger.logInfo(String.format("User %s will attempt to start a new on-demand agent.", username));
        return user;
    }

    private OnDemandAgent sendEmailAndReturnAgent() {
        OnDemandAgent agent = startNewAmazonServer();
        EmailSender.sendEmailToAdmin(String.format("User %s has successfully started a machine with ip %s.", user.getUsername(), agent.ip));
        return agent;
    }


    private OnDemandAgent startNewAmazonServer() {
        // Call Amazon API and start a new EC2 instance, implementation omitted
        OnDemandAgent amazonAgent = new OnDemandAgent();
        amazonAgent.host = "usweav-ec2.mycompany.local";
        amazonAgent.ip = "54.653.234.23";
        amazonAgent.imageId = "ami-784930";

        return amazonAgent;
    }
}
