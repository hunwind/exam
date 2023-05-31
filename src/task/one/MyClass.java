package task.one;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("cat");
        inputList.add("dog");
        inputList.add("elephant");

        List<String> outputList = filterStrings(inputList);

        System.out.println(outputList);
    }

    public static List<String> filterStrings(List<String> inputList) {
        List<String> myList = new ArrayList<>();

        for (String str : inputList) {
            if (str.length() > 3) {
                myList.add(str);
            }
        }

        return myList;
    }
}