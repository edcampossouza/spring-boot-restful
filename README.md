# RESTful Web Services

- Retrieve all Users    
    ```
    GET     /users
    ```
- Create a User      
    ```   
    POST    /user
    ```
- Retrieve one Users    
    ```
    GET     /users/{id}
    ```
- Delete a User        
    ``` 
    DELETE  /users/{id}
    ```

- Retrieve all Posts for a User
    ```
    GET /users/{id}/posts
    ```
- Create a Post for a User
    ```
    POST /users/{id}/posts
    ```
- Get details of a Post
    ```
    GET /users/{user_id}/posts/{post_id}
    ```