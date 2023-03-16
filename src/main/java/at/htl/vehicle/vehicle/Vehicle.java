package at.htl.vehicle.vehicle;

import javax.persistence.*;

@Entity
@Table(name = "X_VEHICLE")
@NamedQueries(
        {
                @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v")
        }
)
public class Vehicle {
    @Id
    @SequenceGenerator(initialValue=1, name="vehicle_sequence", sequenceName="vehicle_sequence", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicle_sequence")
    @Column(name = "V_ID")
    private Long id;
    @Column(name = "V_MODEL", nullable = false)
    private String model;
    @Column(name = "V_BRAND", nullable = false)
    private String brand;

    //region Constructors
    public Vehicle()
    {
    }

    public Vehicle(String model, String brand)
    {
        this.model = model;
        this.brand = brand;
    }
    //endregion

    //region Getter/Setter
    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    //endregion

    @Override
    public String toString()
    {
        return String.format("%s %s", brand, model);
    }
}
