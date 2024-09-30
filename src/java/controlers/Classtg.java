/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlers;

import java.util.Scanner;
import models.Coder;

/**
 *
 * @author ACER
 */
public class Classtg {

    /**
     *
     */
    public static void swc( Coder coder ) {
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt(); // chon option
        switch (option) {
            case 1 ->
                coder.setPrograming_Language("java");
            case 2 ->
                coder.setPrograming_Language("python");
            case 3 ->
                coder.setPrograming_Language("C#");
            case 4 ->
                coder.setPrograming_Language("C++");
        }

    }

    public static void main(String[] args) {

        Coder coder = new Coder();
        Coder coder1 = new Coder();
        Coder coder2 = new Coder();
        
//        coder2.setName("hau");
//        String name = coder.getName();
//        System.out.println(name);
//        
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        //coder.setName(name);        
        coder.setName(name);

        // nhap tuoi tren 18
        System.out.println("Nhap tuoi:");
        int age = sc.nextInt();
        coder.setAge(age);
        while (coder.getAge() == 0) {
            age = sc.nextInt();
            coder.setAge(age);
        }

        System.out.println("Nhap SDT:");
        String phone = sc.next();
        coder.setPhone(phone);

        

//        String Language = sc.next();
//        coder1.setPrograming_Language(Language);

        System.out.println("Ten:" + coder.getName());
        System.out.println("Tuoi:" + coder.getAge());
        System.out.println("SDT:" + coder.getPhone());
        System.out.println("Chon ngon ngu:");
        swc(coder);
        System.out.println("Ngon ngu:" + coder.getPrograming_Language());
    }
}
