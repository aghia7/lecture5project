package com.company;

import java.util.Objects;

public class User {
    private String name;

    public User(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null ||
                getClass() != obj.getClass())
            return false;
        User user = (User) obj;
        return name == user.name;
    }
}


