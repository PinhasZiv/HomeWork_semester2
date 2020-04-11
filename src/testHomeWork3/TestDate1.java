package testHomeWork3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import homeWork3.Date;

class TestDate1 {


	@Test
	void testDeafultConstractor() {
		Date date1 = new Date();

		assertEquals(1, date1.getDay(), "deafult - day !!");
		assertEquals(1, date1.getMonth(), "deafult - month !!");
		assertEquals(1800, date1.getYear(), "deafult - year !!");
	}

	@Test
	void testVariablesConstractor() {
		Date date2 = new Date(4, 8, 1995);
		assertEquals(4, date2.getDay(), "Variables - day !!");
		assertEquals(8, date2.getMonth(), "Variables - month !!");
		assertEquals(1995, date2.getYear(), "Variables - year !!");
	}

	@Test
	void testCopyingConstractor() {
		Date date3 = new Date(7, 6, 1948);
		Date date4 = new Date(date3);
		assertEquals(date3.getDay(), date4.getDay(), "copying - day !!");
		assertEquals(date3.getMonth(), date4.getMonth(), "copying - month !!");
		assertEquals(date3.getYear(), date4.getYear(), "copying - year !!");
	}

	@Test
	void tesWrongArgumentConstractor() {
		Date minDay = new Date(-1, 4, 1995);
		assertEquals(1, minDay.getDay(), "day doesn't set to '1'");
		Date minMonth = new Date(4, 0, 1995);
		assertEquals(1, minMonth.getMonth(), "month doesn't set to '1'");
		Date minYear = new Date(1, 4, 1699);
		assertEquals(1800, minYear.getYear(), "year doesn't set to '1800'");

		Date maxDay = new Date(31, 4, 1995);
		assertEquals(1, maxDay.getDay(), "day doesn't set to '1'");
		Date maxMonth = new Date(4, 13, 1995);
		assertEquals(1, maxMonth.getMonth(), "month doesn't set to '1'");
		Date maxYear = new Date(4, 8, 2021);
		assertEquals(1800, maxYear.getYear(), "year doesn't set to '1800'");

	}

	@Test
	void testLeapYear() {
		Date notLeap = new Date(29, 2, 2019);
		assertEquals(1, notLeap.getDay(), "expect > not a leap year (set to '1'). but > (set to '29')");

		Date leap = new Date(29, 2, 2014);
		assertEquals(29, leap.getDay(), "expect > a leap year (set to '29'). but > (set to '1')");
	}

}
