
package J04007;
public class Employee {
    String code = "00001";
    private String name, sex, birthday,  address, taxes, contractdate;
    public Employee(String name, String sex, String birthday, String address, String taxes, String contractdate){
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.taxes = taxes;
        this.contractdate = contractdate;
    }
    public void Show(){
        System.out.println(this.code + " " + this.name + " " + this.sex + " " + this.birthday + " " + this.address + " " + this.taxes + " " + this.contractdate);
    }
}
