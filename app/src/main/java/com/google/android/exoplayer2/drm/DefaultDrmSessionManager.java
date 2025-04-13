package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C0932C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableListIterator;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@RequiresApi
/* loaded from: classes.dex */
public class DefaultDrmSessionManager implements DrmSessionManager {

    /* renamed from: b */
    public final UUID f10663b;

    /* renamed from: c */
    public final ExoMediaDrm.Provider f10664c;

    /* renamed from: d */
    public final MediaDrmCallback f10665d;

    /* renamed from: e */
    public final HashMap<String, String> f10666e;

    /* renamed from: f */
    public final boolean f10667f;

    /* renamed from: g */
    public final int[] f10668g;

    /* renamed from: h */
    public final boolean f10669h;

    /* renamed from: i */
    public final ProvisioningManagerImpl f10670i;

    /* renamed from: j */
    public final LoadErrorHandlingPolicy f10671j;

    /* renamed from: k */
    public final ReferenceCountListenerImpl f10672k;

    /* renamed from: l */
    public final long f10673l;

    /* renamed from: m */
    public final List<DefaultDrmSession> f10674m;

    /* renamed from: n */
    public final Set<PreacquiredSessionReference> f10675n;

    /* renamed from: o */
    public final Set<DefaultDrmSession> f10676o;

    /* renamed from: p */
    public int f10677p;

    /* renamed from: q */
    @Nullable
    public ExoMediaDrm f10678q;

    /* renamed from: r */
    @Nullable
    public DefaultDrmSession f10679r;

    /* renamed from: s */
    @Nullable
    public DefaultDrmSession f10680s;

    /* renamed from: t */
    public Looper f10681t;

    /* renamed from: u */
    public Handler f10682u;

    /* renamed from: v */
    public int f10683v;

    /* renamed from: w */
    @Nullable
    public byte[] f10684w;

    /* renamed from: x */
    @Nullable
    public volatile MediaDrmHandler f10685x;

    public static final class Builder {

        /* renamed from: a */
        public final HashMap<String, String> f10686a = new HashMap<>();

        /* renamed from: b */
        public UUID f10687b = C0932C.f9459d;

        /* renamed from: c */
        public ExoMediaDrm.Provider f10688c;

        /* renamed from: d */
        public boolean f10689d;

        /* renamed from: e */
        public int[] f10690e;

        /* renamed from: f */
        public boolean f10691f;

        /* renamed from: g */
        public LoadErrorHandlingPolicy f10692g;

        /* renamed from: h */
        public long f10693h;

        public Builder() {
            int i2 = FrameworkMediaDrm.f10734d;
            this.f10688c = C0996b.f10749a;
            this.f10692g = new DefaultLoadErrorHandlingPolicy();
            this.f10690e = new int[0];
            this.f10693h = 300000L;
        }
    }

    public class MediaDrmEventListener implements ExoMediaDrm.OnEventListener {
        public MediaDrmEventListener(C09901 c09901) {
        }

        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener
        /* renamed from: a */
        public void mo6295a(ExoMediaDrm exoMediaDrm, @Nullable byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
            MediaDrmHandler mediaDrmHandler = DefaultDrmSessionManager.this.f10685x;
            Objects.requireNonNull(mediaDrmHandler);
            mediaDrmHandler.obtainMessage(i2, bArr).sendToTarget();
        }
    }

    @SuppressLint
    public class MediaDrmHandler extends Handler {
        public MediaDrmHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f10674m) {
                if (Arrays.equals(defaultDrmSession.f10651t, bArr)) {
                    if (message.what == 2 && defaultDrmSession.f10636e == 0 && defaultDrmSession.f10645n == 4) {
                        int i2 = Util.f14736a;
                        defaultDrmSession.m6269h(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static final class MissingSchemeDataException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public MissingSchemeDataException(java.util.UUID r2, com.google.android.exoplayer2.drm.DefaultDrmSessionManager.C09901 r3) {
            /*
                r1 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                int r3 = r2.length()
                int r3 = r3 + 29
                java.lang.String r0 = "Media does not support uuid: "
                java.lang.String r2 = androidx.room.util.C0576a.m4114m(r3, r0, r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException.<init>(java.util.UUID, com.google.android.exoplayer2.drm.DefaultDrmSessionManager$1):void");
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class PreacquiredSessionReference implements DrmSessionManager.DrmSessionReference {

        /* renamed from: b */
        @Nullable
        public final DrmSessionEventListener.EventDispatcher f10696b;

        /* renamed from: c */
        @Nullable
        public DrmSession f10697c;

        /* renamed from: d */
        public boolean f10698d;

        public PreacquiredSessionReference(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.f10696b = eventDispatcher;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
        public void release() {
            Handler handler = DefaultDrmSessionManager.this.f10682u;
            Objects.requireNonNull(handler);
            Util.m7721T(handler, new RunnableC0995a(this, 0));
        }
    }

    public class ProvisioningManagerImpl implements DefaultDrmSession.ProvisioningManager {

        /* renamed from: a */
        public final Set<DefaultDrmSession> f10700a = new HashSet();

        /* renamed from: b */
        @Nullable
        public DefaultDrmSession f10701b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        /* renamed from: a */
        public void mo6277a(Exception exc, boolean z) {
            this.f10701b = null;
            ImmutableList m11634y = ImmutableList.m11634y(this.f10700a);
            this.f10700a.clear();
            UnmodifiableListIterator listIterator = m11634y.listIterator();
            while (listIterator.hasNext()) {
                ((DefaultDrmSession) listIterator.next()).m6271j(exc, z ? 1 : 3);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        /* renamed from: b */
        public void mo6278b(DefaultDrmSession defaultDrmSession) {
            this.f10700a.add(defaultDrmSession);
            if (this.f10701b != null) {
                return;
            }
            this.f10701b = defaultDrmSession;
            defaultDrmSession.m6275n();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        /* renamed from: c */
        public void mo6279c() {
            this.f10701b = null;
            ImmutableList m11634y = ImmutableList.m11634y(this.f10700a);
            this.f10700a.clear();
            UnmodifiableListIterator listIterator = m11634y.listIterator();
            while (listIterator.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) listIterator.next();
                if (defaultDrmSession.m6273l()) {
                    defaultDrmSession.m6269h(true);
                }
            }
        }
    }

    public class ReferenceCountListenerImpl implements DefaultDrmSession.ReferenceCountListener {
        public ReferenceCountListenerImpl(C09901 c09901) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        /* renamed from: a */
        public void mo6280a(DefaultDrmSession defaultDrmSession, int i2) {
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager.f10673l != -9223372036854775807L) {
                defaultDrmSessionManager.f10676o.remove(defaultDrmSession);
                Handler handler = DefaultDrmSessionManager.this.f10682u;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        /* renamed from: b */
        public void mo6281b(DefaultDrmSession defaultDrmSession, int i2) {
            int i3 = 1;
            if (i2 == 1) {
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f10677p > 0 && defaultDrmSessionManager.f10673l != -9223372036854775807L) {
                    defaultDrmSessionManager.f10676o.add(defaultDrmSession);
                    Handler handler = DefaultDrmSessionManager.this.f10682u;
                    Objects.requireNonNull(handler);
                    handler.postAtTime(new RunnableC0995a(defaultDrmSession, i3), defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f10673l);
                    DefaultDrmSessionManager.this.m6292j();
                }
            }
            if (i2 == 0) {
                DefaultDrmSessionManager.this.f10674m.remove(defaultDrmSession);
                DefaultDrmSessionManager defaultDrmSessionManager2 = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager2.f10679r == defaultDrmSession) {
                    defaultDrmSessionManager2.f10679r = null;
                }
                if (defaultDrmSessionManager2.f10680s == defaultDrmSession) {
                    defaultDrmSessionManager2.f10680s = null;
                }
                ProvisioningManagerImpl provisioningManagerImpl = defaultDrmSessionManager2.f10670i;
                provisioningManagerImpl.f10700a.remove(defaultDrmSession);
                if (provisioningManagerImpl.f10701b == defaultDrmSession) {
                    provisioningManagerImpl.f10701b = null;
                    if (!provisioningManagerImpl.f10700a.isEmpty()) {
                        DefaultDrmSession next = provisioningManagerImpl.f10700a.iterator().next();
                        provisioningManagerImpl.f10701b = next;
                        next.m6275n();
                    }
                }
                DefaultDrmSessionManager defaultDrmSessionManager3 = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager3.f10673l != -9223372036854775807L) {
                    Handler handler2 = defaultDrmSessionManager3.f10682u;
                    Objects.requireNonNull(handler2);
                    handler2.removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f10676o.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.m6292j();
        }
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.Provider provider, MediaDrmCallback mediaDrmCallback, HashMap hashMap, boolean z, int[] iArr, boolean z2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j2, C09901 c09901) {
        Objects.requireNonNull(uuid);
        Assertions.m7514b(!C0932C.f9457b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f10663b = uuid;
        this.f10664c = provider;
        this.f10665d = mediaDrmCallback;
        this.f10666e = hashMap;
        this.f10667f = z;
        this.f10668g = iArr;
        this.f10669h = z2;
        this.f10671j = loadErrorHandlingPolicy;
        this.f10670i = new ProvisioningManagerImpl();
        this.f10672k = new ReferenceCountListenerImpl(null);
        this.f10683v = 0;
        this.f10674m = new ArrayList();
        this.f10675n = Sets.m11890h();
        this.f10676o = Sets.m11890h();
        this.f10673l = j2;
    }

    /* renamed from: e */
    public static boolean m6283e(DrmSession drmSession) {
        DefaultDrmSession defaultDrmSession = (DefaultDrmSession) drmSession;
        if (defaultDrmSession.f10645n == 1) {
            if (Util.f14736a < 19) {
                return true;
            }
            DrmSession.DrmSessionException mo6267f = defaultDrmSession.mo6267f();
            Objects.requireNonNull(mo6267f);
            if (mo6267f.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static List<DrmInitData.SchemeData> m6284h(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f10711e);
        for (int i2 = 0; i2 < drmInitData.f10711e; i2++) {
            DrmInitData.SchemeData schemeData = drmInitData.f10708b[i2];
            if ((schemeData.m6299d(uuid) || (C0932C.f9458c.equals(uuid) && schemeData.m6299d(C0932C.f9457b))) && (schemeData.f10716f != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    /* renamed from: a */
    public DrmSessionManager.DrmSessionReference mo6285a(Looper looper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        Assertions.m7516d(this.f10677p > 0);
        m6291i(looper);
        PreacquiredSessionReference preacquiredSessionReference = new PreacquiredSessionReference(eventDispatcher);
        Handler handler = this.f10682u;
        Objects.requireNonNull(handler);
        handler.post(new RunnableC0997c(preacquiredSessionReference, format, 4));
        return preacquiredSessionReference;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    @Nullable
    /* renamed from: b */
    public DrmSession mo6286b(Looper looper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        Assertions.m7516d(this.f10677p > 0);
        m6291i(looper);
        return m6288d(looper, eventDispatcher, format, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo6287c(com.google.android.exoplayer2.Format r7) {
        /*
            r6 = this;
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r6.f10678q
            java.util.Objects.requireNonNull(r0)
            int r0 = r0.mo6325l()
            com.google.android.exoplayer2.drm.DrmInitData r1 = r7.f9662p
            r2 = 0
            if (r1 != 0) goto L2b
            java.lang.String r7 = r7.f9659m
            int r7 = com.google.android.exoplayer2.util.MimeTypes.m7601i(r7)
            int[] r1 = r6.f10668g
            int r3 = com.google.android.exoplayer2.util.Util.f14736a
            r3 = 0
        L19:
            int r4 = r1.length
            r5 = -1
            if (r3 >= r4) goto L25
            r4 = r1[r3]
            if (r4 != r7) goto L22
            goto L26
        L22:
            int r3 = r3 + 1
            goto L19
        L25:
            r3 = -1
        L26:
            if (r3 == r5) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
        L2b:
            byte[] r7 = r6.f10684w
            r3 = 1
            if (r7 == 0) goto L31
            goto L9e
        L31:
            java.util.UUID r7 = r6.f10663b
            java.util.List r7 = m6284h(r1, r7, r3)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L71
            int r7 = r1.f10711e
            if (r7 != r3) goto L9f
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r7 = r1.f10708b
            r7 = r7[r2]
            java.util.UUID r4 = com.google.android.exoplayer2.C0932C.f9457b
            boolean r7 = r7.m6299d(r4)
            if (r7 == 0) goto L9f
            java.util.UUID r7 = r6.f10663b
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r4 = r7.length()
            int r4 = r4 + 72
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r5.append(r4)
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            java.lang.String r4 = "DefaultDrmSessionMgr"
            android.util.Log.w(r4, r7)
        L71:
            java.lang.String r7 = r1.f10710d
            if (r7 == 0) goto L9e
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L7e
            goto L9e
        L7e:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L8d
            int r7 = com.google.android.exoplayer2.util.Util.f14736a
            r1 = 25
            if (r7 < r1) goto L9f
            goto L9e
        L8d:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L9f
            java.lang.String r1 = "cens"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L9e
            goto L9f
        L9e:
            r2 = 1
        L9f:
            if (r2 == 0) goto La2
            goto La3
        La2:
            r0 = 1
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.mo6287c(com.google.android.exoplayer2.Format):int");
    }

    @Nullable
    /* renamed from: d */
    public final DrmSession m6288d(Looper looper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z) {
        List<DrmInitData.SchemeData> list;
        if (this.f10685x == null) {
            this.f10685x = new MediaDrmHandler(looper);
        }
        DrmInitData drmInitData = format.f9662p;
        DefaultDrmSession defaultDrmSession = null;
        int i2 = 0;
        if (drmInitData == null) {
            int m7601i = MimeTypes.m7601i(format.f9659m);
            ExoMediaDrm exoMediaDrm = this.f10678q;
            Objects.requireNonNull(exoMediaDrm);
            if (exoMediaDrm.mo6325l() == 2 && FrameworkCryptoConfig.f10730d) {
                return null;
            }
            int[] iArr = this.f10668g;
            int i3 = Util.f14736a;
            while (true) {
                if (i2 >= iArr.length) {
                    i2 = -1;
                    break;
                }
                if (iArr[i2] == m7601i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1 || exoMediaDrm.mo6325l() == 1) {
                return null;
            }
            DefaultDrmSession defaultDrmSession2 = this.f10679r;
            if (defaultDrmSession2 == null) {
                DefaultDrmSession m6290g = m6290g(ImmutableList.m11627D(), true, null, z);
                this.f10674m.add(m6290g);
                this.f10679r = m6290g;
            } else {
                defaultDrmSession2.mo6262a(null);
            }
            return this.f10679r;
        }
        if (this.f10684w == null) {
            list = m6284h(drmInitData, this.f10663b, false);
            if (((ArrayList) list).isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f10663b, null);
                Log.m7585b("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (eventDispatcher != null) {
                    eventDispatcher.m6305f(missingSchemeDataException);
                }
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            list = null;
        }
        if (this.f10667f) {
            Iterator<DefaultDrmSession> it = this.f10674m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (Util.m7728a(next.f10632a, list)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f10680s;
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = m6290g(list, false, eventDispatcher, z);
            if (!this.f10667f) {
                this.f10680s = defaultDrmSession;
            }
            this.f10674m.add(defaultDrmSession);
        } else {
            defaultDrmSession.mo6262a(eventDispatcher);
        }
        return defaultDrmSession;
    }

    /* renamed from: f */
    public final DefaultDrmSession m6289f(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        Objects.requireNonNull(this.f10678q);
        boolean z2 = this.f10669h | z;
        UUID uuid = this.f10663b;
        ExoMediaDrm exoMediaDrm = this.f10678q;
        ProvisioningManagerImpl provisioningManagerImpl = this.f10670i;
        ReferenceCountListenerImpl referenceCountListenerImpl = this.f10672k;
        int i2 = this.f10683v;
        byte[] bArr = this.f10684w;
        HashMap<String, String> hashMap = this.f10666e;
        MediaDrmCallback mediaDrmCallback = this.f10665d;
        Looper looper = this.f10681t;
        Objects.requireNonNull(looper);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, exoMediaDrm, provisioningManagerImpl, referenceCountListenerImpl, list, i2, z2, z, bArr, hashMap, mediaDrmCallback, looper, this.f10671j);
        defaultDrmSession.mo6262a(eventDispatcher);
        if (this.f10673l != -9223372036854775807L) {
            defaultDrmSession.mo6262a(null);
        }
        return defaultDrmSession;
    }

    /* renamed from: g */
    public final DefaultDrmSession m6290g(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, boolean z2) {
        DefaultDrmSession m6289f = m6289f(list, z, eventDispatcher);
        if (m6283e(m6289f) && !this.f10676o.isEmpty()) {
            m6293k();
            m6289f.mo6263b(eventDispatcher);
            if (this.f10673l != -9223372036854775807L) {
                m6289f.mo6263b(null);
            }
            m6289f = m6289f(list, z, eventDispatcher);
        }
        if (!m6283e(m6289f) || !z2 || this.f10675n.isEmpty()) {
            return m6289f;
        }
        m6294l();
        if (!this.f10676o.isEmpty()) {
            m6293k();
        }
        m6289f.mo6263b(eventDispatcher);
        if (this.f10673l != -9223372036854775807L) {
            m6289f.mo6263b(null);
        }
        return m6289f(list, z, eventDispatcher);
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    /* renamed from: i */
    public final synchronized void m6291i(Looper looper) {
        Looper looper2 = this.f10681t;
        if (looper2 == null) {
            this.f10681t = looper;
            this.f10682u = new Handler(looper);
        } else {
            Assertions.m7516d(looper2 == looper);
            Objects.requireNonNull(this.f10682u);
        }
    }

    /* renamed from: j */
    public final void m6292j() {
        if (this.f10678q != null && this.f10677p == 0 && this.f10674m.isEmpty() && this.f10675n.isEmpty()) {
            ExoMediaDrm exoMediaDrm = this.f10678q;
            Objects.requireNonNull(exoMediaDrm);
            exoMediaDrm.release();
            this.f10678q = null;
        }
    }

    /* renamed from: k */
    public final void m6293k() {
        Iterator it = ImmutableSet.m11676x(this.f10676o).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).mo6263b(null);
        }
    }

    /* renamed from: l */
    public final void m6294l() {
        Iterator it = ImmutableSet.m11676x(this.f10675n).iterator();
        while (it.hasNext()) {
            PreacquiredSessionReference preacquiredSessionReference = (PreacquiredSessionReference) it.next();
            Handler handler = DefaultDrmSessionManager.this.f10682u;
            Objects.requireNonNull(handler);
            Util.m7721T(handler, new RunnableC0995a(preacquiredSessionReference, 0));
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void prepare() {
        int i2 = this.f10677p;
        this.f10677p = i2 + 1;
        if (i2 != 0) {
            return;
        }
        if (this.f10678q == null) {
            ExoMediaDrm mo6326a = this.f10664c.mo6326a(this.f10663b);
            this.f10678q = mo6326a;
            mo6326a.mo6321h(new MediaDrmEventListener(null));
        } else if (this.f10673l != -9223372036854775807L) {
            for (int i3 = 0; i3 < this.f10674m.size(); i3++) {
                this.f10674m.get(i3).mo6262a(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void release() {
        int i2 = this.f10677p - 1;
        this.f10677p = i2;
        if (i2 != 0) {
            return;
        }
        if (this.f10673l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f10674m);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((DefaultDrmSession) arrayList.get(i3)).mo6263b(null);
            }
        }
        m6294l();
        m6292j();
    }
}
