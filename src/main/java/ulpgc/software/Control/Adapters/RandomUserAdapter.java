package ulpgc.software.Control.Adapters;

import ulpgc.software.Model.User;
import ulpgc.software.Control.Pojos.RandomUserMe;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;

public class RandomUserAdapter implements UserAdapter<RandomUserMe> {

    @Override
    public User adapt(RandomUserMe randomUserMe) {
        return new User(randomUserMe.getName().first(),
                User.Gender.valueOf(capitalize(randomUserMe.getGender())), Integer.parseInt(randomUserMe.getDob().age()),
                randomUserMe.getEmail(),
                randomUserMe.getPhone(), randomUserMe.getLocation().country(), download(randomUserMe.getPicture().large()));
    }

    private byte[] download(String medium) {
        try {
            URLConnection connection = new URI(medium).toURL().openConnection();
            return connection.getInputStream().readAllBytes();
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private String capitalize(String gender) {
        return gender.toUpperCase().charAt(0) + gender.substring(1);
    }
}
