public class Email {

    private static Email INSTANCE = new Email();

    private Email() {
    }

    public static Email getInstance() {
        return INSTANCE;
    }

    public void sendMessage(String email) {
        System.out.println("Body: " + email);
    }
}
