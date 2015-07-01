package ddd.vo;

/**
 * Created by tsukasa on 2015/07/02.
 */
public enum PeopleRange {

    LITTLE(0, 2),
    MIDDLE(3, 3),
    MANY(4, Integer.MAX_VALUE)
    ;

    private int start;
    private int end;

    private PeopleRange(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
