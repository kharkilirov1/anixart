package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ye */
/* loaded from: classes2.dex */
public class C3770Ye {

    /* renamed from: g */
    private static Map<EnumC3482N0, Integer> f44570g;

    /* renamed from: h */
    private static final C3770Ye f44571h;

    /* renamed from: a */
    @NonNull
    private final InterfaceC3925ef f44572a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC4133mf f44573b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3695Ve f44574c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3795Ze f44575d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC3899df f44576e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3951ff f44577f;

    /* renamed from: com.yandex.metrica.impl.ob.Ye$b */
    public static class b {

        /* renamed from: a */
        @NonNull
        private InterfaceC3925ef f44578a;

        /* renamed from: b */
        @NonNull
        private InterfaceC4133mf f44579b;

        /* renamed from: c */
        @NonNull
        private InterfaceC3695Ve f44580c;

        /* renamed from: d */
        @NonNull
        private InterfaceC3795Ze f44581d;

        /* renamed from: e */
        @NonNull
        private InterfaceC3899df f44582e;

        /* renamed from: f */
        @NonNull
        private InterfaceC3951ff f44583f;

        private b(@NonNull C3770Ye c3770Ye) {
            this.f44578a = c3770Ye.f44572a;
            this.f44579b = c3770Ye.f44573b;
            this.f44580c = c3770Ye.f44574c;
            this.f44581d = c3770Ye.f44575d;
            this.f44582e = c3770Ye.f44576e;
            this.f44583f = c3770Ye.f44577f;
        }

        @NonNull
        /* renamed from: a */
        public b m19472a(@NonNull InterfaceC3925ef interfaceC3925ef) {
            this.f44578a = interfaceC3925ef;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m19474a(@NonNull InterfaceC4133mf interfaceC4133mf) {
            this.f44579b = interfaceC4133mf;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m19469a(@NonNull InterfaceC3695Ve interfaceC3695Ve) {
            this.f44580c = interfaceC3695Ve;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m19470a(@NonNull InterfaceC3795Ze interfaceC3795Ze) {
            this.f44581d = interfaceC3795Ze;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m19471a(@NonNull InterfaceC3899df interfaceC3899df) {
            this.f44582e = interfaceC3899df;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public b m19473a(@NonNull InterfaceC3951ff interfaceC3951ff) {
            this.f44583f = interfaceC3951ff;
            return this;
        }

        /* renamed from: a */
        public C3770Ye m19475a() {
            return new C3770Ye(this);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC3482N0.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC3482N0.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC3482N0.UNKNOWN, -1);
        f44570g = Collections.unmodifiableMap(hashMap);
        f44571h = new C3770Ye(new C4055jf(), new C4081kf(), new C3977gf(), new C4029if(), new C3821af(), new C3847bf());
    }

    private C3770Ye(@NonNull b bVar) {
        this(bVar.f44578a, bVar.f44579b, bVar.f44580c, bVar.f44581d, bVar.f44582e, bVar.f44583f);
    }

    /* renamed from: b */
    public static C3770Ye m19456b() {
        return f44571h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p023ob.C3696Vf.d.a m19462a(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C3745Xe r8, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4057jh r9) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3770Ye.m19462a(com.yandex.metrica.impl.ob.Xe, com.yandex.metrica.impl.ob.jh):com.yandex.metrica.impl.ob.Vf$d$a");
    }

    private C3770Ye(@NonNull InterfaceC3925ef interfaceC3925ef, @NonNull InterfaceC4133mf interfaceC4133mf, @NonNull InterfaceC3695Ve interfaceC3695Ve, @NonNull InterfaceC3795Ze interfaceC3795Ze, @NonNull InterfaceC3899df interfaceC3899df, @NonNull InterfaceC3951ff interfaceC3951ff) {
        this.f44572a = interfaceC3925ef;
        this.f44573b = interfaceC4133mf;
        this.f44574c = interfaceC3695Ve;
        this.f44575d = interfaceC3795Ze;
        this.f44576e = interfaceC3899df;
        this.f44577f = interfaceC3951ff;
    }

    /* renamed from: a */
    public static b m19454a() {
        return new b();
    }
}
