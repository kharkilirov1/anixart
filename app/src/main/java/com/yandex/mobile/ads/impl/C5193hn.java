package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q;
import com.yandex.mobile.ads.impl.InterfaceC5793tc;
import com.yandex.mobile.ads.impl.rm0;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.hn */
/* loaded from: classes3.dex */
public final class C5193hn implements InterfaceC5793tc, v71 {

    /* renamed from: n */
    public static final AbstractC4698p<Long> f50987n = AbstractC4698p.m22047a(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: o */
    public static final AbstractC4698p<Long> f50988o = AbstractC4698p.m22047a(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: p */
    public static final AbstractC4698p<Long> f50989p = AbstractC4698p.m22047a(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: q */
    public static final AbstractC4698p<Long> f50990q = AbstractC4698p.m22047a(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: r */
    public static final AbstractC4698p<Long> f50991r = AbstractC4698p.m22047a(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: s */
    public static final AbstractC4698p<Long> f50992s = AbstractC4698p.m22047a(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: t */
    @Nullable
    private static C5193hn f50993t;

    /* renamed from: a */
    private final AbstractC4700q<Integer, Long> f50994a;

    /* renamed from: b */
    private final InterfaceC5793tc.a.C7018a f50995b;

    /* renamed from: c */
    private final e21 f50996c;

    /* renamed from: d */
    private final InterfaceC4972di f50997d;

    /* renamed from: e */
    private final boolean f50998e;

    /* renamed from: f */
    private int f50999f;

    /* renamed from: g */
    private long f51000g;

    /* renamed from: h */
    private long f51001h;

    /* renamed from: i */
    private int f51002i;

    /* renamed from: j */
    private long f51003j;

    /* renamed from: k */
    private long f51004k;

    /* renamed from: l */
    private long f51005l;

    /* renamed from: m */
    private long f51006m;

    /* renamed from: com.yandex.mobile.ads.impl.hn$a */
    public static final class a {

        /* renamed from: a */
        @Nullable
        private final Context f51007a;

        /* renamed from: b */
        private HashMap f51008b;

        /* renamed from: c */
        private int f51009c;

        /* renamed from: d */
        private f51 f51010d;

        /* renamed from: e */
        private boolean f51011e;

        public a(Context context) {
            this.f51007a = context == null ? null : context.getApplicationContext();
            this.f51008b = m25262a(s91.m28122b(context));
            this.f51009c = 2000;
            this.f51010d = InterfaceC4972di.f49652a;
            this.f51011e = true;
        }

        /* renamed from: a */
        public final C5193hn m25263a() {
            return new C5193hn(this.f51007a, this.f51008b, this.f51009c, this.f51010d, this.f51011e, 0);
        }

        /* renamed from: a */
        private static HashMap m25262a(String str) {
            int[] m25254b = C5193hn.m25254b(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            AbstractC4698p<Long> abstractC4698p = C5193hn.f50987n;
            hashMap.put(2, abstractC4698p.get(m25254b[0]));
            hashMap.put(3, C5193hn.f50988o.get(m25254b[1]));
            hashMap.put(4, C5193hn.f50989p.get(m25254b[2]));
            hashMap.put(5, C5193hn.f50990q.get(m25254b[3]));
            hashMap.put(10, C5193hn.f50991r.get(m25254b[4]));
            hashMap.put(9, C5193hn.f50992s.get(m25254b[5]));
            hashMap.put(7, abstractC4698p.get(m25254b[0]));
            return hashMap;
        }
    }

    public /* synthetic */ C5193hn(Context context, HashMap hashMap, int i2, f51 f51Var, boolean z, int i3) {
        this(context, hashMap, i2, f51Var, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m25253b(int i2) {
        int i3 = this.f51002i;
        if (i3 == 0 || this.f50998e) {
            if (i3 == i2) {
                return;
            }
            this.f51002i = i2;
            if (i2 != 1 && i2 != 0 && i2 != 8) {
                this.f51005l = m25249a(i2);
                long mo23887c = this.f50997d.mo23887c();
                int i4 = this.f50999f > 0 ? (int) (mo23887c - this.f51000g) : 0;
                long j2 = this.f51001h;
                long j3 = this.f51005l;
                if (i4 != 0 || j2 != 0 || j3 != this.f51006m) {
                    this.f51006m = j3;
                    this.f50995b.m28586a(i4, j2, j3);
                }
                this.f51000g = mo23887c;
                this.f51001h = 0L;
                this.f51004k = 0L;
                this.f51003j = 0L;
                this.f50996c.m23997b();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5793tc
    /* renamed from: a */
    public final C5193hn mo25255a() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.v71
    /* renamed from: b */
    public final void mo25260b() {
    }

    private C5193hn(@Nullable Context context, HashMap hashMap, int i2, f51 f51Var, boolean z) {
        this.f50994a = AbstractC4700q.m22062a(hashMap);
        this.f50995b = new InterfaceC5793tc.a.C7018a();
        this.f50996c = new e21(i2);
        this.f50997d = f51Var;
        this.f50998e = z;
        if (context == null) {
            this.f51002i = 0;
            this.f51005l = m25249a(0);
            return;
        }
        rm0 m27952b = rm0.m27952b(context);
        int m27953a = m27952b.m27953a();
        this.f51002i = m27953a;
        this.f51005l = m25249a(m27953a);
        m27952b.m27954b(new rm0.InterfaceC5698b() { // from class: com.yandex.mobile.ads.impl.to1
            @Override // com.yandex.mobile.ads.impl.rm0.InterfaceC5698b
            /* renamed from: a */
            public final void mo27956a(int i3) {
                C5193hn.this.m25253b(i3);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5793tc
    /* renamed from: a */
    public final void mo25256a(Handler handler, InterfaceC5569p8 interfaceC5569p8) {
        Objects.requireNonNull(interfaceC5569p8);
        this.f50995b.m28587a(handler, interfaceC5569p8);
    }

    /* renamed from: a */
    public static synchronized C5193hn m25250a(Context context) {
        C5193hn c5193hn;
        synchronized (C5193hn.class) {
            if (f50993t == null) {
                f50993t = new a(context).m25263a();
            }
            c5193hn = f50993t;
        }
        return c5193hn;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5793tc
    /* renamed from: a */
    public final void mo25259a(InterfaceC5569p8 interfaceC5569p8) {
        this.f50995b.m28588a(interfaceC5569p8);
    }

    /* renamed from: a */
    private long m25249a(int i2) {
        Long l2 = this.f50994a.get(Integer.valueOf(i2));
        if (l2 == null) {
            l2 = this.f50994a.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014 A[Catch: all -> 0x000d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:12:0x0014), top: B:4:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012 A[DONT_GENERATE] */
    @Override // com.yandex.mobile.ads.impl.v71
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo25258a(com.yandex.mobile.ads.impl.C5192hm r3, boolean r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto Lf
            r4 = 8
            boolean r3 = r3.m25236a(r4)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto Lf
            r3 = 1
            goto L10
        Ld:
            r3 = move-exception
            goto L1c
        Lf:
            r3 = 0
        L10:
            if (r3 != 0) goto L14
            monitor-exit(r2)
            return
        L14:
            long r3 = r2.f51001h     // Catch: java.lang.Throwable -> Ld
            long r0 = (long) r5     // Catch: java.lang.Throwable -> Ld
            long r3 = r3 + r0
            r2.f51001h = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5193hn.mo25258a(com.yandex.mobile.ads.impl.hm, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0017 A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0007, B:13:0x0017, B:16:0x001c, B:18:0x0039, B:20:0x0053, B:22:0x0065, B:26:0x0071, B:29:0x007f, B:30:0x0078, B:31:0x005c, B:32:0x0083), top: B:5:0x0007 }] */
    @Override // com.yandex.mobile.ads.impl.v71
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo25257a(com.yandex.mobile.ads.impl.C5192hm r13, boolean r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = 1
            if (r14 == 0) goto L12
            r14 = 8
            boolean r13 = r13.m25236a(r14)     // Catch: java.lang.Throwable -> Lf
            if (r13 != 0) goto L12
            r13 = 1
            goto L13
        Lf:
            r13 = move-exception
            goto L8a
        L12:
            r13 = 0
        L13:
            if (r13 != 0) goto L17
            monitor-exit(r12)
            return
        L17:
            int r13 = r12.f50999f     // Catch: java.lang.Throwable -> Lf
            if (r13 <= 0) goto L1c
            r0 = 1
        L1c:
            com.yandex.mobile.ads.impl.C5220ia.m25476b(r0)     // Catch: java.lang.Throwable -> Lf
            com.yandex.mobile.ads.impl.di r13 = r12.f50997d     // Catch: java.lang.Throwable -> Lf
            long r13 = r13.mo23887c()     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.f51000g     // Catch: java.lang.Throwable -> Lf
            long r2 = r13 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.f51003j     // Catch: java.lang.Throwable -> Lf
            long r6 = (long) r5     // Catch: java.lang.Throwable -> Lf
            long r2 = r2 + r6
            r12.f51003j = r2     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.f51004k     // Catch: java.lang.Throwable -> Lf
            long r6 = r12.f51001h     // Catch: java.lang.Throwable -> Lf
            long r2 = r2 + r6
            r12.f51004k = r2     // Catch: java.lang.Throwable -> Lf
            if (r5 <= 0) goto L83
            float r0 = (float) r6     // Catch: java.lang.Throwable -> Lf
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> Lf
            float r0 = r0 / r2
            com.yandex.mobile.ads.impl.e21 r2 = r12.f50996c     // Catch: java.lang.Throwable -> Lf
            double r3 = (double) r6     // Catch: java.lang.Throwable -> Lf
            double r3 = java.lang.Math.sqrt(r3)     // Catch: java.lang.Throwable -> Lf
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Lf
            r2.m23996a(r3, r0)     // Catch: java.lang.Throwable -> Lf
            long r2 = r12.f51003j     // Catch: java.lang.Throwable -> Lf
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L5c
            long r2 = r12.f51004k     // Catch: java.lang.Throwable -> Lf
            r6 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L65
        L5c:
            com.yandex.mobile.ads.impl.e21 r0 = r12.f50996c     // Catch: java.lang.Throwable -> Lf
            float r0 = r0.m23995a()     // Catch: java.lang.Throwable -> Lf
            long r2 = (long) r0     // Catch: java.lang.Throwable -> Lf
            r12.f51005l = r2     // Catch: java.lang.Throwable -> Lf
        L65:
            long r6 = r12.f51001h     // Catch: java.lang.Throwable -> Lf
            long r8 = r12.f51005l     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r5 != 0) goto L78
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L78
            long r10 = r12.f51006m     // Catch: java.lang.Throwable -> Lf
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L78
            goto L7f
        L78:
            r12.f51006m = r8     // Catch: java.lang.Throwable -> Lf
            com.yandex.mobile.ads.impl.tc$a$a r4 = r12.f50995b     // Catch: java.lang.Throwable -> Lf
            r4.m28586a(r5, r6, r8)     // Catch: java.lang.Throwable -> Lf
        L7f:
            r12.f51000g = r13     // Catch: java.lang.Throwable -> Lf
            r12.f51001h = r2     // Catch: java.lang.Throwable -> Lf
        L83:
            int r13 = r12.f50999f     // Catch: java.lang.Throwable -> Lf
            int r13 = r13 - r1
            r12.f50999f = r13     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r12)
            return
        L8a:
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5193hn.mo25257a(com.yandex.mobile.ads.impl.hm, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0015 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0006, B:13:0x0015, B:15:0x0019, B:16:0x0021), top: B:5:0x0006 }] */
    @Override // com.yandex.mobile.ads.impl.v71
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo25261b(com.yandex.mobile.ads.impl.C5192hm r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r3 == 0) goto L10
            r3 = 8
            boolean r2 = r2.m25236a(r3)     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L10
            r2 = 1
            goto L11
        Le:
            r2 = move-exception
            goto L28
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L15
            monitor-exit(r1)
            return
        L15:
            int r2 = r1.f50999f     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L21
            com.yandex.mobile.ads.impl.di r2 = r1.f50997d     // Catch: java.lang.Throwable -> Le
            long r2 = r2.mo23887c()     // Catch: java.lang.Throwable -> Le
            r1.f51000g = r2     // Catch: java.lang.Throwable -> Le
        L21:
            int r2 = r1.f50999f     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r0
            r1.f50999f = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L28:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5193hn.mo25261b(com.yandex.mobile.ads.impl.hm, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: b */
    public static int[] m25254b(String str) {
        Objects.requireNonNull(str);
        char c2 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c2 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c2 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c2 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c2 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c2 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c2 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c2 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c2 = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c2 = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c2 = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c2 = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c2 = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c2 = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c2 = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c2 = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c2 = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c2 = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c2 = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c2 = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c2 = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c2 = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c2 = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c2 = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c2 = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c2 = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c2 = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c2 = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c2 = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c2 = JsonFactory.DEFAULT_QUOTE_CHAR;
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c2 = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c2 = '$';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c2 = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c2 = '&';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c2 = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c2 = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c2 = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c2 = '*';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c2 = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c2 = ',';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c2 = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c2 = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c2 = JsonPointer.SEPARATOR;
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c2 = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c2 = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c2 = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c2 = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c2 = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c2 = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c2 = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c2 = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c2 = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c2 = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c2 = ':';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c2 = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c2 = '<';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c2 = '=';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c2 = '>';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c2 = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c2 = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c2 = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c2 = 'B';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c2 = 'C';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c2 = 'D';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c2 = 'E';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c2 = 'F';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c2 = 'G';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c2 = 'H';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c2 = 'I';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c2 = 'J';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c2 = 'K';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c2 = 'L';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c2 = 'M';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c2 = 'N';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c2 = 'O';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c2 = 'P';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c2 = 'Q';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c2 = 'R';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c2 = 'S';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c2 = 'T';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c2 = 'U';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c2 = 'V';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c2 = 'W';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c2 = 'X';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c2 = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c2 = 'Z';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c2 = '[';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c2 = '\\';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c2 = ']';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c2 = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c2 = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c2 = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c2 = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c2 = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c2 = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c2 = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c2 = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c2 = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c2 = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c2 = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c2 = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c2 = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c2 = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c2 = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c2 = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c2 = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c2 = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c2 = 'p';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c2 = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c2 = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c2 = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c2 = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c2 = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c2 = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c2 = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c2 = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c2 = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c2 = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c2 = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c2 = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c2 = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c2 = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c2 = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c2 = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c2 = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c2 = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c2 = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c2 = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c2 = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c2 = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c2 = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c2 = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c2 = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c2 = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c2 = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c2 = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c2 = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c2 = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c2 = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c2 = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c2 = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c2 = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c2 = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c2 = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c2 = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c2 = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c2 = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c2 = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c2 = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c2 = 154;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c2 = 155;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c2 = 156;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c2 = 157;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c2 = 158;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c2 = 159;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c2 = 160;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c2 = 161;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c2 = 162;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c2 = 163;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c2 = 164;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c2 = 165;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c2 = 166;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c2 = 167;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c2 = 168;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c2 = 169;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c2 = 170;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c2 = 171;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c2 = 172;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c2 = 173;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c2 = 174;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c2 = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c2 = 176;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c2 = 177;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c2 = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c2 = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c2 = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c2 = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c2 = 182;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c2 = 183;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c2 = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c2 = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c2 = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c2 = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c2 = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c2 = 189;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c2 = 190;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c2 = 191;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c2 = 192;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c2 = 193;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c2 = 194;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c2 = 195;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c2 = 196;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c2 = 197;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c2 = 198;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c2 = 199;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c2 = 200;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c2 = 201;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c2 = 202;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c2 = 203;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c2 = 204;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c2 = 205;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c2 = 206;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c2 = 207;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c2 = 208;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c2 = 209;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c2 = 210;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c2 = 211;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c2 = 212;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c2 = 213;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c2 = 214;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c2 = 215;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c2 = 216;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c2 = 217;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c2 = 218;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c2 = 219;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c2 = 220;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c2 = 221;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c2 = 222;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c2 = 223;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c2 = 224;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c2 = 225;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c2 = 226;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c2 = 227;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c2 = 228;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c2 = 229;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c2 = 230;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c2 = 231;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c2 = 232;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c2 = 233;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c2 = 234;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c2 = 235;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c2 = 236;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 26:
            case 29:
            case C4632R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case C4632R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
            case C4632R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
            case C4632R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
            case 223:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case C4632R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 3:
                return new int[]{2, 4, 1, 2, 2, 2};
            case 4:
                return new int[]{0, 2, 0, 3, 2, 2};
            case 5:
            case 231:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 3, 2, 2, 2};
            case '\b':
            case C4632R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
            case C4632R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
            case 210:
            case 220:
                return new int[]{2, 1, 1, 1, 2, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case '\f':
                return new int[]{0, 1, 1, 1, 2, 0};
            case '\r':
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case C4632R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
            case 144:
            case 171:
            case 192:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case C4632R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case 128:
            case 169:
            case 194:
            case 211:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
            case 'E':
            case C4632R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 145:
            case 190:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 1, 3, 4, 2};
            case 23:
            case '[':
            case C4632R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
            case 134:
            case 154:
            case 185:
            case DatastoreTestTrace.FirestoreV1Action.MATCHING_DOCUMENTS_FIELD_NUMBER /* 203 */:
            case 224:
            case 232:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 25:
            case '2':
            case 222:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 30:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 31:
                return new int[]{3, 1, 3, 2, 2, 2};
            case ' ':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '!':
                return new int[]{0, 1, 2, 3, 2, 2};
            case '\"':
                return new int[]{2, 4, 2, 1, 2, 2};
            case '#':
                return new int[]{0, 2, 2, 2, 3, 2};
            case '$':
                return new int[]{4, 2, 3, 2, 2, 2};
            case '%':
            case C4632R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                return new int[]{4, 2, 4, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case C4632R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case C4632R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                return new int[]{3, 4, 3, 3, 2, 2};
            case '\'':
                return new int[]{0, 0, 0, 1, 0, 2};
            case '(':
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ')':
            case 166:
                return new int[]{2, 2, 2, 1, 2, 2};
            case '*':
            case C4632R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                return new int[]{1, 2, 2, 2, 3, 2};
            case '+':
                return new int[]{3, 3, 3, 3, 2, 2};
            case ',':
                return new int[]{2, 0, 1, 1, 3, 2};
            case '-':
                return new int[]{2, 3, 4, 3, 2, 2};
            case '.':
                return new int[]{2, 3, 4, 4, 2, 2};
            case '/':
            case '6':
            case DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER /* 200 */:
            case 206:
            case 208:
                return new int[]{4, 3, 4, 4, 2, 2};
            case '0':
                return new int[]{2, 1, 0, 0, 2, 2};
            case '3':
            case C4632R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                return new int[]{1, 0, 0, 0, 0, 2};
            case '4':
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case '5':
                return new int[]{0, 1, 2, 2, 2, 3};
            case '7':
                return new int[]{0, 0, 3, 2, 0, 2};
            case '9':
                return new int[]{3, 4, 4, 4, 4, 2};
            case C4632R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                return new int[]{2, 3, 2, 1, 2, 2};
            case C4632R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case 'e':
            case 127:
            case 174:
            case 186:
            case 215:
                return new int[]{0, 0, 0, 0, 0, 2};
            case C4632R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case C4632R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                return new int[]{0, 1, 1, 1, 2, 2};
            case '@':
                return new int[]{4, 3, 3, 1, 2, 2};
            case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                return new int[]{0, 0, 0, 3, 0, 2};
            case C4632R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                return new int[]{3, 1, 2, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case C4632R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
            case C4632R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                return new int[]{3, 2, 2, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                return new int[]{4, 2, 4, 1, 2, 2};
            case C4632R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                return new int[]{1, 2, 3, 1, 0, 2};
            case C4632R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case 204:
                return new int[]{3, 4, 1, 0, 2, 2};
            case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                return new int[]{0, 0, 1, 1, 1, 1};
            case C4632R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                return new int[]{1, 1, 1, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case 226:
                return new int[]{0, 2, 0, 1, 2, 2};
            case C4632R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case 152:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                return new int[]{4, 3, 4, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                return new int[]{4, 2, 1, 4, 2, 2};
            case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case 'Z':
            case 189:
                return new int[]{1, 0, 0, 0, 1, 2};
            case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                return new int[]{2, 3, 2, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_panelBackground /* 86 */:
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case C4632R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                return new int[]{3, 2, 2, 1, 2, 2};
            case C4632R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                return new int[]{0, 1, 2, 3, 2, 0};
            case '\\':
                return new int[]{0, 0, 0, 1, 3, 2};
            case ']':
                return new int[]{3, 1, 2, 2, 3, 2};
            case C4632R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case 217:
                return new int[]{0, 2, 1, 1, 2, 2};
            case C4632R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                return new int[]{1, 1, 3, 2, 3, 3};
            case C4632R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case 135:
            case 214:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case C4632R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'd':
                return new int[]{3, 0, 1, 1, 4, 1};
            case C4632R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                return new int[]{0, 0, 0, 1, 1, 2};
            case C4632R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                return new int[]{2, 4, 3, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                return new int[]{2, 1, 1, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                return new int[]{0, 1, 1, 2, 2, 4};
            case C4632R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                return new int[]{2, 1, 4, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                return new int[]{0, 1, 1, 3, 4, 4};
            case C4632R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                return new int[]{2, 1, 2, 2, 2, 2};
            case C4632R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                return new int[]{1, 2, 1, 3, 2, 2};
            case C4632R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                return new int[]{3, 3, 2, 4, 2, 2};
            case C4632R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                return new int[]{3, 1, 3, 3, 4, 2};
            case C4632R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return new int[]{3, 3, 2, 2, 2, 2};
            case '}':
                return new int[]{0, 0, 0, 0, 2, 2};
            case '~':
                return new int[]{1, 0, 3, 2, 1, 4};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 130:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 131:
            case 179:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 2, 2};
            case 133:
            case 177:
                return new int[]{1, 2, 1, 2, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 137:
            case 167:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 138:
                return new int[]{2, 4, 2, 3, 2, 2};
            case 139:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 140:
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 143:
            case 236:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 146:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 147:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 148:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 149:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 150:
                return new int[]{1, 0, 3, 1, 3, 2};
            case 151:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 153:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 155:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 156:
            case 164:
            case 198:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 157:
                return new int[]{0, 2, 2, 3, 0, 3};
            case 159:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 160:
            case 161:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 162:
            case 170:
                return new int[]{1, 1, 2, 2, 4, 2};
            case 163:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 168:
                return new int[]{2, 1, 3, 3, 3, 0};
            case 172:
                return new int[]{2, 0, 2, 1, 2, 1};
            case 173:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 176:
                return new int[]{2, 4, 4, 4, 4, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 4, 3};
            case 181:
                return new int[]{3, 4, 2, 0, 2, 2};
            case 182:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 183:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 184:
            case 209:
                return new int[]{4, 2, 1, 1, 2, 2};
            case 187:
                return new int[]{1, 1, 2, 2, 2, 1};
            case 191:
            case 218:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 193:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 195:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 196:
                return new int[]{4, 3, 2, 3, 2, 2};
            case 197:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 199:
            case DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER /* 202 */:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 201:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 205:
                return new int[]{0, 2, 2, 3, 3, 4};
            case 207:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 212:
                return new int[]{1, 1, 0, 0, 2, 2};
            case 213:
                return new int[]{1, 4, 1, 3, 2, 2};
            case 216:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 219:
                return new int[]{1, 0, 2, 2, 3, 1};
            case 221:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 225:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 227:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 230:
                return new int[]{3, 1, 3, 1, 2, 2};
            case 234:
                return new int[]{3, 2, 2, 1, 1, 2};
            case 235:
                return new int[]{3, 3, 4, 2, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }
}
