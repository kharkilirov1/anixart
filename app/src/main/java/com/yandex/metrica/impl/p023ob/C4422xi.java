package com.yandex.metrica.impl.p023ob;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.xi */
/* loaded from: classes2.dex */
public final class C4422xi implements Parcelable {

    @NotNull
    public static final a CREATOR = new a(null);

    /* renamed from: a */
    @Nullable
    private final Boolean f46946a;

    /* renamed from: b */
    @NotNull
    private final EnumC3911e1 f46947b;

    /* renamed from: c */
    @Nullable
    private final String f46948c;

    /* renamed from: com.yandex.metrica.impl.ob.xi$a */
    public static final class a implements Parcelable.Creator<C4422xi> {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        public C4422xi createFromParcel(Parcel parcel) {
            Object readValue = parcel.readValue(Boolean.TYPE.getClassLoader());
            if (!(readValue instanceof Boolean)) {
                readValue = null;
            }
            EnumC3911e1 m19778a = EnumC3911e1.m19778a(parcel.readString());
            Intrinsics.m32178g(m19778a, "IdentifierStatus.from(parcel.readString())");
            return new C4422xi((Boolean) readValue, m19778a, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public C4422xi[] newArray(int i2) {
            return new C4422xi[i2];
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4422xi(@Nullable Boolean bool, @NotNull EnumC3911e1 enumC3911e1, @Nullable String str) {
        this.f46946a = bool;
        this.f46947b = enumC3911e1;
        this.f46948c = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m21156a() {
        return this.f46948c;
    }

    @Nullable
    /* renamed from: b */
    public final Boolean m21157b() {
        return this.f46946a;
    }

    @NotNull
    /* renamed from: c */
    public final EnumC3911e1 m21158c() {
        return this.f46947b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4422xi)) {
            return false;
        }
        C4422xi c4422xi = (C4422xi) obj;
        return Intrinsics.m32174c(this.f46946a, c4422xi.f46946a) && Intrinsics.m32174c(this.f46947b, c4422xi.f46947b) && Intrinsics.m32174c(this.f46948c, c4422xi.f46948c);
    }

    public int hashCode() {
        Boolean bool = this.f46946a;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        EnumC3911e1 enumC3911e1 = this.f46947b;
        int hashCode2 = (hashCode + (enumC3911e1 != null ? enumC3911e1.hashCode() : 0)) * 31;
        String str = this.f46948c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("FeaturesInternal(sslPinning=");
        m24u.append(this.f46946a);
        m24u.append(", status=");
        m24u.append(this.f46947b);
        m24u.append(", errorExplanation=");
        return C0000a.m20q(m24u, this.f46948c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        parcel.writeValue(this.f46946a);
        parcel.writeString(this.f46947b.m19779a());
        parcel.writeString(this.f46948c);
    }

    public C4422xi() {
        this(null, EnumC3911e1.UNKNOWN, null);
    }
}
