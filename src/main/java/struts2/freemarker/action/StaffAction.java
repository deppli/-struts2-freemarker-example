package struts2.freemarker.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import struts2.freemarker.pojo.Staff;

import com.opensymphony.xwork2.ActionSupport;

public class StaffAction extends ActionSupport{

	private static final long serialVersionUID = 4207676147391046266L;
	
	private String username;
	private String password;
	private Staff staff;
	
	
	public String login(){
		return "login";
	}
	
	
	public String info(){
		if(!"test".equals(password)){
			return "relogin";
		}
		staff =  new Staff();
		staff.setLoginDate(new Date());
		staff.setName(username);
		List<String> welfare = new ArrayList<String>();
		welfare.add("年终奖");
		welfare.add("延迟晚餐费");
		welfare.add("未来的大饼");
		staff.setWelfare(welfare);
		return "info";
	}
	
	public Staff getStaff() {
		return staff;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	

}
