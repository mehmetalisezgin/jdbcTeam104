import org.junit.Test;

import java.sql.SQLException;

public class TestMethods extends QueryOOP_3rdStep {


    @Test
    public void listPersonnelBetweenTest(){
        listPersonnelBetween() ;
    }

    @Test
    public void listNamePersonTest(){
        listNamePerson() ;
    }

    @Test
    public void listEarningCompaniesTableTest(){
        listEarningCompaniesTable() ;
    }
    @Test
    public void createBirdsTableTest(){
        createBirds();
    }
    @Test
    public void createDeviceTableTest(){
        createDeviceTable();
    }

    @Test
    public void deleteBirdsTableTest(){
        deleteBirdsTable();
    }

    @Test
    public void dropBirdsTableTest(){
        dropBirdsTable();
    }

    @Test
    public void updateDeviceTable1Test(){
        updateDeviceTable1();
    }

    @Test
    public void updateBirdsTable1Test(){
        updateBirdsTable1();
    }


    @Test
    public void dropWingLengthBirdsTableTest(){
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

}
