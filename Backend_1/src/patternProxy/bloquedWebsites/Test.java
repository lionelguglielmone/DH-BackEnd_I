package patternProxy.bloquedWebsites;

public class Test {
    public static void main(String[] args) {
        InternetServiceProvider isp = new InternetServiceProvider();
        isp.addWebsite("www.google.com");
        isp.addWebsite("www.yahoo.com");
        isp.addWebsite("www.effedupmovies.net");
        isp.addWebsite("www.cartoonnetwork.com");
        isp.addWebsite("www.bukeala.com");

        ProxyInternetService proxy = new ProxyInternetService(isp);
        proxy.addBlockedUrl("www.effedupmovies.net");

        proxy.connectTo("www.google.com");
        proxy.connectTo("www.effedupmovies.net");

    }

}
