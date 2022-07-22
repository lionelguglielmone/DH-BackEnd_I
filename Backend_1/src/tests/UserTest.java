package tests;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;


public class UserTest {

    @Test
    public void test01AddNewFriend(){
        User u = new User("John", "john@gmail.com", "mypassword");
        u.addFriend("Francis");
        assertTrue(u.isFriend("Francis"));
        assertFalse(u.isFriend("Max"));
       // assertEquals(Optional.of(1),total);
    }

}