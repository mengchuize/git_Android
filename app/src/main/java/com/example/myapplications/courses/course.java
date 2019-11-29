package com.example.myapplications.courses;

public class course {
    private String coursename;
    private String courseschool;
    private int courseimageid;
    private int schoolimageid;
    private int freeimageid;

    public course(String coursename,String courseschool,int courseimageid,int schoolimageid,int freeimageid){
        this.coursename=coursename;
        this.courseschool=courseschool;
        this.courseimageid=courseimageid;
        this.schoolimageid=schoolimageid;
        this.freeimageid=freeimageid;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getCourseschool() {
        return courseschool;
    }

    public int getCourseimageid() {
        return courseimageid;
    }

    public int getSchoolimageid() {
        return schoolimageid;
    }

    public int getFreeimageid() {
        return freeimageid;
    }
}
