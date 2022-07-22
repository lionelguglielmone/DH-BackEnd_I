package designPatterns.patternProxy.registerDocUsers;

import java.util.ArrayList;

public class CloudDocument {
    private String id;
    private String url;
    private String content;
    private ArrayList<User> users;

    public CloudDocument(String id, String url, String content) {
        this.id = id;
        this.url = url;
        this.content = content;
        this.users = new ArrayList<>();
    }

    public void addPermittedUser(User u){
        this.users.add(u);
    }

    public void removePermittedUser(User u){
        this.users.remove(u);
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }

    public Boolean userAllowedToAccess(String email) {
        Boolean accessAllowed = Boolean.FALSE;
        for (User u: this.users) {
            if(u.getEmail().equals(email)) {
                accessAllowed = Boolean.TRUE;
                break;
            }
        }
        return accessAllowed;
    }
}
