## Sandbox Project - Lockpicking

### Technical Goal
Technical goal of the project is to try some architectural patterns in Java.
Especially facades, interfaces, DTO and decoupling.

The idea is to build everything with real RESTful APIs and connect them, in a later phase, with a frontend framework.
The whole communication should base on REST calls and RESTful patterns, mean no hardcoded URI or similiar.

I try to decouple all components. I want to achieve that frontend and backend can coexist without knowing each other.
Concluding, it doesn't care the service if it's called by a frontend/UI or another service

In detail, I also don't want strong dependencies. 
E.g. the REST controller should be call the business logic but the business logic should not care if there is a controller in place.
Similar for the data model. The entity objects should not interact with the business logic.
The business logic should just use DTO to perform action. 
With this approach, I can change the API layer or data layer in future without having to change the business logic.

### Known flats of the data structure
- I decided to use flat files (json) instead of e.g. a h2 database
- That's not a scalable approach but the business rules should be agnostic to database or GUI
- Because of not using h2, I have to generate the hypertext by myself

### User Story 
The idea is to build a simple app to create and read records which represents locks. 
As somebody doing lockpicking as a hobby, you will deal with a lot of locks while practicing.
The goal is to safe each lock you opened in a simple way. 
In addition, you want to retrieve the locks and get some saved attributes like number of pins or type of lock. 


### Todo
- Software Architecture Diagram to ReadMe
- Unit Tests
- Endpoint for reading single item
- Endpoint for delete single item
- Mock Interface for testing

### Ideas for future development
- Multi-tenancy feature with login
- oAuth / FIDO authentication
- React frontend