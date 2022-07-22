package tests;

import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private String password;
    private ArrayList<String> friends;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addFriend(String friend) {
        this.friends.add(friend);
    }

    public void removeFriend(String friend) {
        this.friends.remove(friend);
    }

    public Boolean isFriend(String friend) {
        return this.friends.contains(friend);
    }

    public Integer getTotalFriends(){
        return this.friends.size();
    }
}
