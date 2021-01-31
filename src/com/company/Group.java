package com.company;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<User> users = new ArrayList<>();

    public void addUser(User user)
            throws NullPointerException, UserExistsException {
        if (user == null) {
            throw new NullPointerException("User is null");
        } else if (userExists(user)) {
            throw new UserExistsException("User " + user.getName()
                    + " already exists");
        }
        users.add(user);
    }



    private boolean userExists(User user) {
        for (User u : users) {
            if (u.equals(user)) {
                return true;
            }
        }

        return false;
    }
}

