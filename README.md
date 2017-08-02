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

### Vagrant
Create vagrant file
```
vagrant init
```

Add a box to vagrant, [from this box catalog](https://app.vagrantup.com/boxes/search)
```
vagrant box add
```

Run virtualbox with a vagrantfile
```
vagrant up
```

SSH into vagrant virtual machine
```
vagrant ssh
```

Shutdown virtual machine
```
vagrant halt
```

Reload virtual machine
```
vagrant reload
```

Terminate virtual machine
```
vagrant destroy
```



