package jp.ac.uryukyu.ie.e195733;

public class Enemy extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     *
     * @param name      名前
     * @param maximumHP HP
     * @param attack    攻撃力
     */
    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint(),damage);
        if( getHitPoint() < 0 ) {
            changeDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}