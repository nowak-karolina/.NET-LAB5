package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProblemTest {

    @Test
    public void AtLeastOne(){
        Problem problem = new Problem(10,10,10,1);
        Result result = problem.Solve(20);
        assertNotEquals(0, result.id.size());
    }

    @Test
    public void Empty(){
        Problem problem = new Problem(10,10,10,1);
        Result result = problem.Solve(0);
        assertEquals(0, result.id.size());
    }

    @Test
    public void ValueWeightCheck(){
        Problem problem = new Problem(10,10,10,1);

        for (var item : problem.items ){
            assertTrue(item.weight >= 1 && item.weight <= 10);
            assertTrue(item.value >= 1 && item.value <= 10);
        }
    }

    @Test
    public void GoodCheck(){
        Problem problem = new Problem(10,10,10,1);
        problem.clear();
        problem.ForceItems(3, 2, 0); //1 v/w
        problem.ForceItems(5, 7, 1); //2 v/w
        problem.ForceItems(1, 5, 2); //3 v/w

        Result result = problem.Solve(10);
        assertEquals(5, result.id.size());
        assertEquals(10, result.sumWeight);
        assertEquals(15, result.sumValue);
    }
  
}