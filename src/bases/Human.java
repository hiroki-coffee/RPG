package bases;

import utils.Dice;

public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {

		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int dice = Dice.get(1, 10);
		int damage = (dice * offensive);

		// 相手のHPをダメージ値だけ減らす
		int hp = target.getHp() - damage;
		target.setHp(hp);

		// 自分の攻撃力を1だけ減らす
		int offensive = getOffensive() - 1;
		setOffensive(offensive);

		// コンソールにステータスを表示
		System.out.println(name + "が" + weapon + "で攻撃！" + target + "に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。");
	}

}