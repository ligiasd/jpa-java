## jpa-springboot-java

Checklist:  
- File -> New -> Spring Starter Project  
Maven  
Java 11  
Packing JAR  
Dependencies: Spring Web Starter  

- User entity and resource  
Basic entity checklist:  
Basic attributes  
Associations (instantiate collections)  
Constructors  
Getters & Setters (collections: only get)  
hashCode & equals  
Serializable  

- H2 database, test profile, JPA   
JPA & H2 dependencies  
application.properties  
application-test.properties  
Entity: JPA mapping

- Postgres database, Prod profile, JPA  
Heroku Deploy  
application.properties  
application-prod.properties   

- API Heroku https://workshop-sb.herokuapp.com/
endpoints(crud): /users, /categories, /orders, /products
body to Postman test:
/users(post)  
{  
 "name": "Lidi Brown",  
 "email": "lidi@gmail.com",  
 "phone": "977557755",  
 "password": "123456"  
}  
