package com.example.android.tourguide;

public class Attraction {
    private String mName;
    private String mAddress;
    private String mDetail;
    private int mResource;
    public Attraction(String name, String address, String detail, int resourceId){
        this.mName = name;
        this.mAddress = address;
        this.mDetail = detail;
        this.mResource = resourceId;
    }

    public String getName(){ return this.mName; }
    public String getAddress(){ return this.mAddress; }
    public String getDetail(){ return this.mDetail; }
    public int getImgResource(){ return this.mResource; }
}
