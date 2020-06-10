### What does this maven plugin do?
This maven plugin helps to make a clone of the project in the specified module
#
#### Build project: 
clean install
#
#### after compilation add plugin in parent pom file
    <build>
        <plugins>
            <plugin>
                <groupId>org.my.clonator</groupId>
                <artifactId>clonator</artifactId>
                <version>1.0</version>
                <configuration>
                    <filePath>link de repository</filePath>
                    <urlRepo>modul where will be clone repository</urlRepo>
                    <gitUser>login repository</gitUser>
                    <gitPass>pass repository</gitPass>
                </configuration>
                <executions>
                    <execution>
                        <phase>package</phase>
                        <goals><goal>clonator</goal></goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
#
#### xml tags
   
    <urlRepo>link de repository</urlRepo>
    <filePath>modul where will be clone repository</filePath>
    <gitUser>login repository</gitUser>
    <gitPass>pass repository</gitPass>

