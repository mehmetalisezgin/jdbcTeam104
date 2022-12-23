public class DeviceData {
    // we defined these variables to send data for device table actualy they are nam of the fields
    private int id ;
    private String name ;
    private int ramGB ;
    private double screenSize ;
    private int guarantee_year ;
   // create without parameter constructor

    public DeviceData() {
    }
    // create with parameter constructor

    public DeviceData(int id, String name, int ramGB, double screenSize, int guarantee_year) {
        this.id = id;
        this.name = name;
        this.ramGB = ramGB;
        this.screenSize = screenSize;
        this.guarantee_year = guarantee_year;
    }

    // create getter and setter for all to get data and set data

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

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getGuarantee_year() {
        return guarantee_year;
    }

    public void setGuarantee_year(int guarantee_year) {
        this.guarantee_year = guarantee_year;
    }
}
