package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import com.yandex.mobile.ads.impl.e01;
import com.yandex.mobile.ads.impl.y61;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.KotlinVersion;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class aa0 implements InterfaceC5412lt {

    /* renamed from: c0 */
    private static final byte[] f48338c0;

    /* renamed from: d0 */
    private static final byte[] f48339d0;

    /* renamed from: e0 */
    private static final byte[] f48340e0;

    /* renamed from: f0 */
    private static final byte[] f48341f0;

    /* renamed from: g0 */
    private static final UUID f48342g0;

    /* renamed from: h0 */
    private static final Map<String, Integer> f48343h0;

    /* renamed from: A */
    private long f48344A;

    /* renamed from: B */
    private long f48345B;

    /* renamed from: C */
    @Nullable
    private e90 f48346C;

    /* renamed from: D */
    @Nullable
    private e90 f48347D;

    /* renamed from: E */
    private boolean f48348E;

    /* renamed from: F */
    private boolean f48349F;

    /* renamed from: G */
    private int f48350G;

    /* renamed from: H */
    private long f48351H;

    /* renamed from: I */
    private long f48352I;

    /* renamed from: J */
    private int f48353J;

    /* renamed from: K */
    private int f48354K;

    /* renamed from: L */
    private int[] f48355L;

    /* renamed from: M */
    private int f48356M;

    /* renamed from: N */
    private int f48357N;

    /* renamed from: O */
    private int f48358O;

    /* renamed from: P */
    private int f48359P;

    /* renamed from: Q */
    private boolean f48360Q;

    /* renamed from: R */
    private long f48361R;

    /* renamed from: S */
    private int f48362S;

    /* renamed from: T */
    private int f48363T;

    /* renamed from: U */
    private int f48364U;

    /* renamed from: V */
    private boolean f48365V;

    /* renamed from: W */
    private boolean f48366W;

    /* renamed from: X */
    private boolean f48367X;

    /* renamed from: Y */
    private int f48368Y;

    /* renamed from: Z */
    private byte f48369Z;

    /* renamed from: a */
    private final InterfaceC4882br f48370a;

    /* renamed from: a0 */
    private boolean f48371a0;

    /* renamed from: b */
    private final ba1 f48372b;

    /* renamed from: b0 */
    private InterfaceC5509nt f48373b0;

    /* renamed from: c */
    private final SparseArray<C4800b> f48374c;

    /* renamed from: d */
    private final boolean f48375d;

    /* renamed from: e */
    private final ap0 f48376e;

    /* renamed from: f */
    private final ap0 f48377f;

    /* renamed from: g */
    private final ap0 f48378g;

    /* renamed from: h */
    private final ap0 f48379h;

    /* renamed from: i */
    private final ap0 f48380i;

    /* renamed from: j */
    private final ap0 f48381j;

    /* renamed from: k */
    private final ap0 f48382k;

    /* renamed from: l */
    private final ap0 f48383l;

    /* renamed from: m */
    private final ap0 f48384m;

    /* renamed from: n */
    private final ap0 f48385n;

    /* renamed from: o */
    private ByteBuffer f48386o;

    /* renamed from: p */
    private long f48387p;

    /* renamed from: q */
    private long f48388q;

    /* renamed from: r */
    private long f48389r;

    /* renamed from: s */
    private long f48390s;

    /* renamed from: t */
    private long f48391t;

    /* renamed from: u */
    @Nullable
    private C4800b f48392u;

    /* renamed from: v */
    private boolean f48393v;

    /* renamed from: w */
    private int f48394w;

    /* renamed from: x */
    private long f48395x;

    /* renamed from: y */
    private boolean f48396y;

    /* renamed from: z */
    private long f48397z;

    /* renamed from: com.yandex.mobile.ads.impl.aa0$a */
    public final class C4799a implements InterfaceC4821ar {
        private C4799a() {
        }

        /* renamed from: a */
        public final boolean m22434a(int i2) {
            Objects.requireNonNull(aa0.this);
            return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
        }

        public /* synthetic */ C4799a(aa0 aa0Var, int i2) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.aa0$b */
    public static final class C4800b {

        /* renamed from: N */
        public byte[] f48412N;

        /* renamed from: T */
        public z71 f48418T;

        /* renamed from: U */
        public boolean f48419U;

        /* renamed from: X */
        public y61 f48422X;

        /* renamed from: Y */
        public int f48423Y;

        /* renamed from: a */
        public String f48424a;

        /* renamed from: b */
        public String f48425b;

        /* renamed from: c */
        public int f48426c;

        /* renamed from: d */
        public int f48427d;

        /* renamed from: e */
        public int f48428e;

        /* renamed from: f */
        public int f48429f;

        /* renamed from: g */
        private int f48430g;

        /* renamed from: h */
        public boolean f48431h;

        /* renamed from: i */
        public byte[] f48432i;

        /* renamed from: j */
        public y61.C6060a f48433j;

        /* renamed from: k */
        public byte[] f48434k;

        /* renamed from: l */
        public DrmInitData f48435l;

        /* renamed from: m */
        public int f48436m = -1;

        /* renamed from: n */
        public int f48437n = -1;

        /* renamed from: o */
        public int f48438o = -1;

        /* renamed from: p */
        public int f48439p = -1;

        /* renamed from: q */
        public int f48440q = 0;

        /* renamed from: r */
        public int f48441r = -1;

        /* renamed from: s */
        public float f48442s = 0.0f;

        /* renamed from: t */
        public float f48443t = 0.0f;

        /* renamed from: u */
        public float f48444u = 0.0f;

        /* renamed from: v */
        public byte[] f48445v = null;

        /* renamed from: w */
        public int f48446w = -1;

        /* renamed from: x */
        public boolean f48447x = false;

        /* renamed from: y */
        public int f48448y = -1;

        /* renamed from: z */
        public int f48449z = -1;

        /* renamed from: A */
        public int f48399A = -1;

        /* renamed from: B */
        public int f48400B = 1000;

        /* renamed from: C */
        public int f48401C = DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER;

        /* renamed from: D */
        public float f48402D = -1.0f;

        /* renamed from: E */
        public float f48403E = -1.0f;

        /* renamed from: F */
        public float f48404F = -1.0f;

        /* renamed from: G */
        public float f48405G = -1.0f;

        /* renamed from: H */
        public float f48406H = -1.0f;

        /* renamed from: I */
        public float f48407I = -1.0f;

        /* renamed from: J */
        public float f48408J = -1.0f;

        /* renamed from: K */
        public float f48409K = -1.0f;

        /* renamed from: L */
        public float f48410L = -1.0f;

        /* renamed from: M */
        public float f48411M = -1.0f;

        /* renamed from: O */
        public int f48413O = 1;

        /* renamed from: P */
        public int f48414P = -1;

        /* renamed from: Q */
        public int f48415Q = 8000;

        /* renamed from: R */
        public long f48416R = 0;

        /* renamed from: S */
        public long f48417S = 0;

        /* renamed from: V */
        public boolean f48420V = true;

        /* renamed from: W */
        private String f48421W = "eng";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:243:0x04c5, code lost:
        
            if (r1.m22603p() == com.yandex.mobile.ads.impl.aa0.f48342g0.getLeastSignificantBits()) goto L253;
         */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0531  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0519  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x052f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x053e  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x04cc  */
        /* JADX WARN: Removed duplicated region for block: B:236:0x04ed  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0729  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0550  */
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m22441a(com.yandex.mobile.ads.impl.InterfaceC5509nt r21, int r22) throws com.yandex.mobile.ads.impl.ep0 {
            /*
                Method dump skipped, instructions count: 2110
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.aa0.C4800b.m22441a(com.yandex.mobile.ads.impl.nt, int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public boolean m22439a(boolean z) {
            return "A_OPUS".equals(this.f48425b) ? z : this.f48429f > 0;
        }

        @EnsuresNonNull({"codecPrivate"})
        /* renamed from: a */
        private byte[] m22440a(String str) throws ep0 {
            byte[] bArr = this.f48434k;
            if (bArr != null) {
                return bArr;
            }
            throw ep0.m24225a("Missing CodecPrivate for codec " + str, (Exception) null);
        }
    }

    static {
        dn1 dn1Var = dn1.f49696g;
        f48338c0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f48339d0 = s91.m28124b("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f48340e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f48341f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f48342g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        z90.m30076a(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f48343h0 = Collections.unmodifiableMap(hashMap);
    }

    public aa0() {
        this(new C5503nn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static InterfaceC5412lt[] m22421d() {
        return new InterfaceC5412lt[]{new aa0()};
    }

    /* renamed from: e */
    private void m22422e() {
        this.f48362S = 0;
        this.f48363T = 0;
        this.f48364U = 0;
        this.f48365V = false;
        this.f48366W = false;
        this.f48367X = false;
        this.f48368Y = 0;
        this.f48369Z = (byte) 0;
        this.f48371a0 = false;
        this.f48381j.m22586c(0);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    public final void release() {
    }

    public aa0(C5503nn c5503nn) {
        this.f48388q = -1L;
        this.f48389r = -9223372036854775807L;
        this.f48390s = -9223372036854775807L;
        this.f48391t = -9223372036854775807L;
        this.f48397z = -1L;
        this.f48344A = -1L;
        this.f48345B = -9223372036854775807L;
        this.f48370a = c5503nn;
        c5503nn.m26928a(new C4799a(this, 0));
        this.f48375d = true;
        this.f48372b = new ba1();
        this.f48374c = new SparseArray<>();
        this.f48378g = new ap0(4);
        this.f48379h = new ap0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f48380i = new ap0(4);
        this.f48376e = new ap0(ch0.f49243a);
        this.f48377f = new ap0(4);
        this.f48381j = new ap0();
        this.f48382k = new ap0();
        this.f48383l = new ap0(8);
        this.f48384m = new ap0();
        this.f48385n = new ap0();
        this.f48355L = new int[1];
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final boolean mo22432a(InterfaceC5458mt interfaceC5458mt) throws IOException {
        return new q21().m27607b((C5598pn) interfaceC5458mt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ed, code lost:
    
        if (r1.equals("S_DVBSUB") == false) goto L81;
     */
    @androidx.annotation.CallSuper
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22433b(int r20) throws com.yandex.mobile.ads.impl.ep0 {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.aa0.m22433b(int):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    public final void mo22431a(InterfaceC5509nt interfaceC5509nt) {
        this.f48373b0 = interfaceC5509nt;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    @CallSuper
    /* renamed from: a */
    public final void mo22430a(long j2, long j3) {
        this.f48345B = -9223372036854775807L;
        this.f48350G = 0;
        ((C5503nn) this.f48370a).m26927a();
        this.f48372b.m22759b();
        m22422e();
        for (int i2 = 0; i2 < this.f48374c.size(); i2++) {
            z71 z71Var = this.f48374c.valueAt(i2).f48418T;
            if (z71Var != null) {
                z71Var.m30068a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0005 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5412lt
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22424a(com.yandex.mobile.ads.impl.InterfaceC5458mt r9, com.yandex.mobile.ads.impl.qr0 r10) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r8.f48349F = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3f
            boolean r3 = r8.f48349F
            if (r3 != 0) goto L3f
            com.yandex.mobile.ads.impl.br r2 = r8.f48370a
            com.yandex.mobile.ads.impl.nn r2 = (com.yandex.mobile.ads.impl.C5503nn) r2
            r3 = r9
            com.yandex.mobile.ads.impl.pn r3 = (com.yandex.mobile.ads.impl.C5598pn) r3
            boolean r2 = r2.m26929a(r3)
            if (r2 == 0) goto L5
            long r3 = r3.getPosition()
            boolean r5 = r8.f48396y
            if (r5 == 0) goto L2a
            r8.f48344A = r3
            long r3 = r8.f48397z
            r10.f54129a = r3
            r8.f48396y = r0
        L28:
            r3 = 1
            goto L3c
        L2a:
            boolean r3 = r8.f48393v
            if (r3 == 0) goto L3b
            long r3 = r8.f48344A
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L3b
            r10.f54129a = r3
            r8.f48344A = r5
            goto L28
        L3b:
            r3 = 0
        L3c:
            if (r3 == 0) goto L5
            return r1
        L3f:
            if (r2 != 0) goto L66
        L41:
            android.util.SparseArray<com.yandex.mobile.ads.impl.aa0$b> r9 = r8.f48374c
            int r9 = r9.size()
            if (r0 >= r9) goto L64
            android.util.SparseArray<com.yandex.mobile.ads.impl.aa0$b> r9 = r8.f48374c
            java.lang.Object r9 = r9.valueAt(r0)
            com.yandex.mobile.ads.impl.aa0$b r9 = (com.yandex.mobile.ads.impl.aa0.C4800b) r9
            com.yandex.mobile.ads.impl.y61 r10 = r9.f48422X
            java.util.Objects.requireNonNull(r10)
            com.yandex.mobile.ads.impl.z71 r10 = r9.f48418T
            if (r10 == 0) goto L61
            com.yandex.mobile.ads.impl.y61 r1 = r9.f48422X
            com.yandex.mobile.ads.impl.y61$a r9 = r9.f48433j
            r10.m30071a(r1, r9)
        L61:
            int r0 = r0 + 1
            goto L41
        L64:
            r9 = -1
            return r9
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.aa0.mo22424a(com.yandex.mobile.ads.impl.mt, com.yandex.mobile.ads.impl.qr0):int");
    }

    @CallSuper
    /* renamed from: a */
    public final void m22427a(int i2, long j2) throws ep0 {
        e90 e90Var;
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            throw ep0.m24225a("ContentEncodingOrder " + j2 + " not supported", (Exception) null);
        }
        if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            throw ep0.m24225a("ContentEncodingScope " + j2 + " not supported", (Exception) null);
        }
        int i3 = 3;
        int i4 = 2;
        switch (i2) {
            case 131:
                m22413a(i2);
                this.f48392u.f48427d = (int) j2;
                return;
            case 136:
                m22413a(i2);
                this.f48392u.f48420V = j2 == 1;
                return;
            case 155:
                this.f48352I = m22412a(j2);
                return;
            case 159:
                m22413a(i2);
                this.f48392u.f48413O = (int) j2;
                return;
            case 176:
                m22413a(i2);
                this.f48392u.f48436m = (int) j2;
                return;
            case 179:
                e90 e90Var2 = this.f48346C;
                if (e90Var2 != null && this.f48347D != null) {
                    e90Var2.m24047a(m22412a(j2));
                    return;
                }
                throw ep0.m24225a("Element " + i2 + " must be in a Cues", (Exception) null);
            case 186:
                m22413a(i2);
                this.f48392u.f48437n = (int) j2;
                return;
            case 215:
                m22413a(i2);
                this.f48392u.f48426c = (int) j2;
                return;
            case 231:
                this.f48345B = m22412a(j2);
                return;
            case 238:
                this.f48359P = (int) j2;
                return;
            case 241:
                if (this.f48348E) {
                    return;
                }
                if (this.f48346C != null && (e90Var = this.f48347D) != null) {
                    e90Var.m24047a(j2);
                    this.f48348E = true;
                    return;
                } else {
                    throw ep0.m24225a("Element " + i2 + " must be in a Cues", (Exception) null);
                }
            case 251:
                this.f48360Q = true;
                return;
            case 16871:
                m22413a(i2);
                this.f48392u.f48430g = (int) j2;
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                throw ep0.m24225a("ContentCompAlgo " + j2 + " not supported", (Exception) null);
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    throw ep0.m24225a("DocTypeReadVersion " + j2 + " not supported", (Exception) null);
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                throw ep0.m24225a("EBMLReadVersion " + j2 + " not supported", (Exception) null);
            case 18401:
                if (j2 == 5) {
                    return;
                }
                throw ep0.m24225a("ContentEncAlgo " + j2 + " not supported", (Exception) null);
            case 18408:
                if (j2 == 1) {
                    return;
                }
                throw ep0.m24225a("AESSettingsCipherMode " + j2 + " not supported", (Exception) null);
            case 21420:
                this.f48395x = j2 + this.f48388q;
                return;
            case 21432:
                int i5 = (int) j2;
                m22413a(i2);
                if (i5 == 0) {
                    this.f48392u.f48446w = 0;
                    return;
                }
                if (i5 == 1) {
                    this.f48392u.f48446w = 2;
                    return;
                } else if (i5 == 3) {
                    this.f48392u.f48446w = 1;
                    return;
                } else {
                    if (i5 != 15) {
                        return;
                    }
                    this.f48392u.f48446w = 3;
                    return;
                }
            case 21680:
                m22413a(i2);
                this.f48392u.f48438o = (int) j2;
                return;
            case 21682:
                m22413a(i2);
                this.f48392u.f48440q = (int) j2;
                return;
            case 21690:
                m22413a(i2);
                this.f48392u.f48439p = (int) j2;
                return;
            case 21930:
                m22413a(i2);
                this.f48392u.f48419U = j2 == 1;
                return;
            case 21998:
                m22413a(i2);
                this.f48392u.f48429f = (int) j2;
                return;
            case 22186:
                m22413a(i2);
                this.f48392u.f48416R = j2;
                return;
            case 22203:
                m22413a(i2);
                this.f48392u.f48417S = j2;
                return;
            case 25188:
                m22413a(i2);
                this.f48392u.f48414P = (int) j2;
                return;
            case 30114:
                this.f48361R = j2;
                return;
            case 30321:
                m22413a(i2);
                int i6 = (int) j2;
                if (i6 == 0) {
                    this.f48392u.f48441r = 0;
                    return;
                }
                if (i6 == 1) {
                    this.f48392u.f48441r = 1;
                    return;
                } else if (i6 == 2) {
                    this.f48392u.f48441r = 2;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f48392u.f48441r = 3;
                    return;
                }
            case 2352003:
                m22413a(i2);
                this.f48392u.f48428e = (int) j2;
                return;
            case 2807729:
                this.f48389r = j2;
                return;
            default:
                switch (i2) {
                    case 21945:
                        m22413a(i2);
                        int i7 = (int) j2;
                        if (i7 == 1) {
                            this.f48392u.f48399A = 2;
                            return;
                        } else {
                            if (i7 != 2) {
                                return;
                            }
                            this.f48392u.f48399A = 1;
                            return;
                        }
                    case 21946:
                        m22413a(i2);
                        int i8 = (int) j2;
                        InterfaceC5589pf.a<C5130gj> aVar = C5130gj.f50624f;
                        if (i8 != 1) {
                            if (i8 == 16) {
                                i3 = 6;
                            } else if (i8 == 18) {
                                i3 = 7;
                            } else if (i8 != 6 && i8 != 7) {
                                i3 = -1;
                            }
                        }
                        if (i3 != -1) {
                            this.f48392u.f48449z = i3;
                            return;
                        }
                        return;
                    case 21947:
                        m22413a(i2);
                        C4800b c4800b = this.f48392u;
                        c4800b.f48447x = true;
                        int i9 = (int) j2;
                        InterfaceC5589pf.a<C5130gj> aVar2 = C5130gj.f50624f;
                        if (i9 == 1) {
                            i4 = 1;
                        } else if (i9 == 9) {
                            i4 = 6;
                        } else if (i9 != 4 && i9 != 5 && i9 != 6 && i9 != 7) {
                            i4 = -1;
                        }
                        if (i4 != -1) {
                            c4800b.f48448y = i4;
                            return;
                        }
                        return;
                    case 21948:
                        m22413a(i2);
                        this.f48392u.f48400B = (int) j2;
                        return;
                    case 21949:
                        m22413a(i2);
                        this.f48392u.f48401C = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0281, code lost:
    
        throw com.yandex.mobile.ads.impl.ep0.m24225a("EBML lacing sample size out of range.", (java.lang.Exception) null);
     */
    @androidx.annotation.CallSuper
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22426a(int r19, int r20, com.yandex.mobile.ads.impl.C5598pn r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.aa0.m22426a(int, int, com.yandex.mobile.ads.impl.pn):void");
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: a */
    private void m22413a(int i2) throws ep0 {
        if (this.f48392u != null) {
            return;
        }
        throw ep0.m24225a("Element " + i2 + " must be in a TrackEntry", (Exception) null);
    }

    @CallSuper
    /* renamed from: a */
    public final void m22425a(int i2, double d) throws ep0 {
        if (i2 == 181) {
            m22413a(i2);
            this.f48392u.f48415Q = (int) d;
            return;
        }
        if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    m22413a(i2);
                    this.f48392u.f48402D = (float) d;
                    break;
                case 21970:
                    m22413a(i2);
                    this.f48392u.f48403E = (float) d;
                    break;
                case 21971:
                    m22413a(i2);
                    this.f48392u.f48404F = (float) d;
                    break;
                case 21972:
                    m22413a(i2);
                    this.f48392u.f48405G = (float) d;
                    break;
                case 21973:
                    m22413a(i2);
                    this.f48392u.f48406H = (float) d;
                    break;
                case 21974:
                    m22413a(i2);
                    this.f48392u.f48407I = (float) d;
                    break;
                case 21975:
                    m22413a(i2);
                    this.f48392u.f48408J = (float) d;
                    break;
                case 21976:
                    m22413a(i2);
                    this.f48392u.f48409K = (float) d;
                    break;
                case 21977:
                    m22413a(i2);
                    this.f48392u.f48410L = (float) d;
                    break;
                case 21978:
                    m22413a(i2);
                    this.f48392u.f48411M = (float) d;
                    break;
                default:
                    switch (i2) {
                        case 30323:
                            m22413a(i2);
                            this.f48392u.f48442s = (float) d;
                            break;
                        case 30324:
                            m22413a(i2);
                            this.f48392u.f48443t = (float) d;
                            break;
                        case 30325:
                            m22413a(i2);
                            this.f48392u.f48444u = (float) d;
                            break;
                    }
            }
            return;
        }
        this.f48390s = (long) d;
    }

    @CallSuper
    /* renamed from: a */
    public final void m22429a(int i2, String str) throws ep0 {
        if (i2 == 134) {
            m22413a(i2);
            this.f48392u.f48425b = str;
            return;
        }
        if (i2 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw ep0.m24225a("DocType " + str + " not supported", (Exception) null);
        }
        if (i2 == 21358) {
            m22413a(i2);
            this.f48392u.f48424a = str;
        } else {
            if (i2 != 2274716) {
                return;
            }
            m22413a(i2);
            this.f48392u.f48421W = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m22414a(com.yandex.mobile.ads.impl.aa0.C4800b r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.aa0.m22414a(com.yandex.mobile.ads.impl.aa0$b, long, int, int, int):void");
    }

    /* renamed from: a */
    private void m22415a(C5598pn c5598pn, int i2) throws IOException {
        if (this.f48378g.m22590e() >= i2) {
            return;
        }
        if (this.f48378g.m22584b() < i2) {
            ap0 ap0Var = this.f48378g;
            ap0Var.m22581a(Math.max(ap0Var.m22584b() * 2, i2));
        }
        c5598pn.mo26762a(this.f48378g.m22587c(), this.f48378g.m22590e(), i2 - this.f48378g.m22590e(), false);
        this.f48378g.m22589d(i2);
    }

    @RequiresNonNull({"#2.output"})
    /* renamed from: a */
    private int m22411a(C5598pn c5598pn, C4800b c4800b, int i2, boolean z) throws IOException {
        int mo28348b;
        int mo28348b2;
        int i3;
        if ("S_TEXT/UTF8".equals(c4800b.f48425b)) {
            m22416a(c5598pn, f48338c0, i2);
            int i4 = this.f48363T;
            m22422e();
            return i4;
        }
        if ("S_TEXT/ASS".equals(c4800b.f48425b)) {
            m22416a(c5598pn, f48340e0, i2);
            int i5 = this.f48363T;
            m22422e();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(c4800b.f48425b)) {
            m22416a(c5598pn, f48341f0, i2);
            int i6 = this.f48363T;
            m22422e();
            return i6;
        }
        y61 y61Var = c4800b.f48422X;
        if (!this.f48365V) {
            if (c4800b.f48431h) {
                this.f48358O &= -1073741825;
                if (!this.f48366W) {
                    c5598pn.mo26762a(this.f48378g.m22587c(), 0, 1, false);
                    this.f48362S++;
                    if ((this.f48378g.m22587c()[0] & 128) != 128) {
                        this.f48369Z = this.f48378g.m22587c()[0];
                        this.f48366W = true;
                    } else {
                        throw ep0.m24225a("Extension bit is set in signal byte", (Exception) null);
                    }
                }
                byte b = this.f48369Z;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.f48358O |= 1073741824;
                    if (!this.f48371a0) {
                        c5598pn.mo26762a(this.f48383l.m22587c(), 0, 8, false);
                        this.f48362S += 8;
                        this.f48371a0 = true;
                        this.f48378g.m22587c()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.f48378g.m22591e(0);
                        y61Var.mo28349b(1, this.f48378g);
                        this.f48363T++;
                        this.f48383l.m22591e(0);
                        y61Var.mo28349b(8, this.f48383l);
                        this.f48363T += 8;
                    }
                    if (z2) {
                        if (!this.f48367X) {
                            c5598pn.mo26762a(this.f48378g.m22587c(), 0, 1, false);
                            this.f48362S++;
                            this.f48378g.m22591e(0);
                            this.f48368Y = this.f48378g.m22607t();
                            this.f48367X = true;
                        }
                        int i7 = this.f48368Y * 4;
                        this.f48378g.m22586c(i7);
                        c5598pn.mo26762a(this.f48378g.m22587c(), 0, i7, false);
                        this.f48362S += i7;
                        short s = (short) ((this.f48368Y / 2) + 1);
                        int i8 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f48386o;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.f48386o = ByteBuffer.allocate(i8);
                        }
                        this.f48386o.position(0);
                        this.f48386o.putShort(s);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i3 = this.f48368Y;
                            if (i9 >= i3) {
                                break;
                            }
                            int m22611x = this.f48378g.m22611x();
                            if (i9 % 2 == 0) {
                                this.f48386o.putShort((short) (m22611x - i10));
                            } else {
                                this.f48386o.putInt(m22611x - i10);
                            }
                            i9++;
                            i10 = m22611x;
                        }
                        int i11 = (i2 - this.f48362S) - i10;
                        if (i3 % 2 == 1) {
                            this.f48386o.putInt(i11);
                        } else {
                            this.f48386o.putShort((short) i11);
                            this.f48386o.putInt(0);
                        }
                        this.f48384m.m22582a(i8, this.f48386o.array());
                        y61Var.mo28349b(i8, this.f48384m);
                        this.f48363T += i8;
                    }
                }
            } else {
                byte[] bArr = c4800b.f48432i;
                if (bArr != null) {
                    this.f48381j.m22582a(bArr.length, bArr);
                }
            }
            if (c4800b.m22439a(z)) {
                this.f48358O |= 268435456;
                this.f48385n.m22586c(0);
                int m22590e = (this.f48381j.m22590e() + i2) - this.f48362S;
                this.f48378g.m22586c(4);
                this.f48378g.m22587c()[0] = (byte) ((m22590e >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f48378g.m22587c()[1] = (byte) ((m22590e >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f48378g.m22587c()[2] = (byte) ((m22590e >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f48378g.m22587c()[3] = (byte) (m22590e & KotlinVersion.MAX_COMPONENT_VALUE);
                y61Var.mo28349b(4, this.f48378g);
                this.f48363T += 4;
            }
            this.f48365V = true;
        }
        int m22590e2 = this.f48381j.m22590e() + i2;
        if (!"V_MPEG4/ISO/AVC".equals(c4800b.f48425b) && !"V_MPEGH/ISO/HEVC".equals(c4800b.f48425b)) {
            if (c4800b.f48418T != null) {
                C5220ia.m25476b(this.f48381j.m22590e() == 0);
                c4800b.f48418T.m30069a(c5598pn);
            }
            while (true) {
                int i12 = this.f48362S;
                if (i12 >= m22590e2) {
                    break;
                }
                int i13 = m22590e2 - i12;
                int m22579a = this.f48381j.m22579a();
                if (m22579a > 0) {
                    mo28348b2 = Math.min(i13, m22579a);
                    y61Var.mo28345a(mo28348b2, this.f48381j);
                } else {
                    mo28348b2 = y61Var.mo28348b(c5598pn, i13, false);
                }
                this.f48362S += mo28348b2;
                this.f48363T += mo28348b2;
            }
        } else {
            byte[] m22587c = this.f48377f.m22587c();
            m22587c[0] = 0;
            m22587c[1] = 0;
            m22587c[2] = 0;
            int i14 = c4800b.f48423Y;
            int i15 = 4 - i14;
            while (this.f48362S < m22590e2) {
                int i16 = this.f48364U;
                if (i16 == 0) {
                    int min = Math.min(i14, this.f48381j.m22579a());
                    c5598pn.mo26762a(m22587c, i15 + min, i14 - min, false);
                    if (min > 0) {
                        this.f48381j.m22583a(m22587c, i15, min);
                    }
                    this.f48362S += i14;
                    this.f48377f.m22591e(0);
                    this.f48364U = this.f48377f.m22611x();
                    this.f48376e.m22591e(0);
                    y61Var.mo28345a(4, this.f48376e);
                    this.f48363T += 4;
                } else {
                    int m22579a2 = this.f48381j.m22579a();
                    if (m22579a2 > 0) {
                        mo28348b = Math.min(i16, m22579a2);
                        y61Var.mo28345a(mo28348b, this.f48381j);
                    } else {
                        mo28348b = y61Var.mo28348b(c5598pn, i16, false);
                    }
                    this.f48362S += mo28348b;
                    this.f48363T += mo28348b;
                    this.f48364U -= mo28348b;
                }
            }
        }
        if ("A_VORBIS".equals(c4800b.f48425b)) {
            this.f48379h.m22591e(0);
            y61Var.mo28345a(4, this.f48379h);
            this.f48363T += 4;
        }
        int i17 = this.f48363T;
        m22422e();
        return i17;
    }

    /* renamed from: a */
    private void m22416a(C5598pn c5598pn, byte[] bArr, int i2) throws IOException {
        int length = bArr.length + i2;
        if (this.f48382k.m22584b() < length) {
            ap0 ap0Var = this.f48382k;
            byte[] copyOf = Arrays.copyOf(bArr, length + i2);
            Objects.requireNonNull(ap0Var);
            ap0Var.m22582a(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, this.f48382k.m22587c(), 0, bArr.length);
        }
        c5598pn.mo26762a(this.f48382k.m22587c(), bArr.length, i2, false);
        this.f48382k.m22591e(0);
        this.f48382k.m22589d(length);
    }

    /* renamed from: a */
    private static byte[] m22418a(String str, long j2, long j3) {
        C5220ia.m25473a(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - ((i2 * 3600) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - ((i3 * 60) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return s91.m28124b(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / j3))));
    }

    /* renamed from: a */
    private long m22412a(long j2) throws ep0 {
        long j3 = this.f48389r;
        if (j3 != -9223372036854775807L) {
            return s91.m28097a(j2, j3, 1000L);
        }
        throw ep0.m24225a("Can't scale timecode prior to timecodeScale being set.", (Exception) null);
    }

    @CallSuper
    /* renamed from: a */
    public final void m22428a(int i2, long j2, long j3) throws ep0 {
        C5220ia.m25474b(this.f48373b0);
        if (i2 == 160) {
            this.f48360Q = false;
            this.f48361R = 0L;
            return;
        }
        if (i2 == 174) {
            this.f48392u = new C4800b();
            return;
        }
        if (i2 == 187) {
            this.f48348E = false;
            return;
        }
        if (i2 == 19899) {
            this.f48394w = -1;
            this.f48395x = -1L;
            return;
        }
        if (i2 == 20533) {
            m22413a(i2);
            this.f48392u.f48431h = true;
            return;
        }
        if (i2 == 21968) {
            m22413a(i2);
            this.f48392u.f48447x = true;
            return;
        }
        if (i2 == 408125543) {
            long j4 = this.f48388q;
            if (j4 != -1 && j4 != j2) {
                throw ep0.m24225a("Multiple Segment elements not supported", (Exception) null);
            }
            this.f48388q = j2;
            this.f48387p = j3;
            return;
        }
        if (i2 != 475249515) {
            if (i2 == 524531317 && !this.f48393v) {
                if (this.f48375d && this.f48397z != -1) {
                    this.f48396y = true;
                    return;
                } else {
                    this.f48373b0.mo23024a(new e01.C4998b(this.f48391t, 0L));
                    this.f48393v = true;
                    return;
                }
            }
            return;
        }
        this.f48346C = new e90(0);
        this.f48347D = new e90(0);
    }
}
