package com.day11;

import com.day6.Main;

public enum Stadium {

	EDEN_GARDENS_STADIUM,WANKHEDE_STADIUM,CHIDAMBARAM_STADIUM,M_CHINNASWAMY_STADIUM
}



class IPL {
	
	void homeTeamStadium(Stadium stadium) {
		
		
		switch (stadium) {
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
			
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indians");
			break;

		case CHIDAMBARAM_STADIUM:
			System.out.println("“This is the home ground of CSK”");
			break;

		case M_CHINNASWAMY_STADIUM:
			System.out.println("“This is the home ground of RCB”");
			break;

		default:
			break;
		}
	}
	
	
	
}


class Main{
	
	public static void main(String[] args) {
		
		IPL ipl = new IPL();
		
		ipl.homeTeamStadium(Stadium.EDEN_GARDENS_STADIUM);
	}
}