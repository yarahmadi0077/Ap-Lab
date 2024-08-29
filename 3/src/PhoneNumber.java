public class PhoneNumber {
    private String countryCode ;
    private String number ;

    public PhoneNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
        if(number.length() != 10)
            this.number = "invalid number" ;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
        if(number.length() != 10)
            this.number = "invalid number" ;
    }
    public String toString(){
        if(number.length() == 10)
            return "(" + countryCode + ") " + number ;
        return number ;
    }
}
