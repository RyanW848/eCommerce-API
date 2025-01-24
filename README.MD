# eCommerce API

A RESTful API for managing an eCommerce platform, built with **Spring Boot** and **PostgreSQL**. This project supports customer orders, user authentication, and role-based access control.

## Features

- **User Management**: Register, login, and manage users with `USER` and `ADMIN` roles.
- **Product Management**: Create, read, update, and delete products.
- **Order Management**: Place and manage customer orders.
- **Authentication**: Secure endpoints with JWT authentication.
- **Role-Based Access Control**: Restrict access to admin-only and user-specific features.


## Getting Started

### Prerequisites

- **Java 17** or higher
- **PostgreSQL** installed and configured
- **Maven** for dependency management
- **Docker** to access database
- **Postman** or similar API testing tool (optional)

### Installation and Setup

1. Clone the repository:
   ```
   git clone https://github.com/RyanW848/eCommerce-API.git
   cd eCommerce-API
   ```

2. Navigate to resources and add `application.properties`:
   ```
   cd src/main/resources
   touch application.properties
   ```

3. Configure `application.properties`
   ```
   spring.application.name=eCommerce API
   
   spring.datasource.url=jdbc:postgresql://localhost:5432/[database_name]
   spring.datasource.username=[username]
   spring.datasource.password=[password]
   spring.datasource.driver-class-name=org.postgresql.Driver
  
   spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
   spring.jpa.show-sql=true
   spring.jpa.hibernate.ddl-auto=update
  
   spring.main.allow-bean-definition-overriding=true
  
   jwt.secret=[jwt_secret]
   jwt.expiration=[jwt_expiration]
  
   spring.mail.host=sandbox.smtp.mailtrap.io
   spring.mail.port=2525
   spring.mail.username=[email_username]
   spring.mail.password=[email_password]
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true
  
   server.port=8080
   ```

### Running the program

1. Navigate to `src/main/java/com/ecommerceapi`
   ```
   cd src/main/java/com/ecommerceapi
   ```

2. Run `ECommerceApiApplication.java`

### License

This project is licensed under the MIT License. See the [LICENSE](https://github.com/RyanW848/eCommerce-API/blob/main/LICENSE) file for details.
