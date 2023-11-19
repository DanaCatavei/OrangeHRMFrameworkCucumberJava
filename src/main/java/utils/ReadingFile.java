package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingFile {
    public static Properties file() throws IOException {
        Properties properties = new Properties();
        properties.load(fileReader("C:\\_DANA\\QA Engineer\\IdeaProjects\\OrangeHRMFrameworkCucumberJava\\src\\test\\resources\\properties\\config.properties"));
        return properties;
    }
    public static FileReader fileReader(String path) throws FileNotFoundException {
        return new FileReader(path);
    }
}

