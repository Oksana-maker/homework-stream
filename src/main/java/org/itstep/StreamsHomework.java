package org.itstep;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsHomework {
    final static Collection<Student> students = Arrays.asList(
            new Student("Vas", 16, Gender.MAN),
            new Student("Peter", 23, Gender.MAN),
            new Student("Sony", 18, Gender.WOMEN),
            new Student("Viktor", 65, Gender.MAN),
            new Student("Dima", 25, Gender.MAN),
            new Student("Katy", 21, Gender.WOMEN),
            new Student("Semen", 33, Gender.MAN),
            new Student("Helena", 42, Gender.WOMEN),
            new Student("Ivan", 69, Gender.MAN)
    );

    static List<Student> ex01() {
        students.stream().forEach(System.out::println);
        return students.stream().collect(Collectors.toList());
    }

    static double ex02() {
        // Найти средний возраст всех мужчин
        IntSummaryStatistics summaryStatistics = students.stream()
                .filter(s -> s.getGender() == Gender.MAN)
                .mapToInt(s -> s.getAge())
                .summaryStatistics();
        return summaryStatistics.getAverage();
    }

    static long ex03() {
        IntSummaryStatistics summaryStatistics = students.stream()
                .filter(s -> s.getGender() == Gender.MAN && s.getAge() >= 18 && s.getAge() <= 60 ||
                        s.getGender() == Gender.WOMEN && s.getAge() >= 18 && s.getAge() <= 55)
                .mapToInt(s -> s.getAge())
                .summaryStatistics();
        return summaryStatistics.getCount();
    }

    static List<Student> ex04() {
        return students.stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());
    }

    static Student ex05() {
        return students.stream().max((s1,s2)->s1.getAge().compareTo(s2.getAge())).get();
    }

    static Student ex06() {

        return students.stream().min((s1,s2)->s1.getAge().compareTo(s2.getAge())).get();
    }

    public static void main(String[] args) {
        ex01();
        System.out.println(ex02());
        System.out.println(ex03());
        System.out.println(ex04());
        System.out.println(ex05());
        System.out.println(ex06());
    }

} 
