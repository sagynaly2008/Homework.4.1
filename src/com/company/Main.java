package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> textA = new ArrayList<String>();
        ArrayList<String> textB = new ArrayList<String>();
        ArrayList<String> textC = new ArrayList<String>();

        System.out.println("ведите 5 слов");
        for (int i = 0; i < 5; i++) {
            textA.add(scanner.nextLine());
        }

        Iterator<String> iterator_1 = textA.iterator();
        while (iterator_1.hasNext()) {
            System.out.println(iterator_1.next());
        }

        System.out.println("ведите 5 слов");
        for (int i = 0; i < 5; i++) {
            textB.add(scanner.nextLine());
        }
        Iterator<String> iterator_2 = textB.iterator();
        while (iterator_2.hasNext()) {
            System.out.println(iterator_2.next());
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        textC.add(textA.get(1));
        textC.add(textB.get(4));
        textC.add(textA.get(2));
        textC.add(textB.get(4));
        textC.add(textA.get(3));
        textC.add(textB.get(3));
        textC.add(textA.get(4));
        textC.add(textB.get(2));
        textC.add(textA.get(4));
        textC.add(textB.get(1));

        Iterator<String> iterator_3 = textC.iterator();
        while (iterator_3.hasNext()) {
            System.out.println(iterator_3.next());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        textC.sort(Comparator.comparing(String::length));
        Iterator<String> iterator_4 = textC.iterator();
        while (iterator_4.hasNext()) {
            System.out.println(iterator_4.next());
        }



    }

}