package com.tns.inheritance;

//parent entity class
public class inheritance {
    private String name;
    private String AadharNo;
    private long MobileNo;
    private String gender;

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(long mobileNo) {
        MobileNo = mobileNo;
    }

    public String getAadharNo() {
        return AadharNo;
    }

    public void setAadharNo(String aadharNo) {
        AadharNo = aadharNo;
    }

    public inheritance(String name, String aadharNo, long mobileNo, String gender) {
        this.name = name;
        AadharNo = aadharNo;
        MobileNo = mobileNo;
        this.gender = gender;
    }
    public inheritance()
    {
        System.out.println("default constructor");
    }

    @Override
    public String toString() {
        return "inheritance{" +
                "gender='" + gender + '\'' +
                ", MobileNo=" + MobileNo +
                ", AadharNo='" + AadharNo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    void paytaxes()
    {
        System.out.println("tax hasn't been paid");
    }
}
