package ulpgc.software.Control.Pojos;

public class RandomUserMe {
    private final Name name;
    private final String gender;
    private final Dob dob;
    private final String email;
    private final String phone;
    private Location location;
    private final Picture picture;

    public RandomUserMe(Name name, String gender, Dob dob, String email, String phone, Location location, Picture picture) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.picture = picture;
    }

    public Name getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Dob getDob() {
        return dob;
    }

    public Location getLocation() {
        return location;
    }

    public Picture getPicture() {
        return picture;
    }

    public record Name(String title, String first, String last) {
    }

    public record Picture(String large, String medium, String thumbnail) {
    }

    public record Dob(String date, String age) {
    }

    public record Location(String country) {
    }

    ;
}
