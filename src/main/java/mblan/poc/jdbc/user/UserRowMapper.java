package mblan.poc.jdbc.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{
    @Override
    public User mapRow(ResultSet result, int rowNum) throws SQLException {
        User user = new User();
        user.setId(result.getLong("id"));
        user.setFirstName(result.getString("first_name"));
        user.setLastName(result.getString("last_name"));
        return user;
    }
}
