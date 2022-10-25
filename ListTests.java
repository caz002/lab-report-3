import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

class CheckIfAnts implements StringChecker{
  public boolean checkString(String s){
    if(s.contains("ants")){
      return true;
    }else{
      return false;
    }
  }
}

public class ListTests{
    @Test
    public void filterTest(){
        List<String> input1 = new ArrayList<String>();
        input1.add("ants");
        input1.add("bats");
        input1.add("crabs");
        input1.add("pants");
        StringChecker a = new CheckIfAnts();
        List<String> expected = new ArrayList<String>();
        expected.add("ants"); expected.add("pants"); 
        assertEquals(expected, ListExamples.filter(input1, a));
    }
    @Test
    public void testIfNonePassFilter(){
      List<String> input1 = new ArrayList<String>();
      input1.add("bob");
      input1.add("sally");
      StringChecker a = new CheckIfAnts();
      List<String> expected = new ArrayList<String>();
      assertEquals(expected, ListExamples.filter(input1, a));
    }
    @Test
    public void testCommaMerge(){
      List<String> input1 = new ArrayList<String>();
      input1.add(",");
      input1.add("zebra");
      List<String> input2 = new ArrayList<String>();
      input2.add(";");
      input2.add("azfefe");
      List<String> expected = new ArrayList<String>();
      expected.add(","); expected.add(";"); expected.add("azfefe"); expected.add("zebra");
      assertEquals(expected, ListExamples.merge(input1, input2));

    }
    @Test
    public void mergeTest(){
      List<String> input1 = new ArrayList<String>();
      input1.add("ant"); input1.add("crab"); input1.add("zebra");
      List<String> input2 = new ArrayList<String>();
      input2.add("ant"); input2.add("buzz");
      List<String> expected = new ArrayList<String>();
      expected.add("ant"); expected.add("ant"); expected.add("buzz"); expected.add("crab"); expected.add("zebra"); 
      assertEquals(expected, ListExamples.merge(input1, input2));
    }
}