import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void Test(){

        Person person = new Person("Ryan", 30, "male",
                new String[]{"being a hardarse", "agile", "ssd hard drives"});

        String a = person.hello();
        Assert.assertEquals(a, "Hello, my name is Ryan and " +
                "I am 30 years old. My interests are being a hardarse, agile, and ssd hard drives");

    }

    @Test
    public void TestName(){

        Person person = new Person("Ryan", 30, "male",
                new String[]{"being a hardarse", "agile", "ssd hard drives"});

        Assert.assertEquals(person.name, "Ryan");

    }

    @Test
    public void TestAge(){

        Person person = new Person("Ryan", 30, "male",
                new String[]{"being a hardarse", "agile", "ssd hard drives"});

        Assert.assertEquals(person.age, 30);

    }

    @Test
    public void TestGender(){

        Person person = new Person("Ryan", 30, "male",
                new String[]{"being a hardarse", "agile", "ssd hard drives"});

        Assert.assertEquals(person.gender, "male");

    }

    @Test
    public void TestInterest(){

        Person person = new Person("Ryan", 30, "male",
                new String[]{"being a hardarse", "agile", "ssd hard drives"});

        Assert.assertArrayEquals(person.interest, new String [] {"being a hardarse", "agile", "ssd hard drives"});

    }

}