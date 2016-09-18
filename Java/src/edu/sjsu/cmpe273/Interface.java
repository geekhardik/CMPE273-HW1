package edu.sjsu.cmpe273;

import javax.swing.Spring;

interface Enginnering {
	public String[] diciplines();

	public int subjects();
}

interface SJSU {
	public String[] Building();
}

public class Interface implements Enginnering, SJSU {

	public String[] diciplines() {
		String[] departments = { "Computer Engg", "Software Engg", "Electrical Engg", "Mechanical Engg" };

		return departments;
	}

	public int subjects() {
		int no_subjects = 14;
		return no_subjects;
	}

	public String[] Building() {
		String[] buildings = { "Engg", "Science", "Music" };
		return buildings;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface i = new Interface();
		String[] s = i.diciplines();

		for (String x : s) {
			System.out.println(x + " ");
		}

		int subj = i.subjects();
		System.out.println(subj);

		String[] B = i.Building();

		for (String x : B) {
			System.out.println(x + " ");
		}

	}

}
