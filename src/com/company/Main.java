package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //ListA
        System.out.println("Ввод в лист A");
        ArrayList<String> namesA=new ArrayList<>();

        //Input
        Scanner scanner=new Scanner(System.in);
        namesA.add(scanner.nextLine());
        namesA.add(scanner.nextLine());
        namesA.add(scanner.nextLine());
        namesA.add(scanner.nextLine());
        namesA.add(scanner.nextLine());

        //Output
        Iterator<String> iterA = namesA.iterator();
        while(iterA.hasNext()){
            System.out.println("["+iterA.next()+"]");
        }

        //List B
        System.out.println("\nВвод в лист B");
        ArrayList<String> namesB=new ArrayList<>();

        //Input
        Scanner inB=new Scanner(System.in);
        namesB.add(inB.nextLine());
        namesB.add(inB.nextLine());
        namesB.add(inB.nextLine());
        namesB.add(inB.nextLine());
        namesB.add(inB.nextLine());

        //Output
        Iterator<String> iterB = namesB.iterator();
        while(iterB.hasNext()){
            System.out.println("["+iterB.next()+"]");
        }

        //List C
        System.out.println("\nЛист C");
        Collections.reverse(namesB);
        ArrayList<String> namesC=new ArrayList<>();
        iterA=namesA.iterator();
        iterB=namesB.iterator();

        //Input
        while(iterA.hasNext()&&iterB.hasNext()){
            String a=iterA.next();
            String b=iterB.next();
            namesC.add(a);
            namesC.add(b);
        }
        //Output
        Iterator<String> iterC = namesC.iterator();
        while(iterC.hasNext()){
            System.out.println("["+iterC.next()+"]");
        }
        namesC.sort(Comparator.comparing(String::length));
        //SortOutput
        System.out.println("Отсортированный лист");
        iterC=namesC.iterator();
        while(iterC.hasNext()){
            System.out.println("["+iterC.next()+"]");
        }
    }
}