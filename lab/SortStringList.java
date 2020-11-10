package lab;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringList {

	public static void main(String[] args) {

        ArrayList<String> slist = new ArrayList<String>(); 
        slist.add("Taani");
        slist.add("Vaani");
        slist.add("Rani");
        slist.add("Krishna");
        System.out.println("Original list: "+slist);
        Collections.sort(slist);
        System.out.println("Sorted list: "+slist);

	}

}
