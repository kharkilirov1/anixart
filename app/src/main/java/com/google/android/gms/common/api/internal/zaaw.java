package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.signin.SignInOptions;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaaw implements zabf {

    /* renamed from: a */
    public final zabi f15478a;

    /* renamed from: b */
    public final Lock f15479b;

    /* renamed from: c */
    public final Context f15480c;

    /* renamed from: d */
    public final GoogleApiAvailabilityLight f15481d;

    /* renamed from: e */
    @Nullable
    public ConnectionResult f15482e;

    /* renamed from: f */
    public int f15483f;

    /* renamed from: g */
    public int f15484g;

    /* renamed from: h */
    public int f15485h;

    /* renamed from: i */
    public final Bundle f15486i;

    /* renamed from: j */
    public final Set<Api.AnyClientKey> f15487j;

    /* renamed from: k */
    @Nullable
    public com.google.android.gms.signin.zae f15488k;

    /* renamed from: l */
    public boolean f15489l;

    /* renamed from: m */
    public boolean f15490m;

    /* renamed from: n */
    public boolean f15491n;

    /* renamed from: o */
    @Nullable
    public IAccountAccessor f15492o;

    /* renamed from: p */
    public boolean f15493p;

    /* renamed from: q */
    public boolean f15494q;

    /* renamed from: r */
    @Nullable
    public final ClientSettings f15495r;

    /* renamed from: s */
    public final Map<Api<?>, Boolean> f15496s;

    /* renamed from: t */
    @Nullable
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f15497t;

    /* renamed from: u */
    public final ArrayList<Future<?>> f15498u;

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy
    /* renamed from: a */
    public final void mo8020a(@Nullable Bundle bundle) {
        m8034l(1);
        if (bundle != null) {
            this.f15486i.putAll(bundle);
        }
        if (m8035m()) {
            m8030h();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy
    /* renamed from: b */
    public final void mo8021b(ConnectionResult connectionResult, Api<?> api, boolean z) {
        m8034l(1);
        m8032j(connectionResult, api, z);
        if (m8035m()) {
            m8030h();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy
    /* renamed from: c */
    public final void mo8022c(int i2) {
        m8031i(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy
    /* renamed from: d */
    public final void mo8023d() {
        this.f15478a.f15511e.clear();
        this.f15490m = false;
        this.f15482e = null;
        this.f15484g = 0;
        this.f15489l = true;
        this.f15491n = false;
        this.f15493p = false;
        HashMap hashMap = new HashMap();
        for (Api<?> api : this.f15496s.keySet()) {
            Api.Client client = this.f15478a.f15510d.get(api.f15346b);
            Objects.requireNonNull(client, "null reference");
            Objects.requireNonNull(api.f15345a);
            boolean booleanValue = this.f15496s.get(api).booleanValue();
            if (client.mo7946q()) {
                this.f15490m = true;
                if (booleanValue) {
                    this.f15487j.add(api.f15346b);
                } else {
                    this.f15489l = false;
                }
            }
            hashMap.put(client, new zaal(this, api, booleanValue));
        }
        if (this.f15490m) {
            Objects.requireNonNull(this.f15495r, "null reference");
            Objects.requireNonNull(this.f15497t, "null reference");
            this.f15495r.f15688h = Integer.valueOf(System.identityHashCode(this.f15478a.f15514h));
            zaat zaatVar = new zaat(this);
            Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.f15497t;
            Context context = this.f15480c;
            Objects.requireNonNull(this.f15478a.f15514h);
            ClientSettings clientSettings = this.f15495r;
            this.f15488k = abstractClientBuilder.mo7838a(context, null, clientSettings, clientSettings.f15687g, zaatVar, zaatVar);
        }
        this.f15485h = this.f15478a.f15510d.size();
        this.f15498u.add(zabj.f15516a.submit(new zaao(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy
    /* renamed from: e */
    public final boolean mo8024e() {
        m8036n();
        m8029g(true);
        this.f15478a.m8044a(null);
        return true;
    }

    @GuardedBy
    /* renamed from: f */
    public final void m8028f() {
        this.f15490m = false;
        this.f15478a.f15514h.f15504c = Collections.emptySet();
        for (Api.AnyClientKey<?> anyClientKey : this.f15487j) {
            if (!this.f15478a.f15511e.containsKey(anyClientKey)) {
                this.f15478a.f15511e.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    @GuardedBy
    /* renamed from: g */
    public final void m8029g(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.f15488k;
        if (zaeVar != null) {
            if (zaeVar.mo7942i() && z) {
                zaeVar.mo9688o();
            }
            zaeVar.mo7935b();
            Objects.requireNonNull(this.f15495r, "null reference");
            this.f15492o = null;
        }
    }

    @GuardedBy
    /* renamed from: h */
    public final void m8030h() {
        zabi zabiVar = this.f15478a;
        zabiVar.f15507a.lock();
        try {
            zabiVar.f15514h.m8042i();
            zabiVar.f15512f = new zaaj(zabiVar);
            zabiVar.f15512f.mo8023d();
            zabiVar.f15508b.signalAll();
            zabiVar.f15507a.unlock();
            zabj.f15516a.execute(new zaak(this));
            com.google.android.gms.signin.zae zaeVar = this.f15488k;
            if (zaeVar != null) {
                if (this.f15493p) {
                    IAccountAccessor iAccountAccessor = this.f15492o;
                    Objects.requireNonNull(iAccountAccessor, "null reference");
                    zaeVar.mo9687n(iAccountAccessor, this.f15494q);
                }
                m8029g(false);
            }
            Iterator<Api.AnyClientKey<?>> it = this.f15478a.f15511e.keySet().iterator();
            while (it.hasNext()) {
                Api.Client client = this.f15478a.f15510d.get(it.next());
                Objects.requireNonNull(client, "null reference");
                client.mo7935b();
            }
            this.f15478a.f15515i.mo8038a(this.f15486i.isEmpty() ? null : this.f15486i);
        } catch (Throwable th) {
            zabiVar.f15507a.unlock();
            throw th;
        }
    }

    @GuardedBy
    /* renamed from: i */
    public final void m8031i(ConnectionResult connectionResult) {
        m8036n();
        m8029g(!connectionResult.m7913m());
        this.f15478a.m8044a(connectionResult);
        this.f15478a.f15515i.mo8040c(connectionResult);
    }

    @GuardedBy
    /* renamed from: j */
    public final void m8032j(ConnectionResult connectionResult, Api<?> api, boolean z) {
        Objects.requireNonNull(api.f15345a);
        if ((!z || connectionResult.m7913m() || this.f15481d.mo7916a(null, connectionResult.f15315c, null) != null) && (this.f15482e == null || Integer.MAX_VALUE < this.f15483f)) {
            this.f15482e = connectionResult;
            this.f15483f = Integer.MAX_VALUE;
        }
        this.f15478a.f15511e.put(api.f15346b, connectionResult);
    }

    @GuardedBy
    /* renamed from: k */
    public final void m8033k() {
        if (this.f15485h != 0) {
            return;
        }
        if (!this.f15490m || this.f15491n) {
            ArrayList arrayList = new ArrayList();
            this.f15484g = 1;
            this.f15485h = this.f15478a.f15510d.size();
            for (Api.AnyClientKey<?> anyClientKey : this.f15478a.f15510d.keySet()) {
                if (!this.f15478a.f15511e.containsKey(anyClientKey)) {
                    arrayList.add(this.f15478a.f15510d.get(anyClientKey));
                } else if (m8035m()) {
                    m8030h();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f15498u.add(zabj.f15516a.submit(new zaap(this, arrayList)));
        }
    }

    @GuardedBy
    /* renamed from: l */
    public final boolean m8034l(int i2) {
        if (this.f15484g == i2) {
            return true;
        }
        zabe zabeVar = this.f15478a.f15514h;
        Objects.requireNonNull(zabeVar);
        zabeVar.m8041h("", null, new PrintWriter(new StringWriter()), null);
        throw null;
    }

    @GuardedBy
    /* renamed from: m */
    public final boolean m8035m() {
        int i2 = this.f15485h - 1;
        this.f15485h = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            zabe zabeVar = this.f15478a.f15514h;
            Objects.requireNonNull(zabeVar);
            zabeVar.m8041h("", null, new PrintWriter(new StringWriter()), null);
            throw null;
        }
        ConnectionResult connectionResult = this.f15482e;
        if (connectionResult == null) {
            return true;
        }
        this.f15478a.f15513g = this.f15483f;
        m8031i(connectionResult);
        return false;
    }

    /* renamed from: n */
    public final void m8036n() {
        ArrayList<Future<?>> arrayList = this.f15498u;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).cancel(true);
        }
        this.f15498u.clear();
    }
}
