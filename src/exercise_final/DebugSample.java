package exercise_final;

public class DebugSample {

	public static void main(String[] args) {
		double height = 1.75; // m
		double weight = 65.0; // kg
		
		Bmi bmi = new Bmi(height, weight);
		
		double bmi_value = bmi.calc();
		String judge = bmi.judge();
		System.out.println(judge);
	}

}
