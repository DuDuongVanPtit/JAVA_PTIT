package J05081;
public class Items {
    private String maMh, tenMh, dvTinh;
    private int giaMua, giaBan, loiNhuan;
    public Items(String maMh,String tenMh, String dvTinh, int giaMua, int giaBan) {
        this.maMh = maMh;
        this.tenMh = tenMh;
        this.dvTinh = dvTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }
    public int getLoiNhuan(){
        return this.loiNhuan;
    }
    public int getMa(){
        return Integer.parseInt(this.maMh);
    }
    public void show(){
        System.out.println("MH"+this.maMh + " " + this.tenMh  + " " + this.dvTinh + " " + this.giaMua + " "  + this.giaBan + " " + this.loiNhuan);
    }
}
