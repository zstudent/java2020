package lesson201209.homework.development;

import java.util.List;

public class FrontEndDeveloper extends Developer {

    public FrontEndDeveloper(List<String> tools, List<String> frontEndLanguages,List<String> frameworks){
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

}
