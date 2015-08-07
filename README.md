# spring-boot-routing


This is a simple spring-boot project which helps you in getting started with the spring-boot and lets you understand on how to use spring-boot for any of your Spring application. 

The pom.xml has spring-boot-starter-web dependency listed, it helps in providing useful maven defaults such as deploying the app on tomcat server automatically withoug having to install it on your local machine. The app will be hosted on your localmachine at port 8080

Using spring-boot we can create stand alone Spring applications and helps in embedding tomcat and other useful defaults. Find more at http://projects.spring.io/spring-boot/

#Running this sample application
1. Clone this repo
2. cd into the cloned dir, Open terminal and run "mvn spring-boot:run", the app is now deployed on your local!
3. Open browser, go to http://localhost:8080/ for the first method to execute in the TestSpringBoot.java
4. go to your localhost:8080/query/helloWorld(http://localhost:8080/query/helloWorld "localhost"), to see the Spring's PathVariable coming into play.

Note: By default spring-boot-starter-web looks for deploying app on localhost at port 8080, make sure other servers which are running at this port are completely stopped before deploying the application.
