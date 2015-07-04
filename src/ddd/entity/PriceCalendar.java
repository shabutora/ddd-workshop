package ddd.entity;

import ddd.vo.NumberOfPersons;
import ddd.vo.Price;
import ddd.vo.CalendarColor;
import ddd.vo.StayDate;

/**
 * 宿泊料金カレンダー
 * Created by tsukasa on 2015/07/04.
 */
public class PriceCalendar {

    private CalendarColor calendarColor;

    /**
     * 人数と宿泊日から料金を計算する
     * @param number 人数
     * @param stayDate 宿泊日
     * @return 料金
     */
    public Price calculate(NumberOfPersons number, StayDate stayDate) {
        // TODO impl
        return null;
    }
}
