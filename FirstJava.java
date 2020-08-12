class FirstJava{
	public static void main(String [] args){
		Aritmetica a = new Aritmetica();
		System.out.println("First Java");
		System.out.println(a.sum(2, 3));
	}
}

class Aritmetica{
	public int sum(int a, int b) {
		return a + b;
	}
}