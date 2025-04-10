package in.ashokit.entity;

public class Customer {
	
	private Integer id;
	private String name;
	private String add;
	private Long MobNo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Long getMobNo() {
		return MobNo;
	}
	public void setMobNo(Long mobNo) {
		MobNo = mobNo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", add=" + add + ", MobNo=" + MobNo + "]";
	}
	
	

}
