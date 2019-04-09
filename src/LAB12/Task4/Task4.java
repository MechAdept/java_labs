package LAB12.Task4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static java.lang.Integer.parseInt;

public class Task4 {
    public  boolean ex1(List list){
        if (list.stream().anyMatch(Predicate.isEqual("a1")));
        return true;
    }
    public  boolean ex2(List list){
        if (list.stream().allMatch((element)->list.contains("2")));
        return true;
    }
    public  boolean ex3(List list){
        if (list.stream().anyMatch(Predicate.isEqual("5"))){
            return false;
        } else {
            return true;
        }
    }
    public  void ex4(List list){
        for (Object i:list){
            System.out.println(i+"_1");
        }
    }
    public int[] ex5 (List list){
        int[] iarr = list.stream()
                .mapToInt((element)->parseInt(list.toString().substring(1)))
                .toArray();
        return  iarr;
    }
//    public String[] ex6 (List list){
//        list.stream()
//                .sorted()
//    }

}
