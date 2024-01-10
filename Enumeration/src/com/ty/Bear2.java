package com.ty;

public enum Bear2 {
	KR(100),KO(120),RC(129),FO(180);
	int price;
	Bear2(int d)
	{
		price=d; 
	}
	private Bear2() {
		this.price=89;
	}
	public int getPrice()
	{
		return price;
		
	}

}
