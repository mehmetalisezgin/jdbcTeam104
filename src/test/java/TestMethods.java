import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class TestMethods extends QueryOOP_3rdStep {


    @Test
    public void listPersonnelBetweenTest() {
        listPersonnelBetween();
    }

    @Test
    public void listNamePersonTest() {
        listNamePerson();
    }

    @Test
    public void listEarningCompaniesTableTest() {
        listEarningCompaniesTable();
    }

    @Test
    public void createBirdsTableTest() {
        createBirds();
    }

    @Test
    public void createDeviceTableTest() {
        createDeviceTable();
    }

    @Test
    public void deleteBirdsTableTest() {
        deleteBirdsTable();
    }

    @Test
    public void dropBirdsTableTest() {
        dropBirdsTable();
    }

    @Test
    public void updateDeviceTable1Test() {
        updateDeviceTable1();
    }

    @Test
    public void updateBirdsTable1Test() {
        updateBirdsTable1();
    }


    @Test
    public void dropWingLengthBirdsTableTest() {
        dropWingLengthBirdsTable();
    }

    @Test
    public void addDataBirdTableTest() throws SQLException {
        addDataBirdTable();
    }

    @Test
    public void addDataDeviceTableTest() throws SQLException {
        addDataDeviceTable();
    }

    //*****************************Practice JDBC***************************************************
    @Test
    public void sumOfMathHoursTest() {

     sumOfMathHours();
    }
    @Test
    public void productNameAndPriceTest() {

        productNameAndPrice();
    }
    @Test
    public void productNameAndPriceTrendYolTest() {

        productNameAndPriceTrendYol();
    }

    @Test
    public void productIDNameTest() {

        productIDName();
    }

    @Test
    public void increaseSalaryTest() {

        increaseSalary();// this method is for update
        lastVersionPersonnel() ;// this method is for to see updated table

    }

    @Test
    public void createHospitalTableTest() {

        createHospitalTable();
        ViewHospitalTable() ;
    }
    @Test
    public void addDataHospitalTableTest() throws SQLException {

        addDataHospitalTable();

    }

    @Test
    public void ViewHospitalTableTest() {

        ViewHospitalTable() ;

    }
}
