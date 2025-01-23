# AWS SNS Service

## Introduction
This repository contains a demo project to learn and explore AWS Simple Notification Service (SNS) using Java.
AWS Simple Notification Service (SNS) is a fully managed messaging service for both system-to-system and app-to-person (A2P) communication. This demo project aims to help developers understand how to use AWS SNS.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven
- AWS Account
- AWS CLI configured with appropriate permissions

## Setup

1. Clone the repository:
    ```sh
    git clone https://github.com/Deva-u7/aws-sns-service.git
    cd aws-sns-service
    ```

2. Install dependencies:
    ```sh
    mvn clean install
    ```

3. Configure AWS credentials:
    Ensure your AWS CLI is configured with the necessary permissions to access SNS.

## Usage

1. Update the `application.properties` file with your AWS configuration.

2. Run the application:
    ```sh
    mvn spring-boot:run
    ```

3. The application will demonstrate various SNS operations such as creating a topic, subscribing to a topic, and publishing messages.

## Features

- Create and delete SNS topics
- Subscribe and unsubscribe to SNS topics
- Publish messages to SNS topics
