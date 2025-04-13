package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* renamed from: h */
    public static final Format f12001h;

    /* renamed from: i */
    public static final Format f12002i;

    /* renamed from: b */
    public final String f12003b;

    /* renamed from: c */
    public final String f12004c;

    /* renamed from: d */
    public final long f12005d;

    /* renamed from: e */
    public final long f12006e;

    /* renamed from: f */
    public final byte[] f12007f;

    /* renamed from: g */
    public int f12008g;

    static {
        Format.Builder builder = new Format.Builder();
        builder.f9687k = "application/id3";
        f12001h = builder.m5833a();
        Format.Builder builder2 = new Format.Builder();
        builder2.f9687k = "application/x-scte35";
        f12002i = builder2.m5833a();
        CREATOR = new Parcelable.Creator<EventMessage>() { // from class: com.google.android.exoplayer2.metadata.emsg.EventMessage.1
            @Override // android.os.Parcelable.Creator
            public EventMessage createFromParcel(Parcel parcel) {
                return new EventMessage(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public EventMessage[] newArray(int i2) {
                return new EventMessage[i2];
            }
        };
    }

    public EventMessage(String str, String str2, long j2, long j3, byte[] bArr) {
        this.f12003b = str;
        this.f12004c = str2;
        this.f12005d = j2;
        this.f12006e = j3;
        this.f12007f = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    /* renamed from: Q */
    public Format mo6698Q() {
        String str = this.f12003b;
        Objects.requireNonNull(str);
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f12002i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f12001h;
            default:
                return null;
        }
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
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f12005d == eventMessage.f12005d && this.f12006e == eventMessage.f12006e && Util.m7728a(this.f12003b, eventMessage.f12003b) && Util.m7728a(this.f12004c, eventMessage.f12004c) && Arrays.equals(this.f12007f, eventMessage.f12007f);
    }

    public int hashCode() {
        if (this.f12008g == 0) {
            String str = this.f12003b;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f12004c;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j2 = this.f12005d;
            int i2 = (((hashCode + hashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f12006e;
            this.f12008g = Arrays.hashCode(this.f12007f) + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.f12008g;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @Nullable
    /* renamed from: s0 */
    public byte[] mo6700s0() {
        if (mo6698Q() != null) {
            return this.f12007f;
        }
        return null;
    }

    public String toString() {
        String str = this.f12003b;
        long j2 = this.f12006e;
        long j3 = this.f12005d;
        String str2 = this.f12004c;
        StringBuilder sb = new StringBuilder(C0576a.m4106e(str2, C0576a.m4106e(str, 79)));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j2);
        sb.append(", durationMs=");
        sb.append(j3);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12003b);
        parcel.writeString(this.f12004c);
        parcel.writeLong(this.f12005d);
        parcel.writeLong(this.f12006e);
        parcel.writeByteArray(this.f12007f);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = Util.f14736a;
        this.f12003b = readString;
        this.f12004c = parcel.readString();
        this.f12005d = parcel.readLong();
        this.f12006e = parcel.readLong();
        this.f12007f = parcel.createByteArray();
    }
}
