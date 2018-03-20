package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
	    
	    ArrayList<Staff> staffs = new ArrayList<Staff>();
        Staff S1 = new Staff("Dorcas", "R", "Lincoln", new Date(95, 6, 2), 
                "316 Sycamore R", "123-758-9635", "mercenarywork@baddies.com", "7:00 - 12:00", 1, 2000, 
                new Date(111, 1, 1), eTitle.MR);
        Staff S2 = new Staff("Will", "C", "Archer", new Date(96, 6, 3), 
                "318 Oak C", "555-969-5210", "wontmiss@lies.com", "3:00-4:00", 2, 2500, 
                new Date(112, 1, 1), eTitle.MRS);
        Staff S3 = new Staff("Guy", "L", "Cutter", new Date(97, 5, 3), 
                "45 Call D", "360-584-9687", "cutudown@sword.com", "1:00 - 5:00", 3, 3000, 
                new Date(113, 1, 1), eTitle.MR);
        Staff S4 = new Staff("Ike", "R", "Dawn", new Date(98, 5, 8), 
                "7 Path R", "549-879-5698", "fite4frend@u.com", "12:00 - 4:00", 4, 3500, 
                new Date(114, 1, 1), eTitle.MRS);
        Staff S5 = new Staff("Corrin", "I", "STRASH", new Date(99, 3, 2), 
                "13 Lucifer D", "666-584-3625", "fatesrus@If.com", "10:00 - 7:00", 5, 4000, 
                new Date(115, 1, 1), eTitle.MS);
        staffs.add(S1);
        staffs.add(S2);
        staffs.add(S3);
        staffs.add(S4);
        staffs.add(S5);
        
        double average = 0;
        for (Staff staff : staffs) {
            average += staff.getSalary();
        }
        average /= staffs.size();
        
        assertEquals(average, 3000, 0.00001);
	}	

    @Test(expected = PersonException.class) 
    public void testInvalidPhoneNumber() throws PersonException {
         Staff s = new Staff("Dorcas", "R", "Lincoln", new Date(95, 6, 2), 
        		 "316 Sycamore R", "123-758-9635", "mercenarywork@baddies.com", "7:00 - 12:00", 1, 2000, 
                 new Date(111, 1, 1), eTitle.MR);
    }

    @Test(expected = PersonException.class) 
    public void testInvalidDOB() throws PersonException {
         Staff s = new Staff("Dorcas", "R", "Lincoln", new Date(95, 6, 2), 
        		 "316 Sycamore R", "123-758-9635", "mercenarywork@baddies.com", "7:00 - 12:00", 1, 2000, 
                 new Date(111, 1, 1), eTitle.MR);
    }
}