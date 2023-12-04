package com.gh.sd.structuralpatterns.facade.email;

public class StationaryFactory {

	private StationaryFactory() {}
	public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
