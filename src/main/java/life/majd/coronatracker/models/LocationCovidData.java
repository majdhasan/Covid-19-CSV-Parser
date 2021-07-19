package life.majd.coronatracker.models;

public class LocationCovidData {

    private String state;
    private String country;
    private int cases;
    private String latCord;
    private String longCord;

    public LocationCovidData(String state, String country, int cases, String latCord, String longCord) {
        this.state = state;
        this.country = country;
        this.cases = cases;
        this.latCord = latCord;
        this.longCord = longCord;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
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
                "State='" + state + '\'' +
                ", Country='" + country + '\'' +
                ", cases=" + cases +
                ", latCord=" + latCord +
                ", longCord=" + longCord +
                '}';
    }
}
