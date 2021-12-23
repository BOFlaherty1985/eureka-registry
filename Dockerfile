FROM openjdk:11
MAINTAINER Benjamin OFlaherty
COPY /build/libs/eureka-registry-0.0.1-SNAPSHOT.jar eureka-registry.jar
ENTRYPOINT ["java","-jar","/eureka-registry.jar"]