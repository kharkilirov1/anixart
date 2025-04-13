package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.BuildConfigFieldProvider;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.InterfaceC6125zi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.pu */
/* loaded from: classes3.dex */
public final class C5605pu {

    /* renamed from: A */
    private final Boolean f53646A;

    /* renamed from: B */
    private final String f53647B;

    /* renamed from: C */
    private final Integer f53648C;

    /* renamed from: D */
    private final String f53649D;

    /* renamed from: E */
    private final String f53650E;

    /* renamed from: F */
    private final String f53651F;

    /* renamed from: G */
    private final String f53652G;

    /* renamed from: H */
    private final String f53653H;

    /* renamed from: I */
    private final HashMap f53654I;

    /* renamed from: J */
    private final Long f53655J;

    /* renamed from: K */
    private final String f53656K;

    /* renamed from: L */
    private final String f53657L;

    /* renamed from: M */
    private final String f53658M;

    /* renamed from: N */
    private final String f53659N;

    /* renamed from: O */
    @Nullable
    private final String f53660O;

    /* renamed from: P */
    @Nullable
    private final String f53661P;

    /* renamed from: Q */
    private final String f53662Q;

    /* renamed from: R */
    private final String f53663R;

    /* renamed from: S */
    private final String f53664S;

    /* renamed from: T */
    private final String f53665T;

    /* renamed from: U */
    private final String f53666U;

    /* renamed from: V */
    private final String f53667V;

    /* renamed from: W */
    private final String f53668W;

    /* renamed from: X */
    private final String f53669X;

    /* renamed from: Y */
    private final String f53670Y;

    /* renamed from: Z */
    private final String f53671Z;

    /* renamed from: a */
    @NonNull
    private final C5669r4 f53672a;

    /* renamed from: a0 */
    private final Integer f53673a0;

    /* renamed from: b */
    @NonNull
    private final C5758sr f53674b;

    /* renamed from: b0 */
    private final String f53675b0;

    /* renamed from: c */
    @Nullable
    private final String f53676c;

    /* renamed from: c0 */
    private final String f53677c0;

    /* renamed from: d */
    @Nullable
    private final Integer f53678d;

    /* renamed from: d0 */
    private final Boolean f53679d0;

    /* renamed from: e */
    private final String f53680e;

    /* renamed from: e0 */
    private final Boolean f53681e0;

    /* renamed from: f */
    private final String f53682f;

    /* renamed from: f0 */
    private final boolean f53683f0;

    /* renamed from: g */
    private final String f53684g;

    /* renamed from: g0 */
    @Nullable
    private final String f53685g0;

    /* renamed from: h */
    private final Integer f53686h;

    /* renamed from: h0 */
    @Nullable
    private final String f53687h0;

    /* renamed from: i */
    private final Integer f53688i;

    /* renamed from: i0 */
    private final boolean f53689i0;

    /* renamed from: j */
    private final String f53690j;

    /* renamed from: j0 */
    @Nullable
    private final String f53691j0;

    /* renamed from: k */
    private final String f53692k;

    /* renamed from: k0 */
    @Nullable
    private final String f53693k0;

    /* renamed from: l */
    private final Integer f53694l;

    /* renamed from: l0 */
    @Nullable
    private final String f53695l0;

    /* renamed from: m */
    private final Integer f53696m;

    /* renamed from: m0 */
    @Nullable
    private final String f53697m0;

    /* renamed from: n */
    private final Float f53698n;

    /* renamed from: n0 */
    private final String f53699n0;

    /* renamed from: o */
    private final Location f53700o;

    /* renamed from: o0 */
    @Nullable
    private final String f53701o0;

    /* renamed from: p */
    private final Integer f53702p;

    /* renamed from: p0 */
    @Nullable
    private final String f53703p0;

    /* renamed from: q */
    private final Integer f53704q;

    /* renamed from: q0 */
    @Nullable
    private final String f53705q0;

    /* renamed from: r */
    private final String f53706r;

    /* renamed from: r0 */
    private final boolean f53707r0;

    /* renamed from: s */
    private final String f53708s;

    /* renamed from: s0 */
    @Nullable
    private final String f53709s0;

    /* renamed from: t */
    private final AdRequest f53710t;

    /* renamed from: t0 */
    private StringBuilder f53711t0;

    /* renamed from: u */
    private final Integer f53712u;

    /* renamed from: v */
    private final Integer f53713v;

    /* renamed from: w */
    private final String f53714w;

    /* renamed from: x */
    private final Boolean f53715x;

    /* renamed from: y */
    private final Boolean f53716y;

    /* renamed from: z */
    private final String f53717z;

    /* renamed from: com.yandex.mobile.ads.impl.pu$a */
    public static final class a<T> {

        /* renamed from: A */
        private Float f53718A;

        /* renamed from: B */
        private Integer f53719B;

        /* renamed from: C */
        private Integer f53720C;

        /* renamed from: D */
        private String f53721D;

        /* renamed from: E */
        private String f53722E;

        /* renamed from: F */
        private AdRequest f53723F;

        /* renamed from: G */
        private Integer f53724G;

        /* renamed from: H */
        private Integer f53725H;

        /* renamed from: I */
        private String f53726I;

        /* renamed from: J */
        private Boolean f53727J;

        /* renamed from: K */
        private Boolean f53728K;

        /* renamed from: L */
        private String f53729L;

        /* renamed from: M */
        private Boolean f53730M;

        /* renamed from: N */
        private String f53731N;

        /* renamed from: O */
        private Integer f53732O;

        /* renamed from: P */
        private String f53733P;

        /* renamed from: Q */
        private String f53734Q;

        /* renamed from: R */
        private String f53735R;

        /* renamed from: S */
        private String f53736S;

        /* renamed from: T */
        private String f53737T;

        /* renamed from: U */
        private Long f53738U;

        /* renamed from: V */
        private String f53739V;

        /* renamed from: W */
        private String f53740W;

        /* renamed from: X */
        private String f53741X;

        /* renamed from: Y */
        private String f53742Y;

        /* renamed from: Z */
        @Nullable
        private String f53743Z;

        /* renamed from: a */
        @NonNull
        private final C5932vo f53744a;

        /* renamed from: a0 */
        @Nullable
        private String f53745a0;

        /* renamed from: b */
        @NonNull
        private final C6017x9 f53746b;

        /* renamed from: b0 */
        private String f53747b0;

        /* renamed from: c */
        @NonNull
        private final zz0 f53748c;

        /* renamed from: c0 */
        private String f53749c0;

        /* renamed from: d */
        @NonNull
        private final C6009x7 f53750d;

        /* renamed from: d0 */
        private String f53751d0;

        /* renamed from: e */
        private final boolean f53752e;

        /* renamed from: e0 */
        private String f53753e0;

        /* renamed from: f */
        private boolean f53754f;

        /* renamed from: f0 */
        private String f53755f0;

        /* renamed from: g */
        @NonNull
        private final HashMap f53756g;

        /* renamed from: g0 */
        private String f53757g0;

        /* renamed from: h */
        @Nullable
        private Boolean f53758h;

        /* renamed from: h0 */
        private String f53759h0;

        /* renamed from: i */
        @Nullable
        private Boolean f53760i;

        /* renamed from: i0 */
        private String f53761i0;

        /* renamed from: j */
        @Nullable
        private String f53762j;

        /* renamed from: j0 */
        private String f53763j0;

        /* renamed from: k */
        @Nullable
        private Integer f53764k;

        /* renamed from: k0 */
        private String f53765k0;

        /* renamed from: l */
        private boolean f53766l;

        /* renamed from: l0 */
        private int f53767l0;

        /* renamed from: m */
        @Nullable
        private String f53768m;

        /* renamed from: m0 */
        private String f53769m0;

        /* renamed from: n */
        @Nullable
        private String f53770n;

        /* renamed from: n0 */
        private String f53771n0;

        /* renamed from: o */
        @Nullable
        private String f53772o;

        /* renamed from: o0 */
        @Nullable
        private String f53773o0;

        /* renamed from: p */
        @Nullable
        private String f53774p;

        /* renamed from: p0 */
        @Nullable
        private String f53775p0;

        /* renamed from: q */
        private String f53776q;

        /* renamed from: q0 */
        private String f53777q0;

        /* renamed from: r */
        private String f53778r;

        /* renamed from: r0 */
        @Nullable
        private String f53779r0;

        /* renamed from: s */
        private String f53780s;

        /* renamed from: s0 */
        @Nullable
        private String f53781s0;

        /* renamed from: t */
        private Integer f53782t;

        /* renamed from: t0 */
        @Nullable
        private String f53783t0;

        /* renamed from: u */
        private Integer f53784u;

        /* renamed from: u0 */
        private boolean f53785u0;

        /* renamed from: v */
        private String f53786v;

        /* renamed from: v0 */
        @Nullable
        private String f53787v0;

        /* renamed from: w */
        private String f53788w;

        /* renamed from: x */
        private Location f53789x;

        /* renamed from: y */
        private Integer f53790y;

        /* renamed from: z */
        private Integer f53791z;

        public /* synthetic */ a(boolean z, int i2) {
            this(z);
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27455a(Context context) {
            String str;
            this.f53759h0 = context.getPackageName();
            String str2 = null;
            try {
                str = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (Exception e2) {
                n60.m26808a(e2, e2.getMessage(), new Object[0]);
                str = null;
            }
            this.f53761i0 = str;
            try {
                str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e3) {
                n60.m26808a(e3, e3.getMessage(), new Object[0]);
            }
            this.f53763j0 = str2;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final a<T> m27472b(@NonNull Context context) {
            Objects.requireNonNull(InterfaceC6125zi.f57198a);
            this.f53766l = ((C4871bj) InterfaceC6125zi.a.m30191a(context)).m22843a();
            return this;
        }

        @NonNull
        /* renamed from: d */
        public final a<T> m27479d(@NonNull Context context) {
            Objects.requireNonNull(InterfaceC6125zi.f57198a);
            this.f53768m = ((C4871bj) InterfaceC6125zi.a.m30191a(context)).m22845c();
            return this;
        }

        @NonNull
        /* renamed from: e */
        public final a<T> m27482e(@NonNull Context context) {
            Objects.requireNonNull(InterfaceC6125zi.f57198a);
            this.f53770n = ((C4871bj) InterfaceC6125zi.a.m30191a(context)).m22844b();
            return this;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|3|(7:5|6|7|8|(1:10)|12|13)|17|6|7|8|(0)|12|13) */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #1 {Exception -> 0x0039, blocks: (B:8:0x0022, B:10:0x0034), top: B:7:0x0022 }] */
        @androidx.annotation.NonNull
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.yandex.mobile.ads.impl.C5605pu.a<T> m27485f(android.content.Context r6) {
            /*
                r5 = this;
                java.lang.String r0 = "phone"
                r1 = 65535(0xffff, float:9.1834E-41)
                r2 = -1
                r3 = 0
                java.lang.Object r4 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L1f
                android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Exception -> L1f
                android.telephony.CellLocation r4 = r4.getCellLocation()     // Catch: java.lang.Exception -> L1f
                android.telephony.gsm.GsmCellLocation r4 = (android.telephony.gsm.GsmCellLocation) r4     // Catch: java.lang.Exception -> L1f
                int r4 = r4.getCid()     // Catch: java.lang.Exception -> L1f
                if (r2 == r4) goto L1f
                r4 = r4 & r1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L1f
                goto L20
            L1f:
                r4 = r3
            L20:
                r5.f53724G = r4
                java.lang.Object r0 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L39
                android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.Exception -> L39
                android.telephony.CellLocation r0 = r0.getCellLocation()     // Catch: java.lang.Exception -> L39
                android.telephony.gsm.GsmCellLocation r0 = (android.telephony.gsm.GsmCellLocation) r0     // Catch: java.lang.Exception -> L39
                int r0 = r0.getLac()     // Catch: java.lang.Exception -> L39
                if (r2 == r0) goto L39
                r0 = r0 & r1
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L39
            L39:
                r5.f53725H = r3
                java.lang.String r6 = com.yandex.mobile.ads.impl.zp0.m30266c(r6)
                r5.f53726I = r6
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5605pu.a.m27485f(android.content.Context):com.yandex.mobile.ads.impl.pu$a");
        }

        /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:2|3)|(12:5|6|7|8|(7:10|11|12|13|(1:15)|16|17)|22|11|12|13|(0)|16|17)|25|6|7|8|(0)|22|11|12|13|(0)|16|17) */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #1 {Exception -> 0x0042, blocks: (B:8:0x0025, B:10:0x0039), top: B:7:0x0025 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
        @androidx.annotation.NonNull
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.yandex.mobile.ads.impl.C5605pu.a<T> m27489h(android.content.Context r6) {
            /*
                r5 = this;
                java.lang.String r0 = "phone"
                r1 = 3
                r2 = 0
                java.lang.Object r3 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L22
                android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Exception -> L22
                java.lang.String r3 = r3.getNetworkOperator()     // Catch: java.lang.Exception -> L22
                r4 = 0
                java.lang.String r3 = r3.substring(r4, r1)     // Catch: java.lang.Exception -> L22
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L22
                if (r4 != 0) goto L22
                int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L22
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L22
                goto L23
            L22:
                r3 = r2
            L23:
                r5.f53719B = r3
                java.lang.Object r3 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L42
                android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Exception -> L42
                java.lang.String r3 = r3.getNetworkOperator()     // Catch: java.lang.Exception -> L42
                java.lang.String r1 = r3.substring(r1)     // Catch: java.lang.Exception -> L42
                boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L42
                if (r3 != 0) goto L42
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L42
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L42
                goto L43
            L42:
                r1 = r2
            L43:
                r5.f53720C = r1
                java.lang.String r1 = com.yandex.mobile.ads.impl.zp0.m30264a(r6)
                r5.f53721D = r1
                java.lang.Object r6 = r6.getSystemService(r0)     // Catch: java.lang.Exception -> L5c
                android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch: java.lang.Exception -> L5c
                java.lang.String r6 = r6.getNetworkOperatorName()     // Catch: java.lang.Exception -> L5c
                boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L5c
                if (r0 != 0) goto L5c
                r2 = r6
            L5c:
                r5.f53722E = r2
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5605pu.a.m27489h(android.content.Context):com.yandex.mobile.ads.impl.pu$a");
        }

        @NonNull
        /* renamed from: i */
        public final a<T> m27490i(@NonNull Context context) {
            Objects.requireNonNull(InterfaceC6125zi.f57198a);
            this.f53772o = ((C4871bj) InterfaceC6125zi.a.m30191a(context)).m22846d();
            return this;
        }

        @NonNull
        /* renamed from: l */
        public final a<T> m27493l(@NonNull Context context) {
            Objects.requireNonNull(InterfaceC6125zi.f57198a);
            this.f53774p = ((C4871bj) InterfaceC6125zi.a.m30191a(context)).m22847e();
            return this;
        }

        private a(boolean z) {
            this.f53756g = new HashMap();
            this.f53752e = z;
            this.f53744a = new C5932vo();
            this.f53746b = new C6017x9();
            this.f53748c = new zz0();
            this.f53750d = new C6009x7();
        }

        @NonNull
        /* renamed from: c */
        public final a<T> m27475c() {
            Objects.requireNonNull(this.f53746b);
            this.f53777q0 = C6017x9.m29700a();
            return this;
        }

        @NonNull
        /* renamed from: g */
        public final a<T> m27487g(@NonNull Context context) {
            this.f53789x = this.f53752e ? null : w80.m29404a(context).m29405a();
            return this;
        }

        @NonNull
        /* renamed from: j */
        public final a<T> m27491j(Context context) {
            this.f53790y = Integer.valueOf(tg1.m28658c(context));
            this.f53791z = Integer.valueOf(tg1.m28656b(context));
            this.f53718A = Float.valueOf(context.getResources().getDisplayMetrics().density);
            this.f53767l0 = tg1.m28651a(context);
            return this;
        }

        @NonNull
        /* renamed from: k */
        public final a<T> m27492k(@NonNull Context context) {
            cz0 m29824a = xz0.m29823b().m29824a(context);
            if (m29824a != null) {
                this.f53787v0 = m29824a.m23610s();
            }
            return this;
        }

        @NonNull
        /* renamed from: m */
        public final a<T> m27494m(@NonNull Context context) {
            this.f53785u0 = C5427m6.m26578a(context);
            return this;
        }

        @NonNull
        /* renamed from: c */
        public final a<T> m27477c(@Nullable String str) {
            this.f53745a0 = str;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final a<T> m27473b(Integer num) {
            this.f53732O = num;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public final a<T> m27476c(@NonNull Context context) {
            this.f53781s0 = (new C6128zl(context).m30210a() ? AdTheme.DARK : AdTheme.LIGHT).getF47797a();
            return this;
        }

        @NonNull
        /* renamed from: d */
        public final a<T> m27480d(@Nullable String str) {
            this.f53762j = str;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public final a<T> m27483e(@Nullable String str) {
            this.f53776q = str;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public final a<T> m27486g() {
            this.f53758h = xz0.m29823b().m29835g();
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final a<T> m27474b(@Nullable String str) {
            this.f53743Z = str;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public final a m27478d() {
            this.f53739V = "UTF-8";
            return this;
        }

        @NonNull
        /* renamed from: e */
        public final a m27481e() {
            this.f53740W = null;
            return this;
        }

        @NonNull
        /* renamed from: b */
        public final a<T> m27471b() {
            this.f53760i = xz0.m29823b().m29831d();
            return this;
        }

        @NonNull
        /* renamed from: f */
        public final a<T> m27484f() {
            this.f53773o0 = this.f53748c.m30347a();
            this.f53775p0 = this.f53748c.m30348b();
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27466a(String str) {
            this.f53778r = str;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27460a(EnumC5007e6 enumC5007e6) {
            if (enumC5007e6 != null) {
                this.f53780s = enumC5007e6.m24033a();
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27456a(@NonNull Context context, @Nullable SizeInfo sizeInfo) {
            if (sizeInfo != null) {
                this.f53786v = p11.m27143b(sizeInfo.m21917d());
                this.f53782t = Integer.valueOf(sizeInfo.m21916c(context));
                this.f53784u = Integer.valueOf(sizeInfo.m21913a(context));
            }
            return this;
        }

        /* renamed from: h */
        public final a m27488h() {
            this.f53741X = null;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27453a(int i2) {
            if (1 == i2) {
                this.f53788w = "portrait";
            } else {
                this.f53788w = "landscape";
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27459a(@Nullable AdRequest adRequest) {
            String str;
            if (adRequest != null) {
                String str2 = null;
                this.f53723F = this.f53752e ? null : adRequest;
                String contextQuery = adRequest.getContextQuery();
                if (TextUtils.isEmpty(contextQuery)) {
                    str = null;
                } else {
                    String encode = Uri.encode(contextQuery);
                    if (encode != null && encode.length() > 1024) {
                        ot0.m27110f("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", Integer.valueOf(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE), Integer.valueOf(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE));
                        String encode2 = Uri.encode(" ");
                        String substring = encode.substring(0, RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE);
                        encode = encode.startsWith(encode2, RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE) ? substring : substring.substring(0, substring.lastIndexOf(encode2));
                    }
                    str = Uri.decode(encode);
                }
                this.f53733P = str;
                List<String> contextTags = adRequest.getContextTags();
                StringBuilder sb = new StringBuilder();
                if (contextTags != null) {
                    String str3 = "";
                    for (String str4 : contextTags) {
                        if (!TextUtils.isEmpty(str4)) {
                            C0000a.m1B(sb, str3, str4, "\n");
                            str3 = "3";
                        }
                    }
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    String encode3 = Uri.encode(sb2);
                    if (encode3 != null && encode3.length() > 2048) {
                        ot0.m27110f("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", Integer.valueOf(RecyclerView.ViewHolder.FLAG_MOVED), Integer.valueOf(RecyclerView.ViewHolder.FLAG_MOVED));
                        String encode4 = Uri.encode("\n");
                        encode3 = encode3.substring(0, RecyclerView.ViewHolder.FLAG_MOVED);
                        if (!encode3.endsWith(encode4)) {
                            encode3 = encode3.substring(0, encode3.lastIndexOf(encode4));
                        }
                    }
                    str2 = Uri.decode(encode3);
                }
                this.f53734Q = str2;
                this.f53769m0 = C5781t4.m28458a(adRequest.getAge());
                this.f53771n0 = C5781t4.m28458a(adRequest.getGender());
                this.f53742Y = adRequest.getBiddingData();
                AdTheme preferredTheme = adRequest.getPreferredTheme();
                if (preferredTheme != null) {
                    this.f53779r0 = C5781t4.m28458a(preferredTheme.getF47797a());
                }
                m27467a(C5781t4.m28459a(adRequest.getParameters()));
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27469a(@Nullable String[] strArr) {
            String str;
            if (strArr == null || strArr.length <= 0) {
                str = null;
            } else {
                StringBuilder sb = new StringBuilder();
                String str2 = "";
                for (String str3 : strArr) {
                    if (!TextUtils.isEmpty(str3)) {
                        sb.append(str2);
                        sb.append(str3);
                        str2 = ",";
                    }
                }
                str = sb.toString();
            }
            this.f53735R = str;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27461a(@Nullable kk0 kk0Var) {
            if (kk0Var != null) {
                this.f53736S = kk0Var.m26139a();
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27462a(@Nullable mk0 mk0Var) {
            if (mk0Var != null && mk0.f52696c == mk0Var) {
                this.f53737T = mk0Var.m26688a();
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27467a(@Nullable Map<String, String> map) {
            if (map != null) {
                this.f53756g.putAll(map);
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27458a(@NonNull Context context, @Nullable String str) {
            this.f53747b0 = this.f53744a.m29244a(context);
            Objects.requireNonNull(this.f53744a);
            this.f53749c0 = "android";
            Objects.requireNonNull(this.f53744a);
            this.f53751d0 = Build.VERSION.RELEASE;
            Objects.requireNonNull(this.f53744a);
            this.f53753e0 = C5932vo.m29243a();
            Objects.requireNonNull(this.f53744a);
            this.f53755f0 = Build.MODEL;
            this.f53757g0 = this.f53744a.m29245b(context);
            if (this.f53752e) {
                str = null;
            }
            this.f53765k0 = str;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27468a(@NonNull boolean z) {
            this.f53754f = z;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27464a(@Nullable C6061y7 c6061y7, boolean z) {
            if (c6061y7 != null) {
                this.f53727J = Boolean.valueOf(c6061y7.m29867b());
                this.f53728K = Boolean.valueOf(z);
                String m29866a = c6061y7.m29866a();
                Objects.requireNonNull(this.f53750d);
                boolean z2 = (TextUtils.isEmpty(m29866a) || "00000000-0000-0000-0000-000000000000".equals(m29866a)) ? false : true;
                if (!this.f53752e && !this.f53727J.booleanValue() && z2) {
                    this.f53729L = m29866a;
                }
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27463a(@Nullable C6061y7 c6061y7) {
            if (c6061y7 != null) {
                this.f53730M = Boolean.valueOf(c6061y7.m29867b());
                String m29866a = c6061y7.m29866a();
                Objects.requireNonNull(this.f53750d);
                boolean z = (TextUtils.isEmpty(m29866a) || "00000000-0000-0000-0000-000000000000".equals(m29866a)) ? false : true;
                if (!this.f53752e && !this.f53730M.booleanValue() && z) {
                    this.f53731N = m29866a;
                }
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27454a(long j2) {
            this.f53738U = Long.valueOf(j2);
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27465a(@Nullable Integer num) {
            this.f53764k = num;
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final a<T> m27457a(@NonNull Context context, @NonNull C5101g2 c5101g2) {
            String m27084a;
            String m24779c = c5101g2.m24779c();
            int m24790l = c5101g2.m24790l();
            if (m24779c != null && (m27084a = new og1(context).m27084a(new qg1(m24790l, m24779c))) != null) {
                this.f53783t0 = m27084a;
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public final String m27470a() {
            return new C5605pu(this, 0).toString();
        }
    }

    public /* synthetic */ C5605pu(a aVar, int i2) {
        this(aVar);
    }

    /* renamed from: a */
    public static a<?> m27380a(boolean z) {
        return new a<>(z, 0);
    }

    public final String toString() {
        if (!TextUtils.isEmpty(this.f53711t0)) {
            return this.f53711t0.toString();
        }
        this.f53711t0 = new StringBuilder();
        m27382a(this.f53682f, "ad_unit_id");
        m27382a(this.f53686h, "width");
        m27382a(this.f53688i, "height");
        m27382a(this.f53690j, "ad_size_type");
        m27382a(this.f53692k, "orientation");
        m27382a(this.f53678d, "ads_count");
        m27382a(this.f53694l, "screen_width");
        m27382a(this.f53696m, "screen_height");
        m27382a(this.f53698n, "scalefactor");
        m27382a(this.f53684g, "ad_type");
        m27382a(this.f53706r, "network_type");
        m27382a(this.f53708s, "carrier");
        m27383a("dnt", this.f53715x);
        m27383a("gaid_reset", this.f53716y);
        m27383a("huawei_dnt", this.f53646A);
        m27382a(this.f53648C, "battery_charge");
        m27382a(this.f53651F, "image_sizes");
        m27382a(this.f53652G, "response_ad_format");
        m27382a(this.f53653H, "ad_source");
        m27382a(this.f53657L, "debug_yandexuid");
        m27382a(this.f53658M, "user_id");
        m27382a(this.f53659N, "open_bidding_data");
        m27382a(this.f53655J, "session_random");
        m27382a(this.f53656K, "charset");
        m27382a(this.f53662Q, this.f53672a.m27828b());
        m27382a(this.f53663R, this.f53672a.m27831e());
        m27382a(this.f53664S, this.f53672a.m27832f());
        m27382a(this.f53665T, this.f53672a.m27829c());
        m27382a(this.f53666U, this.f53672a.m27830d());
        m27382a(this.f53667V, "locale");
        m27382a(this.f53668W, "app_id");
        m27382a(this.f53669X, "app_version_code");
        m27382a(this.f53670Y, "app_version_name");
        m27382a(this.f53699n0, "appmetrica_version");
        m27382a(this.f53673a0, "screen_dpi");
        m27383a("user_consent", this.f53679d0);
        m27382a(this.f53691j0, "gdpr");
        m27382a(this.f53693k0, "gdpr_consent");
        m27383a("cmp_present", Boolean.valueOf(this.f53689i0));
        m27382a(this.f53695l0, "parsed_purpose_consents");
        m27382a(this.f53697m0, "parsed_vendor_consents");
        m27382a(this.f53661P, "bidding_data");
        m27382a(this.f53685g0, "sdk_version");
        m27382a(this.f53687h0, "sdk_version_name");
        m27382a(this.f53701o0, "preferred_theme");
        m27382a(this.f53703p0, "device_theme");
        m27383a("age_restricted_user", this.f53681e0);
        m27382a(this.f53705q0, "view_size_info");
        m27383a("web_view_available", Boolean.valueOf(this.f53707r0));
        m27382a(this.f53709s0, "startup_version");
        HashMap hashMap = this.f53654I;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                m27382a(entry.getValue(), (String) entry.getKey());
            }
        }
        if (!this.f53683f0) {
            m27382a(this.f53675b0, "age");
            m27382a(this.f53677c0, "gender");
            m27382a(this.f53649D, "context_query");
            m27382a(this.f53650E, "context_taglist");
            m27382a(this.f53717z, "google_aid");
            m27382a(this.f53647B, "huawei_oaid");
            m27382a(this.f53680e, "uuid");
            m27382a(this.f53676c, "mauid");
            m27382a(this.f53660O, "autograb");
            m27382a(this.f53671Z, this.f53672a.m27827a());
            m27382a(this.f53702p, "mcc");
            m27382a(this.f53704q, "mnc");
            m27382a(this.f53712u, "cellid");
            m27382a(this.f53713v, "lac");
            m27382a(this.f53714w, "wifi");
            AdRequest adRequest = this.f53710t;
            if (adRequest == null || adRequest.getLocation() == null) {
                Location location = this.f53700o;
                if (location != null && xz0.m29823b().m29834f()) {
                    m27382a(String.valueOf(location.getLatitude()), "lat");
                    m27382a(String.valueOf(location.getLongitude()), "lon");
                    m27382a(String.valueOf(location.getTime()), "location_timestamp");
                    m27382a(String.valueOf((int) location.getAccuracy()), "precision");
                }
            } else {
                Location location2 = this.f53710t.getLocation();
                if (location2 != null && xz0.m29823b().m29834f()) {
                    m27382a(String.valueOf(location2.getLatitude()), "lat");
                    m27382a(String.valueOf(location2.getLongitude()), "lon");
                    m27382a(String.valueOf(location2.getTime()), "location_timestamp");
                    m27382a(String.valueOf((int) location2.getAccuracy()), "precision");
                }
            }
        }
        return this.f53711t0.toString();
    }

    private C5605pu(a<?> aVar) {
        this.f53678d = ((a) aVar).f53764k;
        this.f53682f = ((a) aVar).f53778r;
        this.f53680e = ((a) aVar).f53776q;
        this.f53676c = ((a) aVar).f53762j;
        this.f53684g = ((a) aVar).f53780s;
        this.f53686h = ((a) aVar).f53782t;
        this.f53688i = ((a) aVar).f53784u;
        this.f53690j = ((a) aVar).f53786v;
        this.f53692k = ((a) aVar).f53788w;
        this.f53694l = ((a) aVar).f53790y;
        this.f53696m = ((a) aVar).f53791z;
        this.f53698n = ((a) aVar).f53718A;
        this.f53700o = ((a) aVar).f53789x;
        this.f53702p = ((a) aVar).f53719B;
        this.f53704q = ((a) aVar).f53720C;
        this.f53706r = ((a) aVar).f53721D;
        this.f53708s = ((a) aVar).f53722E;
        this.f53710t = ((a) aVar).f53723F;
        this.f53712u = ((a) aVar).f53724G;
        this.f53713v = ((a) aVar).f53725H;
        this.f53714w = ((a) aVar).f53726I;
        this.f53715x = ((a) aVar).f53727J;
        this.f53716y = ((a) aVar).f53728K;
        this.f53717z = ((a) aVar).f53729L;
        this.f53646A = ((a) aVar).f53730M;
        this.f53647B = ((a) aVar).f53731N;
        this.f53648C = ((a) aVar).f53732O;
        this.f53649D = ((a) aVar).f53733P;
        this.f53650E = ((a) aVar).f53734Q;
        this.f53651F = ((a) aVar).f53735R;
        this.f53652G = ((a) aVar).f53736S;
        this.f53653H = ((a) aVar).f53737T;
        this.f53654I = ((a) aVar).f53756g;
        this.f53655J = ((a) aVar).f53738U;
        this.f53656K = ((a) aVar).f53739V;
        this.f53657L = ((a) aVar).f53740W;
        this.f53658M = ((a) aVar).f53741X;
        this.f53660O = ((a) aVar).f53743Z;
        this.f53659N = ((a) aVar).f53742Y;
        this.f53661P = ((a) aVar).f53745a0;
        this.f53662Q = ((a) aVar).f53747b0;
        this.f53663R = ((a) aVar).f53749c0;
        this.f53664S = ((a) aVar).f53751d0;
        this.f53665T = ((a) aVar).f53753e0;
        this.f53666U = ((a) aVar).f53755f0;
        this.f53667V = ((a) aVar).f53757g0;
        this.f53668W = ((a) aVar).f53759h0;
        this.f53669X = ((a) aVar).f53761i0;
        this.f53670Y = ((a) aVar).f53763j0;
        this.f53671Z = ((a) aVar).f53765k0;
        this.f53673a0 = Integer.valueOf(((a) aVar).f53767l0);
        this.f53675b0 = ((a) aVar).f53769m0;
        this.f53677c0 = ((a) aVar).f53771n0;
        this.f53679d0 = ((a) aVar).f53758h;
        this.f53681e0 = ((a) aVar).f53760i;
        this.f53683f0 = ((a) aVar).f53754f;
        this.f53691j0 = ((a) aVar).f53768m;
        this.f53693k0 = ((a) aVar).f53770n;
        this.f53689i0 = ((a) aVar).f53766l;
        this.f53695l0 = ((a) aVar).f53772o;
        this.f53697m0 = ((a) aVar).f53774p;
        this.f53699n0 = ((a) aVar).f53777q0;
        this.f53685g0 = ((a) aVar).f53773o0;
        this.f53687h0 = ((a) aVar).f53775p0;
        this.f53701o0 = ((a) aVar).f53779r0;
        this.f53703p0 = ((a) aVar).f53781s0;
        this.f53705q0 = ((a) aVar).f53783t0;
        this.f53707r0 = ((a) aVar).f53785u0;
        this.f53709s0 = ((a) aVar).f53787v0;
        this.f53672a = new C5669r4();
        this.f53674b = new C5758sr();
    }

    /* renamed from: a */
    private void m27383a(String str, Boolean bool) {
        if (bool != null) {
            m27382a(Integer.valueOf(bool.booleanValue() ? 1 : 0), str);
        }
    }

    /* renamed from: a */
    private void m27382a(Object obj, String str) {
        if (obj != null) {
            StringBuilder sb = this.f53711t0;
            sb.append(TextUtils.isEmpty(sb) ? "" : "&");
            StringBuilder sb2 = this.f53711t0;
            sb2.append(Uri.encode(str));
            sb2.append("=");
            if (this.f53674b.m28352a(str)) {
                this.f53711t0.append(Uri.encode(obj.toString()));
            } else {
                this.f53711t0.append(Uri.encode(obj.toString(), ":"));
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m27381a(@NonNull C5101g2 c5101g2) {
        String m26941a = c5101g2.m24788j().m26941a();
        if (TextUtils.isEmpty(m26941a)) {
            return null;
        }
        return Uri.parse(m26941a).buildUpon().path(BuildConfigFieldProvider.getAdUrlPath()).build().toString();
    }

    @NonNull
    /* renamed from: a */
    public static a m27379a(@NonNull Context context, @NonNull l01 l01Var, @NonNull C5287jj c5287jj) {
        C5507nr m25895b = c5287jj.m25895b();
        C5961w7 m25892a = c5287jj.m25892a();
        Objects.requireNonNull(l01Var);
        a<?> m27463a = m27380a(l01.m26311c(context)).m27455a(context).m27475c().m27464a(m25892a.m29394a(), m25892a.m29399c()).m27463a(m25892a.m29397b());
        Integer num = null;
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > -1 && intExtra2 > 0) {
                    num = Integer.valueOf(Math.round((intExtra / intExtra2) * 100.0f));
                }
            }
        } catch (Exception e2) {
            n60.m26808a(e2, e2.getMessage(), new Object[0]);
        }
        a m27454a = m27463a.m27473b(num).m27478d().m27485f(context).m27487g(context).m27489h(context).m27491j(context).m27484f().m27468a(l01.m26309a(context)).m27454a(C5427m6.f52582a);
        Objects.requireNonNull(m25895b);
        return m27454a.m27481e().m27458a(context, m25895b.m26943b()).m27483e(m25895b.m26950f()).m27480d(m25895b.m26947d()).m27469a(c5287jj.m25896c());
    }

    @NonNull
    /* renamed from: a */
    public static a m27378a(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull l01 l01Var) {
        return m27379a(context, l01Var, c5101g2.m24786h()).m27459a(c5101g2.m24765a()).m27460a(c5101g2.m24775b()).m27465a(c5101g2.m24782d()).m27466a(c5101g2.m24779c()).m27461a(c5101g2.m24791m()).m27456a(context, c5101g2.m24792n()).m27462a(c5101g2.m24793o()).m27488h().m27474b(c5101g2.m24784f()).m27477c(c5101g2.m24785g()).m27453a(c5101g2.m24790l()).m27486g().m27471b().m27479d(context).m27482e(context).m27472b(context).m27490i(context).m27493l(context).m27476c(context).m27457a(context, c5101g2).m27494m(context).m27492k(context);
    }
}
