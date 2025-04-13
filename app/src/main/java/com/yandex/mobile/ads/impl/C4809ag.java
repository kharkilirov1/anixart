package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5657qu;
import com.yandex.mobile.ads.impl.C6120zf;
import com.yandex.mobile.ads.impl.InterfaceC4978dm;
import com.yandex.mobile.ads.impl.InterfaceC5970wf;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.ag */
/* loaded from: classes3.dex */
public final class C4809ag implements InterfaceC4978dm {

    /* renamed from: a */
    private final InterfaceC5970wf f48516a;

    /* renamed from: b */
    private final InterfaceC4978dm f48517b;

    /* renamed from: c */
    @Nullable
    private final t51 f48518c;

    /* renamed from: d */
    private final InterfaceC4978dm f48519d;

    /* renamed from: e */
    private final InterfaceC5228ig f48520e;

    /* renamed from: f */
    private final boolean f48521f;

    /* renamed from: g */
    private final boolean f48522g;

    /* renamed from: h */
    private final boolean f48523h;

    /* renamed from: i */
    @Nullable
    private Uri f48524i;

    /* renamed from: j */
    @Nullable
    private C5192hm f48525j;

    /* renamed from: k */
    @Nullable
    private C5192hm f48526k;

    /* renamed from: l */
    @Nullable
    private InterfaceC4978dm f48527l;

    /* renamed from: m */
    private long f48528m;

    /* renamed from: n */
    private long f48529n;

    /* renamed from: o */
    private long f48530o;

    /* renamed from: p */
    @Nullable
    private C5284jg f48531p;

    /* renamed from: q */
    private boolean f48532q;

    /* renamed from: r */
    private boolean f48533r;

    /* renamed from: s */
    private long f48534s;

    /* renamed from: t */
    private long f48535t;

    /* renamed from: com.yandex.mobile.ads.impl.ag$a */
    public interface a {
        /* renamed from: a */
        void m22493a();

        /* renamed from: b */
        void m22494b();
    }

    /* renamed from: com.yandex.mobile.ads.impl.ag$b */
    public static final class b implements InterfaceC4978dm.a {

        /* renamed from: a */
        private InterfaceC5970wf f48536a;

        /* renamed from: b */
        private C5657qu.b f48537b = new C5657qu.b();

        /* renamed from: c */
        private InterfaceC5228ig f48538c = InterfaceC5228ig.f51292a;

        /* renamed from: d */
        @Nullable
        private InterfaceC4978dm.a f48539d;

        /* renamed from: a */
        public final b m22496a(InterfaceC5970wf interfaceC5970wf) {
            this.f48536a = interfaceC5970wf;
            return this;
        }

        /* renamed from: b */
        public final C4809ag m22498b() {
            InterfaceC4978dm.a aVar = this.f48539d;
            InterfaceC4978dm mo22497a = aVar != null ? aVar.mo22497a() : null;
            int i2 = 1;
            int i3 = -1000;
            InterfaceC5970wf interfaceC5970wf = this.f48536a;
            Objects.requireNonNull(interfaceC5970wf);
            C6120zf m30167a = mo22497a != null ? new C6120zf.b().m30166a(interfaceC5970wf).m30167a() : null;
            Objects.requireNonNull(this.f48537b);
            return new C4809ag(interfaceC5970wf, mo22497a, new C5657qu(), m30167a, this.f48538c, i2, i3, 0);
        }

        /* renamed from: a */
        public final b m22495a(@Nullable InterfaceC4978dm.a aVar) {
            this.f48539d = aVar;
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm.a
        /* renamed from: a */
        public final InterfaceC4978dm mo22497a() {
            InterfaceC4978dm.a aVar = this.f48539d;
            InterfaceC4978dm mo22497a = aVar != null ? aVar.mo22497a() : null;
            int i2 = 0;
            int i3 = 0;
            InterfaceC5970wf interfaceC5970wf = this.f48536a;
            Objects.requireNonNull(interfaceC5970wf);
            C6120zf m30167a = mo22497a != null ? new C6120zf.b().m30166a(interfaceC5970wf).m30167a() : null;
            Objects.requireNonNull(this.f48537b);
            return new C4809ag(interfaceC5970wf, mo22497a, new C5657qu(), m30167a, this.f48538c, i2, i3, 0);
        }
    }

    public /* synthetic */ C4809ag(InterfaceC5970wf interfaceC5970wf, InterfaceC4978dm interfaceC4978dm, C5657qu c5657qu, C6120zf c6120zf, InterfaceC5228ig interfaceC5228ig, int i2, int i3, int i4) {
        this(interfaceC5970wf, interfaceC4978dm, c5657qu, c6120zf, interfaceC5228ig, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    private void m22485f() throws IOException {
        InterfaceC4978dm interfaceC4978dm = this.f48527l;
        if (interfaceC4978dm == null) {
            return;
        }
        try {
            interfaceC4978dm.close();
        } finally {
            this.f48526k = null;
            this.f48527l = null;
            C5284jg c5284jg = this.f48531p;
            if (c5284jg != null) {
                this.f48516a.mo22706b(c5284jg);
                this.f48531p = null;
            }
        }
    }

    /* renamed from: i */
    private boolean m22486i() {
        return !(this.f48527l == this.f48517b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final void mo22488a(v71 v71Var) {
        Objects.requireNonNull(v71Var);
        this.f48517b.mo22488a(v71Var);
        this.f48519d.mo22488a(v71Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: b */
    public final Map<String, List<String>> mo22489b() {
        return m22486i() ? this.f48519d.mo22489b() : Collections.emptyMap();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() throws IOException {
        this.f48525j = null;
        this.f48524i = null;
        this.f48529n = 0L;
        try {
            m22485f();
        } catch (Throwable th) {
            if ((this.f48527l == this.f48517b) || (th instanceof InterfaceC5970wf.a)) {
                this.f48532q = true;
            }
            throw th;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        return this.f48524i;
    }

    /* renamed from: g */
    public final InterfaceC5970wf m22491g() {
        return this.f48516a;
    }

    /* renamed from: h */
    public final InterfaceC5228ig m22492h() {
        return this.f48520e;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.f48530o == 0) {
            return -1;
        }
        C5192hm c5192hm = this.f48525j;
        Objects.requireNonNull(c5192hm);
        C5192hm c5192hm2 = this.f48526k;
        Objects.requireNonNull(c5192hm2);
        try {
            if (this.f48529n >= this.f48535t) {
                m22484a(c5192hm, true);
            }
            InterfaceC4978dm interfaceC4978dm = this.f48527l;
            Objects.requireNonNull(interfaceC4978dm);
            int read = interfaceC4978dm.read(bArr, i2, i3);
            if (read == -1) {
                if (m22486i()) {
                    long j2 = c5192hm2.f50973g;
                    if (j2 == -1 || this.f48528m < j2) {
                        String str = c5192hm.f50974h;
                        int i4 = s91.f54530a;
                        this.f48530o = 0L;
                        if (this.f48527l == this.f48518c) {
                            C5643qk c5643qk = new C5643qk();
                            C5643qk.m27743a(c5643qk, this.f48529n);
                            this.f48516a.mo22703a(str, c5643qk);
                        }
                    }
                }
                long j3 = this.f48530o;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                m22485f();
                m22484a(c5192hm, false);
                return read(bArr, i2, i3);
            }
            if (this.f48527l == this.f48517b) {
                this.f48534s += read;
            }
            long j4 = read;
            this.f48529n += j4;
            this.f48528m += j4;
            long j5 = this.f48530o;
            if (j5 != -1) {
                this.f48530o = j5 - j4;
            }
            return read;
        } catch (Throwable th) {
            if ((this.f48527l == this.f48517b) || (th instanceof InterfaceC5970wf.a)) {
                this.f48532q = true;
            }
            throw th;
        }
    }

    private C4809ag(InterfaceC5970wf interfaceC5970wf, @Nullable InterfaceC4978dm interfaceC4978dm, C5657qu c5657qu, @Nullable C6120zf c6120zf, @Nullable InterfaceC5228ig interfaceC5228ig, int i2, int i3) {
        this.f48516a = interfaceC5970wf;
        this.f48517b = c5657qu;
        this.f48520e = interfaceC5228ig == null ? InterfaceC5228ig.f51292a : interfaceC5228ig;
        this.f48521f = (i2 & 1) != 0;
        this.f48522g = (i2 & 2) != 0;
        this.f48523h = (i2 & 4) != 0;
        if (interfaceC4978dm != null) {
            this.f48519d = interfaceC4978dm;
            this.f48518c = c6120zf != null ? new t51(interfaceC4978dm, c6120zf) : null;
        } else {
            this.f48519d = cq0.f49337a;
            this.f48518c = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws IOException {
        char c2;
        try {
            String mo23917a = this.f48520e.mo23917a(c5192hm);
            C5192hm m25244a = c5192hm.m25234a().m25241a(mo23917a).m25244a();
            this.f48525j = m25244a;
            InterfaceC5970wf interfaceC5970wf = this.f48516a;
            Uri uri = m25244a.f50967a;
            String m26172c = interfaceC5970wf.mo22705b(mo23917a).m26172c();
            Uri parse = m26172c == null ? null : Uri.parse(m26172c);
            if (parse != null) {
                uri = parse;
            }
            this.f48524i = uri;
            this.f48529n = c5192hm.f50972f;
            if (this.f48522g && this.f48532q) {
                c2 = 0;
            } else {
                c2 = (this.f48523h && c5192hm.f50973g == -1) ? (char) 1 : (char) 65535;
            }
            boolean z = c2 != 65535;
            this.f48533r = z;
            if (z) {
                this.f48530o = -1L;
            } else {
                long m26171b = this.f48516a.mo22705b(mo23917a).m26171b();
                this.f48530o = m26171b;
                if (m26171b != -1) {
                    long j2 = m26171b - c5192hm.f50972f;
                    this.f48530o = j2;
                    if (j2 < 0) {
                        throw new C5035em(2008);
                    }
                }
            }
            long j3 = c5192hm.f50973g;
            if (j3 != -1) {
                long j4 = this.f48530o;
                if (j4 != -1) {
                    j3 = Math.min(j4, j3);
                }
                this.f48530o = j3;
            }
            long j5 = this.f48530o;
            if (j5 > 0 || j5 == -1) {
                m22484a(m25244a, false);
            }
            long j6 = c5192hm.f50973g;
            return j6 != -1 ? j6 : this.f48530o;
        } catch (Throwable th) {
            if ((this.f48527l == this.f48517b) || (th instanceof InterfaceC5970wf.a)) {
                this.f48532q = true;
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m22484a(C5192hm c5192hm, boolean z) throws IOException {
        C5284jg mo22709e;
        C5192hm m25244a;
        InterfaceC4978dm interfaceC4978dm;
        String str = c5192hm.f50974h;
        int i2 = s91.f54530a;
        if (this.f48533r) {
            mo22709e = null;
        } else if (this.f48521f) {
            try {
                mo22709e = this.f48516a.mo22709e(str, this.f48529n, this.f48530o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            mo22709e = this.f48516a.mo22707c(str, this.f48529n, this.f48530o);
        }
        if (mo22709e == null) {
            interfaceC4978dm = this.f48519d;
            m25244a = c5192hm.m25234a().m25246b(this.f48529n).m25239a(this.f48530o).m25244a();
        } else if (mo22709e.f51600d) {
            Uri fromFile = Uri.fromFile(mo22709e.f51601e);
            long j2 = mo22709e.f51598b;
            long j3 = this.f48529n - j2;
            long j4 = mo22709e.f51599c - j3;
            long j5 = this.f48530o;
            if (j5 != -1) {
                j4 = Math.min(j4, j5);
            }
            m25244a = c5192hm.m25234a().m25240a(fromFile).m25248c(j2).m25246b(j3).m25239a(j4).m25244a();
            interfaceC4978dm = this.f48517b;
        } else {
            long j6 = mo22709e.f51599c;
            if (j6 == -1) {
                j6 = this.f48530o;
            } else {
                long j7 = this.f48530o;
                if (j7 != -1) {
                    j6 = Math.min(j6, j7);
                }
            }
            m25244a = c5192hm.m25234a().m25246b(this.f48529n).m25239a(j6).m25244a();
            interfaceC4978dm = this.f48518c;
            if (interfaceC4978dm == null) {
                interfaceC4978dm = this.f48519d;
                this.f48516a.mo22706b(mo22709e);
                mo22709e = null;
            }
        }
        this.f48535t = (this.f48533r || interfaceC4978dm != this.f48519d) ? Long.MAX_VALUE : this.f48529n + 102400;
        if (z) {
            C5220ia.m25476b(this.f48527l == this.f48519d);
            if (interfaceC4978dm == this.f48519d) {
                return;
            }
            try {
                m22485f();
            } finally {
            }
        }
        if (mo22709e != null && (!mo22709e.f51600d)) {
            this.f48531p = mo22709e;
        }
        this.f48527l = interfaceC4978dm;
        this.f48526k = m25244a;
        this.f48528m = 0L;
        long mo22487a = interfaceC4978dm.mo22487a(m25244a);
        C5643qk c5643qk = new C5643qk();
        if (m25244a.f50973g == -1 && mo22487a != -1) {
            this.f48530o = mo22487a;
            C5643qk.m27743a(c5643qk, this.f48529n + mo22487a);
        }
        if (m22486i()) {
            Uri mo22490d = interfaceC4978dm.mo22490d();
            this.f48524i = mo22490d;
            C5643qk.m27744a(c5643qk, c5192hm.f50967a.equals(mo22490d) ^ true ? this.f48524i : null);
        }
        if (this.f48527l == this.f48518c) {
            this.f48516a.mo22703a(str, c5643qk);
        }
    }
}
