package J04004;
public class Phanso {
    private long tu, mau;
    public Phanso(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public Phanso(){}
    public long getTu() { return this.tu;}
    public long getMau(){ return this.mau;}
    public void setTu(long  tu){ this.tu = tu; }
    public void setMau(long mau){ this.mau = mau;}
    public void rutgon(){
        long uc = gcd(this.tu, this.mau);
        this.tu = this.tu / uc;
        this.mau = this.mau / uc;
    }
    static long gcd(long tu, long mau){
        if(mau == 0) return tu;
        return gcd(mau, tu % mau);
   }
}
