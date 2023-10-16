package TH2.BAI7_DANH_SACH_LIEN_LAC;
public class SinhVien {
    private String code, name, className, email, phoneNumber;
    public SinhVien(String code, String name, String className, String email, String phoneNumber) {
        this.code = code;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getClassName(){
        return this.className;
    }
    public String getCode(){
        return this.code;
    }
    public String toString(){
        return code + " " + name + " " + className + " " + email +  " " + phoneNumber;
    }
}
