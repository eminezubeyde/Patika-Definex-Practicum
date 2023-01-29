package service;

import dao.HouseDao;
import model.House;
import model.HouseType;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService implements IHouseService {
    private HouseDao houseDao = new HouseDao();

    @Override
    public void add(House house) {
        houseDao.add(house);

    }

    @Override
    public List<House> getAll() {
        return houseDao.getall();
    }

    @Override
    public void addAll(List<House> houseList) {
        houseDao.addAll(houseList);
    }


    @Override
    public List<House> getHouseByHouseType(HouseType houseType) {
        List<House> houseList=houseDao.getall();
       return houseList.stream().filter(house -> house.getHouseType().equals(houseType)).toList();

    }

    public int getTotalPrice() {
         return houseDao.getall().stream().mapToInt(House::getPrice).sum();

        /*List<House> houseList = houseDao.getall();

        int total = 0;
        for (House house : houseList) {
            total += house.getPrice();
        }
        return total;*/
    }

    @Override
    public int getTotalPriceByHouseType(HouseType type) {
        return houseDao.getall().stream().filter(house -> house.getHouseType().equals(type)).mapToInt(House::getPrice).sum();

    }

    public double getAvgSquareMeter() {
        List<House> houseList=houseDao.getall();
       return (double) houseList.stream().mapToInt(House::getSquareMeter).sum()/houseList.size();
      /*
        List<House> houseList = houseDao.getall();
        double totalsquareMeter = 0;
        int count = 0;
        for (House house : houseList) {
            totalsquareMeter += house.getSquareMeter();
            count++;

        }
        return totalsquareMeter / count;
       */
    }

    public int getAvgSquareMeterByType(HouseType type) {
        List<House> houseList = houseDao.getall();
        double totalSquareMeter = 0;
        int count = 0;
        for (House house : houseList) {
            if (house.getHouseType() == type) {
                totalSquareMeter += house.getSquareMeter();
                count++;
            }
        }
        return (int) (totalSquareMeter / count);
    }

    public List<House> filterHousesByRoomCount(int roomCount) {
        List<House> houseList = houseDao.getall();
        return houseList.stream().filter(house -> house.getRoomCount() == roomCount).collect(Collectors.toList());

    }

    @Override
    public void printAllHouse(List<House> houseList) {
        houseList.forEach(System.out::println);
    }
}
