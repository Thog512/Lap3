
package lap3;
import java.util.Scanner;
public class LibraryCard {
    Scanner sc = new Scanner(System.in);
    public long lbCode;
    public String Owner;
    public int borrowCount;
    
    public LibraryCard(){
        
    }
    public LibraryCard(long lbCode, String Owner, int borrowCount){
        this.lbCode = lbCode;
        this.Owner = Owner;
        this.borrowCount = borrowCount;
    }
    public long getlbCode(){
        return lbCode;
    }
    public String getOwner(){
        return Owner;
    }
    public int getborrowCount(){
        return borrowCount;
    }
    public void setibCode(long code){
        this.lbCode = code;
    }
    public void setOwner(String owner){
        this.Owner = owner;
    }
    public void checkout(int num){
        this.borrowCount = num;
    }
    public String toString(){
        return "code:"+lbCode+ "owner:"+Owner+ "num:"+borrowCount;
    }
}
