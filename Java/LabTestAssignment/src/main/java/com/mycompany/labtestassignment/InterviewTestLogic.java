/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtestassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author philwilliams
 */
public class InterviewTestLogic {
    
    public String Rotator(String initial, Integer rotationAmount) throws Exception
    {            
        if (rotationAmount < 0 || rotationAmount > Integer.MAX_VALUE)
        {
            throw new Exception("Invalid Rotation Amount");
        }
        
        while (rotationAmount > initial.length())
        {
            rotationAmount -= initial.length();
        }

        return (initial.substring(initial.length() - rotationAmount) + initial.substring(0, (initial.length() - rotationAmount)));
    }
    
    public HashMap<String, Integer> AboveBelow(ArrayList<Integer> unsortedList, int comparisonValue) throws Exception
    {
        
        if (unsortedList == null || comparisonValue < 0) {
            throw new Exception("Invalid Parameters");
        }
 
        List<Integer> greaterThan = unsortedList.stream()
                                    .filter(val -> val.intValue() > comparisonValue)
                                    .collect(Collectors.toList());
    
        List<Integer> lessThan = unsortedList.stream()
                                    .filter(val -> val.intValue() < comparisonValue)
                                    .collect(Collectors.toList());
 
        HashMap result = new HashMap<String, Integer>();
        result.put("Above", greaterThan.size());
        result.put("Below", lessThan.size());
        
        return result;
    }
}
