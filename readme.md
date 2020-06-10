# How to start

### Build project: 
select profiler 'default' and follow up clean install

## Open application.properties
If you are starting local then:
1. take a look dosen't occupied local port -server.port=9010
2. add settings for database

    -spring.datasource.url=jdbc:postgresql://localhost:15432/datasets
    
    -spring.datasource.username=datasetsuser
    
    -spring.datasource.password=tYh3Nnd2dV
3. uncomment string -keycloak.realm-key

How to [port-forward](https://bass.netcracker.com/display/TA/DataBase) for database

## Start Spring Boot Application 
Main class: com.netcracker.automation.datamgmt.Main

## How to create dump on production and restore it to local DB
[Create and restore dump PostgeSQL](https://bass.netcracker.com/pages/viewpage.action?pageId=723191841)
