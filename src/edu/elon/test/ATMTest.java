/**
 * ATMTest.java 1.0 Sep 7, 2015
 * 
 * Copyright (c) 2015 Matthew Bloom. All Rights Reserved
 */
package edu.elon.test;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Enter summary here
 * 
 * @author Matthew Bloom
 * @version 1.0
 *
 */
public class ATMTest {

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  /**
   * Test method for {@link edu.elon.test.ATM#ATM(double)}.
   */
  @Test
  public void testATMDouble() {
    ATM ATMClass = new ATM(1000.1);
    if (ATMClass.getBalance() != 1000.1) {
      fail("Balance not correct");
    }
  }

  /**
   * Test method for {@link edu.elon.test.ATM#deposit(double)}.
   */
  @Test
  public void testDeposit() {
    ATM ATMClass = new ATM(1000.1);
    ATMClass.deposit(1000);
    if (ATMClass.getBalance() != 2000.1) {
      fail("Balance not correct");
    }
  }

  /**
   * Test method for {@link edu.elon.test.ATM#getBalance()}.
   */
  @Test
  public void testGetBalance() {
    ATM ATMClass = new ATM(1000.1);
    if (ATMClass.getBalance() != 1000.1) {
      fail("Balance not correct");
    }
  }

  /**
   * Test method for exception {@link edu.elon.test.ATM#deposit()}.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testDepositExcpetion() {
    ATM ATMClass = new ATM(1000.1);
    ATMClass.deposit(1 - 1000);
  }

  /**
   * Test method for {@link edu.elon.test.ATM#toString()}.
   */
  @Test
  public void testToString() {
    String expected = "Amount balance is $1,000.00";
    ATM ATMClass = new ATM(1000);
    if (!(ATMClass.toString().equals(expected))) {
      fail("Statement is incorrect");
    }
  }

  /**
   * Test method for {@link edu.elon.test.ATM#withdraw(double)}.
   */
  @Test
  public void testWithdraw() {
    ATM ATMClass = new ATM(1000);
    ATMClass.withdraw(200);
    if (ATMClass.getBalance() != 800) {
      fail("Balance not correct");
    }
  }

  /**
   * Test method for {@link edu.elon.test.ATM#withdraw(double)}.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testWithdrawException() {
    ATM ATMClass = new ATM(1000.1);
    ATMClass.withdraw(-1000);
  }

}
