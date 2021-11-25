CREATE TABLE patient
(
    patient_id  BIGINT       NOT NULL,
    first_name  VARCHAR(255) NOT NULL,
    last_name   VARCHAR(255) NOT NULL,
    birthday    date         NOT NULL,
    gender      INT NULL,
    main_adress VARCHAR(255) NULL,
    phone       INT NULL,
    CONSTRAINT pk_patient PRIMARY KEY (patient_id)
);