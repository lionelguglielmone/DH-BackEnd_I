package designPatterns.patternProxy.registerDocUsers;

public class Test {
    public static void main(String[] args) {
        User u1 = new User("james", "james@hotmail.com", "mypassword1");
        User u2 = new User("nancy", "nancy@hotmail.com", "mypassword2");
        User u3 = new User("megan", "megan@google.com", "mypassword3");
        User u4 = new User("crystal", "crystal_clear@hotmail.com", "mypassword4");
        User u5 = new User("dom", "dom@hotmail.com", "mypassword5");


        CloudDocument cd1 = new CloudDocument("202020","www.google.com/doc1", "content 1");
        cd1.addPermittedUser(u1);

        CloudDocument cd2 = new CloudDocument("202021","www.google.com/doc2", "content 2");
        cd2.addPermittedUser(u1);
        cd2.addPermittedUser(u2);
        cd2.addPermittedUser(u3);
        cd2.addPermittedUser(u4);
        cd2.addPermittedUser(u5);

        CloudDocument cd3 = new CloudDocument("202022","www.google.com/doc3", "content 3");
        cd3.addPermittedUser(u2);
        cd3.addPermittedUser(u3);
        cd3.addPermittedUser(u4);

        CloudDocument cd4 = new CloudDocument("202023","www.google.com/doc4", "content 4");

        CloudDocument cd5 = new CloudDocument("202024","www.google.com/doc5", "content 5");
        cd5.addPermittedUser(u4);
        cd5.addPermittedUser(u5);


        CloudDocService cs = new CloudDocService();
        cs.addDoc(cd1);
        cs.addDoc(cd2);
        cs.addDoc(cd3);
        cs.addDoc(cd4);
        cs.addDoc(cd5);

        ProxyCloudDocService pcs = new ProxyCloudDocService(cs);

        CloudDocument cd = pcs.getDoc("www.google.com/doc5", "crystal_clear@hotmail.com");
        if (cd != null) {
            System.out.println("Doc content: " + cd.getContent());
        } else {
            System.out.println("Either document cannot be find or user is not allowed to access it.");
        }
    }
}
