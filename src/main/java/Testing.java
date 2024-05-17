import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Testing {

	static int findfactoial(int n) {
		if (n <= 1)
			return 1;
		else {
			return n * findfactoial(n - 1);
		}
	}

	// 1*2*3 = 6

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(findfactoial(i)+ " ");
		}

	}

}
