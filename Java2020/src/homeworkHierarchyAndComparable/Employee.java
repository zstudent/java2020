public abstract class Employee implements Comparable<Employee> {
    String name;
    Integer yearsOfExperience;


    @Override
    public int compareTo(Employee o) {
        if (name.length() != o.name.length()) {
            return name.length() - o.name.length();
        } else {
            return yearsOfExperience.compareTo(o.yearsOfExperience);
        }
    }

    static void nameIs(String name) {
        System.out.println("Employee's name is " + name);
    };

    abstract void isWorking();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
