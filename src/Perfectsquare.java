
public class Perfectsquare {

	public static boolean isPerfectSquare(int n){
	    int x = (int) Math.sqrt(n);	

	    if (x*x==n)
	        return true;

	    return false;
	}

	public static int findWays(int x){
	    int result;
	    int count = 0;

	    if (isPerfectSquare(x)){
	        count++;
	    }

	    for (int i=1;i<Math.sqrt(x);i++){
	        result = i*i;
	        if (result<x-result){
	            if (isPerfectSquare(x-result)){
	                        count++;
	            }
	        }
	    }

	    return count;
	}

	public static void main(String[] args) {
		System.out.println("5: "+ findWays(5));
		System.out.println("10: "+ findWays(10));
		System.out.println("25: "+ findWays(25));


	}

}
