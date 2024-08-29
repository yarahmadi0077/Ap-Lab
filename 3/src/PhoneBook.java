import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contact.getPhoneNumber().toString().compareTo(contacts.get(i).getPhoneNumber().toString()) == 0)
                return false;
        }
        contacts.add(contact) ;
        return true ;
    }

    public boolean deleteContact(String firstName, String lastName) {
        return contacts.removeIf(contact ->
                contact.getFirstName().equals(firstName)
                        && contact.getLastName().equals(lastName));
    }

    public String findContact(String firstName, String lastName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().compareTo(firstName) == 0
                    && contacts.get(i).getLastName().compareTo(lastName) == 0) {
                return contacts.get(i).getPhoneNumber().toString();
            }
        }
        return null;
    }

    public String findContacts(String group) {
        boolean b = true ;
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getGroup().compareTo(group) == 0) {
                System.out.println(contacts.get(i).toStringG());
                b = false ;
            }
        }
        if (b)
            return null ;
        return  " ";
    }




    public void printContacts() {
        for (int i = 0; i < contacts.size() ; i++) {
            System.out.println((i + 1) + "");
            System.out.println(contacts.get(i).toStringG());
            System.out.println("----------------------");
        }
    }

}
