package com.ty;

public enum Bear3 {
	RED{
		public void info()
		{
			System.out.println("Dengerous");
		}
	},GREEN,BLUE;
	public void info()
	{
		System.out.println("universal color");
	}

}
