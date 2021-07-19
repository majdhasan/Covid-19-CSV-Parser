package life.majd.coronatracker.models;

public class LocationCovidData {

    private String State;
    private String Country;
    private int cases;
    private String latCord;
    private String longCord;

    public LocationCovidData(String state, String country, int cases, String latCord, String longCord) {
        State = state;
        Country = country;
        this.cases = cases;
        this.latCord = latCord;
        this.longCord = longCord;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    @Override
    public String toString() {
        return "LocationCovidData{" +
                "State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                ", cases=" + cases +
                ", latCord=" + latCord +
                ", longCord=" + longCord +
                '}';
    }
}
