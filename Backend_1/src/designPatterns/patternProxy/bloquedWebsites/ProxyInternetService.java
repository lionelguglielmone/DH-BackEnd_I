package designPatterns.patternProxy.bloquedWebsites;

import java.util.ArrayList;

public class ProxyInternetService implements InternetConnectionInterface{

    private InternetServiceProvider isp;
    private ArrayList<String> blockedUrls;

    public ProxyInternetService(InternetServiceProvider isp){
        this.isp = isp;
        this.blockedUrls = new ArrayList<>();

    }

    public void addBlockedUrl(String url){
        this.blockedUrls.add(url);
    }

    public void removeBlockedUrl(String url){
        this.blockedUrls.remove(url);
    }

    public Boolean connectTo(String url){
        Boolean connectionStablished = Boolean.FALSE;
        Boolean blockedWebsite = Boolean.FALSE;
        for (String blockedUrl: this.blockedUrls){
            if(blockedUrl.equals(url)){
                blockedWebsite = Boolean.TRUE;
                System.out.println(url + " has been blocked by proxy");
                break;
            }
        }
        if (!blockedWebsite){
            connectionStablished = isp.connectTo(url);
        }
        return connectionStablished;
    }
}
