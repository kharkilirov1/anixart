package com.yandex.metrica.push.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.metrica.push.core.notification.EnumC4501d;

/* renamed from: com.yandex.metrica.push.impl.q */
/* loaded from: classes2.dex */
public class C4594q implements Parcelable {
    public static final Parcelable.Creator<C4594q> CREATOR = new a();

    /* renamed from: a */
    @NonNull
    public final String f47460a;

    /* renamed from: b */
    @Nullable
    public final String f47461b;

    /* renamed from: c */
    @Nullable
    public final String f47462c;

    /* renamed from: d */
    @Nullable
    public final String f47463d;

    /* renamed from: e */
    @Nullable
    public final EnumC4501d f47464e;

    /* renamed from: f */
    @Nullable
    public final String f47465f;

    /* renamed from: g */
    @Nullable
    public final String f47466g;

    /* renamed from: h */
    public final int f47467h;

    /* renamed from: i */
    public final long f47468i;

    /* renamed from: j */
    @NonNull
    public final String f47469j;

    /* renamed from: k */
    public final boolean f47470k;

    /* renamed from: l */
    public final boolean f47471l;

    /* renamed from: m */
    @Nullable
    public final Bundle f47472m;

    /* renamed from: n */
    public final boolean f47473n;

    /* renamed from: o */
    public final boolean f47474o;

    /* renamed from: p */
    public final boolean f47475p;

    /* renamed from: com.yandex.metrica.push.impl.q$a */
    public class a implements Parcelable.Creator<C4594q> {
        @Override // android.os.Parcelable.Creator
        public C4594q createFromParcel(Parcel parcel) {
            return new C4594q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C4594q[] newArray(int i2) {
            return new C4594q[i2];
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.q$b */
    public static class b {

        /* renamed from: a */
        @NonNull
        public String f47476a;

        /* renamed from: b */
        @Nullable
        private String f47477b;

        /* renamed from: c */
        @Nullable
        private String f47478c;

        /* renamed from: d */
        @Nullable
        private String f47479d;

        /* renamed from: e */
        @Nullable
        private EnumC4501d f47480e;

        /* renamed from: f */
        @Nullable
        private String f47481f;

        /* renamed from: g */
        @Nullable
        private String f47482g;

        /* renamed from: j */
        @NonNull
        private String f47485j;

        /* renamed from: m */
        @Nullable
        private Bundle f47488m;

        /* renamed from: n */
        private boolean f47489n;

        /* renamed from: h */
        private int f47483h = 0;

        /* renamed from: i */
        private long f47484i = 0;

        /* renamed from: k */
        private boolean f47486k = false;

        /* renamed from: l */
        private boolean f47487l = false;

        /* renamed from: o */
        private boolean f47490o = false;

        /* renamed from: p */
        private boolean f47491p = false;

        public b(@NonNull String str) {
            this.f47476a = str;
        }

        @NonNull
        /* renamed from: a */
        public b m21624a(@Nullable EnumC4501d enumC4501d) {
            this.f47480e = enumC4501d;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public b m21628b(@NonNull String str) {
            this.f47485j = str;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public b m21630c(@Nullable String str) {
            this.f47482g = str;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public b m21632d(@Nullable String str) {
            this.f47479d = str;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public b m21634e(@Nullable String str) {
            this.f47477b = str;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public b m21636f(@Nullable String str) {
            this.f47478c = str;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m21625a(@Nullable String str) {
            this.f47481f = str;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public b m21629b(boolean z) {
            this.f47490o = z;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public b m21631c(boolean z) {
            this.f47489n = z;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public b m21633d(boolean z) {
            this.f47486k = z;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public b m21635e(boolean z) {
            this.f47491p = z;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m21621a(int i2) {
            this.f47483h = i2;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m21622a(long j2) {
            this.f47484i = j2;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m21626a(boolean z) {
            this.f47487l = z;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m21623a(@Nullable Bundle bundle) {
            this.f47488m = null;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public C4594q m21627a() {
            return new C4594q(this, null);
        }
    }

    public /* synthetic */ C4594q(b bVar, a aVar) {
        this(bVar);
    }

    @NonNull
    /* renamed from: a */
    public static b m21604a(@NonNull String str) {
        return new b(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        parcel.writeString(this.f47461b);
        parcel.writeString(this.f47462c);
        parcel.writeString(this.f47463d);
        EnumC4501d enumC4501d = this.f47464e;
        parcel.writeString(enumC4501d == null ? null : enumC4501d.m21396a());
        parcel.writeString(this.f47465f);
        parcel.writeString(this.f47466g);
        parcel.writeInt(this.f47467h);
        parcel.writeString(this.f47469j);
        parcel.writeInt(this.f47470k ? 1 : 0);
        parcel.writeInt(this.f47471l ? 1 : 0);
        parcel.writeBundle(this.f47472m);
        parcel.writeInt(this.f47473n ? 1 : 0);
        parcel.writeInt(this.f47474o ? 1 : 0);
        parcel.writeLong(this.f47468i);
        parcel.writeString(this.f47460a);
        parcel.writeInt(this.f47475p ? 1 : 0);
    }

    private C4594q(@NonNull b bVar) {
        this.f47460a = bVar.f47476a;
        this.f47461b = bVar.f47477b;
        this.f47462c = bVar.f47478c;
        this.f47463d = bVar.f47479d;
        this.f47464e = bVar.f47480e;
        this.f47465f = bVar.f47481f;
        this.f47466g = bVar.f47482g;
        this.f47467h = bVar.f47483h;
        this.f47469j = bVar.f47485j;
        this.f47470k = bVar.f47486k;
        this.f47471l = bVar.f47487l;
        this.f47472m = bVar.f47488m;
        this.f47473n = bVar.f47489n;
        this.f47474o = bVar.f47490o;
        this.f47468i = bVar.f47484i;
        this.f47475p = bVar.f47491p;
    }

    /* renamed from: a */
    private boolean m21605a(@NonNull Parcel parcel) {
        return parcel.readInt() == 1;
    }

    public C4594q(@NonNull Parcel parcel) {
        this.f47461b = parcel.readString();
        this.f47462c = parcel.readString();
        this.f47463d = parcel.readString();
        this.f47464e = EnumC4501d.m21395a(parcel.readString());
        this.f47465f = parcel.readString();
        this.f47466g = parcel.readString();
        this.f47467h = parcel.readInt();
        this.f47469j = parcel.readString();
        this.f47470k = m21605a(parcel);
        this.f47471l = m21605a(parcel);
        this.f47472m = parcel.readBundle(C4594q.class.getClassLoader());
        this.f47473n = m21605a(parcel);
        this.f47474o = m21605a(parcel);
        this.f47468i = parcel.readLong();
        this.f47460a = (String) C4530J0.m21451b(parcel.readString(), CoreConstants.Transport.UNKNOWN);
        this.f47475p = m21605a(parcel);
    }
}
