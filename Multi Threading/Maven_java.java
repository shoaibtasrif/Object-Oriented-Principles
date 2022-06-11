
package com.mycompany.maven_java;

/**
 * 
 * @author shoai
 */

public class Maven_java {
    public static void main(String[] args) throws InterruptedException {
        ThreadRed t1=new ThreadRed(1);
        ThreadRed t2=new ThreadRed(2);
        ThreadBlue tb= new ThreadBlue(3);
        Thread t3=new Thread(tb);
        
        t3.start();
        t1.start();
        t1.join();
        
        t2.start();
        
    }
}