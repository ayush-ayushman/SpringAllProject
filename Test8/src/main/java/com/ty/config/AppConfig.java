package com.ty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ty.beans.Coach;
import com.ty.beans.CoachInfo;
import com.ty.beans.CricketCoach;
import com.ty.beans.FootballCoach;
import com.ty.beans.TeamCoach;
@Configuration
public class AppConfig {
	@Bean
	public CricketCoach getCricketCoach()
	{
		return new  CricketCoach();
	}
	@Bean
	public FootballCoach getFootballCoach()
	{
		return new FootballCoach();
	}
	@Bean
	public TeamCoach getTeamCoach()
	{
		return new TeamCoach();
	}
	@Bean
	public CoachInfo getCoach()
	{
	   CoachInfo coachInfo=new CoachInfo();
	  // coachInfo.setCoach(getCricketCoach());
	  // coachInfo.setCoach(getFootballCoach());
	   coachInfo.setCoach(getTeamCoach());
	   return coachInfo;
	   
	}
	

}
