# mc-common-skeleton

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                https://maven.apache.org/xsd/settings-1.0.0.xsd">
    <profiles>
        <profile>
            <id>local-dev</id>
            <properties>
                <mc-common-plugin-output>Your path goes here</mc-common-plugin-output>
            </properties>
        </profile>
    </profiles>
    
    <activeProfiles>
        <activeProfile>local-dev</activeProfile>
    </activeProfiles>
  </settings>
  ```