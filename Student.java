
package baitap.Student;

import java.util.*;
import java.text.*;
public class Student {
    private String studentID;
    private String fullname;
    private Date dateBirth;
    private String major;
    private float gpa;
    private static SimpleDateFormat bd = new SimpleDateFormat("dd/MM/yyyy");
    public Student(String ID, String name, Date date, String major, float gpa){
        this.dateBirth=date;
        this.fullname=name;
        this.major=major;
        this.studentID=ID;
        this.gpa=gpa;
    }
    public void enter(Scanner nhap){
        System.out.println("Hay nhap ten: ");
        fullname=nhap.nextLine();
        System.out.println("Hay nhap ID: ");
        studentID=nhap.nextLine();
        try{
        System.out.println("Hay nhap ngay sinh: ");
        dateBirth=bd.parse(nhap.nextLine());
        }catch(ParseException e){
            System.out.println("Nhap sai.");
            dateBirth=new Date();
        }
        System.out.println("Hay nhap nganh hoc: ");
        major=nhap.nextLine();
        System.out.println("Hay nhap GPA: ");
        gpa=nhap.nextFloat();
        nhap.nextLine();
    }
    public Student(){
    }
    public String getID(){
        return studentID;
    }
    public void setID(String id){
        this.studentID=id;
    }
    public void setname(String fullname){
        this.fullname=fullname;
    }
    public void setdate(Date dateBirth){
        this.dateBirth=dateBirth;
    }
    public void setmajor(String major) {
        this.major = major;
    }
    public void setgpa(float gpa){
        if(gpa<0){
            System.out.println("Khong phu hop. Hay nhap lai.");
        }else{
            this.gpa=gpa;
        }
    }
    public void display(){
        System.out.println("Hoc sinh: "+fullname+", ID: "+studentID+", ("+dateBirth+") major: "+major+", GPA: "+gpa);
    }
    
}
