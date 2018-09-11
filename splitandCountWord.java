import java.util.Arrays;

public class splitandCountWord {
	String mainDoc ="hello how are you!! this is the perfect time, to make a perfect coffee! let us make a cup of coffee";
	public splitandCountWord() {
		returCleanStr(mainDoc);
	}
	
	public String returCleanStr(String docu) {
		String [] replcSpclChar = {"!",".",","};
		String [] splitDocu = docu.split(" ");
		//StringBuilder sbSplitDocu = new StringBuilder(splitDocu);
		
		Arrays.stream(splitDocu).forEach(e->{
			Arrays.stream(replcSpclChar).forEach(spl->{
				if (e.contains(spl)) {
				e.replace(spl, "");
				//e = e.replaceAll(spl, "");
				
				System.out.println(e);}
			});
		});
		return docu;
	}

	public static void main(String[] args) {
		new splitandCountWord();
	}

}
