package objectOrientation.staticModifiers.test;

import objectOrientation.staticModifiers.domain.User;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("João");
        User user2 = new User("Maria");
        User user3 = new User("Pedro");

        System.out.println(User.getTotalUsers());
    }
}
