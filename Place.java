package Assignment2;

/**
 * This encapsulates the zipcode associated information
 */
public class Place {
    private String zipCode;
    private String townName;
    private String stateName;

    /**
    * Default constructor for Place
     */
    public Place() {
        zipCode = "21228";
        townName = "Catonsville";
        stateName = "Maryland";
    }

    /**
     * Creates a place with zip, town name and state
     * 
     * @param zip   a 5 digit zip code
     * @param town  the town name
     * @param state the state abbreviation
     */
    public Place(String zip, String town, String state) {
        zipCode = zip;
        townName = town;
        stateName = state;
    }

    /**
     * Sets zipcode
     * @param zipCode
     */
    public void setZip(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Sets town
     * @param townName
     */
    public void setTown(String townName) {
        this.townName = townName;
    }

    /**
     * Sets state
     * @param stateName
     */
    public void setState(String stateName) {
        this.stateName = stateName;
    }

    /**
     * Gets zipcode
     * @return
     */
    public String getZip() {
        return zipCode;
    }

    /**
     * Gets town
     * @return
     */
    public String getTown() {
        return townName;
    }

    /**
     * Gets state
     * @return
     */
    public String getState() {
        return stateName;
    }
}
