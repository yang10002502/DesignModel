package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMarried implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> marriedPersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equals(MarriageConstant.MARRIED.getIndex())){
                marriedPersons.add(person);
            }
        }
        return marriedPersons;
    }
}
