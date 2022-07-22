package designPatterns.patternProxy.registerDocUsers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloudDocumentTest {

    @Test
    public void test01ContentIsGotSuccesfully(){
        CloudDocument cd = new CloudDocument("202020","www.google.com", "This is content");
        Assert.assertEquals(cd.getContent(), "This is content");

    }

}