package infrastructure;

import model.Doctor;
import model.Patient;

import static model.Doctor.*;

public class DoctorMemoryRepository implements DoctorRepository {
    @Override
    public void addPatient(Patient patient, String id) {

    }

    @Override
    public void removePatient(String dni, String id) {

    }

    @Override
    public Doctor load(String dni) {
        return (dni.equals("someDni")) ? new Doctor("Jhon Smith") :
                new NotAssignedDoctor();

    }
}
