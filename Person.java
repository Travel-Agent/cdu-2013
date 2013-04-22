class Person {
	private String name;
	private int age;
	
	public Person(){
	
	}
	
	public boolean canDrinkAlcohol(){
		return age >= 18;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
}
