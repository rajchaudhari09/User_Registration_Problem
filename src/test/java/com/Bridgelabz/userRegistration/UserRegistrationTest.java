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
}
