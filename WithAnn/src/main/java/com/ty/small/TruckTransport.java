package com.ty.small;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TruckTransport implements Transport {
	private String companyName;
	private String materials;
	private int capacity;
	private String src;
	private String dest;
	

	public TruckTransport(@Value(value="allicargo") String companyName,
			              @Value(value="Iron" )String materials,
			              @Value(value="50") int capacity,
			              @Value(value="uk" )String src, 
			              @Value(value="goa" )String dest) {
		super();
		this.companyName = companyName;
		this.materials = materials;
		this.capacity = capacity;
		this.src = src;
		this.dest = dest;
	}


	public void modeOfTransport() {
		System.out.println("Transpotation done by Truck");
		System.out.println(companyName);
		System.out.println(materials);
		System.out.println(capacity);
		System.out.println(src);
		System.out.println(dest);
		
		
	}


	@Override
	public String toString() {
		return "TruckTransport [companyName=" + companyName + ", materials=" + materials + ", capacity=" + capacity
				+ ", src=" + src + ", dest=" + dest + "]";
	}
	
	

}
