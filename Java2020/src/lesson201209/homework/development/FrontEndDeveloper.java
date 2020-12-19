package lesson201209.homework.development;

import java.util.List;

public class FrontEndDeveloper extends Developer implements Comparable<FrontEndDeveloper>{

    String firstName;
    String lastName;
    int age;

    public FrontEndDeveloper(String firstName, String lastName, int age, List<String> tools, List<String> frontEndLanguages,List<String> frameworks){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.tools = tools;
        this.programmingLanguages = frontEndLanguages;
        this.frameworks = frameworks;
    }

    @Override
    public void writeCode() {
        System.out.println("Languages that FrontEnd Developers use are: \n"
                + this.getFrondEndLanguages());
        System.out.println("----------------------------------------");
        System.out.println("FrondEnd Developers usually use: \n"
                + this.getFrontEndFrameworks());
        System.out.println("----------------------------------------");
        System.out.println("FrontEnd Devs use these tools: \n"
                + this.getFrontEndTools());
        System.out.println("----------------------------------------");
    }

    @Override
    public void develop() {
        System.out.println("FrontEnd Developers usually develop websites, mobile apps and generally UI applications.");
    }

    public List<String> getFrontEndTools(){
        return this.tools;
    }

    public List<String> getFrondEndLanguages(){
        return this.programmingLanguages;
    }

    public List<String> getFrontEndFrameworks(){
        return this.frameworks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(FrontEndDeveloper o) {
        int fName = this.firstName.compareTo(o.firstName);
        if(fName == 0){
            int lName = this.lastName.compareTo(o.lastName);
            if(lName == 0) {
                return this.age - o.age;
            }
            else{
                return lName;
            }
        }
        return fName;
    }

    @Override
    public String toString() {
        return "FrontEndDeveloper{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
