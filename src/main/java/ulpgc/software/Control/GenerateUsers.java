package ulpgc.software.Control;

import ulpgc.software.Model.User;

import java.io.IOException;
import java.util.List;

public interface GenerateUsers {
    List<User> generate() throws IOException;
}
