
public class ApplePhone extends Mobile {

    public ApplePhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        if (message.length() > 10) {
            System.out.println("<iPhone> Message cannot be sent");
        } else {
            System.out.println("<iPhone> Message: " + message);
        }
    }
}
