package leet_code;

import java.util.TreeMap;

public class MyCalendarIQ729 {

	public static void main(String[] args) {
		MyCalendar calendar = new MyCalendar();
		System.out.println(calendar.book(10, 20)); // return True
		System.out.println(calendar.book(15, 25)); // return False, It can not be booked because time 15 is already booked by another event.
		System.out.println(calendar.book(20, 30)); // return True, The event can be booked, as the first event takes every time less than 20, but not including 20.
	}
	static class MyCalendar {
	    TreeMap<Integer,Integer> map; 
	    public MyCalendar() {
	        map = new TreeMap<>();
	    }
	    
	    public boolean book(int start, int end) {
	        Integer ceil = map.ceilingKey(start);
	        Integer floor = map.floorKey(start);
	        if((floor == null || map.get(floor) <= start) && (ceil == null || end<=ceil)){
	            map.put(start,end);
	            return true;
	        }
	        return false;
	    }
	}
}
