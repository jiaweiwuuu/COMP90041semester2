public class FlowControl{
	public static void main(String[] args){
		// if-else
		System.out.println("if-else demo\n");
		int a = 1;

		if (a < 0){
			System.out.println("negative");
		}
		else if (a == 0){
			System.out.println("zero");
		}
		else{
			System.out.println("positive");
		}
		System.out.println("------------------");
		// switch-case
		System.out.println("switch-case demo\n");
		int b = 1;
		switch (a)
		{
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			default:
				System.out.println("too big");
				break;
		}
		System.out.println("------------------");
		//for-loop
		System.out.println("for-loop demo\n");
		for(int i = 0; i < 5; i++){
			System.out.println("i = " + i);
		}
		System.out.println("------------------");
		// while-loop
		System.out.println("while-loop demo\n");
		int j = 0;
		while(j<5){
			System.out.println("j = " + j);
			j++;
		}
		System.out.println("------------------");
	}
}