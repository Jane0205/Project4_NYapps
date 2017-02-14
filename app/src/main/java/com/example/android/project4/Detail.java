package com.example.android.project4;

/**
 * Created by 재은 on 2017-02-13.
 */

public class Detail {

    private String mname;
    private String mlocation;
    private int mnum;

    private int mImgeId = EXIST;
    private static final int EXIST = -1;

    public Detail(String name,String location,int imageId){
        mname = name;
        mlocation = location;
        mImgeId = imageId;
    }
    public Detail(String name,String location,int num,int imageId){
        mname = name;
        mlocation = location;
        mnum = num;
        mImgeId = imageId;
    }

    public String getname(){
        return mname;
    }
    public String getlocation(){
        return mlocation;
    }
    public int getnum(){
        return mnum;
    }
    public boolean hasImage(){
        return mImgeId != EXIST;
    }
    public int getImageId(){
        return mImgeId;
    }
    @Override
    public String toString(){
        return "Detail{"+"mname='"+mname+'\''+",mlocation='"+mlocation+'\''+
                ",mnum="+mnum+",mImageId"+mImgeId+'}';
    }
}
