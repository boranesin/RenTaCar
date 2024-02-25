package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Brand {

    private int id;
    private String name;

    public Brand(){

    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Brand(String name) {
         this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}