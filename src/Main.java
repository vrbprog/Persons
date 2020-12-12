public class Main {
    public static void main(String[] args) {

        Person[] employees = new Person[5];

        employees[0] = new Person("Ivan", "Sidorov", "programmer",
                "ivan@mail.ru", "9102345678", 1000, 28);
        employees[1] = new Person("Ruslan", "Kugin", "accountant",
                "ruslan@mail.ru", "9102876678", 1200, 38);
        employees[2] = new Person("Oleg", "Sentsov", "courier",
                "oleg@mail.ru", "903115678", 800, 25);
        employees[3] = new Person("Roman", "Lunin", "manager",
                "roman@mail.ru", "9259945678", 1800, 45);
        employees[4] = new Person("Igor", "Portnov", "programmer",
                "igor@mail.ru", "9035545678", 1200, 42);

        for (Person person : employees) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }


    }
}
