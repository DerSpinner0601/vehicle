package at.htl.vehicle.vehicle;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.*;
import java.util.List;

@ApplicationScoped
public class VehicleDao {
    @Inject
    EntityManager em;

    public Vehicle findById(long id)
    {
        return em.find(Vehicle.class, id);
        //return em.createQuery("SELECT v FROM Vehicle v WHERE v.id = :ID", Vehicle.class).setParameter("ID", id).getSingleResult();
    }

    // using named query from Vehicle.java
    public List<Vehicle> findAll()
    {
        return em.createNamedQuery("Vehicle.findAll", Vehicle.class).getResultList();
    }

    // typed query in Dao
//    public List<Vehicle> findAll2()
//    {
//        TypedQuery<Vehicle> query = em.createQuery("SELECT v FROM Vehicle v", Vehicle.class);
//        List<Vehicle> vehicles = query.getResultList();
//        return vehicles;
//    }
}