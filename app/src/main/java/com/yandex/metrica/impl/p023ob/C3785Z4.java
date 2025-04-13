package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Z4 */
/* loaded from: classes2.dex */
public class C3785Z4 {

    /* renamed from: a */
    @Nullable
    private Long f44622a;

    /* renamed from: b */
    private int f44623b;

    /* renamed from: c */
    @NonNull
    private InterfaceC3529Om f44624c;

    /* renamed from: com.yandex.metrica.impl.ob.Z4$a */
    public static class a {

        /* renamed from: a */
        public final long f44625a;

        /* renamed from: b */
        public final long f44626b;

        /* renamed from: c */
        public final int f44627c;

        public a(long j2, long j3, int i2) {
            this.f44625a = j2;
            this.f44627c = i2;
            this.f44626b = j3;
        }
    }

    public C3785Z4() {
        this(new C3504Nm());
    }

    /* renamed from: a */
    public a m19504a() {
        if (this.f44622a == null) {
            this.f44622a = Long.valueOf(this.f44624c.mo18644b());
        }
        long longValue = this.f44622a.longValue();
        long longValue2 = this.f44622a.longValue();
        int i2 = this.f44623b;
        a aVar = new a(longValue, longValue2, i2);
        this.f44623b = i2 + 1;
        return aVar;
    }

    public C3785Z4(@NonNull InterfaceC3529Om interfaceC3529Om) {
        this.f44624c = interfaceC3529Om;
    }
}
