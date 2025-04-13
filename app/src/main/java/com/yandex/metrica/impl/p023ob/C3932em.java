package com.yandex.metrica.impl.p023ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.em */
/* loaded from: classes2.dex */
public class C3932em implements Parcelable {
    public static final Parcelable.Creator<C3932em> CREATOR = new a();

    /* renamed from: a */
    @NonNull
    public final b f45067a;

    /* renamed from: b */
    @NonNull
    public final String f45068b;

    /* renamed from: com.yandex.metrica.impl.ob.em$a */
    public class a implements Parcelable.Creator<C3932em> {
        @Override // android.os.Parcelable.Creator
        public C3932em createFromParcel(Parcel parcel) {
            return new C3932em(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3932em[] newArray(int i2) {
            return new C3932em[i2];
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$b */
    public enum b {
        EQUALS(0),
        CONTAINS(1),
        MATCHES(2),
        DOES_NOT_MATCH(3);


        /* renamed from: a */
        public final int f45074a;

        b(int i2) {
            this.f45074a = i2;
        }

        @NonNull
        /* renamed from: a */
        public static b m19829a(int i2) {
            b[] values = values();
            for (int i3 = 0; i3 < 4; i3++) {
                b bVar = values[i3];
                if (bVar.f45074a == i2) {
                    return bVar;
                }
            }
            return EQUALS;
        }
    }

    public C3932em(@NonNull b bVar, @NonNull String str) {
        this.f45067a = bVar;
        this.f45068b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3932em.class != obj.getClass()) {
            return false;
        }
        C3932em c3932em = (C3932em) obj;
        if (this.f45067a != c3932em.f45067a) {
            return false;
        }
        return this.f45068b.equals(c3932em.f45068b);
    }

    public int hashCode() {
        return this.f45068b.hashCode() + (this.f45067a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("UiParsingFilter{type=");
        m24u.append(this.f45067a);
        m24u.append(", value='");
        m24u.append(this.f45068b);
        m24u.append('\'');
        m24u.append('}');
        return m24u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f45067a.f45074a);
        parcel.writeString(this.f45068b);
    }

    public C3932em(Parcel parcel) {
        this.f45067a = b.m19829a(parcel.readInt());
        this.f45068b = (String) C4452ym.m21236a(parcel.readString(), "");
    }
}
