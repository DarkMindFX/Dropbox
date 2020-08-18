#This is a Tomcat + CentOS image
FROM glob-tomcat9:latest
MAINTAINER contact@darkmindfx.com 

EXPOSE 8080 8080

COPY "globus-users-api.war" "/usr/local/tomcat9/apache-tomcat-9.0.37/webapps/"

ENTRYPOINT ["./usr/local/tomcat9/apache-tomcat-9.0.37/bin/catalina.sh", "run"]
