package composition;

public class Student {

    private String name;
    private Address address;
    private int age;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.address = new Address(streetAddress,zipCode,state,phone);
        this.name = name;
        this.age = age;

    }
    public String getPhone() {
        return address.getPhone();
    }


    public String getState() {
        return address.getState();
    }



    public String getStreetAddress() {
        return address.getStreetAddress();
    }



    public int getZipCode() {
        return address.getZipCode();
    }

    public String getName() {
        return name;
    }
}

