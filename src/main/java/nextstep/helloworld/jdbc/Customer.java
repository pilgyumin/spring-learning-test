package nextstep.helloworld.jdbc;

import java.io.Serializable;

public class Customer implements Serializable {

        private static final long serialVersionUID = 12012031203012L;

    private long id;
    private String firstName, lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
