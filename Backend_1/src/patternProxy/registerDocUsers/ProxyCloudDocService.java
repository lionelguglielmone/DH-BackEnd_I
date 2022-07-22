package patternProxy.registerDocUsers;

import java.util.ArrayList;

public class ProxyCloudDocService implements DocCloudInterface {
    private CloudDocService cds;
    private ArrayList<User> usersRegistered;


    public ProxyCloudDocService(CloudDocService cds) {
        this.usersRegistered = new ArrayList<>();
        this.cds = cds;
    }



    @Override
    public CloudDocument getDoc(String url, String email) {
        Boolean userAlreadyRegistered = Boolean.FALSE;
        for (User u: this.usersRegistered) {
            if (u.getEmail().equals(email)) {
                userAlreadyRegistered = Boolean.TRUE;
            }
        }
        CloudDocument doc = this.cds.getDoc(url,email);
        if (doc != null && !userAlreadyRegistered) {
            this.usersRegistered.add(new User("", email,""));
        }

        return doc;
    }
}
