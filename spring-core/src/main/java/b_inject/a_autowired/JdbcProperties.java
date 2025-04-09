package b_inject.a_autowired;

import java.util.Properties;

public class JdbcProperties {

    private Properties properties;

    public JdbcProperties(Properties properties) {
        this.properties = properties;
    }

    public void setProperties(String key, String value) {
        this.properties.setProperty(key, value);
    }

    @Override
    public String toString() {
        return "JdbcProperties{" +
            "properties=" + properties +
            '}';
    }
}
