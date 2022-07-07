package kia;

import kia.StringFunctions;

import java.util.Arrays;
import java.util.List;

public class TestStringFunctions {
    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 3);
        System.out.println(StringFunctions.joinToString(list, "; ", "(", ")"));

    }
}
