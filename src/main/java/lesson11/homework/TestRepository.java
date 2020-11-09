package lesson11.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class TestRepository {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/vtb_jdbc_lesson?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
                "root", "root");

        Repository<User> userRepository = new Repository<>(User.class, connection);

        User user = userRepository.findById(1L);
        System.out.println(user);

        user = userRepository.findById(2L);
        System.out.println(user);

        userRepository.insert(new User(null, "ccc", "ccc"));
        userRepository.insert(new User(null, "ddd", "ddd"));
        userRepository.insert(new User(1L, "ddd", "ddd"));

        userRepository.update(new User(5L, "newusername", "newpassword"));

        userRepository.delete(5L);

        List<User> users = userRepository.findAll();
        System.out.println(users);
    }

}