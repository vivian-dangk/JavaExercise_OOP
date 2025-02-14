
package baitap.Student;
import java.util.*;
import java.text.*;
public class StudentList {
    private ArrayList<Student> hocsinh=new ArrayList<>();
    public void addST(Scanner nhap){
        System.out.println("Hay nhap so hoc sinh: ");
        int n=nhap.nextInt();
        nhap.nextLine();
        for(int i=0;i<n;i++){
            Student myst=new Student();
            myst.enter(nhap);
            hocsinh.add(myst);
        }
    }
    public void displayall(){
        for(Student hs: hocsinh){
            hs.display();
        }
    }
    public Student findID(String studentID){
        for(Student hs: hocsinh){
            if(hs.getID().equalsIgnoreCase(studentID)){
                return hs;
            }
        }
        return null;
    }
    public boolean deleteid(String ID){
        Student hs = findID(ID);
        if(hs!=null){
            hocsinh.remove(hs);
            return true;
       }else{  
            return false;
       }
    }
    public boolean edit(String ID, Scanner nhap){
        Student hs = findID(ID);
        if(hs==null){
            return false;
        }else{
            System.out.println("Hay nhap ten moi: ");
            hs.setname(nhap.nextLine());
            System.out.println("Nhap ngay thang nam sinh moi: ");
            try{
                Date dateBmoi = new SimpleDateFormat("dd/MM/yyyy").parse(nhap.nextLine());
                hs.setdate(dateBmoi);
            }catch(ParseException e){
                System.out.println("Loi!!! Ngay khong hop le.");
                return false;
            }
            return true;
        }
    }
}
