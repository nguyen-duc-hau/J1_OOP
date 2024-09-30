/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ACER
 */
// extends : kế thừa
public class Coder extends Person {

    private String Programing_Language;

    public Coder() {
    }

    public Coder(String Programing_Language, String name, int age, String phone) {
        super(name, age, phone);
        //super: tu khoa tuong tac voi cac phuong thuc
        this.Programing_Language = Programing_Language;
    }
    // this: để phân biết parameter và thuộc tính(this.tên thuộc tính)

    public String getPrograming_Language() {
        return Programing_Language;
    }

    public void setPrograming_Language(String Programing_Language) {
        this.Programing_Language = Programing_Language;
    }
    
    private String ho;
    private String quequan;

    public Coder(String Programing_Language, String ho, String quequan) {
        this.Programing_Language = Programing_Language;
        this.ho = ho;
        this.quequan = quequan;
    }
    
    public void displayInfo() {
        System.out.println("ho: " + ho + ", que quan: " + quequan);
    }
    
}
