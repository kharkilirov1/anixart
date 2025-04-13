package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new Parcelable.Creator<AppInfoTable>() { // from class: com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable.1
        @Override // android.os.Parcelable.Creator
        public AppInfoTable createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            return new AppInfoTable(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public AppInfoTable[] newArray(int i2) {
            return new AppInfoTable[i2];
        }
    };

    /* renamed from: b */
    public final int f11999b;

    /* renamed from: c */
    public final String f12000c;

    public AppInfoTable(int i2, String str) {
        this.f11999b = i2;
        this.f12000c = str;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: Q */
    public /* synthetic */ Format mo6698Q() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: b */
    public /* synthetic */ void mo6699b(MediaMetadata.Builder builder) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        int i2 = this.f11999b;
        String str = this.f12000c;
        StringBuilder sb = new StringBuilder(C0576a.m4106e(str, 33));
        sb.append("Ait(controlCode=");
        sb.append(i2);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12000c);
        parcel.writeInt(this.f11999b);
    }
}
