
public class Fibo {
	
	public static void main(String[] args) {
		int n = 6;
		int one = 1;
		int zero = 0;
		int bro = 0;
		for(int i=0; i<n; i++){
			if(i==0){
				System.out.println(one);
			}else{
			bro = one + zero;
			System.out.println(bro);
			one = zero;
			zero = bro;
			}
			
		}
		
	}

}


//i = 0, sysout = 1, one = 0, zero = 1
//i = 1, sysout = 1, one = 1, zero = 1
//i = 2, sysout = 2, one = 1, zero = 2
//i = 3, sysout = 3, one = 2, zero = 3
//i = 4, sysout = 5, one = 3, zero = 5