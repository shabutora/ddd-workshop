package ddd.entity;

import ddd.vo.NumberOfPeople;
import ddd.vo.Price;
import ddd.vo.Rank;
import ddd.vo.RoomType;

import java.time.LocalDate;

/**
 * Created by tsukasa on 2015/07/02.
 */
public class SingleReservation {
    private LocalDate date;
    private NumberOfPeople number;
    private Price price;
    private Rank rank;
    private RoomType roomType;
}
