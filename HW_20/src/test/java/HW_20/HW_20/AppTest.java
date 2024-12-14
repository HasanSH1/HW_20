package HW_20.HW_20;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * HASAN SHRKAWE 212148670
 * HAMZE MAREI 211841291
 */
public class AppTest {
	App Tester=new App();

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test  public void TC_1(){
    	String Expected_Result=" No Roots";
    	int a=5,b=9,c=14;
    	String actual_result=Tester.calc_roots(a,b,c);
    	assertEquals(Expected_Result, actual_result);
    	
    }

@Test  public void TC_2(){
	String Expected_Result=" No Roots";
	int a=6,b=8,c=10;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_3(){
	String Expected_Result="Two roots ";
	int a=199,b=15,c=16;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_4(){
	String Expected_Result="Two roots ";
	int a=200,b=120,c=13;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_5(){
	String Expected_Result=" No Roots";
	int a=8,b=5,c=10;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_6(){
	String Expected_Result=" No Roots";
	int a=15,b=6,c=16;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_7(){
	String Expected_Result="Two roots ";
	int a=15,b=199,c=16;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_8(){
	String Expected_Result="Two roots ";
	int a=16,b=200,c=17;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_9(){
	String Expected_Result=" No Roots";
	int a=16,b=17,c=5;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_10(){
	String Expected_Result=" No Roots";
	int a=15,b=16,c=6;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_11(){
	String Expected_Result=" Two roots ";
	int a=15,b=16,c=199;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	
}
@Test  public void TC_12(){
	String Expected_Result="Two roots ";
	int a=17,b=18,c=200;
	String actual_result=Tester.calc_roots(a,b,c);
	assertEquals(Expected_Result, actual_result);
	


	}
}

   


    
    
    

