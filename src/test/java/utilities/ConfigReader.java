package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    static {
        try{
          String path = "src/test/resources/configurations.properties";// даем путь к нашему файлу
            FileInputStream inputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty (String key){
        return properties.getProperty(key).trim();

    }

}
