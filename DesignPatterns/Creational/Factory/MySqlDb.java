package DesignPatterns.Creational.Factory;

import javax.xml.crypto.Data;

public class MySqlDb extends Database {


    public String getQuery(){
        return "MySqlDb query";
    }


}
