package service;

import model.House;
import model.HouseType;

import java.util.List;

public interface IHouseService {
    void add(House house);

    List<House> getAll();

    void addAll(List<House> houseList);

    List<House> getHouseByHouseType(HouseType houseType);

    int getTotalPrice();

    int getTotalPriceByHouseType(HouseType type);

    int getAvgSquareMeterByType(HouseType type);

    double getAvgSquareMeter();

    List<House> filterHousesByRoomCount(int roomCount);
    void printAllHouse(List<House> houseList);
}

