/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themostimportantskillinbiology;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class TheMostImportantSkillInBiology {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[][] vertex=new int[n][2];
        for (int i=0;i<n;i++) {
            vertex[i][0]=sc.nextInt();
            vertex[i][1]=sc.nextInt();
        }
        int plus=0;
        int minus=0;
        for (int i=0;i<n;i++) {
            int j=(i+1)%n;
            plus+=vertex[i][0]*vertex[j][1];
            minus+=vertex[i][1]*vertex[j][0];
        }
        int result=plus-minus;
        if (result<0) result=-result;
        if (result%2==0) result=result/2;
        else result=result/2+1;
        
        System.out.println(result);
    }
    
}
