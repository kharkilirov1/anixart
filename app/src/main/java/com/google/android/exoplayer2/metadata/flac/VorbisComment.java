package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Objects;

/* loaded from: classes.dex */
public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new Parcelable.Creator<VorbisComment>() { // from class: com.google.android.exoplayer2.metadata.flac.VorbisComment.1
        @Override // android.os.Parcelable.Creator
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public VorbisComment[] newArray(int i2) {
            return new VorbisComment[i2];
        }
    };

    /* renamed from: b */
    public final String f12019b;

    /* renamed from: c */
    public final String f12020c;

    public VorbisComment(String str, String str2) {
        this.f12019b = str;
        this.f12020c = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: Q */
    public /* synthetic */ Format mo6698Q() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: b */
    public void mo6699b(MediaMetadata.Builder builder) {
        String str = this.f12019b;
        Objects.requireNonNull(str);
        switch (str) {
            case "ALBUM":
                builder.f9833c = this.f12020c;
                break;
            case "TITLE":
                builder.f9831a = this.f12020c;
                break;
            case "DESCRIPTION":
                builder.f9837g = this.f12020c;
                break;
            case "ALBUMARTIST":
                builder.f9834d = this.f12020c;
                break;
            case "ARTIST":
                builder.f9832b = this.f12020c;
                break;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f12019b.equals(vorbisComment.f12019b) && this.f12020c.equals(vorbisComment.f12020c);
    }

    public int hashCode() {
        return this.f12020c.hashCode() + C0576a.m4107f(this.f12019b, 527, 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        String str = this.f12019b;
        String str2 = this.f12020c;
        return C1008a.m6437d(C0576a.m4106e(str2, C0576a.m4106e(str, 5)), "VC: ", str, "=", str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12019b);
        parcel.writeString(this.f12020c);
    }

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12019b = readString;
        this.f12020c = parcel.readString();
    }
}
