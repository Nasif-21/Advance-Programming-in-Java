import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        ClassX x=new ClassX();
        Class c=x.getClass();
        System.out.println(c.getName());
        Mywarning my=(Mywarning) c.getAnnotation(Mywarning.class);
        System.out.println(my.message());
        System.out.println(my.value());




        System.out.println("Hello world!");
    }
}