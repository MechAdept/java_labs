package LAB12;

import LAB12.Task1.MyPredicate;
import LAB12.Task2.Task2;
import LAB12.Task3.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
		MyPredicate clever = (int n)->{
			if(n>=13&&n%13 == 0){
				return true;
			}
			else {
				return false;
			}
		};
		Task2 runner = (String a, String b)->{
			if(a.length() > b.length()){
				return a;
			}
			else if (b.length() > a.length()){
				return b;
			}
			else return "They equals";
		};
		Task3 BigData = (double a, double b, double c)->{
			return ((b*b)-4*(a*c));
		};
		List<String> myList = Arrays.asList("a1","a4","a3","a2","a1","a4","b1","b2");
		//System.out.println(clever.lucky(12));
		//System.out.println(runner.streq("1234235","1212343"));
		//System.out.println(BigData.Disk(1,4,2));

    }


}
