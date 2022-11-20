
# Spring boot template

A barebones template useful for some Spring boot projects.



## Features

- Thymeleaf
- Spring data JPA
- Ready for web server deployment
- Basic Bootstrap v5 added



## Deployment

To deploy this project using the JPA classes; download OJDBC from oracle, then install it to local maven repository with the following
(ojdbc7 version 2.1.0.2 example)

```bash
  $mvn install:install-file -Dfile=D:\Downloads\Java\ojdbc7.jar -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0.2 -Dpackaging=jar
```
