/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maven_java;

/**
 * State pattern - refactoringguru.com
 * @author shoai
 */


/**
 * World first console e-commerce application.
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