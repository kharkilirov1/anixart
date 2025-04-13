package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new Parcelable.Creator<InternalFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.InternalFrame.1
        @Override // android.os.Parcelable.Creator
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public InternalFrame[] newArray(int i2) {
            return new InternalFrame[i2];
        }
    };

    /* renamed from: c */
    public final String f12062c;

    /* renamed from: d */
    public final String f12063d;

    /* renamed from: e */
    public final String f12064e;

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f12062c = str;
        this.f12063d = str2;
        this.f12064e = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return Util.m7728a(this.f12063d, internalFrame.f12063d) && Util.m7728a(this.f12062c, internalFrame.f12062c) && Util.m7728a(this.f12064e, internalFrame.f12064e);
    }

    public int hashCode() {
        String str = this.f12062c;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12063d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12064e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f12061b;
        String str2 = this.f12062c;
        String str3 = this.f12063d;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str3, C0576a.m4106e(str2, C0576a.m4106e(str, 23))), str, ": domain=", str2, ", description=");
        m4122u.append(str3);
        return m4122u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12061b);
        parcel.writeString(this.f12062c);
        parcel.writeString(this.f12064e);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12062c = readString;
        this.f12063d = parcel.readString();
        this.f12064e = parcel.readString();
    }
}
