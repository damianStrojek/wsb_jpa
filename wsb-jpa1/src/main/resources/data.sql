-- Damian Strojek 99836
-- 15 examples for Address entity
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (1, 'Tokyo', 'Shibuya 108-15', 'Next to Godzilla statue', '150-0002');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (2, 'Paris', 'Rue de la Lune 49', 'Under the Eiffel Tower', '75001');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (3, 'New York', '5th Avenue 333/45', 'Across from Central Park', '10001');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (4, 'Moscow', 'Red Square 88/2', 'Behind the Kremlin', '101000');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (5, 'Sydney', 'Bondi Beach 77A', 'Near the lifeguard tower', '2026');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (6, 'London', 'Baker Street 221B', 'Right next to Sherlock’s office', 'NW1 6XE');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (7, 'Cairo', 'Pyramids Road 666', 'Near the Sphinx’s nose', '12345');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (8, 'Buenos Aires', 'Av. 9 de Julio 200', 'Behind the Tango bar', 'C1002');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (9, 'Rome', 'Piazza del Colosseo 7/5', 'Under the Colosseum’s shadow', '00100');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (10, 'Rio de Janeiro', 'Copacabana 500', 'Near the beach volleyball court', '22040-002');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (11, 'Berlin', 'Unter den Linden 23', 'In front of the Brandenburg Gate', '10117');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (12, 'Mumbai', 'Marine Drive 91', 'Across from the Bollywood sign', '400020');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (13, 'Cape Town', 'Table Mountain 42', 'Right below the cable car', '8001');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (14, 'Bangkok', 'Khao San Road 101', 'In the heart of the backpacker zone', '10200');
INSERT INTO address (id, city, address_line1, address_line2, postal_code) VALUES (15, 'Seoul', 'Gangnam 74', 'Next to the flashy dancing building', '06232');

-- 10 examples for Doctor entity
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (1, 'Hiroshi', 'Takahashi', '+81 90 1234 5678', 'hiroshi@japanmed.co.jp', 'D001', 'DERMATOLOGIST', 1);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (2, 'Claire', 'Dupont', '+33 1 42 68 11 88', 'claire.dupont@parisclinic.fr', 'D002', 'SURGEON', 2);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (3, 'Michael', 'Johnson', '+1 212-555-1234', 'michael.johnson@nyhealth.com', 'D003', 'OCULIST', 3);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (4, 'Anastasia', 'Ivanova', '+7 495 123-45-67', 'anastasia.ivanova@medmoscow.ru', 'D004', 'SURGEON', 4);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (5, 'Liam', 'O’Connor', '+61 2 9876 5432', 'liam.oconnor@sydhealth.com.au', 'D005', 'OCULIST', 5);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (6, 'Emma', 'Brown', '+44 20 7946 0625', 'emma.brown@londonclinic.co.uk', 'D006', 'GP', 6);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (7, 'Pedro', 'Rodriguez', '+54 9 11 2345-6789', 'pedro.rodriguez@buenosairesmed.ar', 'D007', 'OCULIST', 8);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (8, 'Giovanni', 'Ricci', '+39 06 8923 4567', 'giovanni.ricci@romemed.it', 'D008', 'DERMATOLOGIST', 9);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (9, 'Fernanda', 'Silva', '+55 21 9856-1234', 'fernanda.silva@riomed.br', 'D009', 'OCULIST', 10);
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id) VALUES (10, 'Jae', 'Kim', '+82 2 2123 4567', 'jae.kim@seoulmed.kr', 'D015', 'GP', 15);

-- 10 examples for Patient entity
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (1, 'Taro', 'Sato', '+81 90 8765 4321', 'taro.sato@japanmail.co.jp', 'P001', '1985-03-22', 1);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (2, 'Pierre', 'Lemoine', '+33 6 23 45 67 89', 'pierre.lemoine@parismail.fr', 'P002', '1990-06-15', 2);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (3, 'Sarah', 'Davis', '+1 646-555-9876', 'sarah.davis@nycmail.com', 'P003', '1982-11-11', 3);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (4, 'Ivan', 'Popov', '+7 917 987-65-43', 'ivan.popov@medmoscow.ru', 'P004', '1993-02-25', 4);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (5, 'Charlotte', 'Evans', '+61 3 9876 5432', 'charlotte.evans@sydney.com.au', 'P005', '1987-04-05', 5);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (6, 'Oliver', 'Smith', '+44 7911 123 456', 'oliver.smith@londonmail.co.uk', 'P006', '1995-07-12', 6);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (7, 'Carlos', 'Martinez', '+54 9 11 5555-4444', 'carlos.martinez@buenosairesmail.ar', 'P007', '2001-09-30', 8);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (8, 'Giulia', 'Bianchi', '+39 345 678 9012', 'giulia.bianchi@romemail.it', 'P008', '1989-01-18', 9);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (9, 'Lucas', 'Costa', '+55 11 9999-8888', 'lucas.costa@riomail.br', 'P009', '1994-08-23', 10);
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (10, 'Ji-Hye', 'Lee', '+82 10 2345 6789', 'ji-hye.lee@seoulmail.kr', 'P023', '1992-05-05', 15);

-- 15 examples for Visits entity
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (1, 'Emergency check-up after slipping on a banana peel', '2024-11-15 21:29:31', 7, 2);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (2, 'Routine check-up for a person obsessed with cheese', '2024-12-01 14:12:00', 2, 3);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (3, 'General health consultation after dancing for 10 hours straight', '2024-12-05 09:30:00', 3, 4);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (4, 'Surprise visit after accidentally eating an entire pizza alone', '2024-12-08 17:00:00', 5, 5);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (5, 'Check-up for extreme rollercoaster enthusiast', '2024-12-10 13:45:00', 6, 6);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (6, 'Annual check-up after riding a scooter through the streets of Rome', '2024-12-15 10:30:00', 8, 7);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (7, 'Consultation after drinking too much coffee at the office', '2024-12-20 11:00:00', 9, 8);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (8, 'Post-ice-skating visit for bruised knees', '2024-12-22 14:25:00', 10, 9);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (9, 'Visit for feeling dizzy after spinning too much at a carnival', '2024-12-25 12:15:00', 1, 10);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (10, 'Consultation about sore throat after karaoke night', '2024-12-30 16:40:00', 2, 11);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (11, 'Emergency visit for twisted ankle while dancing salsa', '2024-12-31 19:10:00', 3, 12);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (12, 'Health check after participating in a taco-eating contest', '2025-01-02 08:00:00', 4, 13);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (13, 'Post-triathlon consultation for sore muscles', '2025-01-03 12:55:00', 5, 14);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (14, 'Check-up for running a marathon while wearing clown shoes', '2025-01-04 10:30:00', 6, 15);
INSERT INTO visit (id, description, time, doctor_id, patient_id) VALUES (15, 'Visit after too much stress from trying to solve Rubik’s cube in under 2 minutes', '2025-01-05 18:20:00', 7, 1);


-- 13 examples for Medical Treatments entity
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (1, 'Ultrasound after mistakenly thinking I saw a UFO', 'USG', 9);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (2, 'EKG to check heart rate after watching horror movies for 24 hours', 'EKG', 4);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (3, 'X-ray after breaking a world record in jumping jacks', 'RTG', 6);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (4, 'USG for a sore arm from too much texting', 'USG', 2);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (5, 'EKG to see if caffeine overdose caused heart arrhythmia', 'EKG', 5);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (6, 'RTG after accident involving a bouncy castle', 'RTG', 7);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (7, 'USG to check on the mysterious tickle in my belly button', 'USG', 10);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (8, 'EKG for extra heartbeats after dancing in a mosh pit', 'EKG', 1);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (9, 'RTG to confirm no bones were harmed during extreme skateboarding', 'RTG', 12);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (10, 'USG after too much laughter at a comedy show', 'USG', 3);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (11, 'EKG after trying to beat my own high score in video games', 'EKG', 8);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (12, 'RTG after falling off a couch while binge-watching a series', 'RTG', 13);
INSERT INTO medical_treatment (id, description, type, visit_id) VALUES (13, 'USG to investigate what caused an unexplained snoring incident', 'USG', 15);

