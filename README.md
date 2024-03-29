# Library 📚

## Introduction

In this repository is all the sources files of an REST API. I am using the [Supabase](https://supabase.com/) database. 

## Running it by yourself

To run it locally you need a database in Supabase. After create the project go to `Project settings` in the section of `Configuration` clic on `Database`and copy the connection string of `JDBC` in `Connection string`.

The connection string has this form `jdbc:postgresql://[HOST]:[PORT]/postgres?user=[USER]&password=[PASSWORD]`. Your `application.properties`, that is in `./src/main/resources/application.properties`, should looks like this one:

```properties
spring.application.name=library
spring.datasource.url=[REPLACE_JDBC_CONNECTION_STRING]
spring.datasource.username=postgres
spring.datasource.password=[YOUR_DB_PASSWORD]
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
```

Meanwhile, your dependencies group in `pom.xml` should to be this:

```xml
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-test</artifactId>
		<scope>test</scope>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>
	<dependency>
		<groupId>org.postgresql</groupId>
		<artifactId>postgresql</artifactId>
		<version>42.4.0</version>
	</dependency>
	<dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<optional>true</optional>
	</dependency>
	<dependency>
		<groupId>uk.co.jemos.podam</groupId>
		<artifactId>podam</artifactId>
		<version>7.2.7.RELEASE</version>
	</dependency>
	<dependency>
		<groupId>org.modelmapper</groupId>
		<artifactId>modelmapper</artifactId>
		<version>2.3.5</version>
	</dependency>
</dependencies>
```

To create the database schema copy the content of `./db/schema.sql`, go to Supabase web page and then, in your project, clic on `SQL Editor`, create a `New query` and paste the content of `schema.sql`. Finally, run it.

## Features

1. Connection to Supabase database.
2. Entities of the UML model.
3. Repositories for each entity.
4. Services for each entity, but not for the relations.
5. DTO and DetailDTO for each entity.

## Tasks

1. Fix UML model.
2. Add services for the relations.
3. Add authentication.

## Resources

1. [Mapping Objects to Relational Databases](https://agiledata.org/essays/mappingObjects.html)

