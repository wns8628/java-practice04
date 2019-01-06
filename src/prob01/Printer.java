package prob01;

public class Printer{
	public Printer(){}
	
//	public void println(int age) {
//		System.out.println(age);
//	}
//	public void println(boolean yesorno) {
//		System.out.println(yesorno);
//	}
//	public void println(double weight) {
//		System.out.println(weight);
//	}
//	public void println(String name) {
//		System.out.println(name);
//	}
	
	//제너릭쓰면됨
//	public <T> void println(T t) {
//		System.out.println(t);
//	}
	
	//쓸떄 sum(1,2,3,4,5)
	//쓸떄 sum(1,2) 이런식으로쓰고싶다 
	//가변변수 
	public Integer sum(Integer... nums) {
		Integer sum = 0;			
		for(Integer i:nums) {
			sum +=i;
		}
		return sum;
	}
	
	//가변변수 + 제너릭 
	public <T> void println(T... ts) {
		for(T t : ts) {
			System.out.println(t);	
		}
	}	 
}
