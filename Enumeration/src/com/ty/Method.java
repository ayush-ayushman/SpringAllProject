package com.ty;
public class Method {
	public static void main(String [] args)
	{
		PowerState[] k=PowerState.values();
		for(PowerState l:k)
		{
			System.out.println(l.ordinal());
		}
	}

}
