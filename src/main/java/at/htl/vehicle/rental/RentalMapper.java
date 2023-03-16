package at.htl.vehicle.rental;

import at.htl.vehicle.vehicle.VehicleMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.time.ZoneOffset;

@ApplicationScoped
public class RentalMapper
{
    @Inject
    VehicleMapper vehicleMapper;

    public RentalDto fromEntity(Rental rental)
    {
        return new RentalDto(
                rental.getId(),
                vehicleMapper.fromEntity(rental.getVehicle()),
                rental.getPerson().getId(),
                rental.getStartDateTime().toEpochSecond(ZoneOffset.UTC),
                rental.getEndDateTime().toEpochSecond(ZoneOffset.UTC),
                rental.getDiscount().doubleValue()
        );
    }
}
