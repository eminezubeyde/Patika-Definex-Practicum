import dao.HouseDao;
import model.House;
import model.HouseType;
import model.RealtyType;
import service.HouseService;

import java.time.LocalDateTime;
import java.util.List;


public class Main {
    static HouseService houseService=new HouseService();

    public static void main(String[] args) {

        House summerhouse1=new House("1", LocalDateTime.now(), RealtyType.SALE,150,4, HouseType.SUMMERHOUSE,500000);
        House summerhouse2=new House("2", LocalDateTime.now(), RealtyType.RENT,300,8, HouseType.SUMMERHOUSE,1500000);
        House summerhouse3=new House("3", LocalDateTime.now(), RealtyType.SALE,200,6, HouseType.SUMMERHOUSE,800000);

        House villa1=new House();
        villa1.setNoticeNo("4");
        villa1.setCreationDate(LocalDateTime.now());
        villa1.setRealtytype(RealtyType.SALE);
        villa1.setSquareMeter(500);
        villa1.setRoomCount(10);
        villa1.setHouseType(HouseType.VILLA);
        villa1.setPrice(5000000);

        House villa2=new House();
        villa2.setNoticeNo("5");
        villa2.setCreationDate(LocalDateTime.now());
        villa2.setRealtytype(RealtyType.RENT);
        villa2.setSquareMeter(700);
        villa2.setRoomCount(15);
        villa2.setHouseType(HouseType.VILLA);
        villa2.setPrice(4000000);

        House villa3=new House();
        villa3.setNoticeNo("6");
        villa3.setCreationDate(LocalDateTime.now());
        villa3.setRealtytype(RealtyType.RENT);
        villa3.setSquareMeter(900);
        villa3.setRoomCount(20);
        villa3.setHouseType(HouseType.VILLA);
        villa3.setPrice(7000000);

        List<House>houses=List.of(summerhouse1,summerhouse2,summerhouse3,villa1,villa2,villa3);
        houseService.addAll(houses);
        System.out.println(houseService.getAll());
        List<House> houseByHouseType = houseService.getHouseByHouseType(HouseType.SUMMERHOUSE);
        System.out.println(houseByHouseType.size());
        System.out.println(houseService.getTotalPrice());
        System.out.println(houseService.getAvgSquareMeter());
        houseService.printAllHouse(houseByHouseType);
    }


}