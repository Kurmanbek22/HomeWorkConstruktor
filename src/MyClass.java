public class MyClass {
    String  firstName;
    String  lastName;
    int age;
    String[] lessons;
    String favoriteDishes;
    public  MyClass(){
    }
    public MyClass(String firstName,String lastName,int age,String[]lessons){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.lessons=lessons;
    }
    public MyClass(String firstName,String lastName,int age,String[]lessons,String favoriteDishes){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.lessons=lessons;
        this.favoriteDishes=favoriteDishes;
    }
}
