
public class AndroidPhone extends Mobile {
    public AndroidPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void call(String message) {
        if (message.length() > 20) {
            System.out.println("<Android> Message cannot be sent");
        } else {
            System.out.println("<Android> Message: " + message);
        }
    }

}
