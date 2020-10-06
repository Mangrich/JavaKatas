package TDDLesson;

public class Calculadora {

	public Integer getSoma(Integer i, Integer j) {
		if(i == null) {
			i = 0;
		}
		if(j == null) {
			j = 0;
		}
		return i + j;
	}

	public Integer getSubtracao(Integer i, Integer j) {
		if(i == null) {
			i = 0;
		}
		if(j == null) {
			j = 0;
		}
		// TODO Auto-generated method stub
		return i-j;
	}

	public Integer getDivisao(Integer i, Integer j) {
		if(i == null) {
			i = 1;
		}
		if(j == null) {
			j = 1;
		}
		return i/j;
	}

	public Integer getMultiplicacao(Integer i, Integer j) {
		if(i == null) {
			i = 1;
		}
		if(j == null) {
			j = 1;
		}
		return i*j;
	}

}
