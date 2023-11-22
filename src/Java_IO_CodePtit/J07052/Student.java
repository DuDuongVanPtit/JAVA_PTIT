package Java_IO_CodePtit.J07052;
public class Student {
    private String code, name, newName;
    private Double mathScore, physicScore, chemistryScore, total, priorityScore;
    private Integer admission;
    
    public Student(String code, String name, Double mathScore, Double physicScore, Double chemistryScore) {
        this.code = code;
        this.name = name;
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.chemistryScore = chemistryScore;
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
    
    public void setTotal(){
        this.total = this.mathScore * 2 + this.physicScore + this.chemistryScore;
        if(this.code.charAt(2) == '1'){
            this.total += 0.5;
            this.priorityScore = 0.5;
        }
        else if(this.code.charAt(2) == '2'){
            this.total += 1.0;
            this.priorityScore = 1.0;
        }
        else{
            this.total += 2.5;
            this.priorityScore = 2.5;
        }
    }

    public Double getTotal() {
        return total;
    }
    
    public String toString(){
        return this.code + " " + this.newName + formatNumber(this.priorityScore) + " " + formatNumber(this.total);
    }
    
    public static String formatNumber(double number) {
    if (number == (int) number) {
        return String.valueOf((int) number);
    } else {
        return String.valueOf(number);
    }
}
}
