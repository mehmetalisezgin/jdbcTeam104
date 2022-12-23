import java.util.ArrayList;
import java.util.List;

public class DataTable_1stStep {
    // We created this class to put query commands and tasks
   // we will create these tables in the QuerOOP_3rdStep class
    static String deleteTable = "SELECT * FROM deletetable";
    static String salesmanTable = "SELECT * FROM salesman";
    // TASK53 List the earning and cities of the companies with a company ID gretaer than 1209
    static String listEarningCompaniesTable = "SELECT earning,city FROM " +
            "salesman Where company_name " +
            "IN (SELECT company_name FROM companies WHERE company_id>1209) ";

    // TASK54 : List the number of company_id,numberof_person whose city is in Samsun
    static String listNumberOfCompanies = "SELECT company_id,numberof_person,company_name\n" +
            "FROM companies\n" +
            "Where company_name\n" +
            "IN (SELECT company_name\n" +
            "FROM salesman\n" +
            "WHERE city='Samsun')";


    // TASK55 : List all information of the company except Istanbul and Amasya
    static String listAllinfoCompany = "SELECT *\n" +
            "FROM companies WHERE company_name\n" +
            "IN (SELECT company_name\n" +
            "FROM salesman\n" +
            "WHERE city!='Istanbul' AND city!='Amasya')";
    // TASK56: List each name of company, number of person and average earning of person
    static String listEachNameOfCompany = "SELECT company_name,numberof_person,\n" +
            "(SELECT AVG(earning)\n" +
            "FROM salesman \n" +
            "WHERE companies.company_name = salesman.company_name) AS 'earning_avg'\n" +
            "FROM companies";


    // TASK22: List the personnel information between 'Mehmet Yilmaz' and 'Salih Can'

    static String listPersonnelBetween = "SELECT * FROM personnel WHERE personnel_name BETWEEN 'Mehmet Yilmaz' AND 'Salih Can'";

    // TASK23: List the names of the personnel whose name is included Ayse.
    static String listNamePerson = "SELECT personnel_name" +
            " FROM personnel WHERE " +
            "personnel_name LIKE '%ayse%'";

/*===============================================================================================================
                                                CREATE TABLE, UPDATE TABLE
 ==============================================================================================================*/
    // Create a table with name birds
    static String createBirdsTable = "CREATE TABLE birds"
                                   +"(id int primary key,"
                                   +"name varchar(20),"
                                   +"lifeTime varchar(20))" ;



    // Create a table with name device
    static String createDeviceTable = "CREATE TABLE device"
            +"(id int primary key,"
            +"name varchar(20),"
            +"ramGB int)" ;

    // Delete the birds table
    static String deleteBirdsTable = "DELETE FROM birds" ;

    // Drop the birds table
    static String dropBirdsTable = "DROP TABLE birds" ;

    // add a new column (screenSize double, quarantee_year int) for device table
    static String updateDeviceTable1 = "ALTER TABLE device"
                                     +" ADD (screenSize double, guarantee_year int)" ;

   // add a new column (wing_length) in the birds table
    static  String updateBirdsTable1 = "ALTER TABLE birds ADD wing_length int" ;

   //drop the wing_length from the birds table
    static String dropWingLengthBirdsTable = "ALTER TABLE birds DROP COLUMN wing_length" ;

    //*************************************************************************************************
    // if we would like to add many data in the table we use PreparedStatement methods
    // this method also is fast and safe for the attack
    // to add daga we should create POJO(Plain Old Java Object)
    // and we can add data with the list method
    // let create a class with name WildBirdsData

    //we created pojo class with nameWildBirdsData to send data in the table
    //to use this pojo class we should create a list method

    public static List<WildBirdsData> dataWildBirds(){
        List<WildBirdsData> list = new ArrayList<>();
        list.add(new WildBirdsData(1,"eagle",70,3)) ;
        list.add(new WildBirdsData(2,"parrot",20,1)) ;
        list.add(new WildBirdsData(3,"owl",30,2)) ;
        list.add(new WildBirdsData(4,"crow",120,1)) ;
        return  list;
    }
    static String birdsTableAddingData = "INSERT INTO birds VALUES(?,?,?,?)" ;

    // add data for the device table ==> first we should create a pojo class
    // we need to create two things first one is create list method then create String query command

    public static List<DeviceData> dataDevice(){
        List<DeviceData> list = new ArrayList<>();
        list.add(new DeviceData(1,"dell",32,15.5,5)) ;
        list.add(new DeviceData(2,"hp",16,17.1,7)) ;
        list.add(new DeviceData(3,"asus",8,15.5,3)) ;
        list.add(new DeviceData(4,"lenova",12,13.5,2)) ;

        return  list;
    }
    static String deviceTableAdding = "INSERT INTO device VALUES(?,?,?,?,?)" ;

}
