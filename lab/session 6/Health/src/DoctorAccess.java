import java.util.ArrayList;

public class DoctorAccess {
    private HealthSystem healthSystem;
    private Doctor doctor;

    public DoctorAccess(HealthSystem healthSystem, Doctor doctor) {
        this.healthSystem = healthSystem;
        this.doctor = doctor;
    }

    public void addDoctor(Bimar bimar)
    {

        int i;
        int j;
        for (i = 0 ; i < healthSystem.getBimars().size() ; i++)
        {
            if (bimar.getName().equals(healthSystem.getBimars().get(i).getName()))
            {
                for (j = 0 ; j < healthSystem.getBimars().get(i).getFiles().size() ; j++)
                {
                    if (doctor.getTakhasos().equals(healthSystem.getBimars().get(i).getFiles().get(j).setArrayList().get(j).getTakhasos()))
                    {
                        if (healthSystem.getBimars().get(i).getDoctors().contains(doctor))
                        {
                            System.out.println(healthSystem.getBimars().get(i).getFiles().get(j));
                            ///////
                        }
                    }
                }
            }
        }
    }


}
