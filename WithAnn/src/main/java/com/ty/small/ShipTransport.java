package com.ty.small;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShipTransport implements Transport {
	String mediumOfTransport;
	int capacityOfLoad;
	int containerCount;
	String materials;
	String src;
	String dest;
	
	public String getMediumOfTransport() {
		return mediumOfTransport;
	}
    @Value(value="cargo container")
	public void setMediumOfTransport(String mediumOfTransport) {
		this.mediumOfTransport = mediumOfTransport;
	}

	public int getCapacityOfLoad() {
		return capacityOfLoad;
	}
    @ Value(value="1000")
	public void setCapacityOfLoad(int capacityOfLoad) {
		this.capacityOfLoad = capacityOfLoad;
	}

	public int getContainerCount() {
		return containerCount;
	}
    @Value(value="100")
	public void setContainerCount(int containerCount) {
		this.containerCount = containerCount;
	}

	public String getMaterials() {
		return materials;
	}
    @Value(value="steel")
	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getSrc() {
		return src;
	}
    @Value(value="usa")
	public void setSrc(String src) {
		this.src = src;
	}

	public String getDest() {
		return dest;
	}
    @Value(value="Mangalore")
	public void setDest(String dest) {
		this.dest = dest;
	}

	public void modeOfTransport()
	{
		System.out.println("Transpotation done by Ship");
		System.out.println(mediumOfTransport);
		System.out.println(capacityOfLoad);
		System.out.println(containerCount);
		System.out.println(materials);
		System.out.println(src+"----->"+dest);
	}
	@Override
	public String toString() {
		return "ShipTransport [mediumOfTransport=" + mediumOfTransport + ", capacityOfLoad=" + capacityOfLoad
				+ ", containerCount=" + containerCount + ", materials=" + materials + ", src=" + src + ", dest=" + dest
				+ "]";
	}
	

}
