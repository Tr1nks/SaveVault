package com.tr1nks.safevault.entities;

import android.os.Parcel;
import android.os.Parcelable;

public class RowMainMenu implements Parcelable {
    private int id;
    private byte[] title;
    private byte[] titleImgName;

    public RowMainMenu(int id, byte[] title, byte[] img) {
        this.id = id;
        this.title = title;
        this.titleImgName = img;
    }

    protected RowMainMenu(Parcel in) {
        id = in.readInt();
        title = in.createByteArray();
        titleImgName = in.createByteArray();
    }

    public static final Creator<RowMainMenu> CREATOR = new Creator<RowMainMenu>() {
        @Override
        public RowMainMenu createFromParcel(Parcel in) {
            return new RowMainMenu(in);
        }

        @Override
        public RowMainMenu[] newArray(int size) {
            return new RowMainMenu[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeByteArray(title);
        parcel.writeByteArray(titleImgName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getTitle() {
        return title;
    }

    public void setTitle(byte[] title) {
        this.title = title;
    }

    public byte[] getTitleImgName() {
        return titleImgName;
    }

    public void setTitleImgName(byte[] titleImgName) {
        this.titleImgName = titleImgName;
    }
}