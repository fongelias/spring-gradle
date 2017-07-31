# spring-gradle
boilerplate for spring-gradle application


## Commands
### General
Compile, test, and assemble code into a jar file
```
gradle build
```


See what tasks are available
```
gradle tasks
```


### RabbitMQ
launch with default settings
```
rabbitmq-server
```


### Wrapper
Generate wrapper script
```
gradle wrapper --gradle-version 4.0.1
```


Run wrapper script
```
./gradlew build
```


Build and run app
```
./gradlew run
```

Build and run a Spring boot app
```
./gradlew bootRun
```