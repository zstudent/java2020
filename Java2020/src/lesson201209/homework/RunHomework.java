package lesson201209.homework;

import lesson201209.homework.analytics.Analyst;
import lesson201209.homework.analytics.DataScientist;
import lesson201209.homework.development.BackEndDeveloper;
import lesson201209.homework.development.Developer;
import lesson201209.homework.development.FrontEndDeveloper;
import lesson201209.homework.testing.Tester;

import java.util.*;

public class RunHomework {

    public static void main(String[] args) {

        List<String> frontEndTools = Arrays.asList("Git","HTML5 Boilerplate","Chrome DevTools","CodePen","JSON Viewer");
        List<String> frontEndLanguages = Arrays.asList("JavaScript","TypeScript","Dart","HTML","CSS");
        List<String> frontEndFrameworks = Arrays.asList("Angular","React","Vue.js");

        List<String> backEndTools = Arrays.asList("Postman","Git", "FindBug","Powerful IDE-s","DBMS");
        List<String> backEndLanguages = Arrays.asList("Java","C#","Python","Ruby","PHP");
        List<String> backEndFrameworks = Arrays.asList("Spring",".NET","Django");

        /*
        List<String> dataScientistAnalyticsLibraries = Arrays.asList("NumPy","scikit-learn","pandas","TensorFlow","PyTorch");
        List<String> dataSCientistProgrammingLanguages = Arrays.asList("Python","R","Julia","SAS","MATLAB");*/

        List<FrontEndDeveloper> frontEndDevs = new ArrayList<FrontEndDeveloper>();

        frontEndDevs.add(new FrontEndDeveloper("Hafthor", "Bjornsson", 35, frontEndTools,frontEndLanguages,frontEndFrameworks));
        frontEndDevs.add(new FrontEndDeveloper("Zydrunas", "Savickas", 50, frontEndTools,frontEndLanguages,frontEndFrameworks));
        frontEndDevs.add(new FrontEndDeveloper("Terry", "Hollands", 40, frontEndTools,frontEndLanguages,frontEndFrameworks));
        frontEndDevs.add(new FrontEndDeveloper("Zydrunas", "Lalas", 40, frontEndTools,frontEndLanguages,frontEndFrameworks));

        List<BackEndDeveloper> backEndDevs = new ArrayList<BackEndDeveloper>();

        backEndDevs.add(new BackEndDeveloper("Tom", "Stoltman", 24, backEndTools, backEndLanguages,backEndLanguages));
        backEndDevs.add(new BackEndDeveloper("Brian", "Shaw", 35, backEndTools, backEndLanguages,backEndLanguages));
        backEndDevs.add(new BackEndDeveloper("Konstantine", "Janashia", 30, backEndTools, backEndLanguages,backEndLanguages));
        backEndDevs.add(new BackEndDeveloper("Tom", "Stoltman", 20, backEndTools, backEndLanguages,backEndLanguages));


        Collections.sort(frontEndDevs);
        Collections.sort(backEndDevs);

        System.out.println(frontEndDevs);
        System.out.println(backEndDevs);

       /* System.out.println("----------------------------------------");

        Analyst dataScientist = new DataScientist(dataScientistAnalyticsLibraries,dataSCientistProgrammingLanguages);
        dataScientist.writeCode();
        dataScientist.analyze();

        System.out.println("----------------------------------------");

        Tester tester = new Tester();
        tester.writeCode();
        tester.test();*/
    }

}
