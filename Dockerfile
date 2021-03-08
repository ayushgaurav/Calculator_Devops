FROM openjdk:8
COPY ./target/Calculator-devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Calculator-devops-1.0-SNAPSHOT.jar", "Main"]