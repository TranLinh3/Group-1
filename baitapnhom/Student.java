package baitapnhom;

import java.util.Scanner;
public class Student {
    private int id;
    private String lastName;
    private double mark;
    public Student(String id){
    }
    public Student(int id,String lastName, double mark){
        this.id = id;

        this.lastName = lastName;
        this.mark = mark;
    }
    public void scanInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID: ");
        this.id = scanner.nextInt();
        System.out.println("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.println("Enter mark: ");
        this.mark = scanner.nextDouble();
    }
    public void printInfo(){
        System.out.printf("%3d|%10s%10s|%5f\n", getId(),getLastName(),getMark());
    }
    public String getLastName(){
        return lastName;
    }
    public int getId(){
        return id;
    }
    public double getMark(){
        return mark;
    }
}

