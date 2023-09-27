package J04005;
public class Student {
    private String name, birthday;
    private float sub1, sub2, sub3;
    public Student(String name, String birthday, float sub1, float sub2, float sub3){
        this.name = name;
        this.birthday = birthday;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    public void show(){
        System.out.println(this.name + " " + this.birthday + " " + (this.sub1 + this.sub2 + this.sub3));
    }
}
