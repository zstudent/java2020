package lesson201209.homework.development;

import java.util.List;

public class BackEndDeveloper extends Developer {

    public BackEndDeveloper(List<String> tools, List<String> backEndLanguages,List<String> frameworks){
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

}
