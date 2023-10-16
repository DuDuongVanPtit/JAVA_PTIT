package TH2.LOP_USER;
public class UserInfo {
    private String userName, userPassword;
    public UserInfo(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getUserPassword(){
        return this.userPassword;
    }
}
