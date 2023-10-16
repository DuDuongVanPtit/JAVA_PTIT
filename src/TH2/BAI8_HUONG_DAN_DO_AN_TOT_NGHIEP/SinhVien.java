package TH2.BAI8_HUONG_DAN_DO_AN_TOT_NGHIEP;
public class SinhVien {
    private String code, name, className, email, phoneNumber;
    public SinhVien(String code, String name, String className, String email, String phoneNumber) {
        this.code = code;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phoneNumber = "0" + phoneNumber;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}

