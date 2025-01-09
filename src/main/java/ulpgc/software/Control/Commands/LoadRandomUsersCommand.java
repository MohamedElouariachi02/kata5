package ulpgc.software.Control.Commands;

import ulpgc.software.Control.RandomGenerateUsers;
import ulpgc.software.Model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadRandomUsersCommand implements Command {
    private final int numberUsers;
    private final List<User> users;

    public LoadRandomUsersCommand(int numberUsers) {
        this.numberUsers = numberUsers;
        this.users = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public void execute() {
        users.clear();
        RandomGenerateUsers randomGenerateUsers = new RandomGenerateUsers(numberUsers);
        try {
            users.addAll(randomGenerateUsers.generate());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
