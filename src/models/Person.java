package models;

public class Person implements Payable, Comparable<Person>{
    private static int idCounter = 0;
    private int id;
    private String name;
    private String surname;

    public Person() {
        setId(++idCounter);
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString() {
        return getId() + ". " + getName() + " " + getSurname();
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(o.getPaymentAmount(), this.getPaymentAmount());
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }
}
