package extend.practice;

public class Oak extends Monster{
	
	public Oak(String name,int hp,int offensive) {
		this.name=name;
		this.hp=hp;
		this.offensive=offensive;
	}
	
	@Override
	public void attack(Living target) {
		System.out.println(this.name+"が槍で攻撃！");
		int damage=Rand.get(10)*this.offensive;
		System.out.println(target.name+"に"+damage+"のダメージを与えた！");
		target.hp-=damage;
	}
}
