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
public class Marksheet {

    double eng, phy, chy, com, mat;

    Scanner input;
    
    public Marksheet(){
        input=new Scanner(System.in);
        
    }
    public Marksheet(Scanner input){
        this.input=input;
    }

    public void entry() {
        System.out.println("English");
        eng = input.nextDouble();
        System.out.println("Physics");
        phy = input.nextDouble();
        System.out.println("Chemistery");
        chy = input.nextDouble();
        System.out.println("Computer");
        com = input.nextDouble();
        System.out.println("Math");
        mat = input.nextDouble();
    }

    public boolean isFail() {
        return (eng < 32 || phy < 32 || chy < 32 || com < 32 || mat < 32);
    }

    public double getTotal() {
        return (eng + phy + chy + com + mat);
    }

    public double getPercentage() {
        return (getTotal() / 500) * 100;
    }

    public String getGrade() {
        double per = getPercentage();
        String grade = "";
        if (per >= 80) {
            grade = "Distinction";
        } else if (per < 80 && per >= 60) {
            grade = "First Devision";
        } else if (per < 60 && per >= 45) {
            grade = "Second devision";
        } else {
            grade = "Third Devision";
        }
        return grade;
    }
}
