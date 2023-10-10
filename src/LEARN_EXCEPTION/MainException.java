package LEARN_EXCEPTION;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainException {
    //cach 2: throws CheckedException o ham main
    // neu chuong trinh gap lop thi se dung lai tai vi tri loi
    public static void main(String[] args) throws CheckedException {
        int a = 3, b = 3;
        // co hai cach de bat Excep tion
        //cach 1:
        try {
            System.out.println(testCheckedException(a, b));
        } catch (CheckedException ex) {
            ex.printStackTrace();
        }
        System.out.println(testCheckedException(a, b));
        System.out.println("ket thuc chuong trinh");
    }
    // hàm tra ve phep cong hai toan hang khong bang nhau
    // tra ve ket qua loi neu hai toan hang khonbg bang nhau
    static int testCheckedException(int a, int b) throws CheckedException{
        if(a == b){
            //nem ra mot ngoai le checkedexception
            throw new CheckedException("loi hai toan hang bang nhau");
        }
        else{
            return a + b;
        }
    }
}
