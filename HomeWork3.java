package strings.format.mathpi;

import java.util.Formatter;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter PI = new Formatter();
		PI.format("% .1f", Math.PI);
		System.out.println(PI);
		PI = new Formatter();
		PI.format("% .2f", Math.PI);
		System.out.println(PI);
		PI = new Formatter();
		PI.format("% .3f", Math.PI);
		System.out.println(PI);
		PI = new Formatter();
		PI.format("% .4f", Math.PI);
		System.out.println(PI);
		PI = new Formatter();
		PI.format("% .5f", Math.PI);
		System.out.println(PI);
}
}