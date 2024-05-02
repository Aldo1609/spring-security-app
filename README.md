
# Spring Security App


This is a demo project using Spring Security and JWT.

There is a 3 endpoints:

- /auth/login ( This endpoint dont need protection )
- /auth/register ( This endpoint dont need protection )
- /all ( This endpoint is protected and requiere a Bearer Token )








## Requirements

📏 JDK 17

📏 Springboot 3.0

📏 OpenSSL





## References

```bash
Method: POST

  http://localhost:8080/auth/register

Body:

{
    "firstName": "lorem",
    "lastName": "lorem",
    "email": "lorem@gmail.com",
    "password": "#Contraseña1234"
}

Response: "User created successfully!"


```

```bash
Method: POST

http://localhost:8080/auth/login

Body:

{
    "email": "lorem@gmail.com",
    "password": "#Contraseña1234"
}

Response: "jwt": "encrypted_key"

```

```bash
Method: GET

http://localhost:8080/users/all

Authorization:
    Type: Bearer Token
    Token: "The token given by endpoint /auth/login"

```



