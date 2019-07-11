public class IPhoneRobot extends Person {

    public IPhoneRobot(String name) {
        super(name);
    }

    @Override
    public void setMobile(Mobile mobile) {
        if (mobile.getClass() != ApplePhone.class) {
            System.out.println("iPhone Robot can only use iPhone");
        } else {
            super.setMobile(mobile);
        }
    }
}
