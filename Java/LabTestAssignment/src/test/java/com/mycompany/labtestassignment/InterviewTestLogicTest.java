/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.labtestassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author philwilliams
 */
public class InterviewTestLogicTest {

    public InterviewTestLogicTest() {
    }

    @BeforeAll
    public static void setUpClass() {

    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Rotator method, of class InterviewTestLogic.
     */
    @Test
    public void testRotator_HappyPath() throws Exception {
        String expResult = "ngMyStri";

        String initial = "MyString";
        Integer rotationAmount = 2;
        InterviewTestLogic instance = new InterviewTestLogic();

        String result = instance.Rotator(initial, rotationAmount);
        assertEquals(expResult, result);
    }

    @Test
    public void testRotator_ZeroMovement() throws Exception {
        String expResult = "ZeroSum";

        String initial = "ZeroSum";
        Integer rotationAmount = 0;
        InterviewTestLogic instance = new InterviewTestLogic();

        String result = instance.Rotator(initial, rotationAmount);
        assertEquals(expResult, result);
    }

    @Test
    public void testRotator_MaxMovement() throws Exception {
        String expResult = "SonicAndTails";

        String initial = "SonicAndTails";
        Integer rotationAmount = 13;
        InterviewTestLogic instance = new InterviewTestLogic();

        String result = instance.Rotator(initial, rotationAmount);
        assertEquals(expResult, result);
    }

    @Test
    public void testRotator_DoubleRotation() throws Exception {
        String expResult = "SonicAndTails";

        String initial = "SonicAndTails";
        Integer rotationAmount = 26;
        InterviewTestLogic instance = new InterviewTestLogic();

        String result = instance.Rotator(initial, rotationAmount);
        assertEquals(expResult, result);
    }

    @Test
    public void testRotator_NegativeRotation_ThrowsException() throws Exception {
        try {
            String expResult = "SonicAndTails";

            String initial = "SonicAndTails";
            Integer rotationAmount = -50;
            InterviewTestLogic instance = new InterviewTestLogic();

            String result = instance.Rotator(initial, rotationAmount);
            fail();
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

    /**
     * Test of AboveBelow method, of class InterviewTestLogic.
     */
    @Test
    public void testAboveBelow_HappyPath() throws Exception {
        int expResultAbove = 5;
        int expResultBelow = 6;

        ArrayList<Integer> unsortedList = new ArrayList<Integer>(
                Arrays.asList(1, 5, 9, 3, 2, 17, 22, 5, 11, 6, 8));

        int comparisonValue = 7;
        InterviewTestLogic instance = new InterviewTestLogic();
        HashMap<String, Integer> result = instance.AboveBelow(unsortedList, comparisonValue);
        assertEquals(result.get("Above"), expResultAbove);
        assertEquals(result.get("Below"), expResultBelow);
    }

    @Test
    public void testAboveBelow_NumberInList() throws Exception {
        int expResultAbove = 5;
        int expResultBelow = 5;

        ArrayList<Integer> unsortedList = new ArrayList<Integer>(
                Arrays.asList(1, 5, 9, 3, 2, 17, 22, 5, 11, 6, 8));

        int comparisonValue = 6;
        InterviewTestLogic instance = new InterviewTestLogic();
        HashMap<String, Integer> result = instance.AboveBelow(unsortedList, comparisonValue);
        assertEquals(result.get("Above"), expResultAbove);
        assertEquals(result.get("Below"), expResultBelow);
    }

    @Test
    public void testAboveBelow_AllAbove() throws Exception {
        int expResultAbove = 11;
        int expResultBelow = 0;

        ArrayList<Integer> unsortedList = new ArrayList<Integer>(
                Arrays.asList(1, 5, 9, 3, 2, 17, 22, 5, 11, 6, 8));

        int comparisonValue = 0;
        InterviewTestLogic instance = new InterviewTestLogic();
        HashMap<String, Integer> result = instance.AboveBelow(unsortedList, comparisonValue);
        assertEquals(result.get("Above"), expResultAbove);
        assertEquals(result.get("Below"), expResultBelow);
    }

    @Test
    public void testAboveBelow_AllBelow() throws Exception {
        int expResultAbove = 0;
        int expResultBelow = 11;

        ArrayList<Integer> unsortedList = new ArrayList<Integer>(
                Arrays.asList(1, 5, 9, 3, 2, 17, 22, 5, 11, 6, 8));

        int comparisonValue = 100;
        InterviewTestLogic instance = new InterviewTestLogic();
        HashMap<String, Integer> result = instance.AboveBelow(unsortedList, comparisonValue);
        assertEquals(result.get("Above"), expResultAbove);
        assertEquals(result.get("Below"), expResultBelow);
    }

    @Test
    public void testAboveBelow_EmptyList_Returns_Zero() throws Exception {
        int expResultAbove = 0;
        int expResultBelow = 0;

        ArrayList<Integer> unsortedList = new ArrayList<Integer>();

        int comparisonValue = 5;
        InterviewTestLogic instance = new InterviewTestLogic();
        HashMap<String, Integer> result = instance.AboveBelow(unsortedList, comparisonValue);
        assertEquals(result.get("Above"), expResultAbove);
        assertEquals(result.get("Below"), expResultBelow);
    }

    @Test
    public void testAboveBelow_NullList_ThrowsException() throws Exception {

        try {
            int expResultAbove = 0;
            int expResultBelow = 0;

            ArrayList<Integer> unsortedList = null;

            int comparisonValue = 5;
            InterviewTestLogic instance = new InterviewTestLogic();
            HashMap<String, Integer> result = instance.AboveBelow(unsortedList, comparisonValue);
            fail();
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

    @Test
    public void testAboveBelow_NegativeComparisonNumber_ThrowsException() throws Exception {

        try {
            int expResultAbove = 0;
            int expResultBelow = 0;

            ArrayList<Integer> unsortedList = new ArrayList<Integer>(
                    Arrays.asList(1, 5, 9, 3, 2, 17, 22, 5, 11, 6, 8));

            int comparisonValue = -20;
            InterviewTestLogic instance = new InterviewTestLogic();
            HashMap<String, Integer> result = instance.AboveBelow(unsortedList, comparisonValue);
            fail();
        } catch (Exception ex) {
            assertTrue(true);
        }
    }

}
