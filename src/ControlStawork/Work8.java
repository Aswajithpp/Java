package ControlStawork;

public class Work8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 4, 17, 7, 25, 3, 100};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        double avg = sum / 7.0;

        System.out.println("The average of the said array is: " + avg);

        System.out.println("The numbers greater than the average are:");

        for (int i = 0; i < a.length; i++) {

            if (a[i] > avg) {
                System.out.println(a[i]);
            }
        }
	}

}



