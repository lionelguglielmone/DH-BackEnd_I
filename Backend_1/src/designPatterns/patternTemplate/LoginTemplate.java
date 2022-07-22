package designPatterns.patternTemplate;

import java.util.ArrayList;

public abstract class LoginTemplate {
    private ArrayList<User> users;

    public LoginTemplate(){
        this.users = new ArrayList<User>();

    }

    public Boolean processUser(String user, String password){
        Boolean validUser = Boolean.FALSE;
        if(user != null || password != null){
            validUser = logIn(user, password);
        }
        return validUser;
    }

    protected Boolean validateUser(String user, String password){
        Boolean validUserFound = Boolean.FALSE;
        for(User u: this.users){
            if(u.getUsername().equals(user) && u.getPassword().equals(password)){
                validUserFound = Boolean.TRUE;
            }
        }
        return validUserFound;
    }

    protected abstract Boolean logIn(String user, String password);
}
