package in.mkp.db.sprintbootdb;

import java.util.Arrays;

import in.mkp.db.sprintbootdb.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SprintbootDbApplication {

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(SprintbootDbApplication.class, args);
    }

    @Bean
    public void printFiles() {
        System.out.println("fileDao.getAllFiles() = " + Arrays.toString(userDao.getAllUsers().toArray()));
    }

}
