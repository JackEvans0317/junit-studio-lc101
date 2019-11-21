package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    @Test
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
    @Test
    public void startWithUppercase() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("T[]"));
    }
    @Test
    public void reverseBrackets() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }
    @Test
    public void crazyBrackets() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("[[[][[]]]]]]]]"));
    }
    @Test
    public void bracketsInMiddleOfWords() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("launch[Code]"));
    }
    @Test
    public void bracketsWrongWayInWords() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("launch]code["));
    }
    @Test
    public void filledBrackets() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[949128492109812fshdkjkdalhdljsafdlhfjdjfjfjjflaaaaaaaaaaa29329]"));
    }
    @Test
    public void stringWithSpace() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets(" "));
    }
    @Test
    public void twoOpenBracesThenClosed() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[[]]"));
    }
    @Test
    public void twoBraces() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[][]"));
    }
    @Test
    public void incorrectFollowedByCorrect(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("][]"));
    }
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


}

