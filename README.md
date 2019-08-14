# AWS-MM-Exercise-G1

Service-1 is inside "Service-1" folder, is this a problem?
We need to create 3 branches (one for each service).

## Goals

- [X] (I) create CircleCI
- ...
- [ ] (E) cleanup

E - cleanup

## TODO

### Terraform



### Circle CI

Make build work.
Setup __Docker__ creation for Service-1.

### Services

Service-1: Implement a real "random" number between two min-max constant values (1-1000).
Service-2: not implemented
Service-3: not implemented

## Known issues

- Gradle cannot fond 'test' Task
  Error description: Task 'test' not found in root project 'repo'.
  Temporary hack: coomment out gradle test step in CircleCI config.

  Try to use custom test command.
  run gradlew from inside Service-1 folder locally works:
  > PS D:\Programming\AWS\aws-session-0811-G1> .\Service-1\gradlew.bat

  Reporter: Alex
