package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: com.google.android.exoplayer2.offline.DownloadRequest.1
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i2) {
            return new DownloadRequest[i2];
        }
    };

    /* renamed from: b */
    public final String f12165b;

    /* renamed from: c */
    public final Uri f12166c;

    /* renamed from: d */
    @Nullable
    public final String f12167d;

    /* renamed from: e */
    public final List<StreamKey> f12168e;

    /* renamed from: f */
    @Nullable
    public final byte[] f12169f;

    /* renamed from: g */
    @Nullable
    public final String f12170g;

    /* renamed from: h */
    public final byte[] f12171h;

    public static class Builder {
    }

    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12165b = readString;
        this.f12166c = Uri.parse(parcel.readString());
        this.f12167d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f12168e = Collections.unmodifiableList(arrayList);
        this.f12169f = parcel.createByteArray();
        this.f12170g = parcel.readString();
        this.f12171h = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f12165b.equals(downloadRequest.f12165b) && this.f12166c.equals(downloadRequest.f12166c) && Util.m7728a(this.f12167d, downloadRequest.f12167d) && this.f12168e.equals(downloadRequest.f12168e) && Arrays.equals(this.f12169f, downloadRequest.f12169f) && Util.m7728a(this.f12170g, downloadRequest.f12170g) && Arrays.equals(this.f12171h, downloadRequest.f12171h);
    }

    public final int hashCode() {
        int hashCode = (this.f12166c.hashCode() + (this.f12165b.hashCode() * 31 * 31)) * 31;
        String str = this.f12167d;
        int hashCode2 = (Arrays.hashCode(this.f12169f) + ((this.f12168e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f12170g;
        return Arrays.hashCode(this.f12171h) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.f12167d;
        String str2 = this.f12165b;
        return C0576a.m4115n(C0576a.m4106e(str2, C0576a.m4106e(str, 1)), str, ":", str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12165b);
        parcel.writeString(this.f12166c.toString());
        parcel.writeString(this.f12167d);
        parcel.writeInt(this.f12168e.size());
        for (int i3 = 0; i3 < this.f12168e.size(); i3++) {
            parcel.writeParcelable(this.f12168e.get(i3), 0);
        }
        parcel.writeByteArray(this.f12169f);
        parcel.writeString(this.f12170g);
        parcel.writeByteArray(this.f12171h);
    }
}
