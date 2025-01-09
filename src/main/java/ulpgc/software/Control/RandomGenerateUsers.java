package ulpgc.software.Control;

import ulpgc.software.Control.Adapters.RandomUserAdapter;
import ulpgc.software.Model.User;
import com.google.gson.Gson;
import org.jsoup.Jsoup;
import ulpgc.software.Control.Pojos.RandomUserMe;
import ulpgc.software.Control.Pojos.RandomUserRespone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RandomGenerateUsers implements GenerateUsers {
    private String URL = "https://randomuser.me/api/?results=";
    private final int number;

    public RandomGenerateUsers(int number) {
        this.number = number;
        this.URL += number;
    }

    @Override
    public List<User> generate() throws IOException {
        ArrayList<User> users = new ArrayList<>();
        String text = Jsoup.connect(URL).ignoreContentType(true).get().text();
        RandomUserRespone randomUserRespone = new Gson().fromJson(text, RandomUserRespone.class);
        for (RandomUserMe randomUserMe : randomUserRespone.getResult()) {
            users.add(new RandomUserAdapter().adapt(randomUserMe));
        }
        return users;
    }
}
