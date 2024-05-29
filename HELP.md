# Help Guide for JpsOwnStarted

This is the title of the help guide. It indicates that this document is meant to provide help for the `JpsOwnStarted`
project.

## Understanding the Code

This section provides a brief overview of the main classes in the project and how they interact with each other.

1. `JsonPlaceholderServiceConfiguration`: This class is responsible for setting up the configuration for the REST client
   that will be used to communicate with the REST API. It defines two beans: `jsonPlaceHolderRestClient`
   and `jpsTodoClient`. The `jsonPlaceHolderRestClient` bean is an instance of `RestClient` configured with the base URL
   of the REST API. The `jpsTodoClient` bean is an instance of `JpsTodoClient` which uses the `RestClient` to
   communicate with the REST API.

2. `Todo`: This is a record class that represents a Todo item. It has four fields: `userId`, `id`, `title`,
   and `completed`. This class is used to map the JSON response from the REST API to a Java object.

3. `JpsTodoClient`: This class is responsible for making HTTP requests to the REST API. It uses the `RestClient` to send
   HTTP requests and handles the responses. It has methods for all the CRUD
   operations: `findAll()`, `findById()`, `create()`, `update()`, and `delete()`.

4. `JpsTodoClientTest`: This class contains unit tests for the `JpsTodoClient` class. It uses
   the `ApplicationContextRunner` to create a Spring ApplicationContext for the tests. It tests all the CRUD operations
   and checks if the beans `jsonPlaceHolderRestClient` and `jpsTodoClient` are present in the context.

The HttpClient is used in the `JpsTodoClient` class to make HTTP requests to the REST API. It sends GET requests to
retrieve all todos or a specific todo by id, POST requests to create a new todo, PUT requests to update an existing
todo, and DELETE requests to delete a todo. The responses from the REST API are then mapped to Java objects using
the `Todo` class.

## Contact

This section provides contact information for the project maintainers.

- **OmerJuve2023** - [OmerJuve2023](https://github.com/OmerJuve2023)

This is the contact information for the project maintainer, OmerJuve2023.