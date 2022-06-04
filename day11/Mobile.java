package com.day11;


public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};

//	void searchOutdatedModel(String a) {
//		
//		for (String x: outdatedModels) {
//			System.out.println(x);
//		}
//	}
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		mobile.outdatedModels("note4");
		mobile.outdatedModels("iPhone 13");
		mobile.outdatedModels("nokia 3710");
		mobile.outdatedModels("note6");
		
	}

	private void outdatedModels(String string) {
		// TODO Auto-generated method stub
		for (String x: outdatedModels) {
			if(x.equals(string)) {
				System.out.println(string+"_OUTDATED");
			}
		}
		
	}
	
	
	
}
