package com.ty.scan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class Team {
	@Value(value="${name}")
	private String teamName;
	@Value(value="${caption}")
	private String caption;
	@Value(value="${players}")
	private int playersCount;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public int getPlayersCount() {
		return playersCount;
	}
	public void setPlayersCount(int playersCount) {
		this.playersCount = playersCount;
  }
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", caption=" + caption + ", playersCount=" + playersCount + "]";
	}
	
	


}
