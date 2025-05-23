package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STU_TABLE")
public class Students {
	
	@Id
	@Column(name = "STU_ID")
	private Integer stuId;
	@Column(name = "STU_NAME")
	private String stuName;
	@Column(name = "STU_ADD")
	private String stuAdd;
	
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}

	@Override
	public String toString() {
		return "Students [stuId=" + stuId + ", stuName=" + stuName + ", stuAdd=" + stuAdd + "]";
	}
	
	

}
