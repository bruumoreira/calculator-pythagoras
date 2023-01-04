FROM maven:3.8.3-openjdk-17-slim
ENV TZ America/Sao_Paulo
ENV LANG pt_BR.UTF-8
ENV LANGUAGE pt_BR.UTF-8
ENV LC_ALL pt_BR.UTF-8
ENV JAVA_TOOL_OPTIONS -Dfile.encoding=UTF8

COPY pom.xml .
COPY src src
RUN mvn clean install
WORKDIR /target

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "api-calculator-pythagoras.jar"]

