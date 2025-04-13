package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmUtil;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CopyOnWriteMultiset;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@RequiresApi
/* loaded from: classes.dex */
class DefaultDrmSession implements DrmSession {

    /* renamed from: a */
    @Nullable
    public final List<DrmInitData.SchemeData> f10632a;

    /* renamed from: b */
    public final ExoMediaDrm f10633b;

    /* renamed from: c */
    public final ProvisioningManager f10634c;

    /* renamed from: d */
    public final ReferenceCountListener f10635d;

    /* renamed from: e */
    public final int f10636e;

    /* renamed from: f */
    public final boolean f10637f;

    /* renamed from: g */
    public final boolean f10638g;

    /* renamed from: h */
    public final HashMap<String, String> f10639h;

    /* renamed from: i */
    public final CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> f10640i;

    /* renamed from: j */
    public final LoadErrorHandlingPolicy f10641j;

    /* renamed from: k */
    public final MediaDrmCallback f10642k;

    /* renamed from: l */
    public final UUID f10643l;

    /* renamed from: m */
    public final ResponseHandler f10644m;

    /* renamed from: n */
    public int f10645n;

    /* renamed from: o */
    public int f10646o;

    /* renamed from: p */
    @Nullable
    public HandlerThread f10647p;

    /* renamed from: q */
    @Nullable
    public RequestHandler f10648q;

    /* renamed from: r */
    @Nullable
    public CryptoConfig f10649r;

    /* renamed from: s */
    @Nullable
    public DrmSession.DrmSessionException f10650s;

    /* renamed from: t */
    @Nullable
    public byte[] f10651t;

    /* renamed from: u */
    public byte[] f10652u;

    /* renamed from: v */
    @Nullable
    public ExoMediaDrm.KeyRequest f10653v;

    /* renamed from: w */
    @Nullable
    public ExoMediaDrm.ProvisionRequest f10654w;

    public interface ProvisioningManager {
        /* renamed from: a */
        void mo6277a(Exception exc, boolean z);

        /* renamed from: b */
        void mo6278b(DefaultDrmSession defaultDrmSession);

        /* renamed from: c */
        void mo6279c();
    }

    public interface ReferenceCountListener {
        /* renamed from: a */
        void mo6280a(DefaultDrmSession defaultDrmSession, int i2);

        /* renamed from: b */
        void mo6281b(DefaultDrmSession defaultDrmSession, int i2);
    }

    @SuppressLint
    public class RequestHandler extends Handler {

        /* renamed from: a */
        @GuardedBy
        public boolean f10655a;

        public RequestHandler(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public void m6282a(int i2, Object obj, boolean z) {
            obtainMessage(i2, new RequestTask(LoadEventInfo.m6820a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c3 A[RETURN] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r0v11, types: [byte[]] */
        /* JADX WARN: Type inference failed for: r0v15, types: [byte[]] */
        /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.exoplayer2.drm.MediaDrmCallbackException, java.io.IOException] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r23) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.RequestHandler.handleMessage(android.os.Message):void");
        }
    }

    public static final class RequestTask {

        /* renamed from: a */
        public final long f10657a;

        /* renamed from: b */
        public final boolean f10658b;

        /* renamed from: c */
        public final long f10659c;

        /* renamed from: d */
        public final Object f10660d;

        /* renamed from: e */
        public int f10661e;

        public RequestTask(long j2, boolean z, long j3, Object obj) {
            this.f10657a = j2;
            this.f10658b = z;
            this.f10659c = j3;
            this.f10660d = obj;
        }
    }

    @SuppressLint
    public class ResponseHandler extends Handler {
        public ResponseHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Set<DrmSessionEventListener.EventDispatcher> set;
            Set<DrmSessionEventListener.EventDispatcher> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i2 = message.what;
            if (i2 == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.f10654w) {
                    if (defaultDrmSession.f10645n == 2 || defaultDrmSession.m6270i()) {
                        defaultDrmSession.f10654w = null;
                        if (obj2 instanceof Exception) {
                            defaultDrmSession.f10634c.mo6277a((Exception) obj2, false);
                            return;
                        }
                        try {
                            defaultDrmSession.f10633b.mo6323j((byte[]) obj2);
                            defaultDrmSession.f10634c.mo6279c();
                            return;
                        } catch (Exception e2) {
                            defaultDrmSession.f10634c.mo6277a(e2, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i2 != 1) {
                return;
            }
            DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
            if (obj == defaultDrmSession2.f10653v && defaultDrmSession2.m6270i()) {
                defaultDrmSession2.f10653v = null;
                if (obj2 instanceof Exception) {
                    defaultDrmSession2.m6272k((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (defaultDrmSession2.f10636e == 3) {
                        ExoMediaDrm exoMediaDrm = defaultDrmSession2.f10633b;
                        byte[] bArr2 = defaultDrmSession2.f10652u;
                        int i3 = Util.f14736a;
                        exoMediaDrm.mo6322i(bArr2, bArr);
                        CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> copyOnWriteMultiset = defaultDrmSession2.f10640i;
                        synchronized (copyOnWriteMultiset.f14624b) {
                            set2 = copyOnWriteMultiset.f14626d;
                        }
                        Iterator<DrmSessionEventListener.EventDispatcher> it = set2.iterator();
                        while (it.hasNext()) {
                            it.next().m6302c();
                        }
                        return;
                    }
                    byte[] mo6322i = defaultDrmSession2.f10633b.mo6322i(defaultDrmSession2.f10651t, bArr);
                    int i4 = defaultDrmSession2.f10636e;
                    if ((i4 == 2 || (i4 == 0 && defaultDrmSession2.f10652u != null)) && mo6322i != null && mo6322i.length != 0) {
                        defaultDrmSession2.f10652u = mo6322i;
                    }
                    defaultDrmSession2.f10645n = 4;
                    CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> copyOnWriteMultiset2 = defaultDrmSession2.f10640i;
                    synchronized (copyOnWriteMultiset2.f14624b) {
                        set = copyOnWriteMultiset2.f14626d;
                    }
                    Iterator<DrmSessionEventListener.EventDispatcher> it2 = set.iterator();
                    while (it2.hasNext()) {
                        it2.next().m6301b();
                    }
                    return;
                } catch (Exception e3) {
                    defaultDrmSession2.m6272k(e3, true);
                }
                defaultDrmSession2.m6272k(e3, true);
            }
        }
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, @Nullable List<DrmInitData.SchemeData> list, int i2, boolean z, boolean z2, @Nullable byte[] bArr, HashMap<String, String> hashMap, MediaDrmCallback mediaDrmCallback, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        if (i2 == 1 || i2 == 3) {
            Objects.requireNonNull(bArr);
        }
        this.f10643l = uuid;
        this.f10634c = provisioningManager;
        this.f10635d = referenceCountListener;
        this.f10633b = exoMediaDrm;
        this.f10636e = i2;
        this.f10637f = z;
        this.f10638g = z2;
        if (bArr != null) {
            this.f10652u = bArr;
            this.f10632a = null;
        } else {
            Objects.requireNonNull(list);
            this.f10632a = Collections.unmodifiableList(list);
        }
        this.f10639h = hashMap;
        this.f10642k = mediaDrmCallback;
        this.f10640i = new CopyOnWriteMultiset<>();
        this.f10641j = loadErrorHandlingPolicy;
        this.f10645n = 2;
        this.f10644m = new ResponseHandler(looper);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: a */
    public void mo6262a(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int i2 = this.f10646o;
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(51);
            sb.append("Session reference count less than zero: ");
            sb.append(i2);
            Log.e("DefaultDrmSession", sb.toString());
            this.f10646o = 0;
        }
        if (eventDispatcher != null) {
            CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> copyOnWriteMultiset = this.f10640i;
            synchronized (copyOnWriteMultiset.f14624b) {
                ArrayList arrayList = new ArrayList(copyOnWriteMultiset.f14627e);
                arrayList.add(eventDispatcher);
                copyOnWriteMultiset.f14627e = Collections.unmodifiableList(arrayList);
                Integer num = copyOnWriteMultiset.f14625c.get(eventDispatcher);
                if (num == null) {
                    HashSet hashSet = new HashSet(copyOnWriteMultiset.f14626d);
                    hashSet.add(eventDispatcher);
                    copyOnWriteMultiset.f14626d = Collections.unmodifiableSet(hashSet);
                }
                copyOnWriteMultiset.f14625c.put(eventDispatcher, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i3 = this.f10646o + 1;
        this.f10646o = i3;
        if (i3 == 1) {
            Assertions.m7516d(this.f10645n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f10647p = handlerThread;
            handlerThread.start();
            this.f10648q = new RequestHandler(this.f10647p.getLooper());
            if (m6273l()) {
                m6269h(true);
            }
        } else if (eventDispatcher != null && m6270i() && this.f10640i.m7539s0(eventDispatcher) == 1) {
            eventDispatcher.m6304e(this.f10645n);
        }
        this.f10635d.mo6280a(this, this.f10646o);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: b */
    public void mo6263b(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int i2 = this.f10646o;
        if (i2 <= 0) {
            Log.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.f10646o = i3;
        if (i3 == 0) {
            this.f10645n = 0;
            ResponseHandler responseHandler = this.f10644m;
            int i4 = Util.f14736a;
            responseHandler.removeCallbacksAndMessages(null);
            RequestHandler requestHandler = this.f10648q;
            synchronized (requestHandler) {
                requestHandler.removeCallbacksAndMessages(null);
                requestHandler.f10655a = true;
            }
            this.f10648q = null;
            this.f10647p.quit();
            this.f10647p = null;
            this.f10649r = null;
            this.f10650s = null;
            this.f10653v = null;
            this.f10654w = null;
            byte[] bArr = this.f10651t;
            if (bArr != null) {
                this.f10633b.mo6320g(bArr);
                this.f10651t = null;
            }
        }
        if (eventDispatcher != null) {
            CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> copyOnWriteMultiset = this.f10640i;
            synchronized (copyOnWriteMultiset.f14624b) {
                Integer num = copyOnWriteMultiset.f14625c.get(eventDispatcher);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(copyOnWriteMultiset.f14627e);
                    arrayList.remove(eventDispatcher);
                    copyOnWriteMultiset.f14627e = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        copyOnWriteMultiset.f14625c.remove(eventDispatcher);
                        HashSet hashSet = new HashSet(copyOnWriteMultiset.f14626d);
                        hashSet.remove(eventDispatcher);
                        copyOnWriteMultiset.f14626d = Collections.unmodifiableSet(hashSet);
                    } else {
                        copyOnWriteMultiset.f14625c.put(eventDispatcher, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.f10640i.m7539s0(eventDispatcher) == 0) {
                eventDispatcher.m6306g();
            }
        }
        this.f10635d.mo6281b(this, this.f10646o);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: c */
    public final UUID mo6264c() {
        return this.f10643l;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: d */
    public boolean mo6265d() {
        return this.f10637f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: e */
    public boolean mo6266e(String str) {
        ExoMediaDrm exoMediaDrm = this.f10633b;
        byte[] bArr = this.f10651t;
        Assertions.m7518f(bArr);
        return exoMediaDrm.mo6318e(bArr, str);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* renamed from: f */
    public final DrmSession.DrmSessionException mo6267f() {
        if (this.f10645n == 1) {
            return this.f10650s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* renamed from: g */
    public final CryptoConfig mo6268g() {
        return this.f10649r;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f10645n;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:64|65|66|(6:68|69|70|71|(1:73)|75)|78|69|70|71|(0)|75) */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0098 A[Catch: NumberFormatException -> 0x009c, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x009c, blocks: (B:71:0x0090, B:73:0x0098), top: B:70:0x0090 }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6269h(boolean r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.m6269h(boolean):void");
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: i */
    public final boolean m6270i() {
        int i2 = this.f10645n;
        return i2 == 3 || i2 == 4;
    }

    /* renamed from: j */
    public final void m6271j(Exception exc, int i2) {
        int i3;
        Set<DrmSessionEventListener.EventDispatcher> set;
        int i4 = Util.f14736a;
        if (i4 < 21 || !DrmUtil.Api21.m6311a(exc)) {
            if (i4 < 23 || !DrmUtil.Api23.m6313a(exc)) {
                if (i4 < 18 || !DrmUtil.Api18.m6310b(exc)) {
                    if (i4 >= 18 && DrmUtil.Api18.m6309a(exc)) {
                        i3 = 6007;
                    } else if (exc instanceof UnsupportedDrmException) {
                        i3 = 6001;
                    } else if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
                        i3 = 6003;
                    } else if (exc instanceof KeysExpiredException) {
                        i3 = 6008;
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            i3 = 6004;
                        } else if (i2 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i3 = 6002;
            }
            i3 = 6006;
        } else {
            i3 = DrmUtil.Api21.m6312b(exc);
        }
        this.f10650s = new DrmSession.DrmSessionException(exc, i3);
        com.google.android.exoplayer2.util.Log.m7585b("DefaultDrmSession", "DRM session error", exc);
        CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> copyOnWriteMultiset = this.f10640i;
        synchronized (copyOnWriteMultiset.f14624b) {
            set = copyOnWriteMultiset.f14626d;
        }
        Iterator<DrmSessionEventListener.EventDispatcher> it = set.iterator();
        while (it.hasNext()) {
            it.next().m6305f(exc);
        }
        if (this.f10645n != 4) {
            this.f10645n = 1;
        }
    }

    /* renamed from: k */
    public final void m6272k(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f10634c.mo6278b(this);
        } else {
            m6271j(exc, z ? 1 : 2);
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: l */
    public final boolean m6273l() {
        Set<DrmSessionEventListener.EventDispatcher> set;
        if (m6270i()) {
            return true;
        }
        try {
            byte[] mo6317d = this.f10633b.mo6317d();
            this.f10651t = mo6317d;
            this.f10649r = this.f10633b.mo6316c(mo6317d);
            this.f10645n = 3;
            CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> copyOnWriteMultiset = this.f10640i;
            synchronized (copyOnWriteMultiset.f14624b) {
                set = copyOnWriteMultiset.f14626d;
            }
            Iterator<DrmSessionEventListener.EventDispatcher> it = set.iterator();
            while (it.hasNext()) {
                it.next().m6304e(3);
            }
            Objects.requireNonNull(this.f10651t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f10634c.mo6278b(this);
            return false;
        } catch (Exception e2) {
            m6271j(e2, 1);
            return false;
        }
    }

    /* renamed from: m */
    public final void m6274m(byte[] bArr, int i2, boolean z) {
        try {
            ExoMediaDrm.KeyRequest mo6324k = this.f10633b.mo6324k(bArr, this.f10632a, i2, this.f10639h);
            this.f10653v = mo6324k;
            RequestHandler requestHandler = this.f10648q;
            int i3 = Util.f14736a;
            Objects.requireNonNull(mo6324k);
            requestHandler.m6282a(1, mo6324k, z);
        } catch (Exception e2) {
            m6272k(e2, true);
        }
    }

    /* renamed from: n */
    public void m6275n() {
        ExoMediaDrm.ProvisionRequest mo6315b = this.f10633b.mo6315b();
        this.f10654w = mo6315b;
        RequestHandler requestHandler = this.f10648q;
        int i2 = Util.f14736a;
        Objects.requireNonNull(mo6315b);
        requestHandler.m6282a(0, mo6315b, true);
    }

    @Nullable
    /* renamed from: o */
    public Map<String, String> m6276o() {
        byte[] bArr = this.f10651t;
        if (bArr == null) {
            return null;
        }
        return this.f10633b.mo6314a(bArr);
    }
}
