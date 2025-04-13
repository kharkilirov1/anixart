package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() { // from class: android.support.v4.media.session.ParcelableVolumeInfo.1
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    };

    /* renamed from: b */
    public int f158b;

    /* renamed from: c */
    public int f159c;

    /* renamed from: d */
    public int f160d;

    /* renamed from: e */
    public int f161e;

    /* renamed from: f */
    public int f162f;

    public ParcelableVolumeInfo(int i2, int i3, int i4, int i5, int i6) {
        this.f158b = i2;
        this.f159c = i3;
        this.f160d = i4;
        this.f161e = i5;
        this.f162f = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f158b);
        parcel.writeInt(this.f160d);
        parcel.writeInt(this.f161e);
        parcel.writeInt(this.f162f);
        parcel.writeInt(this.f159c);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f158b = parcel.readInt();
        this.f160d = parcel.readInt();
        this.f161e = parcel.readInt();
        this.f162f = parcel.readInt();
        this.f159c = parcel.readInt();
    }
}
