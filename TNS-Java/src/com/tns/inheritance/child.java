package com.tns.inheritance;

public class child extends inheritance{
    private int id;
    private String collegeName;
    private String branch;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public child()
    {
        super();
    }

    public child(String name, String aadharNo, long mobileNo, String gender, int id, String collegeName, String branch) {
        super(name, aadharNo, mobileNo, gender);
        this.id = id;
        this.collegeName = collegeName;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "child{" +
                "id=" + id +
                ", collegeName='" + collegeName + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }

    void studies()
    {
        System.out.println("still studying");
    }

}
