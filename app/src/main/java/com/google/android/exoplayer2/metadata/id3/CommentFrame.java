package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new Parcelable.Creator<CommentFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.CommentFrame.1
        @Override // android.os.Parcelable.Creator
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CommentFrame[] newArray(int i2) {
            return new CommentFrame[i2];
        }
    };

    /* renamed from: c */
    public final String f12049c;

    /* renamed from: d */
    public final String f12050d;

    /* renamed from: e */
    public final String f12051e;

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f12049c = str;
        this.f12050d = str2;
        this.f12051e = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return Util.m7728a(this.f12050d, commentFrame.f12050d) && Util.m7728a(this.f12049c, commentFrame.f12049c) && Util.m7728a(this.f12051e, commentFrame.f12051e);
    }

    public int hashCode() {
        String str = this.f12049c;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12050d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12051e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f12061b;
        String str2 = this.f12049c;
        String str3 = this.f12050d;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str3, C0576a.m4106e(str2, C0576a.m4106e(str, 25))), str, ": language=", str2, ", description=");
        m4122u.append(str3);
        return m4122u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12061b);
        parcel.writeString(this.f12049c);
        parcel.writeString(this.f12051e);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12049c = readString;
        this.f12050d = parcel.readString();
        this.f12051e = parcel.readString();
    }
}
