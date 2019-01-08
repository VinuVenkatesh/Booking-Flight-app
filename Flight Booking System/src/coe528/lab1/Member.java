/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 *
 * @author Vinu
 */
public class Member extends Passenger {
    int yearsOfMembership;
    public Member(String name, int age, int yearsOfMembership){
        super(name,age);
        this.yearsOfMembership = yearsOfMembership;
    }
    @Override
    public double applyDiscount(double p){
        if(yearsOfMembership <= 1 )
            return p;
        else if (yearsOfMembership > 5)
            return p*0.5;
        else
            return p *0.9;          
    }
    
}
