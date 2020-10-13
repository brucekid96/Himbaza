package com.example.himbaza;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.UUID;

public  class Cantique implements Parcelable{

    public static final String Cantique_EXTRA = "event_code";


    private int mId;
    private String mTitle;
    private String mContenu;
    private String mAuteur;

    public Cantique(int id, String title, String contenu, String auteur) {
        mId = id;
        mTitle = title;
        mContenu = contenu;
        mAuteur = auteur;
    }



    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Cantique(String title) {
        mTitle = title;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public  String getmTitle() {
        return mTitle;
    }

    public  void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmContenu() {
        return mContenu;
    }

    public void setmContenu(String mContenu) {
        this.mContenu = mContenu;
    }

    public String getmAuteur() {
        return mAuteur;
    }

    public void setmAuteur(String mAuteur) {
        this.mAuteur = mAuteur;
    }



    // PARCELABLE IMPLEMENTATION METHODS

    public Cantique(Parcel in) {
        this.mId = in.readInt();
        this.mTitle = in.readString();
        this.mAuteur = in.readString();
        this.mContenu = in.readString();


    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.mId);
        dest.writeString(this.mTitle);
        dest.writeString(this.mAuteur);
        dest.writeString(this.mContenu);

    }

    public static final Parcelable.Creator<Cantique> CREATOR =
            new Parcelable.Creator<Cantique>() {
                @Override
                public Cantique createFromParcel(Parcel source) {
                    return new Cantique(source);
                }

                @Override
                public Cantique[] newArray(int size) {
                    return new Cantique[size];
                }
            };


}
