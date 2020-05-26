package lotto.domain;

import java.util.Arrays;
import java.util.Optional;

public enum LottoRank {
    FIRST(6, 2_000_000_000),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000),
    MISS(0, 0);

    private int countOfMatch;
    private int winningMoney;

    private LottoRank(int countOfMatch, int winningMoney) {
        this.countOfMatch = countOfMatch;
        this.winningMoney = winningMoney;
    }

    public int getCountOfMatch() {
        return countOfMatch;
    }

    public int getWinningMoney() {
        return winningMoney;
    }

    public static Optional<LottoRank> valueOf(int countOfMatch) {
        return Arrays.stream(values())
                .filter(lottoRank -> lottoRank.countOfMatch == countOfMatch)
                .findFirst();
    }
}