package domain;

import java.util.List;
import java.util.Objects;

public class Lotto {

	private static final Integer INIT_NUMBER = 0;
	private static final Integer PLUS_NUMBER = 1;

	private List<Number> lotto;

	public Lotto(List<Number> lotto) {
		this.lotto = lotto;
	}

	public static Integer numberOfMatches(Lotto lotto, Lotto lottoWinningNumber) {
		int sum = INIT_NUMBER;
		for (int number = INIT_NUMBER ; number < lotto.size() ; ++number) {
			sum += containStatus(lottoWinningNumber, lotto.lotto.get(number));
		}
		return sum;
	}

	public static Integer containStatus(Lotto lottoWinningNumber, Number lottoNumber) {
		if (lottoWinningNumber.lotto.contains(lottoNumber)) {
			return PLUS_NUMBER;
		}
		return INIT_NUMBER;
	}

	public Integer size() {
		return lotto.size();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Lotto lotto1 = (Lotto) o;
		return Objects.equals(lotto, lotto1.lotto);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lotto);
	}
}