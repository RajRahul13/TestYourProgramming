// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class demo11 {
    public static void main(String[] args) {
        String ip="My name is Rahul"; //aa ehil mm nesuy
        
        char [] ipstr = ip.toLowerCase().toCharArray();
        char [] opstr = new char[ipstr.length];
        
      
       Arrays.sort(ipstr);
       System.out.println(String.valueOf(ipstr));
       
        for(int i=0;i<ipstr.length;i++){
            if(ipstr[i] == ' '){
            opstr [i]=' ';
            }
        }
        
        
        
    }
}