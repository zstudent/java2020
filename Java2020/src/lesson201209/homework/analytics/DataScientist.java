package lesson201209.homework.analytics;

import java.util.List;

public class DataScientist extends Analyst implements Comparable<DataScientist>{

    public DataScientist(List<String> analyticsLibraries, List<String> programmingLanguages){
        this.analyticsLibraries = analyticsLibraries;
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void writeCode() {
        System.out.println("Languages that Data Scientists use are: \n"
                + this.getDataScientistLanguages());
        System.out.println("----------------------------------------");
        System.out.println("Data Scientists usually use: \n"
                + this.getAnalyticsLibraries());
        System.out.println("----------------------------------------");
    }

    @Override
    public void analyze() {
        System.out.println("Data Scientists usually analyze many kinds of large systems and try to extract knowledge from raw data.");
    }

    public List<String> getDataScientistLanguages(){
        return this.programmingLanguages;
    }

    public List<String> getAnalyticsLibraries(){
        return this.analyticsLibraries;
    }

    @Override
    public int compareTo(DataScientist o) {
        return 0;
    }
}
