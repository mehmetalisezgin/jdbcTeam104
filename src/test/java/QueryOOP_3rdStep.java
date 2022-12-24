import java.sql.*;

public class QueryOOP_3rdStep {

    static String dataBaseUrl = "jdbc:mysql://localhost:3306/sys?serverTimezone=UTC";
    static String userName = "root";
    static String password = "ervanaz2012";


    static Connection connection;
    static Statement statement;
    static ResultSet data;
    //weare using PreparedStatement interface for adding data
    static PreparedStatement data2;
    //Create a method from Connection interface

    public static Connection connectionDataBase() {
        try {
            connection = DriverManager.getConnection(dataBaseUrl, userName, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    //Create a method from Statement interface

    public static Statement statementDataBase() {
        try {
            statement = connectionDataBase().createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return statement;
    }


    public static ResultSet listNumberOfCompanies() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.listNumberOfCompanies);
            while (data.next()) {
                System.out.println(data.getString(1) + " " + data.getString(2));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static ResultSet listPersonnelBetween() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.listPersonnelBetween);
            while (data.next()) {
                System.out.println(data.getString(1) + " " + data.getString(2));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static ResultSet listNamePerson() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.listNamePerson);
            while (data.next()) {
                System.out.println(data.getString(1));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static ResultSet listEarningCompaniesTable() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.listEarningCompaniesTable);
            while (data.next()) {
                System.out.println(data.getString(1) + " " + data.getString(2));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }


    // we created methods for the CREATE TABLE
    // we called query from the DataTable_1stStep class
    // to create method for a table we have 2 ways
    // first one is static void method second one is static boolean method
    // the difference between static void method and static boolean method  execution
    // boolean method is fast and safe for the attacks

    public static boolean createBirds(){
        try {
            statementDataBase().execute(DataTable_1stStep.createBirdsTable) ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } return true ; // we can return true or false not matter
   }
    public static boolean createDeviceTable(){
        try {
            statementDataBase().execute(DataTable_1stStep.createDeviceTable) ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } return true ;
    }

    public static boolean deleteBirdsTable(){
        try {
            statementDataBase().execute(DataTable_1stStep.deleteBirdsTable) ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } return true ;
    }

    public static boolean dropBirdsTable(){
        try {
            statementDataBase().execute(DataTable_1stStep.dropBirdsTable) ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } return true ;
    }

    public static boolean updateDeviceTable1(){
        try {
            statementDataBase().execute(DataTable_1stStep.updateDeviceTable1) ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } return false ;
    }

    public static boolean updateBirdsTable1(){
        try {
            statementDataBase().execute(DataTable_1stStep.updateBirdsTable1) ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } return false ;
    }

    public static boolean dropWingLengthBirdsTable(){
        try {
            statementDataBase().execute(DataTable_1stStep.dropWingLengthBirdsTable) ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } return false ;
    }


    public static int[] addDataBirdTable() throws SQLException {
        try{
            data2 = connectionDataBase().prepareStatement(DataTable_1stStep.birdsTableAddingData);
            for(WildBirdsData each : DataTable_1stStep.dataWildBirds()){
                data2.setInt(1,each.getId());
                data2.setString(2,each.getName());
                data2.setInt(3,each.getLife_time());
                data2.setInt(4,each.getWing_length());
                data2.addBatch();// fix it all data and collect them and read them
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       return data2.executeBatch() ;
    }


    public static int[] addDataDeviceTable() throws SQLException {
        try{
            data2 = connectionDataBase().prepareStatement(DataTable_1stStep.deviceTableAdding);
            for(DeviceData each : DataTable_1stStep.dataDevice()){
                data2.setInt(1,each.getId());
                data2.setString(2,each.getName());
                data2.setInt(3,each.getRamGB());
                data2.setDouble(4,each.getScreenSize());
                data2.setInt(5,each.getGuarantee_year());
                data2.addBatch();// fix it all data and collect them and read them
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data2.executeBatch() ;
    }
//*********************************Practice JDBC***************************************************

    public static ResultSet sumOfMathHours() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.sumOfMathHours);
            while (data.next()) {
                System.out.println(data.getString(1));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static ResultSet productNameAndPrice() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.productNameAndPrice);
            while (data.next()) {
                System.out.println(data.getString(1)+ " " + data.getString(2));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static ResultSet productNameAndPriceTrendYol() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.productNameAndPriceTrendYol);
            while (data.next()) {
                System.out.println(data.getString(1)+ " " + data.getString(2));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static ResultSet productIDName() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.productIDName);
            while (data.next()) {
                System.out.println(data.getInt(1)+ " " + data.getString(2)+ " " + data.getString(3));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }
    public static boolean increaseSalary(){
        try {
            statementDataBase().execute(DataTable_1stStep.increaseSalary) ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } return false ;
    }

    public static ResultSet lastVersionPersonnel() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.lastVersionPersonnel);
            while (data.next()) {
                System.out.println(data.getInt(1)+ " " + data.getString(2)+ " " + data.getDouble(3)
                + " " + data.getString(4)+ " " + data.getString(5));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static boolean createHospitalTable(){
        try {
            statementDataBase().execute(DataTable_1stStep.createHospitalTable) ;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } return false ;
    }
    public static ResultSet ViewHospitalTable() {
        try {
            data = statementDataBase().executeQuery(DataTable_1stStep.viewHospitalTable);
            while (data.next()) {
                System.out.println(data.getInt(1)+ " " + data.getString(2)+ " " + data.getString(3)
                        + " " + data.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static int[] addDataHospitalTable() throws SQLException {
        try{
            data2 = connectionDataBase().prepareStatement(DataTable_1stStep.hospitalDataAdding);
            for(HospitalData each : DataTable_1stStep.hospitalDataList()){
                data2.setInt(1,each.getId());
                data2.setString(2,each.getHospital_name());
                data2.setString(3,each.getCity());
                data2.setString(4,each.getSituation());
                data2.addBatch();// fix it all data and collect them and read them
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data2.executeBatch() ;
    }





}
