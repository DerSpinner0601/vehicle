-- PERSON
INSERT INTO X_PERSON
    VALUES (nextval('person_sequence'), '2000-01-02', 'John Doe');
INSERT INTO X_PERSON
    VALUES (nextval('person_sequence'), '1979-01-06', 'Max Raven');

-- VEHICLE
INSERT INTO X_VEHICLE
    VALUES (nextval('vehicle_sequence'), 'VW', 'eGolf');
INSERT INTO X_VEHICLE
    VALUES (nextval('vehicle_sequence'), 'BMW', '520d');
INSERT INTO X_VEHICLE
    VALUES (nextval('vehicle_sequence'), 'Audi', 'RS6');

-- RENTALS
INSERT INTO X_RENTAL (R_ID, R_V_ID, R_P_ID, R_START_DATE_TIME, R_END_DATE_TIME, R_DISCOUNT)
    VALUES (nextval('rental_sequence'), 1, 1, '2023-03-16 10:00:00', '2023-03-17 18:00:00', 0);
INSERT INTO X_RENTAL (R_ID, R_V_ID, R_P_ID, R_START_DATE_TIME, R_END_DATE_TIME, R_DISCOUNT)
    VALUES (nextval('rental_sequence'), 2, 2, '2023-03-16 10:00:00', '2023-03-17 18:00:00', 10);