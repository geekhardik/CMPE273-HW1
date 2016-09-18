//Generate binary numbers!!

package edu.sjsu.cmpe273;

import java.util.LinkedList;
import java.util.Queue;

public class queues {

	public String GetBinaryNumbers(int n) {

		String result = "";

		Queue<String> q = new LinkedList<>();

		q.add("1");

		while (n > 0) {
			String s1 = q.poll();
			String s2 = new String();
			s2 = s1;
			result += s1 + " ";

			q.add(s1.concat("0"));
			q.add(s2.concat("1"));
			n--;
		}

		// System.out.print(result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		queues obj = new queues();
		String s = obj.GetBinaryNumbers(5);
		System.out.println(s);
	}

}
