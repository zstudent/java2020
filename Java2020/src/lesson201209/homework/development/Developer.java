package lesson201209.homework.development;

import lesson201209.homework.Programmer;

import java.util.List;

public abstract class Developer extends Programmer {

    public List<String> frameworks;

    public List<String> tools;

    public abstract void develop();

}
