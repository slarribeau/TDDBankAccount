package test;

import main.BankAccount;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BankAccountTest {
    @Test
    public void myFirstTest() {
        BankAccount bankAccount = new BankAccount();
        boolean t = bankAccount.doWork();
        assertTrue(t);
    }
}
