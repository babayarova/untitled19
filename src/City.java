import java.util.List;

public class City  implements Comparable<City>{
        private int code;
        private String name;
        private String population;

        public City(int code, String name, String population) {

            this.code = code;
             this.name = name;
            this.population = population;
        }

        public int getCode() {
            return code;
        }

        public void setCode() {

            this.code=code;


        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPopulation() {
            return population;
        }

        public void setPopulation(String population) {
            this.population = population;
        }

        @Override
        public String toString() {
            return "City{" +
                    "code=" + code +
                    ", name='" + name + '\'' +
                    ", population='" + population + '\'' +
                    '}';
        }


        @Override
        public int compareTo(City o) {
            return 0;
        }


    }


