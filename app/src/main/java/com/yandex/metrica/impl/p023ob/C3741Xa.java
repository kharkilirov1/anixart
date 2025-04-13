package com.yandex.metrica.impl.p023ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Xa */
/* loaded from: classes2.dex */
public class C3741Xa implements Parcelable {
    public static final Parcelable.Creator<C3741Xa> CREATOR = new a();

    /* renamed from: a */
    @Nullable
    public final C3716Wa f44474a;

    /* renamed from: b */
    @Nullable
    public final C3716Wa f44475b;

    /* renamed from: c */
    @Nullable
    public final C3716Wa f44476c;

    /* renamed from: com.yandex.metrica.impl.ob.Xa$a */
    public class a implements Parcelable.Creator<C3741Xa> {
        @Override // android.os.Parcelable.Creator
        public C3741Xa createFromParcel(Parcel parcel) {
            return new C3741Xa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3741Xa[] newArray(int i2) {
            return new C3741Xa[i2];
        }
    }

    public C3741Xa() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("DiagnosticsConfigsHolder{activationConfig=");
        m24u.append(this.f44474a);
        m24u.append(", clidsInfoConfig=");
        m24u.append(this.f44475b);
        m24u.append(", preloadInfoConfig=");
        m24u.append(this.f44476c);
        m24u.append('}');
        return m24u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f44474a, i2);
        parcel.writeParcelable(this.f44475b, i2);
        parcel.writeParcelable(this.f44476c, i2);
    }

    public C3741Xa(@Nullable C3716Wa c3716Wa, @Nullable C3716Wa c3716Wa2, @Nullable C3716Wa c3716Wa3) {
        this.f44474a = c3716Wa;
        this.f44475b = c3716Wa2;
        this.f44476c = c3716Wa3;
    }

    public C3741Xa(Parcel parcel) {
        this.f44474a = (C3716Wa) parcel.readParcelable(C3716Wa.class.getClassLoader());
        this.f44475b = (C3716Wa) parcel.readParcelable(C3716Wa.class.getClassLoader());
        this.f44476c = (C3716Wa) parcel.readParcelable(C3716Wa.class.getClassLoader());
    }
}
