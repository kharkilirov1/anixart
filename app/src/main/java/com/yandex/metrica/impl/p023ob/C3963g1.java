package com.yandex.metrica.impl.p023ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.g1 */
/* loaded from: classes2.dex */
public class C3963g1 implements Parcelable {
    public static final Parcelable.Creator<C3963g1> CREATOR = new a();

    /* renamed from: a */
    @Nullable
    public final String f45155a;

    /* renamed from: b */
    @NonNull
    public final EnumC3911e1 f45156b;

    /* renamed from: c */
    @Nullable
    public final String f45157c;

    /* renamed from: com.yandex.metrica.impl.ob.g1$a */
    public class a implements Parcelable.Creator<C3963g1> {
        @Override // android.os.Parcelable.Creator
        public C3963g1 createFromParcel(Parcel parcel) {
            return new C3963g1(parcel.readString(), EnumC3911e1.m19778a(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public C3963g1[] newArray(int i2) {
            return new C3963g1[i2];
        }
    }

    public C3963g1(@Nullable String str, @NonNull EnumC3911e1 enumC3911e1, @Nullable String str2) {
        this.f45155a = str;
        this.f45156b = enumC3911e1;
        this.f45157c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3963g1.class != obj.getClass()) {
            return false;
        }
        C3963g1 c3963g1 = (C3963g1) obj;
        String str = this.f45155a;
        if (str == null ? c3963g1.f45155a != null : !str.equals(c3963g1.f45155a)) {
            return false;
        }
        if (this.f45156b != c3963g1.f45156b) {
            return false;
        }
        String str2 = this.f45157c;
        return str2 != null ? str2.equals(c3963g1.f45157c) : c3963g1.f45157c == null;
    }

    public int hashCode() {
        String str = this.f45155a;
        int hashCode = (this.f45156b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.f45157c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("IdentifiersResultInternal{mId='");
        C0576a.m4100A(m24u, this.f45155a, '\'', ", mStatus=");
        m24u.append(this.f45156b);
        m24u.append(", mErrorExplanation='");
        m24u.append(this.f45157c);
        m24u.append('\'');
        m24u.append('}');
        return m24u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f45155a);
        parcel.writeString(this.f45156b.m19779a());
        parcel.writeString(this.f45157c);
    }
}
