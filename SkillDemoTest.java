import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SkillDemoTest {
    
    @Test 
    public void testAdd(){
        SkillDemo test = new SkillDemo();
        assertEquals(1, test.add(0,1));
    }
}
