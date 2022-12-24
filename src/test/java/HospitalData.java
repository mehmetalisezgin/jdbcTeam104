public class HospitalData {

    private int id;
    private String hospital_name;
    private String city;
    private String situation;

    public HospitalData() {
    }

    public HospitalData(int id, String hospital_name, String city, String situation) {
        this.id = id;
        this.hospital_name = hospital_name;
        this.city = city;
        this.situation = situation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
