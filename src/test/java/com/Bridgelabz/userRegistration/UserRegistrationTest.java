package com.Bridgelabz.userRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void userFirstName_validThenTrue() {
        UserRegistration User = new UserRegistration();
        boolean firstName = User.checkName("Name");
        Assert.assertTrue(firstName);
    }
   @Test
    public void userFirstName_invalidThenFalse() {
        UserRegistration User = new UserRegistration();
        boolean firstName = User.checkName("name");
        Assert.assertFalse(firstName);
    }
}
