package at.htl.vehicle.vehicle;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehicleMapper {
    public VehicleDto fromEntity(Vehicle vehicle)
    {
        return new VehicleDto(vehicle.getId(), vehicle.getBrand(), vehicle.getModel());
    }
}