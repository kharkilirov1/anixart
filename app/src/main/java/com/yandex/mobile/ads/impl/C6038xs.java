package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.xs */
/* loaded from: classes3.dex */
public final class C6038xs implements x41 {

    /* renamed from: a */
    private final C5808tl f56548a = new C5808tl();

    /* renamed from: b */
    private final a51 f56549b = new a51();

    /* renamed from: c */
    private final ArrayDeque f56550c = new ArrayDeque();

    /* renamed from: d */
    private int f56551d;

    /* renamed from: e */
    private boolean f56552e;

    /* renamed from: com.yandex.mobile.ads.impl.xs$a */
    public class a extends b51 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5809tm
        /* renamed from: h */
        public final void mo22827h() {
            C6038xs.m29806a(C6038xs.this, this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xs$b */
    public static final class b implements w41 {

        /* renamed from: a */
        private final long f56554a;

        /* renamed from: b */
        private final AbstractC4698p<C5751sl> f56555b;

        public b(long j2, AbstractC4698p<C5751sl> abstractC4698p) {
            this.f56554a = j2;
            this.f56555b = abstractC4698p;
        }

        @Override // com.yandex.mobile.ads.impl.w41
        /* renamed from: a */
        public final int mo22722a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.w41
        /* renamed from: a */
        public final int mo22723a(long j2) {
            return this.f56554a > j2 ? 0 : -1;
        }

        @Override // com.yandex.mobile.ads.impl.w41
        /* renamed from: b */
        public final List<C5751sl> mo22726b(long j2) {
            return j2 >= this.f56554a ? this.f56555b : AbstractC4698p.m22055i();
        }

        @Override // com.yandex.mobile.ads.impl.w41
        /* renamed from: a */
        public final long mo22724a(int i2) {
            C5220ia.m25473a(i2 == 0);
            return this.f56554a;
        }
    }

    public C6038xs() {
        for (int i2 = 0; i2 < 2; i2++) {
            this.f56550c.addFirst(new a());
        }
        this.f56551d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.x41
    /* renamed from: a */
    public final void mo22817a(long j2) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    /* renamed from: a */
    public final void mo22818a(a51 a51Var) throws C5696rm {
        C5220ia.m25476b(!this.f56552e);
        C5220ia.m25476b(this.f56551d == 1);
        C5220ia.m25473a(this.f56549b == a51Var);
        this.f56551d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    @Nullable
    /* renamed from: b */
    public final a51 mo22820b() throws C5696rm {
        C5220ia.m25476b(!this.f56552e);
        if (this.f56551d != 0) {
            return null;
        }
        this.f56551d = 1;
        return this.f56549b;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    public final void flush() {
        C5220ia.m25476b(!this.f56552e);
        this.f56549b.mo22727b();
        this.f56551d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    public final void release() {
        this.f56552e = true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    @Nullable
    /* renamed from: a */
    public final b51 mo22816a() throws C5696rm {
        C5220ia.m25476b(!this.f56552e);
        if (this.f56551d != 2 || this.f56550c.isEmpty()) {
            return null;
        }
        b51 b51Var = (b51) this.f56550c.removeFirst();
        if (this.f56549b.m26638f()) {
            b51Var.m26632b(4);
        } else {
            a51 a51Var = this.f56549b;
            long j2 = a51Var.f54759e;
            C5808tl c5808tl = this.f56548a;
            ByteBuffer byteBuffer = a51Var.f54757c;
            Objects.requireNonNull(byteBuffer);
            byte[] array = byteBuffer.array();
            Objects.requireNonNull(c5808tl);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(array, 0, array.length);
            obtain.setDataPosition(0);
            Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
            obtain.recycle();
            ArrayList parcelableArrayList = readBundle.getParcelableArrayList("c");
            Objects.requireNonNull(parcelableArrayList);
            b51Var.m22725a(this.f56549b.f54759e, new b(j2, C5637qf.m27717a(C5751sl.f54716s, parcelableArrayList)), 0L);
        }
        this.f56549b.mo22727b();
        this.f56551d = 0;
        return b51Var;
    }

    /* renamed from: a */
    public static void m29806a(C6038xs c6038xs, b51 b51Var) {
        C5220ia.m25476b(c6038xs.f56550c.size() < 2);
        C5220ia.m25473a(!c6038xs.f56550c.contains(b51Var));
        b51Var.mo22727b();
        c6038xs.f56550c.addFirst(b51Var);
    }
}
