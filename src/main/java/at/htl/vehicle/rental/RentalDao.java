package at.htl.vehicle.rental;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class RentalDao {
    @Inject
    EntityManager em;

    public Rental find(Long id)
    {
        return new Rental();
    }

    public List<Rental> findAll()
    {
        return em.createQuery("SELECT r FROM Rental r", Rental.class).getResultList();
    }
}
