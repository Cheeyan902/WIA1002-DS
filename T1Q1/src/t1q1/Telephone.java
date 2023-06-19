package t1q1;

public class Telephone {
    
    private String areaCode;
    private String number;
    static int numberofTelephoneObject = 0;
    
    public Telephone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
        numberofTelephoneObject++;
    }
    
    public String getareaCode(){
        return areaCode;
    }
    
    public String getnumber(){
        return number;
    }
    
    public void setareaCode(String areaCode){
        this.areaCode = areaCode;
    }
    
    public void setnumber(String number){
        this.number = number;
    }
    
    public String makeFullNumber(){
        String ret = String.format("%s-%s", areaCode, number);
        return ret;
    }
}
