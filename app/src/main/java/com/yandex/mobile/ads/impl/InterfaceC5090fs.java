package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Looper;
import com.yandex.mobile.ads.impl.C5194ho;
import com.yandex.mobile.ads.impl.C5405ln;
import com.yandex.mobile.ads.impl.C5874un;
import com.yandex.mobile.ads.impl.C5959w6;
import com.yandex.mobile.ads.impl.bc0;

/* renamed from: com.yandex.mobile.ads.impl.fs */
/* loaded from: classes3.dex */
public interface InterfaceC5090fs extends rq0 {

    /* renamed from: com.yandex.mobile.ads.impl.fs$a */
    public interface a {
        /* renamed from: a */
        void mo24728a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.fs$b */
    public static final class b {

        /* renamed from: a */
        public final Context f50419a;

        /* renamed from: b */
        public f51 f50420b;

        /* renamed from: c */
        public c51<fv0> f50421c;

        /* renamed from: d */
        public c51<bc0.InterfaceC4857a> f50422d;

        /* renamed from: e */
        public c51<d71> f50423e;

        /* renamed from: f */
        public c51<h80> f50424f;

        /* renamed from: g */
        public c51<InterfaceC5793tc> f50425g;

        /* renamed from: h */
        public InterfaceC5416lx<InterfaceC4972di, InterfaceC5569p8> f50426h;

        /* renamed from: i */
        public Looper f50427i;

        /* renamed from: j */
        public C5481nb f50428j;

        /* renamed from: k */
        public int f50429k;

        /* renamed from: l */
        public boolean f50430l;

        /* renamed from: m */
        public f01 f50431m;

        /* renamed from: n */
        public C5874un f50432n;

        /* renamed from: o */
        public long f50433o;

        /* renamed from: p */
        public long f50434p;

        /* renamed from: q */
        public boolean f50435q;

        /* renamed from: r */
        public boolean f50436r;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(final android.content.Context r4) {
            /*
                r3 = this;
                com.yandex.mobile.ads.impl.mo1 r0 = new com.yandex.mobile.ads.impl.mo1
                r1 = 0
                r0.<init>()
                com.yandex.mobile.ads.impl.mo1 r1 = new com.yandex.mobile.ads.impl.mo1
                r2 = 1
                r1.<init>()
                r3.<init>(r4, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.InterfaceC5090fs.b.<init>(android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ fv0 m24729a(Context context) {
            return new C4933co(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static bc0.InterfaceC4857a m24730b(Context context) {
            return new C6131zn(new C5405ln.a(context), new C5650qn());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static d71 m24731c(Context context) {
            return new C5194ho(context, C5194ho.c.m25297a(context), new C5959w6.b(0));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private b(final android.content.Context r9, com.yandex.mobile.ads.impl.c51<com.yandex.mobile.ads.impl.fv0> r10, com.yandex.mobile.ads.impl.c51<com.yandex.mobile.ads.impl.bc0.InterfaceC4857a> r11) {
            /*
                r8 = this;
                com.yandex.mobile.ads.impl.mo1 r4 = new com.yandex.mobile.ads.impl.mo1
                r0 = 2
                r4.<init>()
                com.yandex.mobile.ads.impl.gn1 r5 = com.yandex.mobile.ads.impl.gn1.f50685d
                com.yandex.mobile.ads.impl.mo1 r6 = new com.yandex.mobile.ads.impl.mo1
                r0 = 3
                r6.<init>()
                com.yandex.mobile.ads.impl.dn1 r7 = com.yandex.mobile.ads.impl.dn1.f49712w
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.InterfaceC5090fs.b.<init>(android.content.Context, com.yandex.mobile.ads.impl.c51, com.yandex.mobile.ads.impl.c51):void");
        }

        /* renamed from: a */
        public final InterfaceC5090fs m24737a() {
            C5220ia.m25476b(!this.f50436r);
            this.f50436r = true;
            return new C5246is(this);
        }

        private b(Context context, c51<fv0> c51Var, c51<bc0.InterfaceC4857a> c51Var2, c51<d71> c51Var3, c51<h80> c51Var4, c51<InterfaceC5793tc> c51Var5, InterfaceC5416lx<InterfaceC4972di, InterfaceC5569p8> interfaceC5416lx) {
            this.f50419a = context;
            this.f50421c = c51Var;
            this.f50422d = c51Var2;
            this.f50423e = c51Var3;
            this.f50424f = c51Var4;
            this.f50425g = c51Var5;
            this.f50426h = interfaceC5416lx;
            this.f50427i = s91.m28127c();
            this.f50428j = C5481nb.f52893g;
            this.f50429k = 1;
            this.f50430l = true;
            this.f50431m = f01.f50082c;
            this.f50432n = new C5874un.a().m29056a();
            this.f50420b = InterfaceC4972di.f49652a;
            this.f50433o = 500L;
            this.f50434p = 2000L;
            this.f50435q = true;
        }
    }

    /* renamed from: a */
    void mo24727a(ws0 ws0Var);
}
