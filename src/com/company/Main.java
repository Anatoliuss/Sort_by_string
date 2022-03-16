package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
    Friend[] friends = new Friend[4];
    friends[0] = new Friend("White", "James", "88005553535", " 10.09.99");
    friends[1] = new Friend("Brown", "George", "57483859543", " 07.11.98");
    friends[2]= new Friend("Smith", "Alice", "23521095555", " 23.06.99");
    friends[3]=new Friend ("Smith", "Mary", "34973098765", "11.04.00");
    Arrays.sort(friends);
    System.out.println(Arrays.toString(friends));
    }
}
