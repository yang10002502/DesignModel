package filter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {

    @Test
    public void test(){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert",1, 1));
        persons.add(new Person("John",1, 1));
        persons.add(new Person("Laura",1, 0));
        persons.add(new Person("Diana",0, 1));
        persons.add(new Person("Mike",0, 1));
        persons.add(new Person("Bobby",0, 0));

        CriteriaFemale criteriaFemale = new CriteriaFemale();
        CriteriaMale criteriaMale = new CriteriaMale();
        CriteriaSingle criteriaSingle = new CriteriaSingle();
        CriteriaMarried criteriaMarried = new CriteriaMarried();

        System.out.println("Males: ");
        printPersons(criteriaMale.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(criteriaFemale.meetCriteria(persons));

        System.out.println("\nSingle: ");
        printPersons(criteriaSingle.meetCriteria(persons));

        System.out.println("\nMarried: ");
        printPersons(criteriaMarried.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + SexConstant.getName(person.getGender())
                    +", Marital Status : " + MarriageConstant.getName(person.getMaritalStatus())
                    +" ]");
        }
    }
}
