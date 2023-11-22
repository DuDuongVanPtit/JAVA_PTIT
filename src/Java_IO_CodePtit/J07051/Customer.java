package Java_IO_CodePtit.J07051;
public class Customer {
    private String code, name, newName, roomNumber, checkIn, checkOut;
    private long serviceFee, total, stayDay;

    public Customer(String name, String roomNumber, String checkIn, String checkOut, int serviceFee) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.serviceFee = serviceFee;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public void setName(){
        StringBuilder sb = new StringBuilder("");
        String[] arr = this.name.toUpperCase().trim().split("\\s+");
        for(String x : arr){
            sb.append(x.charAt(0));
            sb.append(x.substring(1).toLowerCase() );
            sb.append(" ");
        }
        this.newName = sb.toString();
    }
    
    public void setStayDay(long stayDay) {
        this.stayDay = stayDay + 1;
    }
     
    public void setTotal(){
        this.total = this.serviceFee;
        if(this.roomNumber.charAt(0) == '1'){
            this.total += (this.stayDay) * 25;
        }
        else if(this.roomNumber.charAt(0) == '2'){
            this.total += (this.stayDay) * 34;
        }
        else if(this.roomNumber.charAt(0) == '3'){
            this.total += (this.stayDay) * 50;
        }
        else{
            this.total += (this.stayDay) * 80;
        }
    }
    
    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }
    
    public long getTotal(){
        return this.total;
    }
    public String toString(){
        return this.code + " " + this.newName +  this.roomNumber + " " + this.stayDay + " " + this.total;
    }
}
