package org.example;

import java.sql.Date;

public class Lesson {
        private int id;
        private String name;
        private Date updateAt;
        private int homework_id;

    public Lesson(int id, String name, Date updateAt, int homework_id) {
        this.id = id;
        this.name = name;
        this.updateAt = updateAt;
        this.homework_id = homework_id;
    }

    public Lesson(int id, String name, Date updateAt) {
        this.id = id;
        this.name = name;
        this.updateAt = updateAt;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public Date getUpdateAt() {
        return updateAt;
    }


    public int getHomework_id() {
        return homework_id;
    }


}
