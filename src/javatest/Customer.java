package javatest;

public class Customer extends User {
	//필드
	private int point;
	
	//생성자
	public Customer() {
		super();
	}

	public Customer(String id, String pw, String name ,int point) {
		super(id , pw, name);
		this.point = point;
	}
	
	
	//메소드-gs
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드-일반
	
	@Override
	public String toString() {
		return "Customer [point=" + point + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	public String test() {
		
		return "ry=" + id + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	public void showInfo() {
		System.out.println("아이디:"+ super.id +"\t"+ "비번:"+super.pw +"\t"+ "이름:"+super.name +"\t"+ "포인트:"+ this.point );
	}





}
