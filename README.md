# Sécurité une application Spring Boot avec OAuth2 
![ban-app schema](schema.PNG)

## Les modules : 

- customer-front-thymeleaf-app : Une application front-end - server
- inventory-service : web service avec Spring Boot & Spring Security
- keycloak-23.0.1 : Keycloak

## Les technologies utilisées : 

  - Spring Boot
  - JPA / Hibernate
  - H2 database
  - Lombok
  - Spring Security
  - RestClient : pour faire le communication entre le front et le back

## Démarrer l'application

  - Démarrer Keycloak : dans /bin execute : kc.bat start-dev
  - faire les configurations keycloak
  - démarrer le back et le front
