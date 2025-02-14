
package baitap.Student;
import java.util.*;
import java.text.*;
public class processor {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        StudentList hocsinh = new StudentList();
        while(true){
            System.out.println("Menu: ");
            System.out.println("1. Nhap thong tin hoc sinh.");
            System.out.println("2. In thong tin hoc sinh.");
            System.out.println("3. Tim hoc sinh bang ID.");
            System.out.println("4. Xoa hoc sinh bang ID.");
            System.out.println("5. Sua thong tin bang ID.");
            System.out.println("6. Thoat.");
            System.out.println("Hay chon muc can thuc hien: ");
            int choice=nhap.nextInt();
            nhap.nextLine();
            switch (choice){
                case 1:
                    hocsinh.addST(nhap);
                    break;
                case 2:
                    hocsinh.displayall();
                    break;
                case 3:
                    System.out.println("Hay nhap ID can tim: ");
                    Student timhs = hocsinh.findID(nhap.nextLine());
                    if(timhs!=null){
                        timhs.display();
                    }else{
                        System.out.println("Khong tim thay.");
                    }
                    break;
                case 4:
                    System.out.println("Nhap ID can xoa: ");
                    if(hocsinh.deleteid(nhap.nextLine())){
                        System.out.println("Da xoa.");
                    }else{
                        System.out.println("Khong tim thay.");
                    }
                    break;
                case 5:
                    System.out.println("Nhap ID can sua: ");
                    if(hocsinh.edit(nhap.nextLine(), nhap)){
                            System.out.println("Da sua xong.");
                    }else{
                        System.out.println("Khong tim thay.");
                    }
                    break;
                case 6:
                    System.out.println("Dang 1thoat.............!");
                    return;
                default:
                    System.out.println("Khong hop le hay nhap lai.");
            }  
            
        }
    }
}
