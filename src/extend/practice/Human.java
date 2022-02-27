package extend.practice;

public class Human extends Living {
	
	public Human(String name,int hp,int offensive) {
		this.name=name;
		this.hp=hp;
		this.offensive=offensive;
	}
	
	@Override
	public void attack(Living target) {
		System.out.println("人間のターン！");
		
	}
	
	
}
