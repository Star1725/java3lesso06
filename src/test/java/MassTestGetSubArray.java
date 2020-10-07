import com.geekbrains.java.ProfessionalLevel.homework.Homework;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class MassTestGetSubArray {

    private Integer[] exp;
    private int element;
    private Integer[] source;
    Homework homework;

    public MassTestGetSubArray(Integer[] exp, int element, Integer[] source) {
        this.exp = exp;
        this.element = element;
        this.source = source;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{5,6}, 4, new Integer[]{1,2,3,4,5,6}},
                {new Integer[]{3,4}, 1, new Integer[]{1,2,3}},
                {new Integer[]{5,6}, 4, new Integer[]{1,2,3,8,5,6}},
                {new Integer[]{}, 2, new Integer[]{1,3,4,5,2}}
        });
    }

    @Before
    public void init(){
        homework = new Homework();
    }

    @Test
    public void testGetSubArray(){
        Assert.assertArrayEquals(exp,  homework.getSubArray(element, source));
    }
}
