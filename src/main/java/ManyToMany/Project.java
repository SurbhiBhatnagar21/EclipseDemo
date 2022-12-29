package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	private int pid;
	private String pname;
	
	@ManyToMany(mappedBy="projects")//this will create a column emp_project
	private List<Emp>emps;
	
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	
	
	
	

}
