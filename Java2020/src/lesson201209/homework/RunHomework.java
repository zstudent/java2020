package lesson201209.homework;

import lesson201209.homework.analytics.Analyst;
import lesson201209.homework.analytics.DataScientist;
import lesson201209.homework.development.BackEndDeveloper;
import lesson201209.homework.development.Developer;
import lesson201209.homework.development.FrontEndDeveloper;
import lesson201209.homework.testing.Tester;

import java.util.Arrays;
import java.util.List;

public class RunHomework {

    public static void main(String[] args) {

        List<String> frontEndTools = Arrays.asList("Git","HTML5 Boilerplate","Chrome DevTools","CodePen","JSON Viewer");
        List<String> frontEndLanguages = Arrays.asList("JavaScript","TypeScript","Dart","HTML","CSS");
        List<String> frontEndFrameworks = Arrays.asList("Angular","React","Vue.js");


        List<String> backEndTools = Arrays.asList("Postman","Git", "FindBug","Powerful IDE-s","DBMS");
        List<String> backEndLanguages = Arrays.asList("Java","C#","Python","Ruby","PHP");
        List<String> backEndFrameworks = Arrays.asList("Spring",".NET","Django");

        List<String> dataScientistAnalyticsLibraries = Arrays.asList("NumPy","scikit-learn","pandas","TensorFlow","PyTorch");
        List<String> dataSCientistProgrammingLanguages = Arrays.asList("Python","R","Julia","SAS","MATLAB");

        List<Developer> developers = Arrays.asList(
                new FrontEndDeveloper(frontEndTools,frontEndLanguages,frontEndFrameworks),
                new BackEndDeveloper(backEndTools,backEndLanguages,backEndFrameworks)
        );

        developers.forEach(Programmer::writeCode);
        developers.forEach(Developer::develop);

        System.out.println("----------------------------------------");

        Analyst dataScientist = new DataScientist(dataScientistAnalyticsLibraries,dataSCientistProgrammingLanguages);
        dataScientist.writeCode();
        dataScientist.analyze();

        System.out.println("----------------------------------------");

        Tester tester = new Tester();
        tester.writeCode();
        tester.test();
    }

}
