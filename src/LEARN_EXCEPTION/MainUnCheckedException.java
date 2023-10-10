package LEARN_EXCEPTION;
public class MainUnCheckedException {
    //khi co loi chuong trinh dung luon ma khogn co try catch
    public static void main(String[] args) {
        int a = 3, b = 3;
        testUnCheckedException(a, b);
        System.out.println("ket thuc chuong trinh");
    }
    // hàm tra ve phep cong hai toan hang khong bang nhau
    // tra ve ket qua loi neu hai toan hang khonbg bang nhau
    static int testUnCheckedException(int a, int b){
        if(a == b){
            //nem ra mot ngoai le unchecked exception
            throw new UnCheckedException("loi hai toan hang bang nhau");
        }
        else{
            return a + b;
        }
    }
}
