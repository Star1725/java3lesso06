import com.geekbrains.java.ProfessionalLevel.homework.Homework;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestIsOneAndFour {
    private int num1;
    private int num2;
    private Integer[] source;
    Homework homework;

    public MassTestIsOneAndFour(int num1, int num2, Integer[] source) {
        this.num1 = num1;
        this.num2 = num2;
        this.source = source;
    }

    @Before
    public void init(){
        homework = new Homework();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 2, new Integer[]{1,2,3,4,5,2,3,4,1,3,5,1,2,1,1,1,1,2,1,2,1,2,3,5,0,4,2}},
                {1, 2, new Integer[]{1,2,1,1,2,1,1,1,1,2,1,2,1,1,2,1,2,1,2,2,2,1,1,1,2,2,1}},
                {1, 2, new Integer[]{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}},
                {1, 2, new Integer[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}},
        });
    }

    @Test
    public void testIsOneAndFour(){
        Assert.assertTrue(homework.isOneAndFour(num1, num2, source));
    }
}
