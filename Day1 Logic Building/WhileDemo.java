class StatementDemo{

	public static void main(String []args){
		
		int a = 1000;
		/*
		if(a>=10){
			System.out.println(a>=10);   // true
			System.out.println("if block"); //
		}else{
			System.out.println(a>10);
			System.out.println("else block");
		}
			
		if(a==10){
			
			System.out.println("if block"); 
		}else if(a<100){
											System.out.println("else block");
		}else{
			System.out.println("not in range");
		}
		*/

		/*
		switch(a){
			
			case 1000:
				System.out.println(1000);
				break;
			case 2000:
				System.out.println(2000);
				break;
			case 3000:
				System.out.println(3000);
				break;
			default:
				System.out.println("default block");
				break;
				
		}*/

		/* both are optional - case & default
		switch(a){
			case 1000:
				System.out.println(1000);
				break;
		}*/


		/* compile time error
		switch(a){
			
			case 500+500:
				System.out.println(1000);
				break;
			case 1000:
				System.out.println(2000);
				break;
			case 3000:
				System.out.println(3000);
				break;
			default:
				System.out.println("default block");
				break;
				
		}*/
		/*
		char c = 'b';
		switch(c){
			
			case 97:
				System.out.println(1000);
				break;
			case "b":
				System.out.println(2000);
				break;
			case 3000:
				System.out.println(3000);
				break;
			default:
				System.out.println("default block");
				break;
				
		}*/










System.out.println("end of main()");

	}

}








// 0<= i <= 100
//i>=0 && i<=100

















/*

java statement

1. selection
	if
		syntax: if(condition){   .....    }

	if-else
		syntax: 
		if(condition){
		.....
		....
		}else{ 
		....
		....
		}
	switch
		syntax: 
			swtich(expr){

			case 1:
				....
				break;

			default: 
				....
				break;
			}
	
	

2. iteration
	for
		syntax :
			for ( init ; condition ; incre / decre){
				......
			}
			
	while
		syntax:

			while(condition){
				.......
			}
	do-while
		syntax; 
			do{
			.....	
			}while();


			
	for each

3. transfer
	break
	continue
	return




*/