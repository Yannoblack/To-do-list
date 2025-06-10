# To-Do List Application

Cette application web permet aux utilisateurs de gérer leurs tâches à effectuer.

## Fonctionnalités

- Créer de nouvelles tâches
- Afficher la liste des tâches
- Marquer les tâches comme terminées
- Modifier les détails d'une tâche
- Supprimer des tâches

## Technologies utilisées

- Java 17 et Java 23
- Spring Boot 2.7.x
- Spring Data JPA
- Spring Web
- Lombok
- Swagger
- PostgreSQL
- Maven

## Installation et configuration

1. Clonez le dépôt Git :

https://github.com/Yannoblack/To-do-list.git


2. Ouvrez le projet dans votre IDE préféré (par exemple, IntelliJ IDEA ou Eclipse).

3. Configurez la connexion à la base de données PostgreSQL dans le fichier `application.properties` :

spring.application.name=to-do-list
server.port=8080
# Configuration de la base de données
spring.datasource.url=jdbc:postgresql://localhost:5432/Todolist
spring.datasource.username=postgres
spring.datasource.password=root

# Configuration de JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect


4. Construisez et exécutez l'application :


Ou, si vous utilisez Maven :

./mvnw clean install
./mvnw spring-boot:run


5. Accédez à l'application dans votre navigateur à l'adresse `http://localhost:8080/swagger-ui/index.html#/`pour explorer et tester les API de l'application..

task-controller


PUT
/api/tasks/{id}


DELETE
/api/tasks/{id}


GET
/api/tasks


POST
/api/tasks


GET
/api/tasks/status/{status}


## Licence

Ce projet est n'est pas sous licence.






