# Google Sign-In using OAuth Client

## Reference
* [OAuth2 Google Sign In using Spring Boot | YouTube](https://www.youtube.com/watch?v=qcz2jBLNOtc)
* [Google Cloud Console](https://console.cloud.google.com/)

## Tech Stack / Dependencies
* Java 17
* Spring Boot 3.x
* spring-boot-starter-oauth2-client

## Google Sign-in Demo App using Spring Boot
* Go to [Google Cloud Console](https://console.cloud.google.com/) >> APIs & Services >> Credentials (via Navigation menu)
* Click Create Credentials link >> OAuth Client ID. Enter below details.
    * Application type: Web application
    * Name: demo-app
    * URIs: http://localhost:8080
    * Authorized redirect URIs: http://localhost:8080/login/oauth2/code/google
    * Click Create button
* Once the client is created, you'll get client_id and client_secret data. You'll need to mention this in application properties (or .yml) file.

### Google Sign-In Demo App - Endpoints
* http://localhost:8080/oauth-google/welcome
* http://localhost:8080/oauth-google/user

### Google Sign-In Demo App - Screenshots
* <img src="https://github.com/navrwork/spring-security/assets/149756645/b630ad1a-aca6-4733-bea6-a5d25529f6b2" height="240" width="720" />
* <img src="https://github.com/navrwork/spring-security/assets/149756645/f1768918-8c3f-4f02-a1a8-d58625f3ee7c" height="120" width="720" />
* <img src="https://github.com/navrwork/spring-security/assets/149756645/1eb88386-16a3-4ddf-9983-451ac7ba8338" height="360" width="720" />



