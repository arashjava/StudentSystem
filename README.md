# StudentSystem
A JavaEE project using Spring MVC, Hibernate in Maven on Linux/ MySQL and also Log4J for logging.
For more details please refer to the following page:
http://arash.tech/traning-java-javaee-student/
To run this project you need to change/ add some information to "hibernate.properties" file:
- Set the user name and password for MySQL.
- Create Database "StudentAdmission" in MySQL.
- Change "hibernate.hbm2ddl.auto" to "create" for the first time to let the tables be created. After the first run, change it
back to "update."

Note: To have the email feature of the system working fine you need to consider the following points:
- When you signin to the system, your account email and password must be the real available email.
- You must change the settings of the account email "Send mail from your device or application" as follows:
    https://support.google.com/a/answer/176600?hl=en

