package com.privan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model {

	@Id
	private String playerName;
	private String teamName;
	private String shotAttempt;
	private String threePlus;
	private String threeMin;
	private String twoPlus;
	private String twoMin;
	private String ftPlus;
	private String ftMin;
	
	
	
	
	
	@Override
	public String toString() {
		return "Model [playerName=" + playerName + ", teamName=" + teamName + ", shotAttempt=" + shotAttempt
				+ ", threePlus=" + threePlus + ", threeMin=" + threeMin + ", twoPlus=" + twoPlus + ", twoMin=" + twoMin
				+ ", ftPlus=" + ftPlus + ", ftMin=" + ftMin + "]";
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getShotAttempt() {
		return shotAttempt;
	}
	public void setShotAttempt(String shotAttempt) {
		this.shotAttempt = shotAttempt;
	}
	public String getThreePlus() {
		return threePlus;
	}
	public void setThreePlus(String threePlus) {
		this.threePlus = threePlus;
	}
	public String getThreeMin() {
		return threeMin;
	}
	public void setThreeMin(String threeMin) {
		this.threeMin = threeMin;
	}
	public String getTwoPlus() {
		return twoPlus;
	}
	public void setTwoPlus(String twoPlus) {
		this.twoPlus = twoPlus;
	}
	public String getTwoMin() {
		return twoMin;
	}
	public void setTwoMin(String twoMin) {
		this.twoMin = twoMin;
	}
	public String getFtPlus() {
		return ftPlus;
	}
	public void setFtPlus(String ftPlus) {
		this.ftPlus = ftPlus;
	}
	public String getFtMin() {
		return ftMin;
	}
	public void setFtMin(String ftMin) {
		this.ftMin = ftMin;
	}

	

}
