package ulpgc.software.Model;

import java.util.Objects;

public record User(String name, Gender gender, int age, String email, String phone,
                   String country, byte[] picture) {

    public enum Gender {
        Female, Male
    }
}
