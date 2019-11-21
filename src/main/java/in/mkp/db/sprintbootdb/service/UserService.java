package in.mkp.db.sprintbootdb.service;

import java.util.List;

import in.mkp.db.sprintbootdb.dao.UserDao;
import in.mkp.db.sprintbootdb.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserDao userDao;

    public List<UserEntity> getAllFiles() {
        return userDao.getAllUsers();
    }
}
