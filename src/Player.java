class Player extends Character {
    private int define;
    public Player(String name){
        super(name);
    }
    public int getDefine() {
        return define;
    }
    public void setDefine(int define) {
        this.define = define;
    }
    public void fight(Player player,Monster monster){
        int m=monster.getBlood()-player.getAttack();
        if (m<0){
            System.out.println("【"+player.getName()+"】对【"+monster.getName()+"】造成"+monster.getBlood()+"点伤害");
            System.out.println("["+monster.getName()+"]死亡  游戏结束  ["+player.getName()+"]胜利！");
        }
        else{
            System.out.println("【"+player.getName()+"】对【"+monster.getName()+"】造成"+player.getAttack()+"点伤害");
        }
        monster.setBlood(m);
    }
}
