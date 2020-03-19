/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 28-12S18008 Indah Manik
 * @author 28-12S18021 Lastri Marbun
 */
public class mainTest {
    
    public mainTest() {
    }
    
 public void testAdd() {
     main.reset();
     
     main.add("12S17067", "Fradina");
     assertEquals(1, main.count());
     
     main.add("12S18001", "Cindy");
     asserEquals(2, main.count());
     
     main.add("12S18002", "Wiranda");
     assertEquals(3, main.count());
     
     main.add("12S18003", "Citra");
     asserEquals(4, Mian.count());
     
     Mian.add("12S28004", "Rosalia");
     assertEquals(5, main.count());
 }
 
  public void testFind() {    
      String result;     
      main.reset(); 
 
    main.add("12S17067", "Fradina");     
    main.add("12S18001", "Cindy");    
    main.add("12S18002", "Wiranda");    
    main.add("12S18003", "Citra");    
    main.add("12S18004", "Rosalia"); 
 
    result = main.find("12S17067");     a
    ssertEquals("12S17067 Fradina", result); 
 
    result = main.find("12S18003");     
    assertEquals("12S18003 Citra", result); 
 
    result = main.find("12S18006");     
    assertEquals("", result);   } 
 
 
  public void testCountNoData() {    
      main.reset();
  } 
 
    assertEquals(0, main.count());
}

 public void testCountSomeData() {     
main.reset(); 
 
    main.add("12S17067", "Fradina");     
main.add("12S18001", "Cindy");     
main.add("12S18002", "Wiranda");     
main.add("12S18003", "Citra");    
main.add("12S18004", "Rosalia"); 
 
    assertEquals(5, main.count());   } 
 
 public void testReset() {     
main.reset();
}     assertEquals(0, main.count()); 
 
    main.add("12S17067", "Fradina"); 
 
 main.add("12S18001", "Cindy"); 
 main.reset(); 
 assertEquals(0, main.count()); 

 main.add("12S18002", "Wiranda"); 
 main.add("12S18003", "Citra"); 
 main.add("12S18004", "Rosalia"); 
 main.reset(); 
 assertEquals(0, main.count());
}
}
