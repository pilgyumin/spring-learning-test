package nextstep.helloworld.jdbc.jdbctemplate;

import nextstep.helloworld.jdbc.Customer;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ActorRowMapper implements RowMapper<Customer>, Serializable {
    @Override
    public Customer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Customer customer = new Customer(
                resultSet.getLong("id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name")
        );
        return customer;
    }
}
