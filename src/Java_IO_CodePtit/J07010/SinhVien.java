package Java_IO_CodePtit.J07010;
public class SinhVien {
    private String code, name, birth, class_name;
    private float gpa;

    public SinhVien(String name, String class_name, String birth, float gpa) {
        this.name = name;
        this.birth = birth;
        this.class_name = class_name;
        this.gpa = gpa;
    }
    public String getBith(){
        return this.birth;
    }
    public void setBirth(String birth){
        this.birth = birth;
    }
    public void Out(){
        System.out.print(this.name + " " + this.class_name +  " "  + this.birth + " ");
        System.out.printf("%.2f", this.gpa);
        System.out.println();
    }
}
