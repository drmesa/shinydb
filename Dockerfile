FROM openjdk:16
ADD ./target/shinydb-0.0.1-SNAPSHOT.jar /usr/src/shinydb-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005,server=y,suspend=n
ENTRYPOINT ["java", "-jar", "shinydb-0.0.1-SNAPSHOT.jar"]
