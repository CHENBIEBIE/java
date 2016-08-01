package com.kaishengit.actiom;


import com.kaishengit.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserAction {

    private User user;

    private List<String> names;

    public String toSave() {
        System.out.println("save...");
        return "success";
    }
    public String save() {

        System.out.println("username:" + user.getUsername() + " address:" + user.getAddress());
        return "success";
    }

    public String list() {
        System.out.println("list...");

        names = new ArrayList<>();
        names.add("aaa");
        names.add("bbb");

        return "success";
    }


    //get set
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
