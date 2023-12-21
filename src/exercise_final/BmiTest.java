package exercise_final;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BmiTest {
	double calcWeight(double bmi, double height) {
		// BMI と 身長を引数として、BMI に合うような体重を返す
		return bmi * height * height;	
	}

	@Test
	void BMI計算値() {
		double height = 1.75; // m
		double weight = 65.0; // kg
		Bmi bmi = new Bmi(height, weight);
		assertEquals(weight / (height * height), bmi.calc());
	}
	@Test
	void 入力値不正() {
		double targetBmi = -1;
		double height = 1.75;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("入力値不正", bmi.judge());
	}
	@Test
	void 低体重上限() {
		double targetBmi = 18.4999;
		double height = 1.5;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("低体重", bmi.judge());
	}
	@Test
	void 普通体重下限() {
		double targetBmi = 18.5;
		double height = 2.0;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("普通体重", bmi.judge());
	}
	@Test
	void 普通体重上限() {
		double targetBmi = 24.9999;
		double height = 1.45;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("普通体重", bmi.judge());
	}
	@Test
	void 肥満1度下限() {
		double targetBmi = 25.0;
		double height = 1.8;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("肥満(1度)", bmi.judge());
	}
	@Test
	void 肥満1度上限() {
		double targetBmi = 29.9999;
		double height = 1.95;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("肥満(1度)", bmi.judge());
	}
	@Test
	void 肥満2度下限() {
		double targetBmi = 30.0;
		double height = 2.75;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("肥満(2度)", bmi.judge());
	}
	@Test
	void 肥満2度上限() {
		double targetBmi = 34.9999;
		double height = 1.6;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("肥満(2度)", bmi.judge());
	}
	@Test
	void 肥満3度下限() {
		double targetBmi = 35.0;
		double height = 1.85;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("肥満(3度)", bmi.judge());
	}
	@Test
	void 肥満3度上限() {
		double targetBmi = 39.9999;
		double height = 1.7;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("肥満(3度)", bmi.judge());
	}
	@Test
	void 肥満4度下限() {
		double targetBmi = 40.0;
		double height = 1.86;
		double weight = calcWeight(targetBmi, height);
		Bmi bmi = new Bmi(height, weight);
		assertEquals("肥満(4度)", bmi.judge());
	}
}
