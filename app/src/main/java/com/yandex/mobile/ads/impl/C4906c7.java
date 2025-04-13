package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.g81;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.c7 */
/* loaded from: classes3.dex */
public final class C4906c7 implements InterfaceC4936cr {

    /* renamed from: v */
    private static final byte[] f49097v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f49098a;

    /* renamed from: b */
    private final zo0 f49099b;

    /* renamed from: c */
    private final ap0 f49100c;

    /* renamed from: d */
    @Nullable
    private final String f49101d;

    /* renamed from: e */
    private String f49102e;

    /* renamed from: f */
    private y61 f49103f;

    /* renamed from: g */
    private y61 f49104g;

    /* renamed from: h */
    private int f49105h;

    /* renamed from: i */
    private int f49106i;

    /* renamed from: j */
    private int f49107j;

    /* renamed from: k */
    private boolean f49108k;

    /* renamed from: l */
    private boolean f49109l;

    /* renamed from: m */
    private int f49110m;

    /* renamed from: n */
    private int f49111n;

    /* renamed from: o */
    private int f49112o;

    /* renamed from: p */
    private boolean f49113p;

    /* renamed from: q */
    private long f49114q;

    /* renamed from: r */
    private int f49115r;

    /* renamed from: s */
    private long f49116s;

    /* renamed from: t */
    private y61 f49117t;

    /* renamed from: u */
    private long f49118u;

    public C4906c7() {
        this(null, true);
    }

    /* renamed from: a */
    private static boolean m23032a(byte b) {
        return (((b & 255) | 65280) & 65526) == 65520;
    }

    /* renamed from: d */
    private void m23033d() {
        this.f49105h = 0;
        this.f49106i = 0;
        this.f49107j = 256;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        this.f49116s = -9223372036854775807L;
        this.f49109l = false;
        m23033d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
    }

    /* renamed from: c */
    public final long m23034c() {
        return this.f49114q;
    }

    public C4906c7(@Nullable String str, boolean z) {
        this.f49099b = new zo0(new byte[7]);
        this.f49100c = new ap0(Arrays.copyOf(f49097v, 10));
        m23033d();
        this.f49110m = -1;
        this.f49111n = -1;
        this.f49114q = -9223372036854775807L;
        this.f49116s = -9223372036854775807L;
        this.f49098a = z;
        this.f49101d = str;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        c5112d.m24821a();
        this.f49102e = c5112d.m24822b();
        y61 mo23022a = interfaceC5509nt.mo23022a(c5112d.m24823c(), 1);
        this.f49103f = mo23022a;
        this.f49117t = mo23022a;
        if (this.f49098a) {
            c5112d.m24821a();
            y61 mo23022a2 = interfaceC5509nt.mo23022a(c5112d.m24823c(), 5);
            this.f49104g = mo23022a2;
            mo23022a2.mo28347a(new C5606pv.a().m27555c(c5112d.m24822b()).m27561f("application/id3").m27550a());
            return;
        }
        this.f49104g = new C5757sq();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        if (j2 != -9223372036854775807L) {
            this.f49116s = j2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x02cc, code lost:
    
        r16.f49112o = (r11 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02d4, code lost:
    
        if ((r11 & 1) != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02d6, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02d9, code lost:
    
        r16.f49108k = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02dd, code lost:
    
        if (r16.f49109l != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02df, code lost:
    
        r16.f49105h = 1;
        r16.f49106i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02e9, code lost:
    
        r17.m22591e(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02e4, code lost:
    
        r16.f49105h = 3;
        r16.f49106i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d8, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02cc A[EDGE_INSN: B:45:0x02cc->B:46:0x02cc BREAK  A[LOOP:1: B:8:0x01ed->B:34:0x0331], SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo22654a(com.yandex.mobile.ads.impl.ap0 r17) throws com.yandex.mobile.ads.impl.ep0 {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4906c7.mo22654a(com.yandex.mobile.ads.impl.ap0):void");
    }
}
