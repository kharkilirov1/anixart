package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.Objects;

@SuppressLint
/* renamed from: com.yandex.metrica.impl.ob.Xj */
/* loaded from: classes2.dex */
public class C3750Xj implements InterfaceC4476zk<C3700Vj> {

    /* renamed from: d */
    @SuppressLint
    private static final SparseArray<String> f44511d = new a();

    /* renamed from: a */
    @NonNull
    private final C4060jk f44512a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3976ge f44513b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3976ge f44514c;

    /* renamed from: com.yandex.metrica.impl.ob.Xj$a */
    public class a extends SparseArray<String> {
        public a() {
            put(0, null);
            put(7, "1xRTT");
            put(4, "CDMA");
            put(2, "EDGE");
            put(14, "eHRPD");
            put(5, "EVDO rev.0");
            put(6, "EVDO rev.A");
            put(12, "EVDO rev.B");
            put(1, "GPRS");
            put(8, "HSDPA");
            put(10, "HSPA");
            put(15, "HSPA+");
            put(9, "HSUPA");
            put(11, "iDen");
            put(3, "UMTS");
            put(12, "EVDO rev.B");
            put(14, "eHRPD");
            put(13, "LTE");
            put(15, "HSPA+");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Xj$b */
    public class b implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44515a;

        public b(C3750Xj c3750Xj, C3950fe c3950fe) {
            this.f44515a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            Objects.requireNonNull(this.f44515a);
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Xj$c */
    public class c implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44516a;

        public c(C3750Xj c3750Xj, C3950fe c3950fe) {
            this.f44516a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            return this.f44516a.m19901b(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Xj$d */
    public class d implements InterfaceC3976ge {

        /* renamed from: a */
        public final /* synthetic */ C3950fe f44517a;

        public d(C3750Xj c3750Xj, C3950fe c3950fe) {
            this.f44517a = c3950fe;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            return this.f44517a.m19900a(context);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Xj$e */
    public class e implements InterfaceC3976ge {
        public e(C3750Xj c3750Xj) {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3976ge
        /* renamed from: a */
        public boolean mo19401a(@NonNull Context context) {
            return true;
        }
    }

    public C3750Xj(@NonNull C4060jk c4060jk, @NonNull C3950fe c3950fe) {
        this.f44512a = c4060jk;
        if (C3658U2.m19211a(29)) {
            this.f44513b = new b(this, c3950fe);
            this.f44514c = new c(this, c3950fe);
        } else {
            this.f44513b = new d(this, c3950fe);
            this.f44514c = new e(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m19400b() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3750Xj.m19400b():java.lang.Object");
    }
}
