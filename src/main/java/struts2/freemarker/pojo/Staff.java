package struts2.freemarker.pojo;

import java.util.Date;
import java.util.List;

public class Staff {
	private String name;

	private List<String> welfare;
	
	private Date loginDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getWelfare() {
		return welfare;
	}

	public void setWelfare(List<String> welfare) {
		this.welfare = welfare;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	
	

}
