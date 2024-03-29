# AWS-MM-Exercise-G1

We need to create 3 branches (one for each service).

## GOALS

 - Expose 3 API services hosted on Docker containers using CircleCI for CD

### Steps
- [X] (I) create CircleCI
- [X] create a JAR file from the Service-1 Java project
- [X] deploy Service-1 into a Docker container
- [ ] expose the Service-1 on localhost:5001
- [X] expose the Service-2 on localhost:5002
- [ ] expose the Service-3 on localhost:5003
- [ ] (E) cleanup

## TODO

- logging ([LogBack](https://logback.qos.ch) ?)
- use a database (MongoDB cloud ?)

### Terraform



### Circle CI

Done: Create the JAR file (Service-1) in a specific folder (root/publish/service-1/{latest JAR file})  
Todo: Setup __Docker__ creation for Service-1. @tolorr


## Gradle

T run gradle in your local Windows machine:  
``` batch
:: position inside the Service-1 folder
cd Service-1 
:: run gradle (gradlew is a wrapper of gradle)
.\gradlew createJar   
```


### Services

Done: Service-1: Implement a real "random" number between two min-max constant values (1-1000).  
Service-2: Implement a random number generator between 1 and 1000 (Python + Flask)
Service-3: not implemented


## Known issues


## Solved issues

- Gradle cannot find 'test' Task
  Reporter: Alex

  Error description: Task 'test' not found in root project 'repo'.

  Solution.  
  run gradlew from inside Service-1 folder locally works:
  > `` PS D:\Programming\AWS\aws-session-0811-G1> .\Service-1\gradlew.bat ``
  To solve this you need to position into the "Service-1" folder, then run gradle from there.
  Use custom command and execute theis before calling ```gradle test```.
  > ``cd Service-1``

  