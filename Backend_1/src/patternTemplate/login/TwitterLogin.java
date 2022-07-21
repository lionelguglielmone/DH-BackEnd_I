package patternTemplate.login;

public class TwitterLogin extends LoginTemplate{
    @Override
    protected Boolean logIn(String user, String password) {
        System.out.println("validating Twitter user..");
        return validateUser(user, password);
    }
}
