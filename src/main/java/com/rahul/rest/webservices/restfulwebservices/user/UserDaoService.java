package com.rahul.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add (new User(1,"Rahul", LocalDate.now().minusYears(22)));
        users.add (new User(2,"Sriram", LocalDate.now().minusYears(23)));
        users.add (new User(3,"Paramesh", LocalDate.now().minusYears(22)));

    }
}
