public class student{
    private int id;
    private String name;
    private int age;
    private String course;
    public student(int id,String name,int age,String course){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public int getId(){
        return id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setcourse(String course){
        this.course=course;
    }
    public String toString(){
        return "ID: " + id +",Name: "+name+",Age: "+age+", Course: "+course;
    }




}