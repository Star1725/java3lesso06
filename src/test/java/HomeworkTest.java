import com.geekbrains.java.ProfessionalLevel.homework.Homework;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkTest {
    Homework homework;
    @Before
    public void init(){
        homework = new Homework();
    }
    @Test
    public void testGetSubArray1(){
        Assert.assertArrayEquals(new Integer[]{5, 6},  homework.getSubArray(4, 1,2,3,4,5,6));
    }
    @Test(expected = RuntimeException.class)
    public void testGetSubArray2(){
        Assert.assertArrayEquals(new Integer[]{5, 6},  homework.getSubArray(4, 1,2,3,5,7,6));
    }
    @Test
    public void testGetSubArray3(){
        Assert.assertArrayEquals(new Integer[]{2, 3, 1, 5, 6},  homework.getSubArray(4, 4,2,3,1,5,6));
    }
    @Test
    public void testGetSubArray4(){
        Assert.assertArrayEquals(new Integer[]{},  homework.getSubArray(4, 4,2,3,4,5,4));
    }
}
