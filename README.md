#Introduction
The Dropwizard example application was developed to, as its name implies, provide examples of some of the features present in Dropwizard.The reference is :http://www.dropwizard.io/0.9.1/docs/getting-started.html

#Overview
The structure is showed in the project

#Running The Application
To test the example application run the following commands.

- To package the example run.

mvn package
- To run the server run.

java -jar target/Helloworld-0.0.1-SNAPSHOT.jar server hello-world.yml
- To hit the Hello World example (hit refresh a few times).

http://localhost:8080/hello-world
http://localhost:8080/hello-world?name=ada 
