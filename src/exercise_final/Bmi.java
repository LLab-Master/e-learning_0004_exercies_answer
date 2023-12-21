package exercise_final;

public class Bmi {
	private double height;
	private double weight;
	
	public Bmi(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	public double calc() {
		return this.weight / (this.height * this.height);
	}
	
	public String judge() {
		String result;
		double bmi = this.calc();
		
		if (bmi < 0) {
			result = "入力値不正";
		} else if (bmi < 18.5) {
			result = "低体重";
		} else if (bmi < 25.0) {
			result = "普通体重";
		} else if (bmi < 30.0) {
			result = "肥満(1度)";
		} else if (bmi < 35.0) {
			result = "肥満(2度)";
		} else if (bmi < 40.0) {
			result = "肥満(3度)";
		} else {
			result = "肥満(4度)";
		}
		return result;
	}
}
