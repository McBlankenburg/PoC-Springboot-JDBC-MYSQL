package mblan.poc.jdbc.user;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {
    private static final String USERS = "users";
    private JdbcTemplate jdbcTemplate;

    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM " + USERS, new UserRowMapper());
    }

    public void addUser(User user) {
        String sql = "INSERT INTO " + USERS + " (first_name, last_name) VALUES (?, ?)";
        jdbcTemplate.update(sql, user.getFirstName(), user.getLastName());
    }
}
