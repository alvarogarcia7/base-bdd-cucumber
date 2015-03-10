/**
 * Created by alvaro on 10/03/15.
 */

package com.example.kata.bdd.cucumber;

public class Belly {
	private int cukes;

	public void eat (int cukes) {
		this.cukes = cukes;
	}

	public String getSound (int waitingTime) {
		if (cukes > 41 && waitingTime >= 1) {
			return "growl";
		} else {
			return "silent";
		}
	}
}
