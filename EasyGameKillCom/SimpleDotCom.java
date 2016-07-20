import java.util.ArrayList;

//DotCom的位置和player进行对比
public class SimpleDotCom {
//	 int[] locationsCells;
//	 int numOfHits=0;
	private ArrayList<String> locationsCells;
	 
	public void setLocationCells(ArrayList<String> loc) {
		// setLocationCells传入的是ArrayList<String>
		locationsCells=loc;
		
	}

	public String checkYouself(String userInput) {
		//int guess =Integer.parseInt(userInput);
		String result="miss";
		//locationsCells是ArrayList数组
		int index=locationsCells.indexOf(userInput);
//		System.out.println(index);
		if(index>=0){
			locationsCells.remove(index);
			if(locationsCells.isEmpty()){
				result="kill";
			}else{
				result="hits";
			}
			}
		System.out.println(result);
		return result;
		}
		//把locationsCells每个元素的值赋给cell执行下面的循环
//		for (int cell:locationsCells){
//			if(guess==cell){
//				result="hit";
//				numOfHits++;
//				break;
//			}
//		}
//		if(numOfHits==locationsCells.length){
//			result="kill";
//			
//		}
//		System.out.println(result);
//		return result;
//	}

}
