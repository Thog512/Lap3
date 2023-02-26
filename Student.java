
package lap3;
import java.util.Scanner;
public class Student {
    Scanner sc = new Scanner(System.in);
    public String stID;
    public String stName;
    public String stClass;
    
    public Student(){
    }
    public Student(String stID, String stName, String stClass){
        this.stClass = stClass;
        this.stID = stID;
        this.stName = stName;
    }
    public Student(Student st){
        System.out.println("Nhap ma so sinh vien: ");
        stID = sc.next();
        System.out.println("Nhap ten sinh vien: ");
        stName = sc.next();
        System.out.println("Nhap lop: ");
        stClass = sc.next();
    }
    public String getstID(){
        return stID;
    }
    public String getstName(){
        return stName;
    }
    public String getstClass(){
        return stClass;
    }
    private void setstID(String id){
        this.stID = id;
    }
    private void setstName(String name){
        this.stName = name;
    }
    public void setstClass(String Class){
        this.stClass = Class;
    }
    public String toString(){
        return "Student id:" +stID+ "name:" +stName+ "class:" +stClass;
    }
}