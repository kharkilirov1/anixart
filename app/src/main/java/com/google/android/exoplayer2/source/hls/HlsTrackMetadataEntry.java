package com.google.android.exoplayer2.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new Parcelable.Creator<HlsTrackMetadataEntry>() { // from class: com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public HlsTrackMetadataEntry[] newArray(int i2) {
            return new HlsTrackMetadataEntry[i2];
        }
    };

    /* renamed from: b */
    @Nullable
    public final String f13215b;

    /* renamed from: c */
    @Nullable
    public final String f13216c;

    /* renamed from: d */
    public final List<VariantInfo> f13217d;

    public HlsTrackMetadataEntry(@Nullable String str, @Nullable String str2, List<VariantInfo> list) {
        this.f13215b = str;
        this.f13216c = str2;
        this.f13217d = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f13215b, hlsTrackMetadataEntry.f13215b) && TextUtils.equals(this.f13216c, hlsTrackMetadataEntry.f13216c) && this.f13217d.equals(hlsTrackMetadataEntry.f13217d);
    }

    public int hashCode() {
        String str = this.f13215b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13216c;
        return this.f13217d.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: s0 */
    public /* synthetic */ byte[] mo6700s0() {
        return null;
    }

    public String toString() {
        String str;
        String str2 = this.f13215b;
        if (str2 != null) {
            String str3 = this.f13216c;
            StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str3, C0576a.m4106e(str2, 5)), " [", str2, ", ", str3);
            m4122u.append("]");
            str = m4122u.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(valueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f13215b);
        parcel.writeString(this.f13216c);
        int size = this.f13217d.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeParcelable(this.f13217d.get(i3), 0);
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f13215b = parcel.readString();
        this.f13216c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f13217d = Collections.unmodifiableList(arrayList);
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new Parcelable.Creator<VariantInfo>() { // from class: com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry.VariantInfo.1
            @Override // android.os.Parcelable.Creator
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public VariantInfo[] newArray(int i2) {
                return new VariantInfo[i2];
            }
        };

        /* renamed from: b */
        public final int f13218b;

        /* renamed from: c */
        public final int f13219c;

        /* renamed from: d */
        @Nullable
        public final String f13220d;

        /* renamed from: e */
        @Nullable
        public final String f13221e;

        /* renamed from: f */
        @Nullable
        public final String f13222f;

        /* renamed from: g */
        @Nullable
        public final String f13223g;

        public VariantInfo(int i2, int i3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f13218b = i2;
            this.f13219c = i3;
            this.f13220d = str;
            this.f13221e = str2;
            this.f13222f = str3;
            this.f13223g = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.f13218b == variantInfo.f13218b && this.f13219c == variantInfo.f13219c && TextUtils.equals(this.f13220d, variantInfo.f13220d) && TextUtils.equals(this.f13221e, variantInfo.f13221e) && TextUtils.equals(this.f13222f, variantInfo.f13222f) && TextUtils.equals(this.f13223g, variantInfo.f13223g);
        }

        public int hashCode() {
            int i2 = ((this.f13218b * 31) + this.f13219c) * 31;
            String str = this.f13220d;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13221e;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13222f;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f13223g;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f13218b);
            parcel.writeInt(this.f13219c);
            parcel.writeString(this.f13220d);
            parcel.writeString(this.f13221e);
            parcel.writeString(this.f13222f);
            parcel.writeString(this.f13223g);
        }

        public VariantInfo(Parcel parcel) {
            this.f13218b = parcel.readInt();
            this.f13219c = parcel.readInt();
            this.f13220d = parcel.readString();
            this.f13221e = parcel.readString();
            this.f13222f = parcel.readString();
            this.f13223g = parcel.readString();
        }
    }
}
