package com.sourav.problem.solving;

public class CircularPrinter {
	
	
	public static long getTime(String s) {
		char prev = 'A';
		long val = 0;
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (prev < curr) {
				String s3 = String.valueOf(prev);
				String s4 = String.valueOf(curr);
				int len = s4.compareTo(s3);
				if (len <= 13)
				  val = val + len;
				else 
					val = val + 26-len;
				prev = curr;
			} else if (prev > curr) {
				String s3 = String.valueOf(prev);
				String s4 = String.valueOf(curr);
				int len = s3.compareTo(s4);
				if (len <= 13)
					  val = val + len;
					else 
						val = val + 26-len;
					prev = curr;
			}
		}
		return val;
	}

	public static void main(String[] args) {
		String str = "ZNMD";
		System.out.println(getTime(str));
	}

}
