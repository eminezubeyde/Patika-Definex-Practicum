package dao;

import model.House;
import model.HouseType;

import java.util.ArrayList;
import java.util.List;

public class HouseDao {

    List<House> houseList = new ArrayList<>();


    public void add(House house) {
        houseList.add(house);

    }

    public List<House> getall() {
        return houseList;
    }
    public void addAll(List<House> houses){
        houseList.addAll(houses);

    }


}
