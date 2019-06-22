package com.github.hcsp.inheritance;

public class User {
    private Integer id;
    private String name;

    public User(Integer id, String name) {
        this.id = this.id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new User(1, "user1") == new User(1, "user1"));
        System.out.println(new User(1, "user1").equals(new User(1, "user1")));
        System.out.println(new User(1, "user1").equals(new User(2, "user2")));
    }

    // 请在这里覆盖equals方法，使得两个相同ID的用户equals返回true

}