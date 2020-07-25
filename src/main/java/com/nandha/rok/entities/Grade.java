/**
 * 
 */
package com.nandha.rok.entities;

/**
 * @author Nandha
 * 
 */
public class Grade {
	private int normal;
	private int advanced;
	private int elite;
	private int epic;
	private int legendary;
	
	private int eAdvanced;
	private int eElite;
	private int eEpic;
	private int eLegendary;
	
	public Grade(int nor, int adv, int eli, int epi, int leg){
		System.out.println("Constructing grade ...");
		this.normal=nor;
		this.advanced=adv;
		this.elite=eli;
		this.epic=epi;
		this.legendary=leg;
		
		this.eAdvanced =  this.advanced + this.normal/4;
		this.eElite = this.elite + this.eAdvanced/4 ;
		this.eEpic = this.epic + this.eElite/4;
		this.eLegendary = this.legendary + this.eEpic/4;
	}
	
	public Grade() {
		System.out.println("Constructing null grade Object....");
		this.normal=0;
		this.advanced=0;
		this.elite=0;
		this.epic=0;
		this.legendary=0;
		
		this.eAdvanced =  0;
		this.eElite = 0 ;
		this.eEpic =0;
		this.eLegendary = 0;
	}
	
	public int getNormal() {
		return normal;
	}
	public void setNormal(int normal) {
		this.normal = normal;
	}
	public int getAdvanced() {
		return advanced;
	}
	public void setAdvanced(int advanced) {
		this.advanced = advanced;
	}
	public int getElite() {
		return elite;
	}
	
	public void setElite(int elite) {
		this.elite = elite;
	}
	public int getEpic() {
		return epic;
	}
	public void setEpic(int epic) {
		this.epic = epic;
	}
	public int getLegendary() {
		return legendary;
	}
	public void setLegendary(int legendary) {
		this.legendary = legendary;
	}

	public int geteAdvanced() {
		return eAdvanced;
	}

	public void seteAdvanced(int eAdvanced) {
		this.eAdvanced = eAdvanced;
	}

	public int geteElite() {
		return eElite;
	}

	public void seteElite(int eElite) {
		this.eElite = eElite;
	}

	public int geteEpic() {
		return eEpic;
	}

	public void seteEpic(int eEpic) {
		this.eEpic = eEpic;
	}

	public int geteLegendary() {
		return eLegendary;
	}

	public void seteLegendary(int eLegendary) {
		this.eLegendary = eLegendary;
	}

	@Override
	public String toString() {
		return "Grade [normal=" + normal + ", advanced=" + advanced + ", elite=" + elite + ", epic=" + epic
				+ ", legendary=" + legendary + ", eAdvanced=" + eAdvanced + ", eElite=" + eElite + ", eEpic=" + eEpic
				+ ", eLegendary=" + eLegendary + "]";
	}

}
