/**
 * 
 */
package com.main.design_pattern;

/**
 * @author Akash.d
 *
 */

interface Pen {
	void write(String str);
}

class AssignmentWork {

	Pen p;

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void writeAssignment(String str) {
		p.write(str);
	}

}

class PilotPen {
	public void mark(String str) {
		//
		//
		//
		//
		System.out.println(str);
	}
}

class PenAdaptor implements Pen {

	PilotPen pp = new PilotPen();

	@Override
	public void write(String str) {
		pp.mark(str);
	}

}

public class AdapterPattern_2 {
	public static void main(String[] args) {
		Pen p = new PenAdaptor();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("Im bit tired to write on Assignment.....");
	}

}
