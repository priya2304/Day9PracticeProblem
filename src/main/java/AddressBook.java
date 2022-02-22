import java.util.Scanner;

public class AddressBook {
    private static Address[] addresses = new Address[10];// object -> it will print address

    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details to store data : ");
        Address address = getUserInput(scanner);
        System.out.println(address.toString());
        addresses[i] = address;
    }

    //
    private static Address getUserInput(Scanner scanner) {
        Address address = new Address();
        System.out.println("Enter First Name : ");
        address.setFirstName(scanner.nextLine());
        System.out.println("Enter Last Name : ");
        address.setLastName(scanner.nextLine());

        System.out.println("Enter address Name : ");
        address.setAddress(scanner.nextLine());

        System.out.println("Enter city Name : ");
        address.setCity(scanner.nextLine());

        System.out.println("Enter state Name : ");
        address.setState(scanner.nextLine());

        System.out.println("Enter pincode Name : ");
        address.setPinCode(scanner.nextInt());
        return address;
    }
}


class Address {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private Integer pinCode;

    @Override
    public String toString() {
        return "Address{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address='" + address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\''
                + ", pinCode=" + pinCode + '}';
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }
}
