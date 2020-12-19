public abstract  class Manager extends Employee {
    String Project;

    abstract void managesProject();

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }
}