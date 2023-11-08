
package Java_IO_CodePtit.J07033;
public class Student {
    private String code, name, className, email;

    public Student(String code, String name, String className, String email) {
        this.code = code;
        this.name = name;
        this.className = className;
        this.email = email;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name.trim();
    }
    

    public String toString(){
        return this.code + " " + this.name + " " + this.className + " " + this.email;
    }
}
