package actions;


import infrastructure.DoctorRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CommandRemovePatientShould {

    private DoctorRepository doctorRepository;

    @Before
    public void setUp() throws Exception {
        doctorRepository = mock(DoctorRepository.class);
    }

    @Test
    public void remove_a_patient_from_a_doctor_patients_list() throws Exception {
        CommandRemovePatient commandRemovePatient = new CommandRemovePatient("someDNI", doctorRepository ,"someId");

        commandRemovePatient.run();

        verify(doctorRepository).removePatient(eq("someDNI"), eq("someId"));
    }
}