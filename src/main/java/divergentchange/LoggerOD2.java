package divergentchange;

import java.util.ArrayList;
import java.util.List;

public class LoggerOD2 {
    public List<String> log = new ArrayList<>();
    public void logInfo(String info) {
        log.add("INFO: " + info);
    }

    public void logWarning(String warning) {
        log.add("WARNING: " + warning);
    }

    public void logError(String error) {
        log.add("ERROR: " + error);
    }
}
