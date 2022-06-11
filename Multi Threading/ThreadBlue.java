
package com.mycompany.maven_java;

/**
 *
 * @author shoai
 */

public class ThreadBlue implements Runnable{
    
    int num;
    public ThreadBlue(int num)
    { 
        this.num=num;    
    }
    
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println(i+" from "+num);
        }
    }
}
