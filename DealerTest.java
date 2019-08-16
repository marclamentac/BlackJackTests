/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackfundis;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author marcl
 */
public class DealerTest
{

   public DealerTest ()
   {
   }

   @BeforeClass
   public static void setUpClass ()
   {
   }

   @AfterClass
   public static void tearDownClass ()
   {
   }

   @Before
   public void setUp ()
   {
   }

   @After
   public void tearDown ()
   {
   }



   /**
    * Test of hasBlackJack method, of class Blackjack.
    */
   @Test
   public void testHasBlackJackGood ()
   {
      System.out.println("hasBlackJack");
      int handValue = 21;
      boolean expResult = true;
      boolean result = Blackjack.hasBlackJack(handValue);
      assertEquals(expResult, result);
   }

   @Test
   public void testHasBlackJackBad ()
   {
      System.out.println("hasBlackJack");
      int handValue = 25;
      boolean expResult = false;
      boolean result = Blackjack.hasBlackJack(handValue);
      assertEquals(expResult, result);
   }

   @Test
   public void testHasBlackJackBoundary ()
   {
      System.out.println("hasBlackJack");
      int handValue = 21;
      boolean expResult = true;
      boolean result = Blackjack.hasBlackJack(handValue);
      assertEquals(expResult, result);
   }




}
