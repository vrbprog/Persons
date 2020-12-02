
public class Person {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private int wage;
    private int age;

    public Person(String firstName, String lastName, String position,
                  String email, String phone, int wage, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getWage() {
        return wage;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{ " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", wage=" + wage + "$" +
                ", age=" + age + " " +
                '}';
    }
}
