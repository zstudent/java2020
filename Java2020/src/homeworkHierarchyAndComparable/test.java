import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class test {


    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();
        projectManager.setYearsOfExperience(10);
        projectManager.setName("Marry");
        projectManager.setProject("TestProject");
        projectManager.managesProject();

        SeniorSoftwareDeveloper seniorSoftwareDeveloper = new SeniorSoftwareDeveloper();
        seniorSoftwareDeveloper.setName("Bob");
        seniorSoftwareDeveloper.setYearsOfExperience(7);
        SeniorSoftwareDeveloper seniorSoftwareDeveloper1 = new SeniorSoftwareDeveloper();
        seniorSoftwareDeveloper1.setName("Tom");
        seniorSoftwareDeveloper1.setYearsOfExperience(8);
        MidSoftwareDeveloper midSoftwareDeveloper = new MidSoftwareDeveloper();
        midSoftwareDeveloper.setName("Cody");
        midSoftwareDeveloper.setYearsOfExperience(3);
        MidSoftwareDeveloper midSoftwareDeveloper1 = new MidSoftwareDeveloper();
        midSoftwareDeveloper1.setName("Rambo");
        midSoftwareDeveloper1.setYearsOfExperience(4);
        JuniorSoftwareDeveloper juniorSoftwareDeveloper = new JuniorSoftwareDeveloper();
        juniorSoftwareDeveloper.setName("Pops");
        juniorSoftwareDeveloper.setYearsOfExperience(1);

        List<Employee> employeeList = Arrays.asList(projectManager, seniorSoftwareDeveloper1, seniorSoftwareDeveloper, midSoftwareDeveloper, midSoftwareDeveloper1, juniorSoftwareDeveloper);
        employeeList.forEach(Employee::isWorking);
        Collections.sort(employeeList);
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).getName());
        }
    }
}
