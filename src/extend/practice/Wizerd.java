package extend.practice;

public class Wizerd extends Human{

	public Wizerd(String name,int hp,int offensive) {
		super(name,hp,offensive);
	}
	
	@Override
	public void attack(Living target) {
		super.attack(target);
		System.out.println(this.name+"が魔法で攻撃！");
		int damage=Rand.get(9)*this.offensive;
		System.out.println(target.name+"に"+damage+"のダメージを与えた！");
		target.hp-=damage;
		if(target.hp<=0) {
			die(target);
		}
	}

	public void die(Living target) {
		System.out.println(target.name+"は倒れた！");
	}
}
