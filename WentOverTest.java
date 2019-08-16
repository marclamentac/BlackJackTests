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
public class WentOverTest
{

   public WentOverTest ()
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
    * Test of checkBust method, of class WentOver.
    */
   @Test
   public void testCheckBustGood ()
   {
      System.out.println("checkBust");
      int handvalue = 25;
      boolean expResult = true;
      boolean result = WentOver.checkBust(handvalue);
      assertEquals(expResult, result);

   }

   @Test
   public void testCheckBustBad ()
   {
      System.out.println("checkBust");
      int handvalue = 10;
      boolean expResult = false;
      boolean result = WentOver.checkBust(handvalue);
      assertEquals(expResult, result);

   }

   @Test
   public void testCheckBustBoundary ()
   {
      System.out.println("checkBust");
      int handvalue = 21;
      boolean expResult = true;
      boolean result = WentOver.checkBust(handvalue);
      assertEquals(expResult, result);

   }


}
