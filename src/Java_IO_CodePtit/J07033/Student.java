package Java_IO_CodePtit.J07033;
public class Student {
    private String code, name,className, email;

    public Student(String code, String name, String className, String email) {
        this.code = code;
        this.name = name;
        this.className = className;
        this.email = email;
    }
    public void setNewName() {
        String s = this.name.trim().toLowerCase();
            StringBuilder sb = new StringBuilder("");
            String [] arr = s.split("\\s+");
            for(String x : arr){
                sb.append(Character.toUpperCase(x.charAt(0)));
                sb.append(x.substring(1) + " ");
            }
            this.name = sb.toString();
    }
    public String getCode(){
        return this.code;
    }
    public String toString(){
        return this.code + " " + this.name + this.className + " " + this.email;
    }
}
