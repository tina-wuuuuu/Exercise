package Date0806_3;



public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("讀入的引數: ");
		for (String arg : args)
			System.out.print(arg + " ");
		System.out.println();
		for(String arg : args) {
			 switch(arg.charAt(0)) {
			 case '-': 
			 // 處理參數，執行選項，例如-o、-p、-r等等
			 default:
			 // 執行對應功能
			 }
			}
			//在判斷執行選項的case中，您可以進一步檢查第二個字元，例如：
			/*switch(arg.charAt(1)) {
			 case 'o':
			 // 選項o的處理
			 break;
			 case 'p':
			 // 選項p的處理
			 break;
			 case 'r':
			 // 選項r的處理
			 break;
			 default:
			 // 選項錯誤處理或其它處理
			} */
		//以上是命令列引數處理時的大致流程，當然不同的程式會有不同的處理方式，不過大致上不離以上的架構。 
	}

}
