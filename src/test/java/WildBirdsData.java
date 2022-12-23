public class WildBirdsData {
    // we will create data for the birds table
    private int id ;
    private String name ;
    private int life_time ;
    private int wing_length ;

    public WildBirdsData() {
    }

    public WildBirdsData(int id, String name, int life_time, int wing_length) {
        this.id = id;
        this.name = name;
        this.life_time = life_time;
        this.wing_length = wing_length;
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

    public int getLife_time() {
        return life_time;
    }

    public void setLife_time(int life_time) {
        this.life_time = life_time;
    }

    public int getWing_length() {
        return wing_length;
    }

    public void setWing_length(int wing_length) {
        this.wing_length = wing_length;
    }


}
