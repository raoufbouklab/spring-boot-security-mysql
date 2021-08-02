FROM openjdk:11

VOLUME /tmp

EXPOSE 8082

ADD target/spring-security-rest-api.jar spring-security-rest-api.jar

ENTRYPOINT ["java", "-jar", "spring-security-rest-api.jar"]