import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Mywarning {

    String message () default "This is a annotation";
    int value() default 125;
    /*@Target(ElementType.FIELD)*/



}
