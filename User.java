public abstract class User implements HasMenu {
    private String username;
    private String pin;

    public User(String username, String pin) {
        this.username = username;
        this.pin = pin;
    }

    public boolean login(String inputUsername, String inputPin) {
        return this.username.equals(inputUsername) && this.pin.equals(inputPin);
    }

    public String getUsername() {
        return username;
    }

    public String getPin() {
        return pin;
    }
}
