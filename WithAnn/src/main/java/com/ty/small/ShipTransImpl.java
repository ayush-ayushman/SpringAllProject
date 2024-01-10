package com.ty.small;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShipTransImpl {
	@Autowired
	@Qualifier(value="shipTransport")
	private Transport transport;

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	@Override
	public String toString() {
		return "ShipTransImpl [transport=" + transport + "]";
	}
	
	
	

}
