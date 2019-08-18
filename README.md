# AWS-MM-Exercise-G1

We need to create 3 branches (one for each service).

## Goals

- [X] (I) create CircleCI
- [X] create a JAR file from the Service-1 Java project
- [ ] deploy Servie-1 into a docker container
- [ ] expose the Service-1 from (?)
- [ ] (E) cleanup

## TODO


### Terraform



### Circle CI

Done: Create the JAR file (Service-1) in a specific folder (root/publish/service-1/{latest JAR file})
Todo: Setup __Docker__ creation for Service-1. @tolorr

### Services

Done: Service-1: Implement a real "random" number between two min-max constant values (1-1000).
Service-2: not implemented (Python?)
Service-3: not implemented


## Known issues

- SOLVED: Gradle cannot fond 'test' Task
  Error description: Task 'test' not found in root project 'repo'.
  To solve this you need to move into "Service-1" folder and run gradle from there.
  > ``cd Service-1``

  Try to use custom test command.
  run gradlew from inside Service-1 folder locally works:
  > PS D:\Programming\AWS\aws-session-0811-G1> .\Service-1\gradlew.bat

  Reporter: Alex
