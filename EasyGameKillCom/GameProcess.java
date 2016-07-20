import java.util.ArrayList;

//一个简单的游戏
//game进行的过程

public class GameProcess {
	public static void main(String[] args) {
		 int numOfGuess=0;
		 GameHelper helper=new GameHelper();
		 SimpleDotCom theDotCom=new SimpleDotCom();
		 int randomNum=(int) (Math.random()*5);
		 //随机取dotcom的三个连续数字
		 ArrayList<String> locations=new ArrayList<String>();
		 //创建空的String类型ArrayList对象，往空的ArrayList增加元素，需要将元素类型从int转化为String
		 //int i=Integer.parseInt("3"); String-->int
		 locations.add(randomNum+"");//+""将int转化为String
		 locations.add(randomNum+1+"");
		 locations.add(randomNum+2+"");
//		 int[] locations={randomNum,randomNum+1,randomNum+2};
		 theDotCom.setLocationCells(locations);
		 boolean isAlive=true;
		 
		 while(isAlive==true){
			 String userInput=helper.getUserInput("enter a number");
			 String result=theDotCom.checkYouself(userInput);
			 numOfGuess++;
			 if (result.equals("kill")){
				 isAlive=false;
				 System.out.println("You took "+numOfGuess+" guesses");
			 }
		 }
	}

}
