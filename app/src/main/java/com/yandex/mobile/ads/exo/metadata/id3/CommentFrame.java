package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.s91;

/* loaded from: classes2.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C4751a();

    /* renamed from: b */
    public final String f48104b;

    /* renamed from: c */
    public final String f48105c;

    /* renamed from: d */
    public final String f48106d;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.CommentFrame$a */
    public class C4751a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        public final CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame[] newArray(int i2) {
            return new CommentFrame[i2];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f48104b = str;
        this.f48105c = str2;
        this.f48106d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return s91.m28112a(this.f48105c, commentFrame.f48105c) && s91.m28112a(this.f48104b, commentFrame.f48104b) && s91.m28112a(this.f48106d, commentFrame.f48106d);
    }

    public final int hashCode() {
        String str = this.f48104b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f48105c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f48106d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f48111a + ": language=" + this.f48104b + ", description=" + this.f48105c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48111a);
        parcel.writeString(this.f48104b);
        parcel.writeString(this.f48106d);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f48104b = (String) s91.m28101a(parcel.readString());
        this.f48105c = (String) s91.m28101a(parcel.readString());
        this.f48106d = (String) s91.m28101a(parcel.readString());
    }
}
