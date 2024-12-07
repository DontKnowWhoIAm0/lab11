package model;

public class User {
    private String nickName;
    private String userName;
    private String phoneNumber;
    private String passWord;

    public User() {}
    public User(String nickName, String userName, String phoneNumber, String passWord) {
        this.nickName = nickName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setUserName(String UserName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public String getUserName() {
        return userName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

}

