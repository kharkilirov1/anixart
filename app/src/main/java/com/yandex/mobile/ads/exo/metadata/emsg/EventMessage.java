package com.yandex.mobile.ads.exo.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.metadata.C4740b;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.sb0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {

    /* renamed from: a */
    public final String f48063a;

    /* renamed from: b */
    public final String f48064b;

    /* renamed from: c */
    public final long f48065c;

    /* renamed from: d */
    public final long f48066d;

    /* renamed from: e */
    public final byte[] f48067e;

    /* renamed from: f */
    private int f48068f;

    /* renamed from: g */
    private static final C5606pv f48061g = new C5606pv.a().m27561f("application/id3").m27550a();

    /* renamed from: h */
    private static final C5606pv f48062h = new C5606pv.a().m27561f("application/x-scte35").m27550a();
    public static final Parcelable.Creator<EventMessage> CREATOR = new C4742a();

    /* renamed from: com.yandex.mobile.ads.exo.metadata.emsg.EventMessage$a */
    public class C4742a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        public final EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EventMessage[] newArray(int i2) {
            return new EventMessage[i2];
        }
    }

    public EventMessage(String str, String str2, long j2, long j3, byte[] bArr) {
        this.f48063a = str;
        this.f48064b = str2;
        this.f48065c = j2;
        this.f48066d = j3;
        this.f48067e = bArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    @Nullable
    /* renamed from: a */
    public final C5606pv mo22238a() {
        String str = this.f48063a;
        Objects.requireNonNull(str);
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f48062h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f48061g;
            default:
                return null;
        }
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public /* synthetic */ void mo22239a(sb0.C5738a c5738a) {
        C4740b.m22251b(this, c5738a);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    @Nullable
    /* renamed from: b */
    public final byte[] mo22240b() {
        if (mo22238a() != null) {
            return this.f48067e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f48065c == eventMessage.f48065c && this.f48066d == eventMessage.f48066d && s91.m28112a(this.f48063a, eventMessage.f48063a) && s91.m28112a(this.f48064b, eventMessage.f48064b) && Arrays.equals(this.f48067e, eventMessage.f48067e);
    }

    public final int hashCode() {
        if (this.f48068f == 0) {
            String str = this.f48063a;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f48064b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j2 = this.f48065c;
            int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f48066d;
            this.f48068f = Arrays.hashCode(this.f48067e) + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.f48068f;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("EMSG: scheme=");
        m26356a.append(this.f48063a);
        m26356a.append(", id=");
        m26356a.append(this.f48066d);
        m26356a.append(", durationMs=");
        m26356a.append(this.f48065c);
        m26356a.append(", value=");
        m26356a.append(this.f48064b);
        return m26356a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48063a);
        parcel.writeString(this.f48064b);
        parcel.writeLong(this.f48065c);
        parcel.writeLong(this.f48066d);
        parcel.writeByteArray(this.f48067e);
    }

    public EventMessage(Parcel parcel) {
        this.f48063a = (String) s91.m28101a(parcel.readString());
        this.f48064b = (String) s91.m28101a(parcel.readString());
        this.f48065c = parcel.readLong();
        this.f48066d = parcel.readLong();
        this.f48067e = (byte[]) s91.m28101a(parcel.createByteArray());
    }
}
