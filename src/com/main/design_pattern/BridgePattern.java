/**
 * 
 */
package com.main.design_pattern;

/**
 * @author Akash.d
 *
 */

interface Remote {
	void on();

	void off();
}

abstract class TV {
	Remote remote;

	public TV(Remote r) {
		this.remote = r;
	}

	abstract void on();

	abstract void off();

}

class Sony extends TV {

	Remote remoteType;

	public Sony(Remote r) {
		super(r);
		this.remoteType = r;

	}

	@Override
	void on() {
		System.out.print("Sony TV ON : ");
		remoteType.on();

	}

	@Override
	void off() {
		System.out.print("Sony TV ON : ");
		remoteType.off();

	}

}

class Philips extends TV {
	Remote remoteType;

	public Philips(Remote r) {
		super(r);
		this.remoteType = r;
	}

	@Override
	void on() {
		System.out.print("Philips TV ON : ");
		remoteType.on();
	}

	@Override
	void off() {
		System.out.print("Hilips TV OFF : ");
		remoteType.off();

	}

}

class OldRemote implements Remote {

	@Override
	public void on() {
		System.out.println("On With Old Remote");

	}

	@Override
	public void off() {
		System.out.println("OFF With Old Remote");

	}

}

class NewRemote implements Remote {

	@Override
	public void on() {
		System.out.println("On With New Remote");

	}

	@Override
	public void off() {
		System.out.println("OFF With New Remote");

	}

}

public class BridgePattern {

	public static void main(String[] args) {

		TV sony_old = new Sony(new OldRemote());
		sony_old.on();
		sony_old.off();
		System.out.println();

		TV sony_new = new Sony(new NewRemote());
		sony_new.on();
		sony_new.off();
		System.out.println();

		TV philips_old = new Philips(new OldRemote());
		philips_old.on();
		philips_old.off();
		System.out.println();

		TV philips_new = new Philips(new NewRemote());
		philips_new.on();
		philips_new.off();
		System.out.println();

	}

}
