package designPatterns.patternProxy.bloquedWebsites;

import java.util.ArrayList;

public class InternetServiceProvider implements InternetConnectionInterface{

    private ArrayList<String> websites;

    public InternetServiceProvider(){
        this.websites = new ArrayList<>();
    }

    public void addWebsite(String website){
        this.websites.add(website);
    }

    public void deleteWebsite(String website){
        this.websites.remove(website);
    }

    public Boolean connectTo(String url) {
        Boolean connectionStablished = Boolean.FALSE;
        for (String website: this.websites){
            if(website.equals(url)){
                connectionStablished = Boolean.TRUE;
                System.out.println("Going to " + url);
                break;
            }
        }
        return connectionStablished;
    }
}
