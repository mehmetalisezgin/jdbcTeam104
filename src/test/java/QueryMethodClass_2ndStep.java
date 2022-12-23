import java.sql.*;

public class QueryMethodClass_2ndStep {
    // We created this class to query methods
    // define the url of MySQL
    static String dataBaseUrl = "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC";
    static String userName = "root";
    static String password = "ervanaz2012";

    // Executes the given SQL statement, which returns a single ResultSet object
    static Statement statement;
    // to connection
    static Connection connection;
    static ResultSet data;

    public static void deleteTable()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTable_1stStep.deleteTable) ;
            while (data.next()){
                System.out.println(data.getInt(1)+ " " + data.getString(2)+" "
                        + data.getString(3));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void salesmanTable()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTable_1stStep.salesmanTable) ;

            while (data.next()){
                System.out.println(data.getInt(1)+ " " + data.getString(2)+" "
                        + data.getString(3));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }


    public static void listNumberOfCompanies()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTable_1stStep.listNumberOfCompanies) ;
            System.out.println("The number of Companies");
            while (data.next()){
                System.out.println(data.getInt(1));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }



    public static void listEachNameOfCompany()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTable_1stStep.listEachNameOfCompany) ;
            System.out.println("The number of Companies");
            while (data.next()){
                System.out.println(data.getString(1)+ "  " + data.getString(2) +
                        "           " +        data.getString(3));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void listAllinfoCompany()  {
        try {
            connection = DriverManager.getConnection(dataBaseUrl,userName,password) ;
            statement = connection.createStatement();
            data = statement.executeQuery(DataTable_1stStep.listAllinfoCompany) ;

            while (data.next()){
                System.out.println(data.getString(1));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }




    public static void main(String[] args) {

        //deleteTable();
        System.out.println("****************************");
       //salesmanTable() ;
       // listNumberOfCompanies() ;
       // listEachNameOfCompany() ;

        listAllinfoCompany() ;
    }
}
