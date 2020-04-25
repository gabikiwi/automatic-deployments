In order to run this application
Make sure you have maven installed.
Import project in eclipse and in the root folder and perform the following steps:

1. mvn clean
2. mvn package
3. Deploy the war from the target folder to weblogic or tomcat
4. Optional you can use mvn install to deploy automatically on Tomcat running locally. Please check the root pom for goal deploy (first time) or redeploy 

For Tomcat server:
http://localhost:8080/sdmxregistry-jax-rs-mock/rest/application.wadl
http://localhost:8080/sdmxregistry-jax-rs-mock

For Weblogic server:
http://localhost:7001/sdmxregistry-jax-rs-mock/rest/application.wadl
http://localhost:7001/sdmxregistry-jax-rs-mock/rest/datastructure?references=test
