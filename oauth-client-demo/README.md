# Sign-In using OAuth Client

## Tech Stack / Dependencies
* Java 17
* Spring Boot 3.x
* spring-boot-starter-oauth2-client

## Reference
* [OAuth2 Google Sign In using Spring Boot | YouTube](https://www.youtube.com/watch?v=qcz2jBLNOtc)
* [Google Cloud Console](https://console.cloud.google.com/)
* [Rotating your client secrets | google.com ](https://support.google.com/cloud/answer/6158849?authuser=1&hl=en-GB#rotate-client-secret)
* [Implementing the Oauth 2.0 using Jakarta EE | baeldung.com](https://www.baeldung.com/java-ee-oauth2-implementation)
* [Sign-In with LinkedIn using OpenID Connect | microsoft.com](https://learn.microsoft.com/en-us/linkedin/consumer/integrations/self-serve/sign-in-with-linkedin-v2)
* [Sign-In with LinkedIn - Step by Step | dev.to](https://dev.to/fardinabir/fetching-linkedin-user-data-and-sign-in-with-linkedin-using-openid-connect-3kf)
* [Authenticate Users With LinkedIn OAuth | stateful.com](https://stateful.com/blog/linkedin-oauth)
* [Authorization Code Flow | microsoft.com ](https://learn.microsoft.com/en-us/linkedin/shared/authentication/authorization-code-flow)

## #1 Google OAuth2 Sign-In
* Go to [Google Cloud Console](https://console.cloud.google.com/) >> APIs & Services >> Credentials (via Navigation menu)
* Click Create Credentials link >> OAuth Client ID. Enter below details.
    * Application type: Web application
    * Name: demo-app
    * URIs: http://localhost:8080
    * Authorized redirect URIs: http://localhost:8080/login/oauth2/code/google
    * Click Create button
* Once the client is created, you'll get client_id and client_secret data. You'll need to mention this in application properties (or .yml) file.

### Auth Flow for Google Sign-In Demo App
* Access 3rd party app: http://localhost:8080/oauth-client-demo/welcome
* User selects Google Sign-In option and then selects a specific Google user account.
* Consent screen is then displayed for the user to review and approve the permissions.
  * Request URL for Auth code below: <br/> 
     https://accounts.google.com/o/oauth2/v2/auth? <br/>
     response_type=code& <br/>
     client_id=dummy_client_id.apps.googleusercontent.com& <br/>
     redirect_uri=http://localhost:8080/login/oauth2/code/google& <br/>
     scope=openid%20profile%20email& <br/>
     state=jRBrDySmrHl6p_HLo-cIOeu7XNkvWg8j9_IVdsbCK04%3D& <br/>
     nonce=DHQGiy2TNdgjZGOu9DYqZBaHsSKI3DGByx_ueQFjSm8
  * Request URL parameters explained:
    * response_type=code: This tells the server that you're doing the authorization code flow.
    * client_id: Add your client ID to tell the OAuth server which app is making this request.
    * redirect_uri: It has to match one of the redirect URLs you added when you registered the app.
    * scope: You'll need to find the scope values to request based on the API that you're trying to access.
    * state: The state parameter was originally used for CSRF protection, but PKCE provides that protection as well, so you can use it for storing application specific state now, such as which page to redirect the user to after they log in, like cart or checkout. This is only safe to use this way if you are sure the OAuth server supports PKCE. If the server doesn't support PKCE, then you will need to make this a random value.
    * code_challenge: Hash of the code verifier (for PKCE supported auth server)
    * code_challenge_method: S256 for SHA256 (for PKCE supported auth server)
* Once the Consent is approved, access token request is made to the Auth server.
  * Request for Access Token --> http://localhost:8080/login/oauth2/code/google?state=jRBrDySmrHl6p_HLo-cIOeu7XNkvWg8j9_IVdsbCK04%3D&code=4/0AcvDMrARf5W4r1BsIcBEbX-978ZCSdSEW3P6703x5mwUbQqbN44Rs-nLZYafIwPbeHTABg&scope=email%20profile%20openid%20https://www.googleapis.com/auth/userinfo.profile%20https://www.googleapis.com/auth/userinfo.email&authuser=1&prompt=consent
* User agent is then redirected to the original page.
  * http://localhost:8080/oauth-client-demo/welcome?continue
* Note: This is the authorised redirect uri configured in [Google Cloud Console](https://console.cloud.google.com/): http://localhost:8080/login/oauth2/code/google

## #2 LinkedIn OAuth2 Sign-In
### Authorization Code Flow | LinkedIn
<img src="https://learn.microsoft.com/en-us/linkedin/media/oauth-3-legged-flow_highres.png" height="360" width="640" />


## OAuth Sign-In Demo App

### Demo App - Endpoints
* http://localhost:8080/oauth-client-demo/welcome
* http://localhost:8080/oauth-client-demo/user

### Demo App - Screenshots
* <img src="https://github.com/navrwork/spring-security/assets/149756645/b630ad1a-aca6-4733-bea6-a5d25529f6b2" height="240" width="640" />
* <img src="https://github.com/navrwork/spring-security/assets/149756645/f1768918-8c3f-4f02-a1a8-d58625f3ee7c" height="120" width="640" />
* <img src="https://github.com/navrwork/spring-security/assets/149756645/1eb88386-16a3-4ddf-9983-451ac7ba8338" height="360" width="640" />
