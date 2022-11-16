FROM openjdk
WORKDIR usr/lib
ADD ./target/demoC14-0.0.1-SNAPSHOT.jar /usr/lib/demoC14-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demoC14-0.0.1-SNAPSHOT.jar"]