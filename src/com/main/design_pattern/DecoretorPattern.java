/**
 * 
 */
package com.main.design_pattern;

/**
 * @author Akash.d
 *
 */

interface Dress {
	void assemble();
}

class BasicDress implements Dress {

	@Override
	public void assemble() {
		System.out.println("Basic dress features");
	}

}

class DressDecoretor implements Dress {

	protected Dress dress;

	public DressDecoretor(Dress dress) {
		this.dress = dress;
	}

	@Override
	public void assemble() {
		this.dress.assemble();
	}

}

class CasualDress extends DressDecoretor {

	public CasualDress(Dress dress) {
		super(dress);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Additional Casual Dress Features");
	}

}

class SportyDress extends DressDecoretor {

	public SportyDress(Dress dress) {
		super(dress);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Additional Sporty Dress Features");
	}

}

class FancyDress extends DressDecoretor {

	public FancyDress(Dress dress) {
		super(dress);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Additional Fancy Dress Features");
	}

}

public class DecoretorPattern {

	public static void main(String[] args) {

		// Dress s_dress = new SportyDress(new BasicDress());
		// s_dress.assemble();

		// Dress f_dress = new FancyDress(new BasicDress());
		// f_dress.assemble();

		// Dress c_dress = new CasualDress(new BasicDress());
		// c_dress.assemble();

		// Dress s_f_dress = new SportyDress(new FancyDress(new BasicDress()));
		// s_f_dress.assemble();

		Dress c_f_s_dress = new CasualDress(new FancyDress(new SportyDress(new BasicDress())));
		c_f_s_dress.assemble();

	}

}
