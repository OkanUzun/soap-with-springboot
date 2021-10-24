# Description
soap client-server example with spring boot

## Installation
Use the git to download repository.

```bash
git clone https://github.com/OkanUzun/soap-with-springboot.git
```
go to the downloaded repository named **soap-with-springboot**
### Server Side
go to folder named **spring-boot-soap-server**

package project
```bash
mvn clean package -Dmaven.test.skip=true (use ./mvnw instead of mvn if maven not installed)
```
run application
```bash
java -jar target/spring-boot-soap-server-0.0.1-SNAPSHOT.jar
```
### Client Side
go to folder named **spring-boot-soap-client**

package project
```bash
mvn clean package -Dmaven.test.skip=true (use ./mvnw instead of mvn if maven not installed)
```
run application
```bash
java -jar target/spring-boot-soap-client-0.0.1-SNAPSHOT.jar
```

### Notes
server side application must be started first.