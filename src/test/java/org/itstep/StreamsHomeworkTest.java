//package org.itstep;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.OptionalDouble;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class StreamsHomeworkTest {
//    @Test
//    public void testEx01() {
//        List<Student> students = StreamsHomework.ex01();
//        assertNotNull(students);
//        assertEquals(2, students.size());
//        assertEquals(new Student("Петя", 23, Gender.MAN), students.get(0));
//        assertEquals(new Student("Дима", 25, Gender.MAN), students.get(1));
//    }
//
//    @Test
//    public void testEx02() {
//        double optionalAge = StreamsHomework.ex02();
//        assertEquals(38.5, optionalAge);
//    }
//
//    @Test
//    public void testEx03() {
//        assertEquals(6L, StreamsHomework.ex03());
//    }
//
//    @Test
//    public void testEx04() {
//        List<Student> students = StreamsHomework.ex04();
//        assertNotNull(students);
//        assertEquals(9, students.size());
//    }
//
//    @Test
//    public void testEx05() {
//        Student optionalStudent = StreamsHomework.ex05();
//        assertEquals(new Student("Иван Иванович", 69, Gender.MAN), optionalStudent);
//    }
//
//    @Test
//    public void testEx06() {
//        Student optionalStudent = StreamsHomework.ex06();
//        assertEquals(new Student("Вася", 16, Gender.MAN), optionalStudent);
//    }
//}
//
