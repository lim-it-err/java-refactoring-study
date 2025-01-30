import java.util.*;

public class UserProfileQuestion {
    private String username;
    private int age;
    private List hobbies;

    public UserProfileQuestion(String username, int age) {
        this.username = username;
        this.age = age;
        this.hobbies = new ArrayList(); // 1. Missing generics
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void removeHobby(String hobby) {
        if (hobbies.contains(hobby)) {
            hobbies.remove(hobby); // 2. No error handling for missing hobby
        }
    }

    public String getProfile() {
        return "Username: " + username + ", Age: " + age + ", Hobbies: " + hobbies.toString(); // 3. Potential security issue exposing all data
    }

    public void updateAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        } // 4. No handling for unrealistic ages (e.g., >150)
    }
}