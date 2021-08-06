package com.wyy.pojo;

/**
 * @Author WYY
 * @Description
 * @Date 2021/8/5 14:34
 * @ClassName User
 */
public class User {
    private int id;
    private String userName;
    private String pws;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPws() {
        return pws;
    }

    public void setPws(String pws) {
        this.pws = pws;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", pws='" + pws + '\'' +
                '}';
    }
}
