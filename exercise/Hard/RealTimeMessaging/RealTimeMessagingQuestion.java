import java.util.*;

public class RealTimeMessagingQuestion {
    private List messages;
    private Map users;

    public RealTimeMessagingQuestion() {
        messages = new ArrayList(); // 1. Raw type usage
        users = new HashMap(); // 2. Missing generics
    }

    public void sendMessage(String userId, String message) {
        if (!users.containsKey(userId)) {
            System.out.println("User not found"); // 3. Weak error handling
            return;
        }
        messages.add(userId + ": " + message); // 4. Inefficient message storage format
    }

    public void registerUser(String userId) {
        if (users.containsKey(userId)) {
            System.out.println("User already exists"); // 5. Weak duplicate handling
            return;
        }
        users.put(userId, new Object());
    }

    public List fetchMessages(String userId) {
        List userMessages = new ArrayList(); // 6. Raw type again
        for (Object msg : messages) {
            if (msg.toString().startsWith(userId)) {
                userMessages.add(msg);
            }
        }
        return userMessages;
    }

    public void deleteUser(String userId) {
        if (!users.containsKey(userId)) {
            System.out.println("User does not exist");
            return;
        }
        users.remove(userId);
        messages.removeIf(msg -> msg.toString().startsWith(userId)); // 7. Inefficient cleanup
    }
}
