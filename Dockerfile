FROM adoptopenjdk/openjdk11:alpine

COPY target/ms-servico-1.jar ms-servico.jar
ENTRYPOINT ["java","-jar","/ms-servico.jar"]

EXPOSE 8090