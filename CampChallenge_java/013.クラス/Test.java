/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shochan
 */class Human {
    
    public String name = "";
    public int age = 0;

    public void setHuman(String n, int a) {
        
        this.name = n;
        this.age = a;
    }
    }

    public class Test {
     public static void main(String[] args) {
        
        Human hito = new Human();

        hito.age = 25;
        hito.name=("higashida");
        
    }
    }
    
