# Rest Demo Application

## Getting Started

1. (Optional) Install [Docker](https://www.docker.com/) (do it, you'll be better off!) 
1. Copy the `src/main/resources/application-local.yml.template` to `src/main/resources/application-local.yml`
1. Start database
    1. If using Docker run ``docker-compose up -d``
    1. Otherwise start instance of MySQL, depending on how it was installed.
        1. There must be a database called "rest_demo" created and changes made to the spring.datasource properties (url, username, password) in your `application-local.yml` file
        1. Don't forget to update any settings you change in the src/main/resources/liquibase.properties file!  
1. Start the application 
	1. Command Line: `./mvnw`
	1. Eclipse - Right Click on project -> Run As -> Spring Boot App
	
1. Navigate to http://localhost:8080/



