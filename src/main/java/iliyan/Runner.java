package iliyan;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Runner {
    public static void main(String[] args) {
        List<Ageable> ageableList = new ArrayList<>();

        IntStream.range(18, 25).forEach(i -> {
            final Person person = new Person(LocalDate.now().with(ChronoField.YEAR, 1990)); //new Person(i);
            final Company company = new Company(LocalDate.now().with(ChronoField.YEAR, 1990)); //new Company(i);
            ageableList.add(person);
            ageableList.add(company);
        });

        Collections.shuffle(ageableList);
        System.out.println("Not sorted Ageables:");
        for (Ageable ageable : ageableList) {
            System.out.println(ageable);
        }

        ageableList.sort(new AgeableCompairer());
        System.out.println("Sorted Ageables:");
        for (Ageable ageable : ageableList) {
            System.out.println(ageable);
        }
    }
}
