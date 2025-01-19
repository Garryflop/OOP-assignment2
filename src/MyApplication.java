import models.Employee;
import models.Payable;
import models.Person;
import models.Student;
import models.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Test test = new Test();
        people.add(new Student("Danial", "Shaykenov", 3.5));
        people.add(new Student("Aldiar", "Jaks", 3.5));

        people.add(new Employee("Minion", "Minionuly","Team Leader", 77777));
        people.add(new Employee("Satoru", "Gojo", "Teacher", 0.3));
        test.setTest(10);
        Collections.sort(people);
        List<Payable> sortedPayables = new ArrayList<>(people);
        printData(sortedPayables);
        System.out.println(test.getTest());
    }
    public static void printData(Iterable<Payable> people ) {
        for (Payable payable : people) {
            System.out.printf("%s earns %.2f tenge\n", payable.toString(), payable.getPaymentAmount());

        }
    }
}