
package baitap.Animal;
import java.util.*;
import java.text.*;
public class processor1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        AnimalList dongvat = new AnimalList();
        SimpleDateFormat bd=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhap so luong dong vat: ");
        int n=nhap.nextInt();
        nhap.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Nhap loai dong vat: ");
            String loai = nhap.nextLine();
            System.out.println("Nhap ID: ");
            String id=nhap.nextLine();
            System.out.println("Nhap nguon goc: ");
            String source=nhap.nextLine();
            System.out.println("Nhap ngay sinh: ");
            Date dateBirth=null;
            try{
                dateBirth=bd.parse(nhap.nextLine());
            }catch(Exception e){
                System.out.println("Khong hop le.");
                dateBirth=new Date();
            }
            System.out.println("Nhap mau long: ");
            String color=nhap.nextLine();
            if(loai.equals("cho")){
                System.out.println("Nhap giong cho (cho/meo): ");
                String breed = nhap.nextLine();
                Dog cho = new Dog(id, source, dateBirth, color, breed);
                dongvat.addDV(cho);
            }else if(loai.equals("meo")){
                Cat meo = new Cat(id, source, dateBirth, color);
                dongvat.addDV(meo);
            }
        }
        dongvat.displayall();
    }    
}
