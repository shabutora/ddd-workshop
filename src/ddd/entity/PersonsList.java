package ddd.entity;

import java.util.List;

/**
 * Created by tsukasa on 2015/07/04.
 */
public class PersonsList {
    private List<Person> persons;

    /**
     * 人数を返す
     * @return 人数
     */
    public int getCount() {
        return this.persons.size();
    }
}
