/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mybankmachine;
import javax.swing.*;
/**
 *
 * @author himel9675
 */
public class ATM {
    
    public double currentBal, depositeMoney;
    public String bankName;
    
    
    ATM (){
        currentBal = 0;
        bankName = "Royal bank";
        depositeMoney += currentBal;
    }
    
    ATM (String bName, int cBal) {
       bankName = bName;
       currentBal = cBal;
       
    }
    
    
    
    
    
}
