
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday = false, isVacation, isWeekend = false;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */
		int wn = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		int wd = JOptionPane.showConfirmDialog(null, "Is it a weekend?", "", JOptionPane.YES_NO_OPTION);
		int v = JOptionPane.showConfirmDialog(null, "Is it vacation?", "", JOptionPane.YES_NO_OPTION);
		System.out.println(wn);
		System.out.println(wd);
		System.out.println(v);

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */

		if (v == 0) {
			System.out.println("Sleep in.");

		}
		
			
			if (v == 1) {
				System.out.println("Not vacation!");
				if (wn == 0) {
					System.out.println("Sleep in.");
				}
				if (wn == 1) {
					System.out.println("Get up lazybones!");
				}
			}
		}
	}

