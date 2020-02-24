# SpringBoot-OAUTH2-Example
## BASE URL
  - [Heroku](https://oauth-apps.herokuapp.com/)

## DEPLOY
  - Heroku
  
## Documentation
  - [Postman](https://documenter.getpostman.com/view/6149286/SzKVRHx3?version=latest) 

## What is OAUTH2
OAuth 2 is an authorization framework that enables applications to obtain limited access to user accounts on an HTTP service, 
such as Facebook, GitHub, and DigitalOcean. It works by delegating user authentication to the service that hosts the user account, 
and authorizing third-party applications to access the user account. OAuth 2 provides authorization flows for web and desktop applications, and mobile devices.

## Generate AuthToken
In the header we have username and password as Authorization header.
As per Oauth2 specification, Access token request should use application/x-www-form-urlencoded.Following is the setup.
  - Select Authorization -> Change type to <b>Basic Auth</b>
  - set username = client
  - set password = $2a$04$ABvLmB1zanHA0wEhrDVqqejmNgWWSR4BPG4xxNcUb/.b5xf9t81vm
<img src="https://github.com/ddiffa/SpringBoot-OAUTH2-Example/blob/master/screenshot/header.png"
width="100%">&nbsp;&nbsp;&nbsp;
  - After that, select Body -> use application/x-www-form-urlencoded -> Fill in the key and value as shown below.
<img align="center" src="https://github.com/ddiffa/SpringBoot-OAUTH2-Example/blob/master/screenshot/oauth.png"
width="100%">&nbsp;&nbsp;&nbsp;
  - You can use `access_token` for accessing resources and Using `refresh_token` to refresh the token.
  Usually, the token expiry time is very less in case of oAuth2 and you can use following API to refresh token once it is expired.
Following is the setup :
<p align="center"> <img align="center" src="https://github.com/ddiffa/SpringBoot-OAUTH2-Example/blob/master/screenshot/refresh.png"
width="100%">&nbsp;&nbsp;&nbsp; </p>
