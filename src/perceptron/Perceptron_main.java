package perceptron;
//学習するごとに判定するようにして完了したらすぐに終わるようにした
public class Perceptron_main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double nu[] = {0.35, 0.2};
		Perceptron_lib plib = new Perceptron_lib(2, nu, 0.01, 0.5);


	//学習データ
		double input[][] = { {1,1}, {1,0}, {0,1}, {0,0}};
		double output[] = {1, 0, 0, 0};
        int k,m=0;

		int index;
		for(int i = 0; i < 10000; i++){
			k=0;m++;
			index = (int)(Math.random()*4);  //0~3の乱数発生
			plib.getParameter(input[index], output[index]);
			System.out.println("index : "+i+"nu = "+nu[0]+", "+nu[1]);
			for(int v = 0; v < output.length; v++){
				if(plib.getOutput(input[v]) == output[v])
			    k++;
			}
		 if (k==4)
			 break;
		}


		for(int i = 0; i < output.length; i++){
			if(plib.getOutput(input[i]) == output[i])
				System.out.println("Correct! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
			else System.out.println("Miss! : input("+input[i][0]+","+input[i][1]+") to output("+output[i]+")");
		}
		System.out.println("Check : nu = "+nu[0]+", "+nu[1]);
		System.out.println("試行回数"+m);
		



	}

}

