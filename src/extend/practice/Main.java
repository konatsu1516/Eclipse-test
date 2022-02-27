package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//人間チーム作成
		Brave brave = new Brave("勇者", 100, 10);
		Fighter fighter = new Fighter("戦士", 100, 8);
		Wizerd wizerd = new Wizerd("魔法使い", 100, 6);

		List<Human> humans = new ArrayList<>();
		humans.add(brave);
		humans.add(fighter);
		humans.add(wizerd);
		
		//モンスターチーム作成
		Slime slime = new Slime("スライム", 50, 5);
		Oak oak = new Oak("オーク", 70, 7);
		Dragon dragon = new Dragon("ドラゴン", 120, 10);

		List<Monster> monsters = new ArrayList<>();
		monsters.add(slime);
		monsters.add(oak);
		monsters.add(dragon);
		
		//バトル開始
		while (humans.size() != 0 && monsters.size() != 0) {
			// 人間のターン
			Living humanAttacker = humans.get(Rand.get(humans.size()));// 攻撃者をランダムで決める
			Living monsterTarget = monsters.get(Rand.get(monsters.size()));// 攻撃相手(モンスター)をランダムで決める
			System.out.println("人間のターン！");
			humanAttacker.attack(monsterTarget);
			if (monsterTarget.hp <= 0) { // もし攻撃相手のHPが0以下なら
				System.out.println(monsterTarget.name+"は倒れた！");
				monsters.remove(monsterTarget); // 攻撃相手をリストから削除
			}
			if (monsters.size() == 0) {
				System.out.println("勇者達は勝利した！");
				break;
			}
			// モンスターのターン
			Living monsterAttacker = monsters.get(Rand.get(monsters.size()));// 攻撃者をランダムで決める
			Living humanTarget = humans.get(Rand.get(humans.size()));// 攻撃相手(人間)をランダムで決める
			System.out.println("モンスターのターン！");
			monsterAttacker.attack(humanTarget);
			if (humanTarget.hp <= 0) { // もし攻撃相手のHPが0以下なら
				System.out.println(humanTarget.name+"は倒れた！");
				humans.remove(humanTarget); // 攻撃相手をリストから削除
			}
			if (humans.size() == 0) {
				System.out.println("勇者達は全滅してしまった...");
			}
		}
	}

}
