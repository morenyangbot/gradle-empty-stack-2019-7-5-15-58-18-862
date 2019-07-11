public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name) {
        this.name = name;
    }

    public void call(String message) {
        if(this.mobile != null) {

        this.mobile.call(message);
        } else {
            System.out.println(name + " has no phone. ");
        }
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        mobile.getInfo();
        this.mobile = mobile;
    }
}
