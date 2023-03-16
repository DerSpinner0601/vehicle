package at.htl.vehicle.vehicle;

import io.agroal.api.AgroalDataSource;
import io.quarkus.narayana.jta.QuarkusTransaction;
import io.quarkus.test.junit.QuarkusTest;
import org.assertj.db.type.Table;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import static org.assertj.db.api.Assertions.assertThat;
import static org.assertj.db.output.Outputs.output;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class VehicleDaoTest {
    @Inject
    VehicleDao vehicleDao;
    @Inject
    AgroalDataSource ds;

    // Test ausführen im Terminal für spezifische Klasse: "mvn clean test -Dtest=VehicleDaoTest"
    @Test
    //@Transactional
    void name() {
        QuarkusTransaction.begin();

        var vehicle = new Vehicle("Opel", "Kadett");
        vehicleDao.create(vehicle);

        QuarkusTransaction.commit();

        Table table = new Table(ds, "X_VEHICLE");
        output(table).toConsole(); // Inhalt der Testtabelle anzeigen

        assertThat(table).exists().hasNumberOfRows(1); // 4
    }
}