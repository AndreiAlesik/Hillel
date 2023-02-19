package org.example;

import java.sql.SQLException;
import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        LessonDao lessonDao;

        lessonDao = new LessonDao();

        Lesson lesson1 = new Lesson(1, "Lesson 1", new Date(2020-01-05), 1);
        Lesson lesson2 = new Lesson(2, "Lesson 2", new Date(2021-01-05), 4);
        Lesson lesson3 = new Lesson(3, "Lesson 3", new Date(2022-01-05), 5);
        Lesson lesson4 = new Lesson(4, "Lesson 4", new Date(2023-01-05), 6);

        lessonDao.addLesson(lesson1);
        lessonDao.addLesson(lesson2);
        lessonDao.addLesson(lesson3);
        lessonDao.addLesson(lesson4);

        System.out.println(lessonDao.getLessonById(4));

        System.out.println(lessonDao.getAllLessons());


        lessonDao.deleteLesson(lesson2);
        lessonDao.deleteLesson(lesson3);
        lessonDao.deleteLesson(lesson4);


    }
}
