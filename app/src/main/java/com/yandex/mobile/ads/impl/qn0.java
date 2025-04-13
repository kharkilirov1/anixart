package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.upstream.HttpUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Predicate;
import com.google.common.util.concurrent.SettableFuture;
import com.yandex.mobile.ads.impl.InterfaceC5537og;
import com.yandex.mobile.ads.impl.aw0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class qn0 extends AbstractC6022xd {

    /* renamed from: e */
    private final InterfaceC5537og.a f54105e;

    /* renamed from: f */
    private final i00 f54106f;

    /* renamed from: g */
    @Nullable
    private final String f54107g;

    /* renamed from: h */
    @Nullable
    private final C6074yf f54108h;

    /* renamed from: i */
    @Nullable
    private final i00 f54109i;

    /* renamed from: j */
    @Nullable
    private Predicate<String> f54110j;

    /* renamed from: k */
    @Nullable
    private C5192hm f54111k;

    /* renamed from: l */
    @Nullable
    private rw0 f54112l;

    /* renamed from: m */
    @Nullable
    private InputStream f54113m;

    /* renamed from: n */
    private boolean f54114n;

    /* renamed from: o */
    private long f54115o;

    /* renamed from: p */
    private long f54116p;

    static {
        C5411ls.m26526a("goog.exo.okhttp");
    }

    public qn0(mn0 mn0Var, @Nullable String str, @Nullable i00 i00Var) {
        super(true);
        Objects.requireNonNull(mn0Var);
        this.f54105e = mn0Var;
        this.f54107g = str;
        this.f54108h = null;
        this.f54109i = i00Var;
        this.f54110j = null;
        this.f54106f = new i00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws f00 {
        this.f54111k = c5192hm;
        long j2 = 0;
        this.f54116p = 0L;
        this.f54115o = 0L;
        m29738b(c5192hm);
        long j3 = c5192hm.f50972f;
        long j4 = c5192hm.f50973g;
        t00 m28384a = t00.m28384a(c5192hm.f50967a.toString());
        if (m28384a == null) {
            throw new f00("Malformed URL", 1004);
        }
        aw0.C4827a m22642a = new aw0.C4827a().m22642a(m28384a);
        C6074yf c6074yf = this.f54108h;
        if (c6074yf != null) {
            m22642a.m22646a(c6074yf);
        }
        HashMap hashMap = new HashMap();
        i00 i00Var = this.f54109i;
        if (i00Var != null) {
            hashMap.putAll(i00Var.m25421a());
        }
        hashMap.putAll(this.f54106f.m25421a());
        hashMap.putAll(c5192hm.f50971e);
        for (Map.Entry entry : hashMap.entrySet()) {
            m22642a.m22649b((String) entry.getKey(), (String) entry.getValue());
        }
        String m7466a = HttpUtil.m7466a(j3, j4);
        if (m7466a != null) {
            m22642a.m22648a("Range", m7466a);
        }
        String str = this.f54107g;
        if (str != null) {
            m22642a.m22648a("User-Agent", str);
        }
        if (!c5192hm.m25236a(1)) {
            m22642a.m22648a("Accept-Encoding", "identity");
        }
        byte[] bArr = c5192hm.f50970d;
        m22642a.m22643a(c5192hm.m25237b(), bArr != null ? dw0.m23947a(bArr) : c5192hm.f50969c == 2 ? dw0.m23947a(Util.f14741f) : null);
        ju0 mo26699a = this.f54105e.mo26699a(m22642a.m22645a());
        try {
            SettableFuture settableFuture = new SettableFuture();
            mo26699a.m25962a(new pn0(settableFuture));
            try {
                rw0 rw0Var = (rw0) settableFuture.get();
                this.f54112l = rw0Var;
                vw0 m27993a = rw0Var.m27993a();
                Objects.requireNonNull(m27993a);
                this.f54113m = m27993a.m29281a();
                int m27997e = rw0Var.m27997e();
                if (!rw0Var.m28001i()) {
                    if (m27997e == 416) {
                        if (c5192hm.f50972f == u00.m28812a(rw0Var.m28000h().m25381a("Content-Range"))) {
                            this.f54114n = true;
                            m29740c(c5192hm);
                            long j5 = c5192hm.f50973g;
                            if (j5 != -1) {
                                return j5;
                            }
                            return 0L;
                        }
                    }
                    try {
                        InputStream inputStream = this.f54113m;
                        Objects.requireNonNull(inputStream);
                        Util.m7729a0(inputStream);
                    } catch (IOException unused) {
                        byte[] bArr2 = Util.f14741f;
                    }
                    TreeMap m25384c = rw0Var.m28000h().m25384c();
                    rw0 rw0Var2 = this.f54112l;
                    if (rw0Var2 != null) {
                        vw0 m27993a2 = rw0Var2.m27993a();
                        Objects.requireNonNull(m27993a2);
                        m27993a2.close();
                        this.f54112l = null;
                    }
                    this.f54113m = null;
                    throw new h00(m27997e, m27997e == 416 ? new C5035em(2008) : null, m25384c);
                }
                hc0 mo27788c = m27993a.mo27788c();
                String hc0Var = mo27788c != null ? mo27788c.toString() : "";
                Predicate<String> predicate = this.f54110j;
                if (predicate != null && !predicate.apply(hc0Var)) {
                    rw0 rw0Var3 = this.f54112l;
                    if (rw0Var3 != null) {
                        vw0 m27993a3 = rw0Var3.m27993a();
                        Objects.requireNonNull(m27993a3);
                        m27993a3.close();
                        this.f54112l = null;
                    }
                    this.f54113m = null;
                    throw new g00(hc0Var);
                }
                if (m27997e == 200) {
                    long j6 = c5192hm.f50972f;
                    if (j6 != 0) {
                        j2 = j6;
                    }
                }
                long j7 = c5192hm.f50973g;
                if (j7 != -1) {
                    this.f54115o = j7;
                } else {
                    long mo27787b = m27993a.mo27787b();
                    this.f54115o = mo27787b != -1 ? mo27787b - j2 : -1L;
                }
                this.f54114n = true;
                m29740c(c5192hm);
                try {
                    m27759a(j2);
                    return this.f54115o;
                } catch (f00 e2) {
                    rw0 rw0Var4 = this.f54112l;
                    if (rw0Var4 != null) {
                        vw0 m27993a4 = rw0Var4.m27993a();
                        Objects.requireNonNull(m27993a4);
                        m27993a4.close();
                        this.f54112l = null;
                    }
                    this.f54113m = null;
                    throw e2;
                }
            } catch (InterruptedException unused2) {
                mo26699a.m25959a();
                throw new InterruptedIOException();
            } catch (ExecutionException e3) {
                throw new IOException(e3);
            }
        } catch (IOException e4) {
            throw f00.m24288a(e4, 1);
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC6022xd, com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: b */
    public final Map<String, List<String>> mo22489b() {
        rw0 rw0Var = this.f54112l;
        return rw0Var == null ? Collections.emptyMap() : rw0Var.m28000h().m25384c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() {
        if (this.f54114n) {
            this.f54114n = false;
            m29741f();
            rw0 rw0Var = this.f54112l;
            if (rw0Var != null) {
                vw0 m27993a = rw0Var.m27993a();
                Objects.requireNonNull(m27993a);
                m27993a.close();
                this.f54112l = null;
            }
            this.f54113m = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        rw0 rw0Var = this.f54112l;
        if (rw0Var == null) {
            return null;
        }
        return Uri.parse(rw0Var.m28008p().m22640h().toString());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws f00 {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.f54115o;
            if (j2 != -1) {
                long j3 = j2 - this.f54116p;
                if (j3 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j3);
            }
            InputStream inputStream = this.f54113m;
            int i4 = Util.f14736a;
            int read = inputStream.read(bArr, i2, i3);
            if (read == -1) {
                return -1;
            }
            this.f54116p += read;
            m29739c(read);
            return read;
        } catch (IOException e2) {
            int i5 = Util.f14736a;
            throw f00.m24288a(e2, 2);
        }
    }

    /* renamed from: a */
    private void m27759a(long j2) throws f00 {
        if (j2 == 0) {
            return;
        }
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (j2 > 0) {
            try {
                int min = (int) Math.min(j2, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
                InputStream inputStream = this.f54113m;
                int i2 = Util.f14736a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read != -1) {
                    j2 -= read;
                    m29739c(read);
                } else {
                    throw new f00(2008);
                }
            } catch (IOException e2) {
                if (e2 instanceof f00) {
                    throw ((f00) e2);
                }
                throw new f00(2000);
            }
        }
    }
}
