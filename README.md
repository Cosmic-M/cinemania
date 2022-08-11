# cinemania

<h3>Project descriptions:</h3>
Here's a simple, however, smart app which can imitate some serious project responded on ticket 
distribution. The idea is to bind some different classes (or entities in our cases) and demonstrate 
how it can be getting on together, interacting with DB and managed by spring.  The main feature of 
this APP is to delegate roles, in other words who will be responsible for what. Security Spring 
concept was implemented to resolve this task. Strictly speaking, admin and users will have their 
own interface for managing and resolve their tasks.

<h3>All features:</h3>
- storing information about users, order's history, available tickets or cinema halls<br>
- authentication option supported<br>
- authorization option supported by spring security<br>
- flexible interface: you may add new entities from all available classes as much as you like<br>
- ability to use real schedule because we apply LocalDateTime<br>
- flexible exception report on front end if such necessity arise (implemented by ResponseEntityExceptionHandler)<br>
- protection against the fool while try to send invalid data (God bless javax.validation.constraints)<br>

<h3>In this APP were used such technologies like:</h3>
- java, version 11<br>
- org.apache.maven, version 3.8.0<br>
- org.hibernate - 5.6.10.Final<br>
- spring version 5.3.22<br>
- spring security version 5.5.0<br>
- jdbc (mysql-connector-java version 8.0.29)<br>
- javax.annotation<br>
- three-tier architecture<br>
- checkstyle.plugin.version - 3.1.1<br>
- HQL

<h3>DataBase structure:</h3>
<img alt="hibernate_schema.png" height="500" src="hibernate_schema.png" width="850"/>

<h3>Instructions for assembling and running the application:</h3>
- To build the application, you need to install JDK and Maven<br>
- For the full functioning of java applications, you must specify the path to each of the installed
  components to the system. For Windows: The Path system variable must contain the path to the Java and
  Maven programs (to the bin folders).<br>
- MySQL - must have installed (workbench will come in handy).<br>
- While creating a connection to mySQL, configure port (3307 by default) and fetch password in db.properties.<br>
- Tomcat up to 10 version - must have!<br>
- Launching can be done using the IDE. All requests by browser or Postman.<br>
- Here's basic endpoints to ease your life at the beginning:<br>
  FOR ADMIN:<br>
  POST: /cinema-halls<br>
  POST: /cinema-halls<br>
  POST: /movies<br>
  POST: /movie-sessions<br>
  PUT: /movie-sessions/{id}<br>
  DELETE: /movie-sessions/{id}<br>
  GET: /users/by-email<br>

  FOR USERS:<br>
  GET: /orders<br>
  POST: /orders/complete<br>
  PUT: /shopping-carts/movie-sessions<br>
  GET: /shopping-carts/by-user<br>

  FOR BOTH ROLES:<br>
  GET: /cinema-halls<br>
  GET: /movies<br>
  GET: /movie-sessions/available<br>
  
  FOR NON AUTHENTICATED CUSTOMERS:<br>
  POST: /register<br>
