package at.htl.vehicle.person;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class PersonDao {
    @Inject
    EntityManager em;

    public Person findById(long id)
    {
        return em.find(Person.class, id);
    }
}