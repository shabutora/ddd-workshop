package ddd.vo;

/**
 * 人数幅
 * Created by tsukasa on 2015/07/02.
 */
public enum NumberOfPersonsRange {

    LITTLE(0, 2),
    MIDDLE(3, 3),
    MANY(4, Integer.MAX_VALUE)
    ;

    private int start;
    private int end;

    private NumberOfPersonsRange(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
