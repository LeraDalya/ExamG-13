package libs;

public class ConfigProvider {
    public static String getConfigValue(String key) {

        java.util.Properties properties = new java.util.Properties();
        try (java.io.InputStream input = new java.io.FileInputStream("config.properties")) {
            properties.load(input);
            return properties.getProperty(key);
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
