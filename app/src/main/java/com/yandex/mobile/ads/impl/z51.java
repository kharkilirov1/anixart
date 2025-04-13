package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.z41;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class z51 extends AbstractC5074fe implements Handler.Callback {

    /* renamed from: A */
    private int f57039A;

    /* renamed from: B */
    private long f57040B;

    /* renamed from: n */
    @Nullable
    private final Handler f57041n;

    /* renamed from: o */
    private final y51 f57042o;

    /* renamed from: p */
    private final z41 f57043p;

    /* renamed from: q */
    private final C5658qv f57044q;

    /* renamed from: r */
    private boolean f57045r;

    /* renamed from: s */
    private boolean f57046s;

    /* renamed from: t */
    private boolean f57047t;

    /* renamed from: u */
    private int f57048u;

    /* renamed from: v */
    @Nullable
    private C5606pv f57049v;

    /* renamed from: w */
    @Nullable
    private x41 f57050w;

    /* renamed from: x */
    @Nullable
    private a51 f57051x;

    /* renamed from: y */
    @Nullable
    private b51 f57052y;

    /* renamed from: z */
    @Nullable
    private b51 f57053z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(y51 y51Var, @Nullable Looper looper) {
        super(3);
        z41 z41Var = z41.f57031a;
        this.f57042o = (y51) C5220ia.m25469a(y51Var);
        this.f57041n = looper == null ? null : s91.m28100a(looper, (Handler.Callback) this);
        this.f57043p = z41Var;
        this.f57044q = new C5658qv();
        this.f57040B = -9223372036854775807L;
    }

    /* renamed from: y */
    private long m30060y() {
        if (this.f57039A == -1) {
            return Long.MAX_VALUE;
        }
        Objects.requireNonNull(this.f57052y);
        if (this.f57039A >= this.f57052y.mo22722a()) {
            return Long.MAX_VALUE;
        }
        return this.f57052y.mo22724a(this.f57039A);
    }

    /* renamed from: z */
    private void m30061z() {
        this.f57051x = null;
        this.f57039A = -1;
        b51 b51Var = this.f57052y;
        if (b51Var != null) {
            b51Var.mo22827h();
            this.f57052y = null;
        }
        b51 b51Var2 = this.f57053z;
        if (b51Var2 != null) {
            b51Var2.mo22827h();
            this.f57053z = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.dv0
    /* renamed from: a */
    public final int mo22243a(C5606pv c5606pv) {
        if (((z41.C6106a) this.f57043p).m30055b(c5606pv)) {
            return co1.m23502a(c5606pv.f53807E == 0 ? 4 : 2);
        }
        return he0.m25143c(c5606pv.f53820l) ? co1.m23502a(1) : co1.m23502a(0);
    }

    /* renamed from: c */
    public final void m30062c(long j2) {
        C5220ia.m25476b(mo23531k());
        this.f57040B = j2;
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: d */
    public final boolean mo22248d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.cv0, com.yandex.mobile.ads.impl.dv0
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List<C5751sl> list = (List) message.obj;
        this.f57042o.onCues(list);
        this.f57042o.mo25713a(new C5871ul(list));
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: u */
    public final void mo22249u() {
        this.f57049v = null;
        this.f57040B = -9223372036854775807L;
        List<C5751sl> emptyList = Collections.emptyList();
        Handler handler = this.f57041n;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f57042o.onCues(emptyList);
            this.f57042o.mo25713a(new C5871ul(emptyList));
        }
        m30061z();
        x41 x41Var = this.f57050w;
        Objects.requireNonNull(x41Var);
        x41Var.release();
        this.f57050w = null;
        this.f57048u = 0;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo22246a(C5606pv[] c5606pvArr, long j2, long j3) {
        C5606pv c5606pv = c5606pvArr[0];
        this.f57049v = c5606pv;
        if (this.f57050w != null) {
            this.f57048u = 1;
            return;
        }
        this.f57047t = true;
        z41 z41Var = this.f57043p;
        Objects.requireNonNull(c5606pv);
        this.f57050w = ((z41.C6106a) z41Var).m30054a(c5606pv);
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final void mo22244a(long j2, long j3) {
        boolean z;
        if (mo23531k()) {
            long j4 = this.f57040B;
            if (j4 != -9223372036854775807L && j2 >= j4) {
                m30061z();
                this.f57046s = true;
            }
        }
        if (this.f57046s) {
            return;
        }
        if (this.f57053z == null) {
            x41 x41Var = this.f57050w;
            Objects.requireNonNull(x41Var);
            x41Var.mo22817a(j2);
            try {
                x41 x41Var2 = this.f57050w;
                Objects.requireNonNull(x41Var2);
                this.f57053z = x41Var2.mo22816a();
            } catch (y41 e2) {
                StringBuilder m26356a = l60.m26356a("Subtitle decoding failed. streamFormat=");
                m26356a.append(this.f57049v);
                d90.m23838a("TextRenderer", m26356a.toString(), e2);
                List<C5751sl> emptyList = Collections.emptyList();
                Handler handler = this.f57041n;
                if (handler != null) {
                    handler.obtainMessage(0, emptyList).sendToTarget();
                } else {
                    this.f57042o.onCues(emptyList);
                    this.f57042o.mo25713a(new C5871ul(emptyList));
                }
                m30061z();
                x41 x41Var3 = this.f57050w;
                Objects.requireNonNull(x41Var3);
                x41Var3.release();
                this.f57050w = null;
                this.f57048u = 0;
                this.f57047t = true;
                z41 z41Var = this.f57043p;
                C5606pv c5606pv = this.f57049v;
                Objects.requireNonNull(c5606pv);
                this.f57050w = ((z41.C6106a) z41Var).m30054a(c5606pv);
                return;
            }
        }
        if (mo23525c() != 2) {
            return;
        }
        if (this.f57052y != null) {
            long m30060y = m30060y();
            z = false;
            while (m30060y <= j2) {
                this.f57039A++;
                m30060y = m30060y();
                z = true;
            }
        } else {
            z = false;
        }
        b51 b51Var = this.f57053z;
        if (b51Var != null) {
            if (b51Var.m26638f()) {
                if (!z && m30060y() == Long.MAX_VALUE) {
                    if (this.f57048u == 2) {
                        m30061z();
                        x41 x41Var4 = this.f57050w;
                        Objects.requireNonNull(x41Var4);
                        x41Var4.release();
                        this.f57050w = null;
                        this.f57048u = 0;
                        this.f57047t = true;
                        z41 z41Var2 = this.f57043p;
                        C5606pv c5606pv2 = this.f57049v;
                        Objects.requireNonNull(c5606pv2);
                        this.f57050w = ((z41.C6106a) z41Var2).m30054a(c5606pv2);
                    } else {
                        m30061z();
                        this.f57046s = true;
                    }
                }
            } else if (b51Var.f55152b <= j2) {
                b51 b51Var2 = this.f57052y;
                if (b51Var2 != null) {
                    b51Var2.mo22827h();
                }
                this.f57039A = b51Var.mo22723a(j2);
                this.f57052y = b51Var;
                this.f57053z = null;
                z = true;
            }
        }
        if (z) {
            Objects.requireNonNull(this.f57052y);
            List<C5751sl> mo22726b = this.f57052y.mo22726b(j2);
            Handler handler2 = this.f57041n;
            if (handler2 != null) {
                handler2.obtainMessage(0, mo22726b).sendToTarget();
            } else {
                this.f57042o.onCues(mo22726b);
                this.f57042o.mo25713a(new C5871ul(mo22726b));
            }
        }
        if (this.f57048u == 2) {
            return;
        }
        while (!this.f57045r) {
            try {
                a51 a51Var = this.f57051x;
                if (a51Var == null) {
                    x41 x41Var5 = this.f57050w;
                    Objects.requireNonNull(x41Var5);
                    a51Var = x41Var5.mo22820b();
                    if (a51Var == null) {
                        return;
                    } else {
                        this.f57051x = a51Var;
                    }
                }
                if (this.f57048u == 1) {
                    a51Var.m26635d(4);
                    x41 x41Var6 = this.f57050w;
                    Objects.requireNonNull(x41Var6);
                    x41Var6.mo22818a(a51Var);
                    this.f57051x = null;
                    this.f57048u = 2;
                    return;
                }
                int m24559a = m24559a(this.f57044q, a51Var, 0);
                if (m24559a == -4) {
                    if (a51Var.m26638f()) {
                        this.f57045r = true;
                        this.f57047t = false;
                    } else {
                        C5606pv c5606pv3 = this.f57044q.f54140b;
                        if (c5606pv3 == null) {
                            return;
                        }
                        a51Var.f48313i = c5606pv3.f53824p;
                        a51Var.m28324h();
                        this.f57047t &= !a51Var.m26639g();
                    }
                    if (!this.f57047t) {
                        x41 x41Var7 = this.f57050w;
                        Objects.requireNonNull(x41Var7);
                        x41Var7.mo22818a(a51Var);
                        this.f57051x = null;
                    }
                } else if (m24559a == -3) {
                    return;
                }
            } catch (y41 e3) {
                StringBuilder m26356a2 = l60.m26356a("Subtitle decoding failed. streamFormat=");
                m26356a2.append(this.f57049v);
                d90.m23838a("TextRenderer", m26356a2.toString(), e3);
                List<C5751sl> emptyList2 = Collections.emptyList();
                Handler handler3 = this.f57041n;
                if (handler3 != null) {
                    handler3.obtainMessage(0, emptyList2).sendToTarget();
                } else {
                    this.f57042o.onCues(emptyList2);
                    this.f57042o.mo25713a(new C5871ul(emptyList2));
                }
                m30061z();
                x41 x41Var8 = this.f57050w;
                Objects.requireNonNull(x41Var8);
                x41Var8.release();
                this.f57050w = null;
                this.f57048u = 0;
                this.f57047t = true;
                z41 z41Var3 = this.f57043p;
                C5606pv c5606pv4 = this.f57049v;
                Objects.requireNonNull(c5606pv4);
                this.f57050w = ((z41.C6106a) z41Var3).m30054a(c5606pv4);
                return;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.cv0
    /* renamed from: a */
    public final boolean mo22247a() {
        return this.f57046s;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5074fe
    /* renamed from: a */
    public final void mo22245a(long j2, boolean z) {
        List<C5751sl> emptyList = Collections.emptyList();
        Handler handler = this.f57041n;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.f57042o.onCues(emptyList);
            this.f57042o.mo25713a(new C5871ul(emptyList));
        }
        this.f57045r = false;
        this.f57046s = false;
        this.f57040B = -9223372036854775807L;
        if (this.f57048u != 0) {
            m30061z();
            x41 x41Var = this.f57050w;
            Objects.requireNonNull(x41Var);
            x41Var.release();
            this.f57050w = null;
            this.f57048u = 0;
            this.f57047t = true;
            z41 z41Var = this.f57043p;
            C5606pv c5606pv = this.f57049v;
            Objects.requireNonNull(c5606pv);
            this.f57050w = ((z41.C6106a) z41Var).m30054a(c5606pv);
            return;
        }
        m30061z();
        x41 x41Var2 = this.f57050w;
        Objects.requireNonNull(x41Var2);
        x41Var2.flush();
    }
}
