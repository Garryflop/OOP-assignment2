import models.Employee;
import models.Payable;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Student("Danial", "Shaykenov", 3.5));
        people.add(new Student("Aldiar", "Jaks", 3.5));

        people.add(new Employee("Minion", "Minionuly","Team Leader", 77777));
        people.add(new Employee("Satoru", "Gojo", "Teacher", 0.3));

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> persons ) {
        for (Payable payable : persons) {
            System.out.printf("%s earns %.2f tenge\n", payable.toString(), payable.getPaymentAmount());
        }
    }
}