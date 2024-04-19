# Components of a Spring MVC application

* A set of web pages to layout UI components
* A collection of Spring Beans (controllers, services, etc)
* Spring configuration (XML, Annotations or Java)

<img src="C:\Users\priet\Downloads\Spring MVC front controller.png"/>

## Spring MVC front controller
* Front controller is known as DispatcherServlet
    * Part of the Spring Framework
* We only need to create 
    * Model objects -> contains your data
      * Store/retrieve data via backend systems (db, web service)
      * Place your data (Java object/collection) in the model
    * View Templates
    * Controller classes -> Contains business logic
        * Handle the request
        * Store/retrieve data
        * Place data in model
        * Send to appropriate view template
      

## @InitBinder
* @InitBinder annotation works as a pre-processor
* It will pre-process each web request to our controller
* Method annotated with @InitBinder is executed

## Thymeleaf Expressions
* th:action => Location to send form
* th:object => Reference to model attribute
* th:field => Bind input field to a property on model attribute

## Spring Security with Servlet Filters
* Servlet Filters are used to pre-process/ post-process web requests
* Servlet Filters can route web requests based on security logic
* Spring provides a bulk of security functionality with servlet filters
