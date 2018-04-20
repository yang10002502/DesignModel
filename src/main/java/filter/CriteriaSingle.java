package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if(person.getGender().equals(MarriageConstant.SINGLE.getIndex())){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
