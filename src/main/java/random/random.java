package random;
import java.util.*;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Random rand = new Random(System.currentTimeMillis());
			long result=0;
			for(long i=0; i<2147483647; i++)
			{
				result += (rand.nextInt(9)+1);
			}
			System.out.println(result);
	}

}
