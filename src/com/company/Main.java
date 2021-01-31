package com.company;

public class Main {

    public static void main(String[] args) {
//        try {
//            int c = 5 / 0;
//        } catch (Exception e) {
//            System.out.println(
//                    "Exception: " +
//                    e.getMessage());
//        }
//
//        System.out.println("Finished");

        Group group = new Group();
        User[] users = new User[3];

        users[0] = new User("John");
        users[1] = null;
        users[2] = new User("John");

        for (int i = 0; i < users.length; i++) {
            try {
                group.addUser(users[i]);
                System.out.println("A new user was added!");
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (UserExistsException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Finished iteration #" + i);
            }
            System.out.println("************************");
        }
    }
}
