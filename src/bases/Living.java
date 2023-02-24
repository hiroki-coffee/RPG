package bases;

//自分自身の内容を適切に表現する文字列を戻り値とするようにカスタマイズします。ヒットポイントが50以下の場合は、警告分も含みます。
//	protected
public abstract class Living {
	protected String name;
	protected String weapon;
	protected int hp;
	protected int offensive;

	public Living(String name, String weapon) {
		this.name = name;
		this.weapon = weapon;
	}

	// ゲッター、セッター
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getOffensive() {
		return offensive;
	}

	public void setOffensive(int offensive) {
		this.offensive = offensive;
	}

    // ターゲットに攻撃するメソッド
	public abstract void attack(Living target); 

	// 自分自身を表現する文字列のオーバーライド
	@Override
	public String toString() {
		String alert = "";
		if (this.hp <= 50) {
			alert = "★ HP残りわずか！アブナイ";
		}
		return String.format("[名前]: %s, [ヒットポイント]: %d, [攻撃力]: %d %s", this.name, this.hp, this.offensive, alert);
	}

}
