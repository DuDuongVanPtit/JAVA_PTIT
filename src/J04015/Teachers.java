package J04015;
public class Teachers {
    private String code, name;
    private long basicSalary, allowance, lv, income;

    public Teachers(String code, String name, long basicSalary) {
        this.code = code;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public String getCode(){
        return this.code;
    }
    public void setAllowance(String jobTitle){
        if(jobTitle.compareTo("HT") == 0){
            this.allowance = 2000000;
        }
        else if(jobTitle.compareTo("HP") == 0){
            this.allowance = 900000;  
        }
        else{
            this.allowance = 500000;
        }
    }
    public void setIncome(String leverAllowance){
        this.lv = Integer.parseInt(leverAllowance);
        this.income = this.basicSalary * this.lv + this.allowance;
    }
    public String toString(){
        return (this.code + " " + this.name + " " + this.lv + " " + this.allowance + " " + this.income);
    }
}
