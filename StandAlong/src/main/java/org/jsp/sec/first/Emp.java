package org.jsp.sec.first;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String ename;
	private List<Long> ephone;
	private Set<String> eaddress;
	private Properties property;
	public Properties getProperty() {
		return property;
	}
	public void setProperty(Properties property) {
		this.property = property;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<Long> getEphone() {
		return ephone;
	}
	public void setEphone(List<Long> ephone) {
		this.ephone = ephone;
	}
	public Set<String> getEaddress() {
		return eaddress;
	}
	public void setEaddress(Set<String> eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", ephone=" + ephone + ", eaddress=" + eaddress + ", property=" + property + "]";
	}
	
	

}
