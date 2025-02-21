# Java-springboot-refresher
# Use H2 database instead of MySQL
spring.datasource.url=jdbc:h2:mem:nobsV2
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# Enable H2 console for debugging (optional)
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Hibernate properties
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Replace this:

<dependency>
<groupId>com.mysql</groupId>
<artifactId>mysql-connector-j</artifactId>
<version>8.4.0</version>
</dependency>

With this (for in-memory database H2):

<dependency>
<groupId>com.h2database</groupId>
<artifactId>h2</artifactId>
<scope>runtime</scope>
</dependency>



Configure Hibernate in application.properties
Since you are using Hibernate, update your database configuration to work with H2 instead of MySQL.

Modify your application.properties like this:
properties
Copy
Edit
# Use H2 database instead of MySQL
spring.datasource.url=jdbc:h2:mem:nobsV2
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# Enable H2 console for debugging (optional)
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Hibernate properties
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Note:

spring.jpa.hibernate.ddl-auto=update → Automatically updates the schema based on entity changes.
spring.jpa.show-sql=true → Logs SQL queries executed by Hibernate.
spring.h2.console.enabled=true → Enables the H2 web console at /h2-console.
