package at.htl.vehicle.person;

import javax.enterprise.context.ApplicationScoped;
import java.time.format.DateTimeFormatter;

@ApplicationScoped
public class PersonMapper {
    public PersonDto fromEntity(Person person)
    {
        // person.getDob().toEpochDay() * 3600 * 24
        return new PersonDto(person.getId(), person.getName(), person.getDob().format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}