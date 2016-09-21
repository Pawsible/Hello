
public class Patterns {
	
	public static void upper(int row){
		for(int column = 1; column<=row; column++){
			System.out.print("*");
		}
		System.out.println();
	}

	public static void lower(int row){


		for(int space_column = 3; space_column>row;space_column--){
			System.out.print(" ");
		}
		for(int star_column=1;star_column<=row;star_column++){
			System.out.print("*");
		}
		System.out.println();	
	}
	public static void main(String[] args) {
		
		for(int row = 1; row<3; row++){
			upper(row);
		}
		for(int row=3;row>=1;row--){	
			lower(row);
		}
	}
	
	
	
	
		/*for(int row = 5; row>=1; row--){
			for(int column = 1; column<=3;column++){
				if(row<=3&&column<=row){
				System.out.print("*");
				}else {
					if(row>3&&){
						System.out.print("*");
					}
					System.out.print("");
				}
			}
			System.out.println();
		}
	
	}*/
		
		
		/*for(int row = 1; row<=3; row++){
			for(int column = 1; column<=3; column++){
				if(column<=row){
					System.out.print("*");
				}
			}
			System.out.println();
		}*/
	
	}

/*		*										(1,1)										
		**										(2,1) (2,2)
		***										(3,1) (3,2) (3,3)
		 **										(4,1) (4,2) (4,3)	  	
		  *										(5,1) (5,2) (5,3)
*/


