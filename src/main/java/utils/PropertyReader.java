package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader
{
    private Properties prop;

    public PropertyReader () throws IOException {   loadAllProperties(); }

    public void loadAllProperties() throws IOException {
        prop = new Properties();
        String filePath =System.getProperty("user.dir")+"/src/main/java/resources/config.properties";
        prop.load(new FileInputStream(filePath));
    }

    public String readProperty(String propertyName)
    {
        return prop.getProperty(propertyName);
    }
}
