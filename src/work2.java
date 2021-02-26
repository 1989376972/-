import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎来到《简陋的打怪兽游戏》");
        System.out.println("简陋的打怪之旅即将开始，请创建角色名称：");
        Player player=new Player(in.nextLine());
        System.out.println("请输入角色生命（1-999），攻击力（1-999），防御力（1-999）：");
        player.setBlood(in.nextInt());
        player.setAttack(in.nextInt());
        player.setDefine(in.nextInt());
        System.out.println("请输入怪兽名称：");
        Monster monster=new Monster(in.next());
        System.out.println("请输入怪兽生命（1-999）和攻击力（1-999）：");
        monster.setBlood(in.nextInt());
        monster.setAttack(in.nextInt());
        System.out.println("战斗开始！！！");
        int count=1;
        while (monster.getBlood()>0&&player.getBlood()>0){
            System.out.println("第【"+count+"】回合");
            player.fight(player,monster);
            if(monster.getBlood()>0) {
                monster.fight(player, monster);
            }
            count++;
        }
    }

}
