package TH2.BAI8_HUONG_DAN_DO_AN_TOT_NGHIEP;
public class DoAn {
    private SinhVien sv;
    private String gv, chuDe;
    public DoAn(SinhVien sv, String gv, String chuDe){
        this.sv = sv;
        this.gv = gv;
        this.chuDe = chuDe;
    }
    public String getMsv(){
        return this.sv.getCode();
    }
    public int compareTo(DoAn o){
        return this.sv.getCode().compareTo(o.sv.getCode());
    }
    public String toString(){
        String s = "";
        for(int i = 0; i < this.gv.length(); i++){
            if(!Character.isDigit(this.gv.charAt(i))) s += this.gv.charAt(i);
        }
        String tmp = s.trim();
        return this.sv.getCode() + " " + this.sv.getName() + " " + tmp + " "+ this.chuDe.trim() + " " + this.sv.getPhoneNumber();
        
    }
    
}
