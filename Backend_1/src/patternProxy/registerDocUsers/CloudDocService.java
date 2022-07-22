package patternProxy.registerDocUsers;

import java.util.ArrayList;

public class CloudDocService implements DocCloudInterface{

    private ArrayList<CloudDocument> docs;

    public CloudDocService(){
        this.docs = new ArrayList<>();
    }

    public void addDoc(CloudDocument d){
        this.docs.add(d);
    }

    public void removeDoc(CloudDocument d){
        this.docs.remove(d);
    }

    @Override
    public CloudDocument getDoc(String url, String email) {
        for (CloudDocument d: this.docs) {
            if (d.getUrl().equals(url)) {
                if (d.userAllowedToAccess(email)) {
                    return d;
                }
                break;
            }
        }

        return null;
    }
}
