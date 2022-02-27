package extend.practice;

public class Fighter extends Human{
	
	public Fighter(String name,int hp,int offensive) {
		this.name=name;
		this.hp=hp;
		this.offensive=offensive;
	}
	
	@Override
	public void attack(Living target) {
		System.out.println(this.name+"が斧で攻撃！");
		int damage=Rand.get(10)*this.offensive;
		System.out.println(target.name+"に"+damage+"のダメージを与えた！");
		target.hp-=damage;
	}
}
