package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zabq<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {

    /* renamed from: b */
    @NotOnlyInitialized
    public final Api.Client f15525b;

    /* renamed from: c */
    public final ApiKey<O> f15526c;

    /* renamed from: d */
    public final zaad f15527d;

    /* renamed from: g */
    public final int f15530g;

    /* renamed from: h */
    @Nullable
    public final zact f15531h;

    /* renamed from: i */
    public boolean f15532i;

    /* renamed from: m */
    public final /* synthetic */ GoogleApiManager f15536m;

    /* renamed from: a */
    public final Queue<zai> f15524a = new LinkedList();

    /* renamed from: e */
    public final Set<zal> f15528e = new HashSet();

    /* renamed from: f */
    public final Map<ListenerHolder.ListenerKey<?>, zaci> f15529f = new HashMap();

    /* renamed from: j */
    public final List<zabs> f15533j = new ArrayList();

    /* renamed from: k */
    @Nullable
    public ConnectionResult f15534k = null;

    /* renamed from: l */
    public int f15535l = 0;

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.common.api.Api$Client] */
    @WorkerThread
    public zabq(GoogleApiManager googleApiManager, GoogleApi<O> googleApi) {
        this.f15536m = googleApiManager;
        Looper looper = googleApiManager.f15427o.getLooper();
        ClientSettings m8115a = googleApi.m7948c().m8115a();
        Api.AbstractClientBuilder<?, O> abstractClientBuilder = googleApi.f15355c.f15345a;
        Objects.requireNonNull(abstractClientBuilder, "null reference");
        ?? mo7838a = abstractClientBuilder.mo7838a(googleApi.f15353a, looper, m8115a, googleApi.f15356d, this, this);
        String str = googleApi.f15354b;
        if (str != null && (mo7838a instanceof BaseGmsClient)) {
            ((BaseGmsClient) mo7838a).f15674x = str;
        }
        if (str != null && (mo7838a instanceof NonGmsServiceBrokerClient)) {
            Objects.requireNonNull((NonGmsServiceBrokerClient) mo7838a);
        }
        this.f15525b = mo7838a;
        this.f15526c = googleApi.f15357e;
        this.f15527d = new zaad();
        this.f15530g = googleApi.f15359g;
        if (mo7838a.mo7946q()) {
            this.f15531h = new zact(googleApiManager.f15418f, googleApiManager.f15427o, googleApi.m7948c().m8115a());
        } else {
            this.f15531h = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zau
    /* renamed from: S0 */
    public final void mo8043S0(ConnectionResult connectionResult, Api<?> api, boolean z) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public final Feature m8047a(@Nullable Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] mo7944m = this.f15525b.mo7944m();
            if (mo7944m == null) {
                mo7944m = new Feature[0];
            }
            ArrayMap arrayMap = new ArrayMap(mo7944m.length);
            for (Feature feature : mo7944m) {
                arrayMap.put(feature.f15321b, Long.valueOf(feature.m7915m()));
            }
            for (Feature feature2 : featureArr) {
                Long l2 = (Long) arrayMap.get(feature2.f15321b);
                if (l2 == null || l2.longValue() < feature2.m7915m()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @WorkerThread
    /* renamed from: b */
    public final void m8048b(ConnectionResult connectionResult) {
        Iterator<zal> it = this.f15528e.iterator();
        if (!it.hasNext()) {
            this.f15528e.clear();
            return;
        }
        zal next = it.next();
        if (com.google.android.gms.common.internal.Objects.m8123a(connectionResult, ConnectionResult.f15313f)) {
            this.f15525b.mo7939f();
        }
        Objects.requireNonNull(next);
        throw null;
    }

    @WorkerThread
    /* renamed from: c */
    public final void m8049c(Status status) {
        Preconditions.m8128c(this.f15536m.f15427o);
        m8050d(status, null, false);
    }

    @WorkerThread
    /* renamed from: d */
    public final void m8050d(@Nullable Status status, @Nullable Exception exc, boolean z) {
        Preconditions.m8128c(this.f15536m.f15427o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<zai> it = this.f15524a.iterator();
        while (it.hasNext()) {
            zai next = it.next();
            if (!z || next.f15589a == 2) {
                if (status != null) {
                    next.mo8072a(status);
                } else {
                    next.mo8073b(exc);
                }
                it.remove();
            }
        }
    }

    @WorkerThread
    /* renamed from: e */
    public final void m8051e() {
        ArrayList arrayList = new ArrayList(this.f15524a);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zai zaiVar = (zai) arrayList.get(i2);
            if (!this.f15525b.mo7942i()) {
                return;
            }
            if (m8057l(zaiVar)) {
                this.f15524a.remove(zaiVar);
            }
        }
    }

    @WorkerThread
    /* renamed from: f */
    public final void m8052f() {
        m8060o();
        m8048b(ConnectionResult.f15313f);
        m8056k();
        Iterator<zaci> it = this.f15529f.values().iterator();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            Objects.requireNonNull(null);
            throw null;
        }
        m8051e();
        m8054h();
    }

    @WorkerThread
    /* renamed from: g */
    public final void m8053g(int i2) {
        m8060o();
        this.f15532i = true;
        zaad zaadVar = this.f15527d;
        String mo7945p = this.f15525b.mo7945p();
        Objects.requireNonNull(zaadVar);
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (mo7945p != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(mo7945p);
        }
        zaadVar.m8016a(true, new Status(20, sb.toString()));
        Handler handler = this.f15536m.f15427o;
        Message obtain = Message.obtain(handler, 9, this.f15526c);
        Objects.requireNonNull(this.f15536m);
        handler.sendMessageDelayed(obtain, 5000L);
        Handler handler2 = this.f15536m.f15427o;
        Message obtain2 = Message.obtain(handler2, 11, this.f15526c);
        Objects.requireNonNull(this.f15536m);
        handler2.sendMessageDelayed(obtain2, 120000L);
        this.f15536m.f15420h.f15765a.clear();
        Iterator<zaci> it = this.f15529f.values().iterator();
        if (it.hasNext()) {
            Objects.requireNonNull(it.next());
            throw null;
        }
    }

    /* renamed from: h */
    public final void m8054h() {
        this.f15536m.f15427o.removeMessages(12, this.f15526c);
        Handler handler = this.f15536m.f15427o;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.f15526c), this.f15536m.f15414b);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    /* renamed from: i */
    public final void mo7980i(int i2) {
        if (Looper.myLooper() == this.f15536m.f15427o.getLooper()) {
            m8053g(i2);
        } else {
            this.f15536m.f15427o.post(new zabn(this, i2));
        }
    }

    @WorkerThread
    /* renamed from: j */
    public final void m8055j(zai zaiVar) {
        zaiVar.mo8075d(this.f15527d, m8065v());
        try {
            zaiVar.mo8074c(this);
        } catch (DeadObjectException unused) {
            mo7980i(1);
            this.f15525b.mo7937d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    @WorkerThread
    /* renamed from: k */
    public final void m8056k() {
        if (this.f15532i) {
            this.f15536m.f15427o.removeMessages(11, this.f15526c);
            this.f15536m.f15427o.removeMessages(9, this.f15526c);
            this.f15532i = false;
        }
    }

    @WorkerThread
    /* renamed from: l */
    public final boolean m8057l(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            m8055j(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature m8047a = m8047a(zacVar.mo8070g(this));
        if (m8047a == null) {
            m8055j(zaiVar);
            return true;
        }
        String name = this.f15525b.getClass().getName();
        String str = m8047a.f15321b;
        long m7915m = m8047a.m7915m();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        C0000a.m2C(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(m7915m);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f15536m.f15428p || !zacVar.mo8069f(this)) {
            zacVar.mo8073b(new UnsupportedApiCallException(m8047a));
            return true;
        }
        zabs zabsVar = new zabs(this.f15526c, m8047a);
        int indexOf = this.f15533j.indexOf(zabsVar);
        if (indexOf >= 0) {
            zabs zabsVar2 = this.f15533j.get(indexOf);
            this.f15536m.f15427o.removeMessages(15, zabsVar2);
            Handler handler = this.f15536m.f15427o;
            Message obtain = Message.obtain(handler, 15, zabsVar2);
            Objects.requireNonNull(this.f15536m);
            handler.sendMessageDelayed(obtain, 5000L);
            return false;
        }
        this.f15533j.add(zabsVar);
        Handler handler2 = this.f15536m.f15427o;
        Message obtain2 = Message.obtain(handler2, 15, zabsVar);
        Objects.requireNonNull(this.f15536m);
        handler2.sendMessageDelayed(obtain2, 5000L);
        Handler handler3 = this.f15536m.f15427o;
        Message obtain3 = Message.obtain(handler3, 16, zabsVar);
        Objects.requireNonNull(this.f15536m);
        handler3.sendMessageDelayed(obtain3, 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (m8058m(connectionResult)) {
            return false;
        }
        this.f15536m.m7986c(connectionResult, this.f15530g);
        return false;
    }

    @WorkerThread
    /* renamed from: m */
    public final boolean m8058m(@NonNull ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.f15412s) {
            GoogleApiManager googleApiManager = this.f15536m;
            if (googleApiManager.f15424l == null || !googleApiManager.f15425m.contains(this.f15526c)) {
                return false;
            }
            this.f15536m.f15424l.m8081o(connectionResult, this.f15530g);
            return true;
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final boolean m8059n(boolean z) {
        Preconditions.m8128c(this.f15536m.f15427o);
        if (!this.f15525b.mo7942i() || this.f15529f.size() != 0) {
            return false;
        }
        zaad zaadVar = this.f15527d;
        if (!((zaadVar.f15455a.isEmpty() && zaadVar.f15456b.isEmpty()) ? false : true)) {
            this.f15525b.mo7937d("Timing out service connection.");
            return true;
        }
        if (z) {
            m8054h();
        }
        return false;
    }

    @WorkerThread
    /* renamed from: o */
    public final void m8060o() {
        Preconditions.m8128c(this.f15536m.f15427o);
        this.f15534k = null;
    }

    @WorkerThread
    /* renamed from: p */
    public final void m8061p() {
        Preconditions.m8128c(this.f15536m.f15427o);
        if (this.f15525b.mo7942i() || this.f15525b.mo7938e()) {
            return;
        }
        try {
            GoogleApiManager googleApiManager = this.f15536m;
            int m8187a = googleApiManager.f15420h.m8187a(googleApiManager.f15418f, this.f15525b);
            if (m8187a != 0) {
                ConnectionResult connectionResult = new ConnectionResult(m8187a, null);
                String name = this.f15525b.getClass().getName();
                String connectionResult2 = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + connectionResult2.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(connectionResult2);
                Log.w("GoogleApiManager", sb.toString());
                m8063s(connectionResult, null);
                return;
            }
            GoogleApiManager googleApiManager2 = this.f15536m;
            Api.Client client = this.f15525b;
            zabu zabuVar = new zabu(googleApiManager2, client, this.f15526c);
            if (client.mo7946q()) {
                zact zactVar = this.f15531h;
                Objects.requireNonNull(zactVar, "null reference");
                com.google.android.gms.signin.zae zaeVar = zactVar.f15575f;
                if (zaeVar != null) {
                    zaeVar.mo7935b();
                }
                zactVar.f15574e.f15688h = Integer.valueOf(System.identityHashCode(zactVar));
                Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = zactVar.f15572c;
                Context context = zactVar.f15570a;
                Looper looper = zactVar.f15571b.getLooper();
                ClientSettings clientSettings = zactVar.f15574e;
                zactVar.f15575f = abstractClientBuilder.mo7838a(context, looper, clientSettings, clientSettings.f15687g, zactVar, zactVar);
                zactVar.f15576g = zabuVar;
                Set<Scope> set = zactVar.f15573d;
                if (set == null || set.isEmpty()) {
                    zactVar.f15571b.post(new zacq(zactVar));
                } else {
                    zactVar.f15575f.mo9689r();
                }
            }
            try {
                this.f15525b.mo7940g(zabuVar);
            } catch (SecurityException e2) {
                m8063s(new ConnectionResult(10), e2);
            }
        } catch (IllegalStateException e3) {
            m8063s(new ConnectionResult(10), e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    /* renamed from: q */
    public final void mo8006q(@NonNull ConnectionResult connectionResult) {
        m8063s(connectionResult, null);
    }

    @WorkerThread
    /* renamed from: r */
    public final void m8062r(zai zaiVar) {
        Preconditions.m8128c(this.f15536m.f15427o);
        if (this.f15525b.mo7942i()) {
            if (m8057l(zaiVar)) {
                m8054h();
                return;
            } else {
                this.f15524a.add(zaiVar);
                return;
            }
        }
        this.f15524a.add(zaiVar);
        ConnectionResult connectionResult = this.f15534k;
        if (connectionResult == null || !connectionResult.m7913m()) {
            m8061p();
        } else {
            m8063s(this.f15534k, null);
        }
    }

    @WorkerThread
    /* renamed from: s */
    public final void m8063s(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        com.google.android.gms.signin.zae zaeVar;
        Preconditions.m8128c(this.f15536m.f15427o);
        zact zactVar = this.f15531h;
        if (zactVar != null && (zaeVar = zactVar.f15575f) != null) {
            zaeVar.mo7935b();
        }
        m8060o();
        this.f15536m.f15420h.f15765a.clear();
        m8048b(connectionResult);
        if ((this.f15525b instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.f15315c != 24) {
            GoogleApiManager googleApiManager = this.f15536m;
            googleApiManager.f15415c = true;
            Handler handler = googleApiManager.f15427o;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        if (connectionResult.f15315c == 4) {
            m8049c(GoogleApiManager.f15411r);
            return;
        }
        if (this.f15524a.isEmpty()) {
            this.f15534k = connectionResult;
            return;
        }
        if (exc != null) {
            Preconditions.m8128c(this.f15536m.f15427o);
            m8050d(null, exc, false);
            return;
        }
        if (!this.f15536m.f15428p) {
            Status m7982d = GoogleApiManager.m7982d(this.f15526c, connectionResult);
            Preconditions.m8128c(this.f15536m.f15427o);
            m8050d(m7982d, null, false);
            return;
        }
        m8050d(GoogleApiManager.m7982d(this.f15526c, connectionResult), null, true);
        if (this.f15524a.isEmpty() || m8058m(connectionResult) || this.f15536m.m7986c(connectionResult, this.f15530g)) {
            return;
        }
        if (connectionResult.f15315c == 18) {
            this.f15532i = true;
        }
        if (!this.f15532i) {
            Status m7982d2 = GoogleApiManager.m7982d(this.f15526c, connectionResult);
            Preconditions.m8128c(this.f15536m.f15427o);
            m8050d(m7982d2, null, false);
        } else {
            Handler handler2 = this.f15536m.f15427o;
            Message obtain = Message.obtain(handler2, 9, this.f15526c);
            Objects.requireNonNull(this.f15536m);
            handler2.sendMessageDelayed(obtain, 5000L);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    /* renamed from: t */
    public final void mo7981t(@Nullable Bundle bundle) {
        if (Looper.myLooper() == this.f15536m.f15427o.getLooper()) {
            m8052f();
        } else {
            this.f15536m.f15427o.post(new zabm(this));
        }
    }

    @WorkerThread
    /* renamed from: u */
    public final void m8064u() {
        Preconditions.m8128c(this.f15536m.f15427o);
        Status status = GoogleApiManager.f15410q;
        m8049c(status);
        zaad zaadVar = this.f15527d;
        Objects.requireNonNull(zaadVar);
        zaadVar.m8016a(false, status);
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f15529f.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            m8062r(new zah(listenerKey, new TaskCompletionSource()));
        }
        m8048b(new ConnectionResult(4));
        if (this.f15525b.mo7942i()) {
            this.f15525b.mo7941h(new zabp(this));
        }
    }

    /* renamed from: v */
    public final boolean m8065v() {
        return this.f15525b.mo7946q();
    }
}
