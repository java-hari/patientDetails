#
# Build stage
#
FROM eclipse-temurin:17-jdk
WORKDIR /hospital
COPY . .
RUN chmod +x mvnw | true 
RUN ./mvn clean package -DskipTests


# ENV PORT=8080
EXPOSE 8080
CMD ["java","-jar","/target/hospital-0.0.1-SNAPSHOT.jar"]