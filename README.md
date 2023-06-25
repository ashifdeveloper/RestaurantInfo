# Restaurant Info

This project is designed to take input data such as ID, name, address, totalstuff, and phone number to create a Restaurant data.

## Frameworks and Language Used

The following frameworks and languages were used in the development of this project:

- Java
- Spring Boot

## Data Flow

The following functions were used in this project:

1. Controller - This component is responsible for handling the incoming requests and processing them.
2. Services - This component provides business logic to the application.
3. Repository - This component interacts with the datasource.
4. Module - This component is responsible for the design of the schema.

## Data Structure

The following data structures were used in this project:

- ArrayList

## brief description of each of the components in the context of the code:

### Controller
The controller is responsible for handling incoming requests and returning appropriate responses. In the code, it have a RestaurantInfoController which handles requests related to the restaurant entity. It has methods such as getRestaurantById, getAllRestaurants, addRestaurant, updateRestaurantInfo, and removeRestaurant. These methods use the RestaurantService to perform CRUD (create, read, update, delete) operations on the Restaurant data.

### Service
The service layer contains the business logic of the project. It acts as an intermediary between the controller and the repository. In the code, it have a RestaurantService which contains methods such as getRestaurantById, getAllRestaurants, addRestaurant, updateRestaurantInfo, and removeRestaurantr. These methods perform validation on the input data and delegate datasource operations to the RestaurantRepository.

### Repository
In the code, it have a RestaurantRepository.This interface provides basic CRUD operations such as add, delete, update etc.

### Module
In the code, i have created a module named Restaurant which contains the Restaurant entity class. This class represents the data model of the user and contains properties such as id, name, speciality,totalstuff address, and phoneNumber.

Overall, these components work together to create a layered architecture for your project, which separates concerns and promotes modularity and maintainability.

## Project Summary

The aim of this project is to create a system that can take input data and use it to create a project. The system is built using Java and Spring Boot.The data flow is handled by the Controller, Services, and Repository components, with the Database Design being responsible for the schema. The project also makes use of arrayslists to store and manipulate data.
