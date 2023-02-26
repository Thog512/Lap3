
package lap3;
import java.util.Scanner;
public class Book {
    Scanner sc = new Scanner(System.in);
    public String boCode;
    public String boTitle;
    public String boAuthor;
    
    public Book(){
    }
    
    public Book(String boCode, String boTitle, String boAuthor){
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
    public Book(Book bo){
        System.out.println("Nhap ma sach: ");
        boCode = sc.next();
        System.out.println("Nhap tieu de sach: ");
        boTitle = sc.next();
        System.out.println("Nhap ten tac gia: ");
        boAuthor = sc.next();
    }
    public String getboCode(){
        return boCode;
    }
    public String getboTitle(){
        return boTitle;
    }
    public String getboAuthor(){
        return boAuthor;
    }
    private void setboCode(String code){
        this.boCode = code;
    }
    private void setboTitle(String title){
        this.boTitle = title;
    }
    private void setboAuthor(String author){
        this.boAuthor = author;
    }
    public String toString(){
        return "code:"+boCode+ "title:"+boTitle+ "author:"+boAuthor;
    }
}