class ProjectManager extends Manager {


    @Override
    void managesProject() {
        System.out.println(name + " is managing " + getProject());

    }
    @Override
    void isWorking() {
        System.out.println(name + " is working");
    }
}

