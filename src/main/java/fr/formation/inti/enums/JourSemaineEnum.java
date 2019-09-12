package fr.formation.inti.enums;

public enum JourSemaineEnum {
	LUNDI(1), MARDI(2), MERCREDI(3), JEUDI(4), VENDREDI(5), SAMEDI(6, true), DIMANCHE(7,true);
	
	private int numJours;
	private boolean weekend;

	public int getNumJours() {
		return numJours;
	}

	public void setNumJours(int numJours) {
		this.numJours = numJours;
	}

	public boolean isWeekend() {
		return weekend;
	}

	public void setWeekend(boolean weekend) {
		this.weekend = weekend;
	}

	private JourSemaineEnum(int numJours) {
		this.numJours = numJours;
	}
	
	private JourSemaineEnum(int numJours, boolean weekend) {
		this.numJours = numJours;
		this.weekend = weekend;
	}
	
	
}
