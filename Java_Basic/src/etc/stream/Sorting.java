package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {
    public static void main(String[] args) {
        // 음식 목록 중 칼로리가 낮은 순으로 정렬 (오름차 정렬)
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);
        System.out.println("=======================================================================");

        // 칼로리가 높은 순으로 정렬 (내림차 정렬)
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);
        System.out.println("=======================================================================");

        // 500 칼로리보다 작은 요리 중에 top3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500)   // 칼로리가 500 미만 애들 걸러
                .sorted(comparing(Dish::getCalories).reversed()) // 걸은 애들 정렬(내림차, 높은 순)
                .limit(3) // 정렬된 애들 중 상위 3개
                .collect(toList()) // 리스트로 반환
                .forEach(System.out::println); // 반복해서 출력
    }
}
