package at.htl.vehicle.person;

public record PersonDto(Long id, String name, String dob) {
    // Unix-Epoch oder "YYYY-MM-DD"
    // https://stackoverflow.com/questions/10286204/what-is-the-right-json-date-format
}