package divergentchange;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class OnDemandAgentServiceShould {
    @Test
    public void
    starting_a_new_VM_fill_host_an_IP_on_OnDemandAgent() {
        OnDemandAgentService onDemandAgentService = new OnDemandAgentService();
        onDemandAgentService.log = new ArrayList<>();
        onDemandAgentService.username = "admin";
        onDemandAgentService.password = "passw0rd";

        OnDemandAgent onDemandAgent = onDemandAgentService.startNewOnDemandMachine();

        assertThat(onDemandAgent.host, is(not("")));
        assertThat(onDemandAgent.ip, is(not(equalTo(""))));
    }
    
    @Test(expected = UnauthorizedAccessException.class)
    public void
    throws_not_authorized_if_invalid_credentials() {
        OnDemandAgentService onDemandAgentService = new OnDemandAgentService();
        onDemandAgentService.log = new ArrayList<>();
        onDemandAgentService.username = "";
        onDemandAgentService.password = "";

        onDemandAgentService.startNewOnDemandMachine();
    }
}
