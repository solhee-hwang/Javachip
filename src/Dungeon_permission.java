import java.util.Scanner;
public class Dungeon_permission{
        Scanner i = new Scanner(System.in);

        public void per(int level){
            job jb = new job();
            System.out.println("============player choice==============");
            System.out.println("(1).level_1 던전|| (2).level_2 던전|| (3).level_3 던전");
            System.out.print(">");
            int player_ch = i.nextInt();
            switch(player_ch){
            case 1: 
                System.out.println("level 1 던전에 입장하셨습니다.");
                Monster monster_1 = new Monster();
                break;
                case 1:
                System.out.println("level_1 던전에 입장하셨습니다.");
                Monster monster_1 =  new Monster();
                break;
                //던전플레이 함수 실행
            case 2:
                if(level <10){
                    System.out.println("level 10이상 부터 입장이 가능합니다.");
                    break;
                }
                System.out.println("level_2 던전에 입장하셨습니다.");
                break;
            case 3:
                if(level < 20){
                    System.out.println("level 20이상부터 입장이 가능합니다.");
                    break;
                }
                System.out.println("");
            case 4:
                System.out.println(">>던전에서 나갔습니다.");
            }
            
        }
        
    
    
    

    
}