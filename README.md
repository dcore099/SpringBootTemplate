Spring boot template for:


*Thymeleaf 
*Spring data JPA



NOTES:
#odbc
*Download OJDBC from oracle, then install it to local maven repository with the following
(ojdbc7 version 2.1.0.2 example)

$mvn install:install-file -Dfile=D:\Downloads\Java\ojdbc7.jar -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0.2 -Dpackaging=jar
