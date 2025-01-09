import ulpgc.software.Control.RandomGenerateUsers;
import ulpgc.software.Model.User;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomGenerateUsers randomGenerateUsers = new RandomGenerateUsers(1);
        try {
            List<User> generate = randomGenerateUsers.generate();
            for (User user : generate) {
                System.out.println(user);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
