package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.banner.C4636d;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.AbstractC4967de;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.impl.yp0;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.mobile.ads.impl.td */
/* loaded from: classes3.dex */
public abstract class AbstractC5794td<T> implements yp0.InterfaceC6087a, InterfaceC5538oh, AbstractC4967de.a<AdResponse<T>> {

    /* renamed from: b */
    @NonNull
    public final Context f55053b;

    /* renamed from: d */
    @NonNull
    private final Executor f55055d;

    /* renamed from: f */
    @NonNull
    public final C5101g2 f55057f;

    /* renamed from: h */
    @NonNull
    private final l01 f55059h;

    /* renamed from: i */
    @NonNull
    private final C4965dc f55060i;

    /* renamed from: j */
    @NonNull
    public final C5724s3 f55061j;

    /* renamed from: k */
    @NonNull
    public final k80 f55062k;

    /* renamed from: l */
    @NonNull
    public final wz0 f55063l;

    /* renamed from: m */
    @NonNull
    private final C5329k9 f55064m;

    /* renamed from: n */
    @NonNull
    private final C5486ne f55065n;

    /* renamed from: r */
    private boolean f55069r;

    /* renamed from: s */
    private long f55070s;

    /* renamed from: t */
    @Nullable
    public AdResponse<T> f55071t;

    /* renamed from: u */
    @Nullable
    private InterfaceC5470n2 f55072u;

    /* renamed from: v */
    @Nullable
    private String f55073v;

    /* renamed from: a */
    @NonNull
    public final Handler f55052a = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    @NonNull
    public final C5616q2 f55054c = new C5616q2(this);

    /* renamed from: q */
    @NonNull
    private EnumC5901v3 f55068q = EnumC5901v3.f55739b;

    /* renamed from: e */
    @NonNull
    private final yp0 f55056e = yp0.m29957a();

    /* renamed from: o */
    @NonNull
    private final t41 f55066o = t41.m28460a();

    /* renamed from: p */
    @NonNull
    private final qw0 f55067p = new qw0();

    /* renamed from: g */
    @NonNull
    private final C5379l6 f55058g = new C5379l6();

    /* renamed from: com.yandex.mobile.ads.impl.td$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ d91 f55074b;

        /* renamed from: com.yandex.mobile.ads.impl.td$a$a, reason: collision with other inner class name */
        public class C7020a implements InterfaceC5117gc {
            public C7020a() {
            }

            @Override // com.yandex.mobile.ads.impl.InterfaceC5117gc
            /* renamed from: a */
            public final void mo24840a(@Nullable String str) {
                AbstractC5794td.this.f55061j.m28050a(EnumC5668r3.f54172e);
                AbstractC5794td.this.f55057f.m24777b(str);
                a aVar = a.this;
                AbstractC5794td.this.m28613b(aVar.f55074b);
            }
        }

        public a(d91 d91Var) {
            this.f55074b = d91Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C4965dc c4965dc = AbstractC5794td.this.f55060i;
            AbstractC5794td abstractC5794td = AbstractC5794td.this;
            c4965dc.m23864a(abstractC5794td.f55053b, abstractC5794td.f55064m, new C7020a());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.td$b */
    public class b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C5563p2 f55077b;

        public b(C5563p2 c5563p2) {
            this.f55077b = c5563p2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC5794td.this.mo26772a(this.f55077b);
        }
    }

    public AbstractC5794td(@NonNull Context context, @NonNull EnumC5007e6 enumC5007e6, @NonNull C5724s3 c5724s3) {
        this.f55053b = context;
        this.f55061j = c5724s3;
        C5101g2 c5101g2 = new C5101g2(enumC5007e6);
        this.f55057f = c5101g2;
        Executor m27019b = o80.m27018a().m27019b();
        this.f55055d = m27019b;
        this.f55063l = new wz0(context, m27019b, c5724s3);
        this.f55059h = new l01();
        this.f55060i = C5015ec.m24092a();
        this.f55064m = C5389l9.m26397a();
        this.f55065n = new C5486ne(c5101g2);
        this.f55062k = new k80(context, c5101g2);
    }

    @NonNull
    /* renamed from: a */
    public abstract AbstractC5630qd<T> mo23561a(String str, String str2);

    @Override // com.yandex.mobile.ads.impl.yp0.InterfaceC6087a
    /* renamed from: a */
    public void mo21796a(@NonNull Intent intent) {
        StringBuilder m26356a = l60.m26356a("action = ");
        m26356a.append(intent.getAction());
        n60.m26811d(m26356a.toString(), new Object[0]);
    }

    @NonNull
    /* renamed from: e */
    public final C5724s3 m28617e() {
        return this.f55061j;
    }

    /* renamed from: f */
    public final synchronized AdRequest m28618f() {
        return this.f55057f.m24765a();
    }

    @NonNull
    /* renamed from: g */
    public final EnumC5901v3 m28619g() {
        return this.f55068q;
    }

    @Nullable
    /* renamed from: h */
    public final AdResponse<T> m28620h() {
        return this.f55071t;
    }

    @NonNull
    /* renamed from: i */
    public final Context m28621i() {
        return this.f55053b;
    }

    @Nullable
    /* renamed from: j */
    public final SizeInfo m28622j() {
        return this.f55057f.m24792n();
    }

    /* renamed from: k */
    public final synchronized boolean m28623k() {
        return this.f55068q == EnumC5901v3.f55738a;
    }

    /* renamed from: l */
    public final boolean m28624l() {
        return !this.f55056e.m29961b(this.f55053b);
    }

    /* renamed from: m */
    public void mo26774m() {
        mo21798n();
    }

    /* renamed from: n */
    public synchronized void mo21798n() {
        n60.m26811d("notifyListenersOnSuccessAdLoaded", new Object[0]);
        InterfaceC5470n2 interfaceC5470n2 = this.f55072u;
        if (interfaceC5470n2 != null) {
            ((C4636d) interfaceC5470n2).m21771d();
        }
    }

    /* renamed from: o */
    public final void m28625o() {
        this.f55061j.m28053a(new C5783t6(sv0.EnumC5765c.f54860b, this.f55073v));
        this.f55061j.m28050a(EnumC5668r3.f54170c);
        this.f55066o.m28461a(h70.f50864a, this);
        m28608a(EnumC5901v3.f55741d);
        this.f55070s = SystemClock.elapsedRealtime();
    }

    /* renamed from: p */
    public void mo21780p() {
        C5667r2.m27823a(this.f55057f.m24775b().m24033a());
        m28625o();
        mo21798n();
    }

    /* renamed from: q */
    public final void m28626q() {
        StringBuilder m26356a = l60.m26356a("registerPhoneStateTracker(), clazz = ");
        m26356a.append(getClass());
        n60.m26811d(m26356a.toString(), new Object[0]);
        this.f55056e.m29959a(this.f55053b, this);
    }

    /* renamed from: r */
    public final synchronized void m28627r() {
        m28608a(EnumC5901v3.f55739b);
    }

    /* renamed from: s */
    public final void m28628s() {
        StringBuilder m26356a = l60.m26356a("unregisterPhoneStateTracker(), clazz = ");
        m26356a.append(getClass());
        n60.m26811d(m26356a.toString(), new Object[0]);
        this.f55056e.m29960b(this.f55053b, this);
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: t */
    public C5563p2 mo28629t() {
        return this.f55062k.m26069b();
    }

    /* renamed from: b */
    public synchronized void mo26773b(@NonNull AdRequest adRequest) {
        EnumC5901v3 enumC5901v3;
        EnumC5901v3 enumC5901v32;
        n60.m26809b("loadAd", new Object[0]);
        synchronized (this) {
            n60.m26809b("isLoading, state = " + this.f55068q, new Object[0]);
            enumC5901v3 = this.f55068q;
            enumC5901v32 = EnumC5901v3.f55740c;
        }
        if (enumC5901v3 != enumC5901v32) {
            if (mo28611a(adRequest)) {
                this.f55061j.m28049a();
                this.f55061j.m28055b(EnumC5668r3.f54170c);
                this.f55066o.m28462b(h70.f50864a, this);
                synchronized (this) {
                    C5379l6 c5379l6 = this.f55058g;
                    synchronized (this) {
                        m28608a(enumC5901v32);
                        this.f55052a.post(new RunnableC5684rd(this, adRequest, c5379l6));
                    }
                }
            } else {
                mo26774m();
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m28615c(@Nullable AdRequest adRequest) {
        C5379l6 c5379l6 = this.f55058g;
        synchronized (this) {
            m28608a(EnumC5901v3.f55740c);
            this.f55052a.post(new RunnableC5684rd(this, adRequest, c5379l6));
        }
    }

    @NonNull
    /* renamed from: d */
    public final C5101g2 m28616d() {
        return this.f55057f;
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void m28606a(@NonNull d91 d91Var) {
        this.f55061j.m28055b(EnumC5668r3.f54172e);
        this.f55055d.execute(new a(d91Var));
    }

    /* renamed from: c */
    public synchronized void mo21779c() {
        synchronized (this) {
        }
        if (!this.f55069r) {
            this.f55069r = true;
            m28628s();
            this.f55063l.m29610a();
            m28612b();
            this.f55054c.m27605c();
            this.f55052a.removeCallbacksAndMessages(null);
            this.f55066o.m28461a(h70.f50864a, this);
            this.f55071t = null;
            n60.m26813f("Ad view controller has been cleaned out, controller type: %s", getClass().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28597a(BiddingSettings biddingSettings, d91 d91Var) {
        this.f55065n.m26857a(this.f55053b, biddingSettings, new pn1(this, d91Var, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m28598a(d91 d91Var, String str) {
        this.f55061j.m28050a(EnumC5668r3.f54173f);
        this.f55057f.m24781c(str);
        synchronized (this) {
            this.f55055d.execute(new RunnableC5856ud(this, d91Var));
        }
    }

    /* renamed from: a */
    public final synchronized void m28608a(@NonNull EnumC5901v3 enumC5901v3) {
        n60.m26809b("assignLoadingState, state = " + enumC5901v3, new Object[0]);
        this.f55068q = enumC5901v3;
    }

    /* renamed from: a */
    public final void m28609a(@Nullable String str) {
        this.f55057f.m24773a(str);
    }

    /* renamed from: a */
    public final void m28604a(@Nullable C4636d c4636d) {
        this.f55072u = c4636d;
    }

    /* renamed from: a */
    public final void m28605a(@NonNull SizeInfo sizeInfo) {
        this.f55057f.m24767a(sizeInfo);
    }

    @VisibleForTesting
    /* renamed from: b */
    public final void m28613b(@NonNull d91 d91Var) {
        cz0 m29824a = xz0.m29823b().m29824a(this.f55053b);
        BiddingSettings m23597f = m29824a != null ? m29824a.m23597f() : null;
        if (m23597f != null) {
            this.f55061j.m28055b(EnumC5668r3.f54173f);
            this.f55055d.execute(new sq1(this, m23597f, d91Var, 8));
        } else {
            synchronized (this) {
                this.f55055d.execute(new RunnableC5856ud(this, d91Var));
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5538oh
    /* renamed from: a */
    public final synchronized boolean mo27086a() {
        return this.f55069r;
    }

    /* renamed from: a */
    public synchronized boolean mo28611a(AdRequest adRequest) {
        boolean z;
        z = false;
        if (this.f55071t != null && this.f55070s > 0 && SystemClock.elapsedRealtime() - this.f55070s <= this.f55071t.m21819i() && (adRequest == null || adRequest.equals(this.f55057f.m24765a()))) {
            synchronized (this) {
                if (this.f55068q == EnumC5901v3.f55742e) {
                }
            }
        }
        z = true;
        return z;
    }

    /* renamed from: a */
    public final void m28610a(boolean z) {
        this.f55057f.m24778b(z);
    }

    @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5822b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void mo22924a(@NonNull AdResponse<T> adResponse) {
        this.f55061j.m28050a(EnumC5668r3.f54177j);
        this.f55071t = adResponse;
    }

    /* renamed from: b */
    public void mo21797b(@NonNull C5563p2 c5563p2) {
        e60.m24037c(c5563p2.m27145b(), new Object[0]);
        m28608a(EnumC5901v3.f55742e);
        this.f55061j.m28053a(new C5783t6(sv0.EnumC5765c.f54861c, this.f55073v));
        this.f55061j.m28050a(EnumC5668r3.f54170c);
        this.f55066o.m28461a(h70.f50864a, this);
        this.f55052a.post(new b(c5563p2));
    }

    @Override // com.yandex.mobile.ads.impl.tw0.InterfaceC5821a
    /* renamed from: a */
    public final void mo22923a(@NonNull qh1 qh1Var) {
        if (qh1Var instanceof C5372l2) {
            mo21797b(C5616q2.m27602a(this.f55057f, ((C5372l2) qh1Var).m26318a()));
        }
    }

    /* renamed from: a */
    public synchronized void mo26772a(@NonNull C5563p2 c5563p2) {
        InterfaceC5470n2 interfaceC5470n2 = this.f55072u;
        if (interfaceC5470n2 != null) {
            ((C4636d) interfaceC5470n2).m21769a(c5563p2);
        }
    }

    /* renamed from: b */
    public final void m28612b() {
        this.f55060i.m23865a(this.f55064m);
    }

    /* renamed from: a */
    public final void m28607a(@NonNull ip0 ip0Var) {
        AdRequest m24765a = this.f55057f.m24765a();
        synchronized (this) {
            m28608a(EnumC5901v3.f55740c);
            this.f55052a.post(new RunnableC5684rd(this, m24765a, ip0Var));
        }
    }

    /* renamed from: b */
    public final void m28614b(@Nullable String str) {
        this.f55073v = str;
    }
}
