package com.Bridgelabz.userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void userLastName_validThenTrue() {
        UserRegistration User = new UserRegistration();
        boolean lastName = User.checkName("Name");
        Assert.assertTrue(lastName);
    }
   @Test
    public void userLastName_invalidThenFalse() {
        UserRegistration User = new UserRegistration();
        boolean lasttName = User.checkName("name");
        Assert.assertFalse(lasttName);
    }
    @Test
    public void userEmail_validThenTrue(){
        UserRegistration User = new UserRegistration();
        boolean userEmail = User.checkEmail("rajchaudhari366@gmail.com");
        Assert.assertTrue(userEmail);
    }
    @Test
    public void userMobileNumber_validThenTrue() {
        UserRegistration User = new UserRegistration();
        boolean mobilenumber = User.checkMobileNumber("91 7016379039");
        Assert.assertTrue(mobilenumber);
    }
    @Test
    public void userMobileNumber_invalidThenFalse() {
        UserRegistration User = new UserRegistration();
        boolean mobileNumber = User.checkMobileNumber("1234567890");
        Assert.assertFalse(mobileNumber);
    }
    @Test
    public void userPassword_validThenTrue() {
        UserRegistration User = new UserRegistration();
        boolean password = User.checkPassword("a64Daffy8547");
        Assert.assertTrue(password);
    }
    @Test
    public void userPassword_invalidThenFalse() {
        UserRegistration User = new UserRegistration();
        boolean password = User.checkPassword("dh67");
        Assert.assertFalse(password);
    }
}
