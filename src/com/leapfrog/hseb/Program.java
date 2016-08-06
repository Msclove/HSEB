/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.hseb;

import java.util.Scanner;

/**
 *
 * @author Mahesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Marksheet marksheet = new Marksheet(input);
        while (true) {
            marksheet.entry();

            if (marksheet.isFail()) {
                System.out.println("You have failed");
            } else {
                double total = marksheet.getTotal();
                double per = marksheet.getPercentage();
                String grade = marksheet.getGrade();
                System.out.println("Total is :" + total);
                System.out.println("Perentage is:" + per);
                System.out.println("Grade is:" + grade);
            }
            System.out.println("Do you want to continue[Y/N]:");
            
            if(input.next().equalsIgnoreCase("n")){
                System.exit(0);
            }
        }
    }
}
