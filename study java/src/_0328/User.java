package _0328;

import java.time.LocalDate;


public class User {
    String name;
    String loginId;
    String password;
    LocalDate birthDate;
    String email;

    public User(){

    }
    public User(String name, String loginId, String password,LocalDate birthDate, String email) {
        this.name = name;
        this.loginId = loginId;
        this.password = password;
        this.birthDate = birthDate;
        this.email = email;
    }

    public String getUserName() {
        return name;
    }

    public void setUserName(String userName) {
        this.name = userName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String toString(){
        return name+", "+loginId+", "+password+", "+birthDate+", "+email;
    }
}
