FROM openjdk:8-jdk-alpine

VOLUME /tmp
ARG DEPENDENCY=target/dependency
ARG PROFILE=${ENVIRONMENT}
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","wei.springframework.cloud.config.KubernetesConfigExampleApplication"]