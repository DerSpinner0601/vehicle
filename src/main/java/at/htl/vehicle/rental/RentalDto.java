package at.htl.vehicle.rental;

import at.htl.vehicle.vehicle.VehicleDto;

import java.time.LocalDateTime;

// mapping muss nicht unbedingt der Entity entsprechen (siehe personId)
public record RentalDto(Long id, VehicleDto vehicle, long personId, long startDateTime, long endDateTime, double discount) {
}
