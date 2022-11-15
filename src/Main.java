import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Второе задание:
        Set<City>citySet=new TreeSet<>(Comparator.reverseOrder());
        List<City> list = new ArrayList<>();
        list.add(new City(14, "Bishkek", "2mln"));
        list.add(new City(123, "New York", "15mln"));
        list.add(new City(67, "London", "7mln"));
        list.add(new City(90, "Moscow", "14mln"));
        list.add(new City(58, "Sidney", "4mln"));
        list.add(new City(33, "Washington", "5mln"));
        list.add(new City(74, "Istanbul", "9mln"));

        for (City city : list) {
            if (city.getCode() % 2 == 0) {
                System.out.println(city);
            }if (city.getCode()%2!=0){
                System.out.println(citySet);
            }


        }
    }
}