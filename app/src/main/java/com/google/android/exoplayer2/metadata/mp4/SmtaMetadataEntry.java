package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: classes.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new Parcelable.Creator<SmtaMetadataEntry>() { // from class: com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (C10611) null);
        }

        @Override // android.os.Parcelable.Creator
        public SmtaMetadataEntry[] newArray(int i2) {
            return new SmtaMetadataEntry[i2];
        }
    };

    /* renamed from: b */
    public final float f12089b;

    /* renamed from: c */
    public final int f12090c;

    public SmtaMetadataEntry(float f2, int i2) {
        this.f12089b = f2;
        this.f12090c = i2;
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

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f12089b == smtaMetadataEntry.f12089b && this.f12090c == smtaMetadataEntry.f12090c;
    }

    public int hashCode() {
        return ((Float.valueOf(this.f12089b).hashCode() + 527) * 31) + this.f12090c;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        float f2 = this.f12089b;
        int i2 = this.f12090c;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f2);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f12089b);
        parcel.writeInt(this.f12090c);
    }

    public SmtaMetadataEntry(Parcel parcel, C10611 c10611) {
        this.f12089b = parcel.readFloat();
        this.f12090c = parcel.readInt();
    }
}
