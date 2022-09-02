
public class JurorInformation {
    int jurNum; // Juror's number ID
    String jurLastName;  // Juror's last name
    int jurAge;  // Juror's age
    boolean jurCollegeDegree;  // Does juror have a college degree? yes = true

    // Information about 12 jurors through constructor
    public JurorInformation(int jurNum, String jurLastName, int jurAge, boolean jurCollegeDegree){
        super();
        this.jurNum = jurNum;
        this.jurLastName = jurLastName;
        this.jurAge = jurAge;
        this.jurCollegeDegree = jurCollegeDegree;
    }

    public void presentJuryInfo() {

        System.out.println("---> Juror number: " + jurNum);
        System.out.println("Juror last name: " + jurLastName);
        System.out.println("Juror age: " + jurAge);
        System.out.println("Juror has college degree? " + jurCollegeDegree + "\n");
    }


}



