# Scaffold for Warehouse API microservice.
## Warehouse API microservice
### Prerequisites
- Check the proper version of Java is installed
```
java -version
```
it should be a version 1.8 or higher.
- Clone the project
```
git clone https://github.com/volodymyrd/java_tour.git
```
### Scaffolding a gradle project
- Create your own github project with name `warehouse_api_ms` and clone it.
- Back to the `java_tour` project and change the directory to `warehouse_api_ms`
- Check you are on the `main` git branch
```
git branch
```
- Switch to the `warehouse_api_ms_init_config` branch
```
git checkout warehouse_api_ms_init_config
```
- Copy the whole contents of the `warehouse_api_ms` folder to your project
- Switch to you project and check the project build
```
./gradlew
```
- Check the project run
```
./gradlew bootRun
```
- Create a `warehouse_api_ms_init_config` branch
```
git checkout -b warehouse_api_ms_init_config
```
- Commit and push your change
```
git commit -m 'Scaffolding a gradle project'
git push
```
- Create a pull request on github
- Merge the pull request to the master/main branch
- Switch to the main branch
```
git checkout main
```
- Pull merge from the server
```
git pull
```
### Create a first controller
- Go to the `java_tour` project on your computer and switch to the `warehouse_api_ms_api_rest_controller` branch
```
git checkout warehouse_api_ms_api_rest_controller
```
- Go to your project and switch to the `master` branch
```
git checkout master
```
- Create you a new branch 
```
git checkout -b rest_controller
```
- Copy `warehouse_api_ms` to your project (replace all files in your project).
- Check status
```
git status
```
-- Commit the changes
```
git add .
git status
git commit -m 'add rest controller'
git push
```
- Check your project build
```
./gradlew
```
- Check your project run
```
./gradlew bootRun
```
- Open the browser with [url](http://localhost:8080/v1/warehouse/api/version)

### Open your project in the IDE and configure it
- Open IDE and open your project in it
