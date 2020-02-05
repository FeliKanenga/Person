import org.junit.Assert

class MainProgramTest {
    void testMain() {

        Person person = new Person("Ryan", 30, "male",
                new String[]{"being a hardarse", "agile", "ssd hard drives"});

        String a = person.hello();
        Assert.assertEquals(a, "Hello, my name is Ryan and I am 30 years old. My interests are being a hardarse agile  and ssd hard drives");

    }
}
