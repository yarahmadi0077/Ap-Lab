import javax.print.DocFlavor;

public class Contact {
    private String group ;
    private String email ;
    private String firstName ;
    private String lastName ;
    private PhoneNumber phoneNumber ;
    private Address address ;

    public String toStringG(){
        return "group name : " + group + "\n" + "email: " + email + "\nname: " + firstName + " " + lastName
                + "\n" + phoneNumber.toString() + "\n" + address ;
    }
    public Contact(String group, String email, String firstName, String lastName, PhoneNumber phoneNumber, Address address) {
        this.group = group;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void printContacts(){
        System.out.println("-------------------");
        System.out.println(group);
        System.out.println(email);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(phoneNumber);
        System.out.println(address);
        System.out.print("-------------------");
    }
}
