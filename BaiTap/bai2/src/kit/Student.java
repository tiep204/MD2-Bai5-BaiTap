package kit;

public class Student {
    private String name;
    private String classes;

    public Student(){
        this.name = "john";
        this.classes = "CO2";
    }
    public Student(String name , String classes){
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }
    public String getClasses(){
        return classes;
    }
}
