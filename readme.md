# How to start

#### Build project: 
select profiler 'default' and follow up clean install

#### after compilation add dependency
       
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


#### xml tags
   
    <urlRepo>link de repository</urlRepo>
    <filePath>modul where will be clone repository</filePath>
    <gitUser>login repository</gitUser>
    <gitPass>pass repository</gitPass>

