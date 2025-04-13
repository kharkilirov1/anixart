package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.vf0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class mf0 implements lo0 {

    /* renamed from: a */
    private final gf0 f52656a;

    /* renamed from: b */
    private final yo0 f52657b;

    /* renamed from: c */
    private final bg0 f52658c;

    /* renamed from: d */
    private final vf0 f52659d;

    /* renamed from: e */
    @NonNull
    private rg1 f52660e;

    /* renamed from: f */
    @NonNull
    private final C4938ct f52661f;

    /* renamed from: g */
    @NonNull
    private final C5044et f52662g;

    /* renamed from: h */
    @NonNull
    private final String f52663h;

    /* renamed from: i */
    @NonNull
    private final vg1 f52664i;

    /* renamed from: j */
    @NonNull
    private final i91 f52665j;

    /* renamed from: k */
    @Nullable
    private wf0 f52666k;

    /* renamed from: l */
    @Nullable
    private ve0 f52667l;

    /* renamed from: m */
    @Nullable
    private ue0 f52668m;

    /* renamed from: n */
    @Nullable
    private ko0 f52669n;

    /* renamed from: o */
    @Nullable
    private pe1 f52670o;

    /* renamed from: p */
    @Nullable
    private C4884bt f52671p;

    /* renamed from: com.yandex.mobile.ads.impl.mf0$a */
    public class C5439a implements vf0.InterfaceC5916a {

        /* renamed from: a */
        public final /* synthetic */ String f52672a;

        public C5439a(String str) {
            this.f52672a = str;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mf0$b */
    public static /* synthetic */ class C5440b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52674a;

        static {
            int[] iArr = new int[C5782t5.m28465b(8).length];
            f52674a = iArr;
            try {
                iArr[C5782t5.m28463a(4)] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52674a[C5782t5.m28463a(7)] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52674a[C5782t5.m28463a(5)] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f52674a[C5782t5.m28463a(1)] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f52674a[C5782t5.m28463a(2)] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f52674a[C5782t5.m28463a(3)] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f52674a[C5782t5.m28463a(6)] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mf0$c */
    public class C5441c implements InterfaceC5610pz {
        private C5441c() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5610pz
        /* renamed from: a */
        public final void mo26301a() {
            mf0.this.f52657b.mo26301a();
        }

        public /* synthetic */ C5441c(mf0 mf0Var, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5610pz
        /* renamed from: a */
        public final void mo26656a(@NonNull Context context, @NonNull String str) {
            mf0.this.f52657b.mo26656a(context, str);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5610pz
        /* renamed from: a */
        public final void mo26655a(int i2) {
            mf0.this.f52657b.mo26655a(i2);
        }
    }

    public mf0(@NonNull yo0 yo0Var) {
        this.f52657b = yo0Var;
        bg0 bg0Var = new bg0(new C5441c(this, 0));
        this.f52658c = bg0Var;
        yo0Var.setWebViewClient(bg0Var);
        this.f52656a = new gf0(yo0Var);
        this.f52659d = new vf0();
        this.f52664i = new vg1();
        this.f52665j = new i91();
        this.f52660e = rg1.f54308c;
        C4938ct c4938ct = new C4938ct();
        this.f52661f = c4938ct;
        this.f52662g = new C5044et(yo0Var, c4938ct, this);
        this.f52663h = C5427m6.m26576a(this);
    }

    /* renamed from: a */
    public final void m26649a(@NonNull wf0 wf0Var) {
        this.f52666k = wf0Var;
    }

    /* renamed from: b */
    public final void m26653b() {
        if (rg1.f54307b == this.f52660e) {
            rg1 rg1Var = rg1.f54309d;
            this.f52660e = rg1Var;
            this.f52656a.m24875a(rg1Var);
        }
    }

    /* renamed from: a */
    public final void m26648a(@NonNull ve0 ve0Var) {
        this.f52667l = ve0Var;
    }

    /* renamed from: a */
    public final void m26647a(@NonNull ue0 ue0Var) {
        this.f52668m = ue0Var;
    }

    /* renamed from: a */
    public final void m26645a(@NonNull ko0 ko0Var) {
        this.f52669n = ko0Var;
    }

    /* renamed from: a */
    public final void m26646a(@NonNull pe1 pe1Var) {
        this.f52670o = pe1Var;
    }

    /* renamed from: b */
    public final void m26654b(String str) {
        Objects.requireNonNull(this.f52665j);
        if (i91.m25468c(str)) {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if ("mraid".equals(scheme) || "mobileads".equals(scheme)) {
                HashMap hashMap = new HashMap();
                for (String str2 : parse.getQueryParameterNames()) {
                    hashMap.put(str2, parse.getQueryParameter(str2));
                }
                int m28242a = sf0.m28242a(host);
                try {
                    m26641a(m28242a, hashMap);
                } catch (Exception e2) {
                    this.f52656a.m24874a(m28242a, e2.getMessage());
                }
                this.f52656a.m24873a(m28242a);
                return;
            }
            return;
        }
        n60.m26813f(um1.m29049a("Invalid MRAID URL: ", str), new Object[0]);
        this.f52656a.m24874a(8, "Mraid command sent an invalid URL");
    }

    /* renamed from: a */
    public final void m26651a(@NonNull String str) {
        Context context = this.f52657b.getContext();
        vf0 vf0Var = this.f52659d;
        String str2 = this.f52663h;
        C5439a c5439a = new C5439a(str);
        Objects.requireNonNull(vf0Var);
        cz0 m29824a = xz0.m29823b().m29824a(context);
        if (m29824a != null && !TextUtils.isEmpty(m29824a.m23605n())) {
            n41 n41Var = new n41(m29824a.m23605n(), new tf0(c5439a), new uf0(c5439a));
            n41Var.m30318b((Object) str2);
            synchronized (iw0.m25739a()) {
                um0.m29048a(context).m26292a(n41Var);
            }
            return;
        }
        this.f52658c.m22814a(vf0.f55812a);
        this.f52656a.m24876b(str);
        n60.m26813f("SdkConfiguration is empty. Use default mraid js controller.", new Object[0]);
    }

    /* renamed from: a */
    public final void m26650a(@NonNull yo0 yo0Var, @Nullable Map map) {
        d51 d51Var = new d51(this.f52657b);
        vg1 vg1Var = this.f52664i;
        yo0 yo0Var2 = this.f52657b;
        Objects.requireNonNull(vg1Var);
        zg1 zg1Var = new zg1(vg1.m29222a(yo0Var2));
        C4884bt m23508a = this.f52661f.m23508a(this.f52657b);
        C4987dt c4987dt = new C4987dt(m23508a.m22931a(), m23508a.m22932b());
        rg1 rg1Var = rg1.f54307b;
        this.f52660e = rg1Var;
        this.f52656a.m24875a(rg1Var, zg1Var, c4987dt, d51Var);
        this.f52656a.m24872a();
        wf0 wf0Var = this.f52666k;
        if (wf0Var != null) {
            wf0Var.mo29478a(yo0Var, map);
        }
    }

    /* renamed from: a */
    public final void m26652a(boolean z) {
        this.f52656a.m24875a(new zg1(z));
        if (z) {
            this.f52662g.m24251a();
            return;
        }
        this.f52662g.m24252b();
        C4884bt m23508a = this.f52661f.m23508a(this.f52657b);
        if (m23508a.equals(this.f52671p)) {
            return;
        }
        this.f52671p = m23508a;
        this.f52656a.m24875a(new C4987dt(m23508a.m22931a(), m23508a.m22932b()));
    }

    @Override // com.yandex.mobile.ads.impl.lo0
    /* renamed from: a */
    public final void mo26507a(@NonNull C4884bt c4884bt) {
        if (c4884bt.equals(this.f52671p)) {
            return;
        }
        this.f52671p = c4884bt;
        this.f52656a.m24875a(new C4987dt(c4884bt.m22931a(), c4884bt.m22932b()));
    }

    /* renamed from: a */
    private void m26641a(@NonNull int i2, @NonNull HashMap hashMap) throws kf0 {
        if (this.f52666k != null) {
            int[] iArr = C5440b.f52674a;
            if (i2 != 0) {
                switch (iArr[i2 - 1]) {
                    case 1:
                        if (rg1.f54307b == this.f52660e) {
                            rg1 rg1Var = rg1.f54309d;
                            this.f52660e = rg1Var;
                            this.f52656a.m24875a(rg1Var);
                            ko0 ko0Var = this.f52669n;
                            if (ko0Var != null) {
                                ko0Var.mo22867c();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        if (this.f52669n != null) {
                            this.f52669n.mo22865a(Boolean.parseBoolean((String) hashMap.get("shouldUseCustomClose")));
                            return;
                        }
                        return;
                    case 3:
                        String str = (String) hashMap.get("url");
                        if (!TextUtils.isEmpty(str)) {
                            this.f52666k.mo29479a(str);
                            n60.m26812e("Mraid open command with url %s", str);
                            return;
                        }
                        throw new kf0(String.format("Mraid open command sent an invalid URL: %s", str));
                    case 4:
                        pe1 pe1Var = this.f52670o;
                        if (pe1Var != null) {
                            pe1Var.mo26115a();
                            return;
                        }
                        return;
                    case 5:
                        ue0 ue0Var = this.f52668m;
                        if (ue0Var != null) {
                            ue0Var.mo26329d();
                            return;
                        }
                        return;
                    case 6:
                        ue0 ue0Var2 = this.f52668m;
                        if (ue0Var2 != null) {
                            ue0Var2.mo26325b();
                            return;
                        }
                        return;
                    case 7:
                        ve0 ve0Var = this.f52667l;
                        if (ve0Var != null) {
                            ve0Var.mo22863a();
                            return;
                        }
                        return;
                    default:
                        throw new kf0("Unspecified MRAID Javascript command");
                }
            }
            throw null;
        }
        throw new kf0("Invalid state to execute this command");
    }

    /* renamed from: a */
    public final void m26644a() {
        this.f52662g.m24252b();
        vf0 vf0Var = this.f52659d;
        Context context = this.f52657b.getContext();
        String str = this.f52663h;
        Objects.requireNonNull(vf0Var);
        Objects.requireNonNull(iw0.m25739a());
        iw0.m25740a(context, str);
        this.f52666k = null;
        this.f52667l = null;
        this.f52668m = null;
        this.f52669n = null;
        this.f52670o = null;
    }
}
