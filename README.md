# springboot-two-dbs

In this simple project, I describe how we can connect to two different DBS in one simple springboot app.

## Files of interest:
* resources/application.properties: Defining two db connection parameters.
* DbConf.java: Using the parameters defined in application.properties to have to JdbcTemplates.
* UserDao.java: Shows how the JdbcTemplates are autowired. 
* resources/postgres.sql: This has all the SQL statements required to run a demo.
* Docker/*.sh: Shell scripts to run docker & kill it.