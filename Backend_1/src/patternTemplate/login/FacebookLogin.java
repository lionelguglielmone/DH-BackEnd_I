package patternTemplate.login;

public class FacebookLogin extends LoginTemplate {
    @Override
    protected Boolean logIn(String user, String password) {
        System.out.println("validating Facebook user..");
        return validateUser(user, password);
    }
}
