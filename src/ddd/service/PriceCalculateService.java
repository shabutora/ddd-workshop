package ddd.service;

import ddd.vo.NumberOfPersons;
import ddd.vo.Price;
import ddd.vo.RoomType;
import ddd.vo.StayDate;

/**
 * 料金計算
 * Created by tsukasa on 2015/07/04.
 */
public class PriceCalculateService {

    public Price calclulate(StayDate stayDate, NumberOfPersons number, RoomType roomType) {
        return new Price();
    }
}
