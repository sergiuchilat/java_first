class FirstJava{
	public static void main(String [] args){
		Aritmetica a = new Aritmetica();
		System.out.println("First Java");
		int x = 4;
		int y = 2;
		System.out.println(a.sum(x, y));
	}
}

class Aritmetica{
	public int sum(int a, int b) {
		return a + b;
	}
}