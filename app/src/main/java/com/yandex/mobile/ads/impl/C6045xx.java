package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.g81;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.xx */
/* loaded from: classes3.dex */
public final class C6045xx implements InterfaceC4936cr {

    /* renamed from: q */
    private static final double[] f56581q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    private String f56582a;

    /* renamed from: b */
    private y61 f56583b;

    /* renamed from: c */
    @Nullable
    private final r91 f56584c;

    /* renamed from: d */
    @Nullable
    private final ap0 f56585d;

    /* renamed from: e */
    @Nullable
    private final bh0 f56586e;

    /* renamed from: f */
    private final boolean[] f56587f = new boolean[4];

    /* renamed from: g */
    private final a f56588g = new a();

    /* renamed from: h */
    private long f56589h;

    /* renamed from: i */
    private boolean f56590i;

    /* renamed from: j */
    private boolean f56591j;

    /* renamed from: k */
    private long f56592k;

    /* renamed from: l */
    private long f56593l;

    /* renamed from: m */
    private long f56594m;

    /* renamed from: n */
    private long f56595n;

    /* renamed from: o */
    private boolean f56596o;

    /* renamed from: p */
    private boolean f56597p;

    public C6045xx(@Nullable r91 r91Var) {
        this.f56584c = r91Var;
        if (r91Var != null) {
            this.f56586e = new bh0(178);
            this.f56585d = new ap0();
        } else {
            this.f56586e = null;
            this.f56585d = null;
        }
        this.f56593l = -9223372036854775807L;
        this.f56595n = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22652a() {
        ch0.m23263a(this.f56587f);
        this.f56588g.m29815a();
        bh0 bh0Var = this.f56586e;
        if (bh0Var != null) {
            bh0Var.m22831b();
        }
        this.f56589h = 0L;
        this.f56590i = false;
        this.f56593l = -9223372036854775807L;
        this.f56595n = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: b */
    public final void mo22656b() {
    }

    /* renamed from: com.yandex.mobile.ads.impl.xx$a */
    public static final class a {

        /* renamed from: e */
        private static final byte[] f56598e = {0, 0, 1};

        /* renamed from: a */
        private boolean f56599a;

        /* renamed from: b */
        public int f56600b;

        /* renamed from: c */
        public int f56601c;

        /* renamed from: d */
        public byte[] f56602d = new byte[128];

        /* renamed from: a */
        public final void m29815a() {
            this.f56599a = false;
            this.f56600b = 0;
            this.f56601c = 0;
        }

        /* renamed from: a */
        public final boolean m29817a(int i2, int i3) {
            if (this.f56599a) {
                int i4 = this.f56600b - i3;
                this.f56600b = i4;
                if (this.f56601c == 0 && i2 == 181) {
                    this.f56601c = i4;
                } else {
                    this.f56599a = false;
                    return true;
                }
            } else if (i2 == 179) {
                this.f56599a = true;
            }
            m29816a(f56598e, 0, 3);
            return false;
        }

        /* renamed from: a */
        public final void m29816a(byte[] bArr, int i2, int i3) {
            if (this.f56599a) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f56602d;
                int length = bArr2.length;
                int i5 = this.f56600b + i4;
                if (length < i5) {
                    this.f56602d = Arrays.copyOf(bArr2, i5 * 2);
                }
                System.arraycopy(bArr, i2, this.f56602d, this.f56600b, i4);
                this.f56600b += i4;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22655a(InterfaceC5509nt interfaceC5509nt, g81.C5112d c5112d) {
        c5112d.m24821a();
        this.f56582a = c5112d.m24822b();
        this.f56583b = interfaceC5509nt.mo23022a(c5112d.m24823c(), 2);
        r91 r91Var = this.f56584c;
        if (r91Var != null) {
            r91Var.m27883a(interfaceC5509nt, c5112d);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    public final void mo22653a(int i2, long j2) {
        this.f56593l = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cd  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4936cr
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo22654a(com.yandex.mobile.ads.impl.ap0 r20) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C6045xx.mo22654a(com.yandex.mobile.ads.impl.ap0):void");
    }
}
