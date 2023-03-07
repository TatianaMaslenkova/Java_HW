/*
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации 
 * и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
 * Например: “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ 2 - Объем ЖД
 * 3 - Операционная система 4 - Цвет … Далее нужно запросить минимальные значения для указанных 
 * критериев - сохранить параметры фильтрации можно также в Map. Отфильтровать ноутбуки 
 * из первоначального множества и вывести проходящие по условиям.
 */
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Program_HW_6 {
    public static void main(String[] args) throws IOException{
        // #region
        Laptops lap1 = new Laptops(20230301, "ASUS", "TUF Gaming A15", "Intel Core i5", 
        15.6, 8, 512, "Windows 11", "серый", 70000);
        Laptops lap2 = new Laptops(20230302, "LENOVO", "IdeaPad 5 15ITL05", "Intel Core i5", 
        17.3, 16, 256, "Windows 10", "синий", 45000);
        Laptops lap3 = new Laptops(20230303, "XIAOMI", "RedmiBook 15", "Intel Core i3", 
        16.1, 8, 256, "Windows 11", "белый", 35000);
        Laptops lap4 = new Laptops(20230304, "Hp", "dw1495nia 6J5C0EA", "Intel Celeron N4120", 
        15.6, 4, 1024, "Windows 10", "черный", 20000);
        Laptops lap5 = new Laptops(20230305, "APPLE", "MacBook Air MLY33", "Apple M2 M2", 
        13.6, 8, 512, "macOS", "серый", 150000);
        Laptops lap6 = new Laptops(20230306, "Asus", "ABC123", "Intel Core i3", 
        16.1, 16, 1024, "Windows 7", "белый", 50000);
        Laptops lap7 = new Laptops(20230307, "Lenovo", "Idea20ITL08", "Intel Core i3", 
        15.6, 8, 512, "Windows 11", "бежевый", 55000);
        Laptops lap8 = new Laptops(20230308, "Xiaomi", "Book 30", "Intel Core i5", 
        17.1, 16, 512, "Windows 8", "красный", 47000);
        Laptops lap9 = new Laptops(20230309, "HP", "8J7C5EA", "Intel Celeron N4120", 
        16.1, 8, 512, "Windows 11", "белый", 28000);
        Laptops lap10 = new Laptops(20230310, "Apple", "MacBook Air MLY44", "Apple M3 M3", 
        13.3, 16, 256, "macOS", "серый", 124000);
        //#endregion

        Set<Laptops> laptopsList = new HashSet<>();
        laptopsList.add(lap1);
        laptopsList.add(lap2);
        laptopsList.add(lap3);
        laptopsList.add(lap4);
        laptopsList.add(lap5);
        laptopsList.add(lap6);
        laptopsList.add(lap7);
        laptopsList.add(lap8);
        laptopsList.add(lap9);
        laptopsList.add(lap10);     
        
        Scanner scanner = new Scanner(System.in,"ibm866");
        System.out.println("Приветствуем в нашем онлайн-магазине ноутбуков!");
        // Если нужно вывести полный список ноутбуков:
        System.out.println("Всего в наличии " + laptopsList.size() + " ноутбуков:");
        System.out.println(laptopsList);
        System.out.println("Введите номер фильтра, по которому будем выбирать ноутбук:");
        System.out.println("1 - фильтр по бренду");
        System.out.println("2 - фильтр по модели");
        System.out.println("3 - фильтр по процессору");
        System.out.println("4 - фильтр по диагонали");
        System.out.println("5 - фильтр по оперативной памяти");
        System.out.println("6 - фильтр по объему жесткого диска");
        System.out.println("7 - фильтр по ОС");
        System.out.println("8 - фильтр по цвету");
        System.out.println("9 - фильтр по цене");
        Integer choice = scanner.nextInt();
        if (choice == 1) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите бренд (в наличии есть: Asus, Lenovo, Xiaomi, HP, Apple): ");
            String brandFilter = scanner1.nextLine();
            int count = 0;
            for(Laptops item: laptopsList) {
                if (item.getBrand().equalsIgnoreCase(brandFilter)) {
                    System.out.println(item.toString());
                    count ++;
                }
            }
            showResult(count);
            scanner1.close();
        } else if (choice == 2) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Введите модель (в наличии есть: TUF Gaming A15, IdeaPad 5 15ITL05, RedmiBook 15, dw1495nia 6J5C0EA, MacBook Air MLY33, ABC123, Idea20ITL08, Book 30, 8J7C5EA, MacBook Air MLY44): ");
            String modelFilter = scanner2.nextLine();
            int count = 0;
            for(Laptops item: laptopsList) {
                if (item.getModel().equalsIgnoreCase(modelFilter)) {
                    System.out.println(item.toString());
                    count ++;
                }
            }
            showResult(count);
            scanner2.close();
        } else if (choice == 3) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Введите процессор (в наличии есть: Intel Core i5, Intel Core i3, Intel Celeron N4120, Apple M2 M2, Apple M3 M3): ");
            String cpuFilter = scanner3.nextLine();
            int count = 0;
            for(Laptops item: laptopsList) {
                if (item.getCpu().equalsIgnoreCase(cpuFilter)) {
                    System.out.println(item.toString());
                    count ++;
                }
            }
            showResult(count);
            scanner3.close();
        } else if (choice == 4) {
            Scanner scanner4 = new Scanner(System.in);
            System.out.print("Введите минимальную диагональ (в дюймах): ");
            double diagonalFilter = scanner4.nextDouble();
            int count = 0;
            for(Laptops item: laptopsList) {
                if (item.getScreenDiagonal() >= diagonalFilter) {
                    System.out.println(item.toString());
                    count ++;
                }
            }
            showResult(count);
            scanner4.close();
        } else if (choice == 5) {
            Scanner scanner5 = new Scanner(System.in);
            System.out.print("Введите минимальную оперативную память (в Гб): ");
            Integer ramFilter = scanner5.nextInt();
            int count = 0;
            for(Laptops item: laptopsList) {
                if (item.getRam() >= ramFilter) {
                    System.out.println(item.toString());
                    count ++;
                }
            }
            showResult(count);
            scanner5.close();
        } else if (choice == 6) {
            Scanner scanner6 = new Scanner(System.in);
            System.out.print("Введите минимальный объём жесткого диска (в Гб): ");
            Integer ssdFilter = scanner6.nextInt();
            int count = 0;
            for(Laptops item: laptopsList) {
                if (item.getSsdCapacity() >= ssdFilter) {
                    System.out.println(item.toString());
                    count ++;
                }
            }
            showResult(count);
            scanner6.close();
        } else if (choice == 7) {
            Scanner scanner7 = new Scanner(System.in);
            System.out.print("Введите ОС (в наличии есть: Windows 7, Windows 8, Windows 10, Windows 11, macOS): ");
            String osFilter = scanner7.nextLine();
            int count = 0;
            for(Laptops item: laptopsList) {
                if (item.getOS().equalsIgnoreCase(osFilter)) {
                    System.out.println(item.toString());
                    count ++;
                }
            }
            showResult(count);
            scanner7.close();
        } else if (choice == 8) {
            Scanner scanner8 = new Scanner(System.in, "ibm866");
            System.out.print("Введите цвет (в наличии есть: серый, синий, белый, черный, бежевый, красный: ");
            String colorFilter = scanner8.nextLine();
            int count = 0;
            for(Laptops item: laptopsList) {
                if (item.getColor().equalsIgnoreCase(colorFilter)) {
                    System.out.println(item.toString());
                    count ++;
                }
            }
            showResult(count);
            scanner8.close();
        } else if (choice == 9) {
            Scanner scanner9 = new Scanner(System.in);
            System.out.print("Введите максимальную цену (в наличии ноутбуки от 20 000 до 150 000 руб.): ");
            Integer priceFilter = scanner9.nextInt();
            int count = 0;
            for(Laptops item: laptopsList) {
                if (item.getPrice() <= priceFilter) {
                    System.out.println(item.toString());
                    count ++;
                }
            }
            showResult(count);
            scanner9.close();
        } else {
            System.out.println("Нет такого фильтра!");    
        }
    }

    public static void showResult(Integer count) {
        if (count == 0){
            System.out.println("Ничего не найдено. Пожалуйста, измените параметры поиска.");
        }else{
            System.out.println("По указанным критериям найдено ноутбуков: " + count);
        }
    }
}