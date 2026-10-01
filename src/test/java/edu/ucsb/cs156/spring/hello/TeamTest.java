package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_correct_same_object() {
        assertTrue(team.equals(team), "teams should be equal");
    }

    @Test
    public void equals_correct_different_class() {
        String tester = "dinkle";
        assertTrue(!team.equals(tester), "different classes should not be equal");
    }

    @Test
    public void equals_correct_different_fields() {
        Team other = new Team("test-team");
        assertTrue(team.equals(other), "different team objects should be equal");
        other.setName("not-test-team");
        assertTrue(!team.equals(other), "objects should not be equal");
        other.addMember("dinkle");
        other.setName("test-team");
        assertTrue(!team.equals(other), "objects should not be equal");
        
        
    }

    @Test
    public void hashCode_correct() {
        Team t1 = new Team("foo");
        Team t2 = new Team("foo");
        t1.addMember("dinkle");
        t2.addMember("dinkle");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_fix_equal_mutation() {
        Team t = new Team("foobar");
        int result = t.hashCode();
        int expectedResult = -1268878963;
        assertEquals(expectedResult, result);
    }


}
