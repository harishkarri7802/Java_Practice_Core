package pack2;

import pack1.DbConfiguration;

public class MySQLConnection extends DbConfiguration {

    public static void main(String[] args) {

        MySQLConnection mysql = new MySQLConnection();

        System.out.println("username : " + mysql.username);
        System.out.println("password : " + mysql.password);
    }


}
