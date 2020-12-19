package lesson201209.homework.development;

import java.util.List;

public class BackEndDeveloper extends Developer implements Comparable<BackEndDeveloper>{

    String firstName;
    String lastName;
    int age;

    public BackEndDeveloper(String firstName, String lastName, int age, List<String> tools, List<String> backEndLanguages,List<String> frameworks){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.tools = tools;
        this.programmingLanguages = backEndLanguages;
        this.frameworks = frameworks;
    }

    @Override
    public void writeCode() {
        System.out.println("Languages that BackEnd Developers use are: \n"
                + this.getBackEndLanguages());
        System.out.println("----------------------------------------");
        System.out.println("BackEnd Developers usually use: \n"
                + this.getBackEndFrameworks());
        System.out.println("----------------------------------------");
        System.out.println("BackEnd Devs use these tools: \n"
                + this.getBackEndTools());
        System.out.println("----------------------------------------");
    }

    @Override
    public void develop() {
        System.out.println("BackEnd Developers usually develop REST APIs, web services and large complex systems which interact with databases.");
    }

    public List<String> getBackEndLanguages(){
        return this.programmingLanguages;
    }

    public List<String> getBackEndFrameworks(){
        return this.frameworks;
    }

    public List<String> getBackEndTools(){
        return this.tools;
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
    public int compareTo(BackEndDeveloper o) {
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
        return "BackEndDeveloper{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
