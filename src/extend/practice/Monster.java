package extend.practice;

public abstract class Monster extends Living{

	public Monster(String name,int hp,int offensive) {
		this.name=name;
		this.hp=hp;
		this.offensive=offensive;
	}
	
	@Override
	public void attack(Living target) {
		System.out.println("モンスターのターン！");
		
	}
}
