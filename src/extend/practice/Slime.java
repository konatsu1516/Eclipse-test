package extend.practice;

public class Slime extends Monster{
	
	public Slime(String name,int hp,int offensive) {
		this.name=name;
		this.hp=hp;
		this.offensive=offensive;
	}
	
	@Override
	public void attack(Living target) {
		System.out.println(this.name+"が体当たりで攻撃！");
		int damage=Rand.get(10)*this.offensive;
		System.out.println(target.name+"に"+damage+"のダメージを与えた！");
		target.hp-=damage;
	}
}
