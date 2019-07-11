public class Main {

    public static void main(String[] args) {
        ApplePhone iPhoneXSMAX = new ApplePhone("iPhone XS MAX 256G", "Black", "Apple");
        ApplePhone iPhoneXS = new ApplePhone("iPhone XS MAX 128G", "White", "Apple");
        AndroidPhone GalaxyS10 = new AndroidPhone("SAMSUNG Galaxy S10 128G", "Blue", "SAMSUNG");
        AndroidPhone HuaweiP30Pro = new AndroidPhone("P30 Pro", "Pink", "Huawei");

        Person person = new Person("Xiaoming");
        person.setMobile(iPhoneXSMAX);
        person.call("Hello World");
        person.call("Hello");
        person.setMobile(GalaxyS10);
        person.call("Hello World");
        person.call("This is a message length test");

        Person robot = new IPhoneRobot("Robot");
        robot.setMobile(HuaweiP30Pro);
        robot.call("Hello World");
        robot.setMobile(iPhoneXS);
        robot.call("Hello");
    }
}
