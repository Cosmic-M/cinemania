# cinemania

<h3>Project descriptions:</h3>
Here's a simple, however, smart app which can imitate some serious project responded on ticket 
distribution or something. The idea is to bind some different classes (or entities in our cases)
and demonstrate how it can be getting on together, interacting with DB.  Since it's managed by 
hibernate framework it can be useful for self-educational goals, because it touches all possible 
relations with entities. So,... don't judge strictly.

<h3>All features:</h3>
- storing information about users, order's history, available tickets or cinema halls<br>
- authentication option supported<br>
- flexible interface: you may add new entities from all available classes as much as you like<br>
- ability to use real schedule because we apply LocalDateTime<br>
- authorization on service layer (you can't create any shopping cart before registration)<br>

<h3>In this APP were used such technologies like:</h3>
- java, version 11<br>
- org.apache.maven, version 3.8.0<br>
- org.hibernate - 5.4.24.Final<br>
- hibernate-entity-manager v. 5.4.21.Final<br>
- jdbc (mysql-connector-java version 8.0.29)<br>
- annotations<br>
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
- MySQL - must have installed (workbench will come in handy). After installing don't forget to create a schema
(init.db file is waiting for you in resource directory)<br>
- While creating a connection in mySQL, configure port (3307 by default).
However, you can change it in hibernate.cfg.xml file<br>
- Launching can be done using the IDE. The main method - is your working area. push Run -> enjoy
