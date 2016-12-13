import org.apache.commons.io.FileUtils;
import org.apache.commons.io.output.StringBuilderWriter;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {

    String filename;

    public void logEvent(Event event) {
        FileUtils.writeStringToFile(File file, String str, boolean append);
    }

    public void init() throws IOException {
        this.file = new File(fileName);

    }
}
