package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
  private int eid;
  private String ename;
  
  @ManyToMany
  @JoinTable(name="emp_pro")
  private List<Project>projects;
  
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}




	
}
  
  
  
  


