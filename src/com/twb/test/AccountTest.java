//package com.twb.test;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
//
////@RunWith(JUnit4.class)
//public class AccountTest {
//
//    private double epsilon = 1e-6;
//
//    @Test
//    public void accountCannotHaveNegativeOverdraftLimit() {
//        Account account = new Account(-20);
//
//        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
//    }
//
//    @Test
//    public void testWithdrawAmountPositive() {
//        Account account = new Account(-20);
//        double amount = 200.0;
//        account.deposit(amount);
//        Assert.assertTrue(account.withdraw(20));
//    }
//
//    @Test
//    public void testDepositAmountPositive() {
//        Account account = new Account(-20);
//        double amount = 200.0;
//        Assert.assertTrue(account.deposit(amount));
//    }
//
//    @Test
//    public void testOverdraftLimit() {
//        Account account = new Account(-20);
//        double amount = 200.0;
//        Assert.assertTrue(account.deposit(amount));
//        Assert.assertFalse(account.withdraw(250.0));
//
//    }
//
//    @Test
//    public void testCorrectDeposit() {
//        Account account = new Account(-20);
//        double balancePrevious = account.getBalance();
//        double amount = 200.0;
//        account.deposit(amount);
//        Assert.assertEquals(account.getBalance(), (balancePrevious+amount), epsilon);
//
//    }
//
//
//    @Test
//    public void testCorrectWithdraw() {
//        Account account = new Account(-20);
//        double amount = 200.0;
//        account.deposit(amount);
//        double balancePrevious = account.getBalance();
//        account.withdraw(50);
//        Assert.assertEquals(account.getBalance(), (balancePrevious - 50), epsilon);
//
//    }
//}
