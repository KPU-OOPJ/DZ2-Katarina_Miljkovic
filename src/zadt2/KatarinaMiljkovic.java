
package zad2;

import java.util.*;
import java.lang.*;
import java.io.*;

public class KatarinaMiljkovic {
    private String s1;
    private String s2;
    
    public KatarinaMiljkovic(String s1, String s2){
        this.s1= s1;
        this.s2 = s2;
    }
    
    int proveri(){
        int i=0,j,rez,p = 0;
        while (i<s1.length()){
            char a = s1.charAt(i);
            if(a==s2.charAt(0)){
                i++;
                j=1;
                rez = 1;
                while (j<s2.length()){
                    char b = s1.charAt(i);
                    char c = s2.charAt(j);
                    if (b==c){
                        rez++;
                    j++; 
                    i++;
                    }else break;
                }
                if (rez==s2.length())
                    p++;
                
            }else i++;
            
        }
     return p;   
    }
    
    public void setS1(){
        this.s1 = s1;
    }
    
    public void setS2(){
        this.s2 = s2;
    }
    
    public String getS1(){
        return s1;
    }
    
    public String getS2(){
        return s2;
    }
}
