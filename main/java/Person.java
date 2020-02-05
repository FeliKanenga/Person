public class Person {
    private String name= "";
    private int age;
    private String gender;
    private String[] interest;
    String txt = "";
    String msg = "";

    public Person(String name, int age, String gender, String[] interest) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }

    public String hello() {

        for (int i = 0; i < interest.length ; i++) {

           if (i == interest.length-1){

               msg += "and "+ interest[i];
           }
           else{
               msg += interest[i] + " ";
           }

        }
        return txt = "Hello, my name is " + name + " and I am " + age + " years old." +
                " My interests are " + msg ;
    }



}
