package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5754sn;
import com.yandex.mobile.ads.impl.InterfaceC4978dm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ln */
/* loaded from: classes3.dex */
public final class C5405ln implements InterfaceC4978dm {

    /* renamed from: a */
    private final Context f52463a;

    /* renamed from: b */
    private final ArrayList f52464b = new ArrayList();

    /* renamed from: c */
    private final InterfaceC4978dm f52465c;

    /* renamed from: d */
    @Nullable
    private C5657qu f52466d;

    /* renamed from: e */
    @Nullable
    private C5788ta f52467e;

    /* renamed from: f */
    @Nullable
    private C5594pk f52468f;

    /* renamed from: g */
    @Nullable
    private InterfaceC4978dm f52469g;

    /* renamed from: h */
    @Nullable
    private s81 f52470h;

    /* renamed from: i */
    @Nullable
    private C4876bm f52471i;

    /* renamed from: j */
    @Nullable
    private bu0 f52472j;

    /* renamed from: k */
    @Nullable
    private InterfaceC4978dm f52473k;

    /* renamed from: com.yandex.mobile.ads.impl.ln$a */
    public static final class a implements InterfaceC4978dm.a {

        /* renamed from: a */
        private final Context f52474a;

        /* renamed from: b */
        private final InterfaceC4978dm.a f52475b;

        public a(Context context) {
            this(context, new C5754sn.a());
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm.a
        /* renamed from: a */
        public final InterfaceC4978dm mo22497a() {
            return new C5405ln(this.f52474a, this.f52475b.mo22497a());
        }

        public a(Context context, InterfaceC4978dm.a aVar) {
            this.f52474a = context.getApplicationContext();
            this.f52475b = aVar;
        }
    }

    public C5405ln(Context context, InterfaceC4978dm interfaceC4978dm) {
        this.f52463a = context.getApplicationContext();
        this.f52465c = (InterfaceC4978dm) C5220ia.m25469a(interfaceC4978dm);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final void mo22488a(v71 v71Var) {
        Objects.requireNonNull(v71Var);
        this.f52465c.mo22488a(v71Var);
        this.f52464b.add(v71Var);
        C5657qu c5657qu = this.f52466d;
        if (c5657qu != null) {
            c5657qu.mo22488a(v71Var);
        }
        C5788ta c5788ta = this.f52467e;
        if (c5788ta != null) {
            c5788ta.mo22488a(v71Var);
        }
        C5594pk c5594pk = this.f52468f;
        if (c5594pk != null) {
            c5594pk.mo22488a(v71Var);
        }
        InterfaceC4978dm interfaceC4978dm = this.f52469g;
        if (interfaceC4978dm != null) {
            interfaceC4978dm.mo22488a(v71Var);
        }
        s81 s81Var = this.f52470h;
        if (s81Var != null) {
            s81Var.mo22488a(v71Var);
        }
        C4876bm c4876bm = this.f52471i;
        if (c4876bm != null) {
            c4876bm.mo22488a(v71Var);
        }
        bu0 bu0Var = this.f52472j;
        if (bu0Var != null) {
            bu0Var.mo22488a(v71Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: b */
    public final Map<String, List<String>> mo22489b() {
        InterfaceC4978dm interfaceC4978dm = this.f52473k;
        return interfaceC4978dm == null ? Collections.emptyMap() : interfaceC4978dm.mo22489b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() throws IOException {
        InterfaceC4978dm interfaceC4978dm = this.f52473k;
        if (interfaceC4978dm != null) {
            try {
                interfaceC4978dm.close();
            } finally {
                this.f52473k = null;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        InterfaceC4978dm interfaceC4978dm = this.f52473k;
        if (interfaceC4978dm == null) {
            return null;
        }
        return interfaceC4978dm.mo22490d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        InterfaceC4978dm interfaceC4978dm = this.f52473k;
        Objects.requireNonNull(interfaceC4978dm);
        return interfaceC4978dm.read(bArr, i2, i3);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws IOException {
        boolean z = true;
        C5220ia.m25476b(this.f52473k == null);
        String scheme = c5192hm.f50967a.getScheme();
        Uri uri = c5192hm.f50967a;
        int i2 = s91.f54530a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z = false;
        }
        if (z) {
            String path = c5192hm.f50967a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f52467e == null) {
                    C5788ta c5788ta = new C5788ta(this.f52463a);
                    this.f52467e = c5788ta;
                    m26503a(c5788ta);
                }
                this.f52473k = this.f52467e;
            } else {
                if (this.f52466d == null) {
                    C5657qu c5657qu = new C5657qu();
                    this.f52466d = c5657qu;
                    m26503a(c5657qu);
                }
                this.f52473k = this.f52466d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f52467e == null) {
                C5788ta c5788ta2 = new C5788ta(this.f52463a);
                this.f52467e = c5788ta2;
                m26503a(c5788ta2);
            }
            this.f52473k = this.f52467e;
        } else if ("content".equals(scheme)) {
            if (this.f52468f == null) {
                C5594pk c5594pk = new C5594pk(this.f52463a);
                this.f52468f = c5594pk;
                m26503a(c5594pk);
            }
            this.f52473k = this.f52468f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f52469g == null) {
                try {
                    InterfaceC4978dm interfaceC4978dm = (InterfaceC4978dm) Class.forName("com.yandex.mobile.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f52469g = interfaceC4978dm;
                    m26503a(interfaceC4978dm);
                } catch (ClassNotFoundException unused) {
                    d90.m23842d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating RTMP extension", e2);
                }
                if (this.f52469g == null) {
                    this.f52469g = this.f52465c;
                }
            }
            this.f52473k = this.f52469g;
        } else if ("udp".equals(scheme)) {
            if (this.f52470h == null) {
                s81 s81Var = new s81(0);
                this.f52470h = s81Var;
                m26503a(s81Var);
            }
            this.f52473k = this.f52470h;
        } else if ("data".equals(scheme)) {
            if (this.f52471i == null) {
                C4876bm c4876bm = new C4876bm();
                this.f52471i = c4876bm;
                m26503a(c4876bm);
            }
            this.f52473k = this.f52471i;
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.f52473k = this.f52465c;
        } else {
            if (this.f52472j == null) {
                bu0 bu0Var = new bu0(this.f52463a);
                this.f52472j = bu0Var;
                m26503a(bu0Var);
            }
            this.f52473k = this.f52472j;
        }
        return this.f52473k.mo22487a(c5192hm);
    }

    /* renamed from: a */
    private void m26503a(InterfaceC4978dm interfaceC4978dm) {
        for (int i2 = 0; i2 < this.f52464b.size(); i2++) {
            interfaceC4978dm.mo22488a((v71) this.f52464b.get(i2));
        }
    }
}
