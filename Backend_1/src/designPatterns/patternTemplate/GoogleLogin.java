package designPatterns.patternTemplate;

public class GoogleLogin extends LoginTemplate{

    @Override
    protected Boolean logIn(String user, String password) {
        System.out.println("validating Google user..");
        return validateUser(user, password);
    }


}
