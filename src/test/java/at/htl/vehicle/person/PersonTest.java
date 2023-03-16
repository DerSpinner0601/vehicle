package at.htl.vehicle.person;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    // Alt-Einfg für Kontextmenü
    // Test ausführen im Terminal für spezifische Klasse: "mvn clean test -Dtest=PersonTest"
    @Test
    void itShouldHaveNameSusi_givenNameSusi() {
        var person = new Person("Susi", LocalDate.of(2000, Month.APRIL, 1)); // NICHT: LocalDate.now()
        assertThat(person.getName()).isEqualTo("Susi");
    }
}