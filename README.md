# spring-boot-routing


This project which helps you in getting started with the Spring Boot and lets you understand on how to develop a spring boot based web app. 

The pom.xml has spring-boot-starter-web dependency listed, it helps in providing useful maven defaults such as deploying the app on tomcat server automatically withoug having to install it on your local machine. The app once deployed will be hosted on your localmachine at port 8080

Spring Boot is the next-gen process that helps in setting up spring with ease. Using Spring Boot we can create stand alone Spring applications and helps in embedding tomcat and other useful defaults. Find more at http://projects.spring.io/spring-boot/

#Running this sample application
1. Clone this repo
2. cd into the cloned dir, Open terminal and run "mvn spring-boot:run", the app is now deployed on your local!
3. Open browser, go to http://localhost:8080/ for the first method to execute in the TestSpringBoot.java
4. go to http://localhost:8080/query/helloWorld, to see the Spring's PathVariable coming into play.

Note: By default spring-boot-starter-web looks for deploying app on localhost at port 8080, make sure other servers which are running at this port are completely stopped before deploying the application.

#Description of Annotations used for Spring Boot applications
Following Spring Annotations are used in Spring Boot projects

####@Controller vs @RestController
The controller in spring boot is RestController. Previously we used to use @Controller which implies to expose http end points and we had to anotate every single method with @ResponseBody = serialize the response that this method returns but with  @RestController it means it does something that is very specific and we can also now avoid writing @ResponseBody for every method.

### RequestMapping
This helps in providing routing information. For example in TestSpringBoot.java the "/" route will redirect to show the functionality of 'helloWorld()' and similarly the route "/query/{anyvalue}" will redirect to show the functionality of 'userText()'.

###RestController
The RestController in Spring Boot helps to render the result string directly to the caller method.

###EnableAutoConfiguration
This annotation will help Spring Boot to understand the needs of the project. This helps in setting up the configuration  automatically specified for this project. For example "spring-boot-starter-web" is interpreted as the project is a web application and thus auto configures the tomcat server and deploys the application.

####Note: If we don't specify the annotation EnableAutoConfiguration, while trying to run the app at 'mvn spring-boot:run' it throws up WebAppContextError (= cannot retrieve any project config)

#Other Descriptions
###SpringApplication.run(Classname.class, args)
SpringApplication.run will help in boostrapping the application. This starts the spring and also tomcat webserver (for this project).
###mvn spring-boot:run
this command helps in running the app (deploy)

####Executable jar/ war file -  useful for prod environment
Executable jar/war files contain compiled classes and all dependecies required for the application. Creating an executable jar/ war file will be useful when trying to deploy to any cloud platform.
For the application that we have just created, add spring-boot-maven-plugin dependecy to pom thereby making the app to be distributed across any environment.
