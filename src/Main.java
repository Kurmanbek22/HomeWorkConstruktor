import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     String[] courses={"java-14","JS-14"};
        String[] courses2={"Pithon","C++"};

    MyClass myClass1=new MyClass("Kurmanbek","Abdullaev",24,courses,"manty");
        MyClass myClass2=new MyClass("Asan","Usenov",25,courses2);
        System.out.println(myClass1.firstName+"\n"+myClass1.lastName+"\n"+myClass1.age+"\n"+ Arrays.toString(myClass1.lessons) +"\n"+myClass1.favoriteDishes);
        System.out.println();
        System.out.println(myClass2.firstName+"\n"+myClass2.lastName+"\n"+myClass2.age+"\n"+ Arrays.toString(myClass2.lessons));

    }
}