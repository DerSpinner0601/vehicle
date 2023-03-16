package at.htl.vehicle.rental;

import at.htl.vehicle.person.Person;
import at.htl.vehicle.vehicle.Vehicle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="X_RENTAL")
public class Rental {
    @Id
    @SequenceGenerator(initialValue=1, name="rental_sequence", sequenceName="rental_sequence", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rental_sequence")
    @Column(name = "R_ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "R_V_ID")
    private Vehicle vehicle;
    @ManyToOne
    @JoinColumn(name = "R_P_ID")
    private Person person;
    @Column(name = "R_START_DATE_TIME")
    private LocalDateTime startDateTime;
    @Column(name = "R_END_DATE_TIME")
    private LocalDateTime endDateTime;
    @Column(name = "R_DISCOUNT")
    private BigDecimal discount;

    //region Constructors
    public Rental()
    {
    }

    public Rental(Vehicle vehicle, Person person, LocalDateTime startDateTime, LocalDateTime endDateTime, BigDecimal discount) {
        this.vehicle = vehicle;
        this.person = person;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.discount = discount;
    }

    //endregion

    //region Getter/Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
    //endregion
}
