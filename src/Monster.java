public class Monster extends Character {
   public Monster(String name){
       super(name);
   }
    public void fight(Player player,Monster monster){
        int x=monster.getAttack()- player.getDefine();
        if (x<=0){
            x=1;
        }
        int m=player.getBlood()-x;
        if (m<0){
            System.out.println("【"+monster.getName()+"】对【"+player.getName()+"】造成"+player.getBlood()+"点伤害");
            System.out.println("["+player.getName()+"]死亡  游戏结束  ["+player.getName()+"]失败");
        }
        else{
            System.out.println("【"+monster.getName()+"】对【"+player.getName()+"】造成"+x+"点伤害");
        }
        player.setBlood(m);
    }
}
