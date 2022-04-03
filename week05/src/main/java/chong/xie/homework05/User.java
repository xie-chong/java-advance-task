package chong.xie.homework05;

import java.util.List;

public class User {
    private String username;
    private Integer password;
    private List list;


    public User(String username, Integer password, List list) {
        super();
        this.username = username;
        this.password = password;
        this.list = list;
    }

    public User() {
        super();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User[username =" + username + ",password =" + password + ",list =" + list + "]";
    }
}
