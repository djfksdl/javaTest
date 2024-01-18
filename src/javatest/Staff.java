package javatest;

public class Staff extends User {
	//필드
		private int salary;
		
		//생성자
		public Staff() {
			super();
		}
		
		public Staff(String id, String pw, String name ,int salary) {
			super(id, pw, name);
			this.salary = salary;
		}
		
		//메소드-gs
		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		



		//메소드-일반
		@Override
		public String toString() {
			return "Staff [salary=" + salary + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
		}


		public void showInfo() {
			System.out.println("아이디:"+ super.id +"\t"+ "비번:"+super.pw +"\t"+ "이름:"+super.name +"\t"+ "월급:"+ this.salary );
		}
		public void showSalary() {
			System.out.println("운영자의 연봉은 " + salary*12 + "입니다.");
		}





}
