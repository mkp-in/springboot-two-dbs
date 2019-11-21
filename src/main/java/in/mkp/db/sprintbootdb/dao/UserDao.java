package in.mkp.db.sprintbootdb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import in.mkp.db.sprintbootdb.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

@Configuration
public class UserDao {
    @Autowired
    @Qualifier("jdbcTemplate1")
    private JdbcTemplate jdbcTemplate1;

    @Autowired
    @Qualifier("jdbcTemplate2")
    private JdbcTemplate jdbcTemplate2;

    public List<UserEntity> getAllUsers() {
        String sql1 = "select * from test_demo_user_tablev1";
        List<UserEntity> list1 = jdbcTemplate1.query(sql1, new UserRowMapper());

        String sql2 = "select * from test_demo_user_tablev2";
        List<UserEntity> list2 = jdbcTemplate2.query(sql2, new UserRowMapper());

        List<UserEntity> listAll = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());

        return listAll;
    }

    class UserRowMapper implements RowMapper<UserEntity> {

        @Override
        public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
            final UserEntity userEntity = new UserEntity();
            userEntity.setUserName(rs.getString("user_name"));
            userEntity.setEmail(rs.getString("email"));
            userEntity.setLastLogin(rs.getString("last_login"));
            return userEntity;
        }
    }

}

