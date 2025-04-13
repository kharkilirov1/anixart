package com.yandex.mobile.ads.exo.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.exo.drm.C4716c;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.drm.InterfaceC4718e;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.exo.drm.InterfaceC4726m;
import com.yandex.mobile.ads.impl.C4929cl;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5915vf;
import com.yandex.mobile.ads.impl.InterfaceC5646ql;
import com.yandex.mobile.ads.impl.a91;
import com.yandex.mobile.ads.impl.d90;
import com.yandex.mobile.ads.impl.i80;
import com.yandex.mobile.ads.impl.j70;
import com.yandex.mobile.ads.impl.j80;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.uq0;
import com.yandex.mobile.ads.impl.yi1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.exo.drm.b */
/* loaded from: classes2.dex */
final class C4715b implements InterfaceC4718e {

    /* renamed from: a */
    @Nullable
    public final List<DrmInitData.SchemeData> f47944a;

    /* renamed from: b */
    private final InterfaceC4726m f47945b;

    /* renamed from: c */
    private final a f47946c;

    /* renamed from: d */
    private final b f47947d;

    /* renamed from: e */
    private final int f47948e;

    /* renamed from: f */
    private final boolean f47949f;

    /* renamed from: g */
    private final boolean f47950g;

    /* renamed from: h */
    private final HashMap<String, String> f47951h;

    /* renamed from: i */
    private final C4929cl<InterfaceC4719f.a> f47952i;

    /* renamed from: j */
    private final i80 f47953j;

    /* renamed from: k */
    private final uq0 f47954k;

    /* renamed from: l */
    public final InterfaceC4729p f47955l;

    /* renamed from: m */
    public final UUID f47956m;

    /* renamed from: n */
    public final e f47957n;

    /* renamed from: o */
    private int f47958o;

    /* renamed from: p */
    private int f47959p;

    /* renamed from: q */
    @Nullable
    private HandlerThread f47960q;

    /* renamed from: r */
    @Nullable
    private c f47961r;

    /* renamed from: s */
    @Nullable
    private InterfaceC5646ql f47962s;

    /* renamed from: t */
    @Nullable
    private InterfaceC4718e.a f47963t;

    /* renamed from: u */
    @Nullable
    private byte[] f47964u;

    /* renamed from: v */
    private byte[] f47965v;

    /* renamed from: w */
    @Nullable
    private InterfaceC4726m.a f47966w;

    /* renamed from: x */
    @Nullable
    private InterfaceC4726m.d f47967x;

    /* renamed from: com.yandex.mobile.ads.exo.drm.b$a */
    public interface a {
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.b$b */
    public interface b {
    }

    @SuppressLint
    /* renamed from: com.yandex.mobile.ads.exo.drm.b$c */
    public class c extends Handler {

        /* renamed from: a */
        @GuardedBy
        private boolean f47968a;

        public c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final synchronized void m22118a() {
            removeCallbacksAndMessages(null);
            this.f47968a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r9.obj
                com.yandex.mobile.ads.exo.drm.b$d r0 = (com.yandex.mobile.ads.exo.drm.C4715b.d) r0
                r1 = 1
                int r2 = r9.what     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                if (r2 == 0) goto L23
                if (r2 != r1) goto L1d
                com.yandex.mobile.ads.exo.drm.b r2 = com.yandex.mobile.ads.exo.drm.C4715b.this     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                com.yandex.mobile.ads.exo.drm.p r3 = r2.f47955l     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                java.util.UUID r2 = r2.f47956m     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                java.lang.Object r4 = r0.f47972c     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                com.yandex.mobile.ads.exo.drm.m$a r4 = (com.yandex.mobile.ads.exo.drm.InterfaceC4726m.a) r4     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                com.yandex.mobile.ads.exo.drm.o r3 = (com.yandex.mobile.ads.exo.drm.C4728o) r3     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                byte[] r1 = r3.m22221a(r2, r4)     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                goto La9
            L1d:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                r2.<init>()     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                throw r2     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
            L23:
                com.yandex.mobile.ads.exo.drm.b r2 = com.yandex.mobile.ads.exo.drm.C4715b.this     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                com.yandex.mobile.ads.exo.drm.p r2 = r2.f47955l     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                java.lang.Object r3 = r0.f47972c     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                com.yandex.mobile.ads.exo.drm.m$d r3 = (com.yandex.mobile.ads.exo.drm.InterfaceC4726m.d) r3     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                com.yandex.mobile.ads.exo.drm.o r2 = (com.yandex.mobile.ads.exo.drm.C4728o) r2     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                byte[] r1 = r2.m22220a(r3)     // Catch: java.lang.Exception -> L33 com.yandex.mobile.ads.impl.hb0 -> L3d
                goto La9
            L33:
                r1 = move-exception
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                com.yandex.mobile.ads.impl.d90.m23840b(r2, r3, r1)
                goto La9
            L3d:
                r2 = move-exception
                java.lang.Object r3 = r9.obj
                com.yandex.mobile.ads.exo.drm.b$d r3 = (com.yandex.mobile.ads.exo.drm.C4715b.d) r3
                boolean r4 = r3.f47971b
                if (r4 != 0) goto L47
                goto La4
            L47:
                int r4 = r3.f47973d
                int r4 = r4 + r1
                r3.f47973d = r4
                com.yandex.mobile.ads.exo.drm.b r5 = com.yandex.mobile.ads.exo.drm.C4715b.this
                com.yandex.mobile.ads.impl.i80 r5 = com.yandex.mobile.ads.exo.drm.C4715b.m22092a(r5)
                r6 = 3
                int r5 = r5.mo25458a(r6)
                if (r4 <= r5) goto L5a
                goto La4
            L5a:
                com.yandex.mobile.ads.impl.j80 r4 = new com.yandex.mobile.ads.impl.j80
                android.os.SystemClock.elapsedRealtime()
                android.os.SystemClock.elapsedRealtime()
                java.lang.Throwable r4 = r2.getCause()
                boolean r4 = r4 instanceof java.io.IOException
                if (r4 == 0) goto L71
                java.lang.Throwable r4 = r2.getCause()
                java.io.IOException r4 = (java.io.IOException) r4
                goto L7a
            L71:
                com.yandex.mobile.ads.exo.drm.b$f r4 = new com.yandex.mobile.ads.exo.drm.b$f
                java.lang.Throwable r5 = r2.getCause()
                r4.<init>(r5)
            L7a:
                com.yandex.mobile.ads.exo.drm.b r5 = com.yandex.mobile.ads.exo.drm.C4715b.this
                com.yandex.mobile.ads.impl.i80 r5 = com.yandex.mobile.ads.exo.drm.C4715b.m22092a(r5)
                com.yandex.mobile.ads.impl.i80$a r6 = new com.yandex.mobile.ads.impl.i80$a
                int r3 = r3.f47973d
                r6.<init>(r4, r3)
                long r3 = r5.mo25459a(r6)
                r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 != 0) goto L95
                goto La4
            L95:
                monitor-enter(r8)
                boolean r5 = r8.f47968a     // Catch: java.lang.Throwable -> Ld1
                if (r5 != 0) goto La3
                android.os.Message r5 = android.os.Message.obtain(r9)     // Catch: java.lang.Throwable -> Ld1
                r8.sendMessageDelayed(r5, r3)     // Catch: java.lang.Throwable -> Ld1
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld1
                goto La5
            La3:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld1
            La4:
                r1 = 0
            La5:
                if (r1 == 0) goto La8
                return
            La8:
                r1 = r2
            La9:
                com.yandex.mobile.ads.exo.drm.b r2 = com.yandex.mobile.ads.exo.drm.C4715b.this
                com.yandex.mobile.ads.impl.i80 r2 = com.yandex.mobile.ads.exo.drm.C4715b.m22092a(r2)
                long r3 = r0.f47970a
                java.util.Objects.requireNonNull(r2)
                monitor-enter(r8)
                boolean r2 = r8.f47968a     // Catch: java.lang.Throwable -> Lce
                if (r2 != 0) goto Lcc
                com.yandex.mobile.ads.exo.drm.b r2 = com.yandex.mobile.ads.exo.drm.C4715b.this     // Catch: java.lang.Throwable -> Lce
                com.yandex.mobile.ads.exo.drm.b$e r2 = r2.f47957n     // Catch: java.lang.Throwable -> Lce
                int r9 = r9.what     // Catch: java.lang.Throwable -> Lce
                java.lang.Object r0 = r0.f47972c     // Catch: java.lang.Throwable -> Lce
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch: java.lang.Throwable -> Lce
                android.os.Message r9 = r2.obtainMessage(r9, r0)     // Catch: java.lang.Throwable -> Lce
                r9.sendToTarget()     // Catch: java.lang.Throwable -> Lce
            Lcc:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Lce
                return
            Lce:
                r9 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Lce
                throw r9
            Ld1:
                r9 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld1
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.C4715b.c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.b$d */
    public static final class d {

        /* renamed from: a */
        public final long f47970a;

        /* renamed from: b */
        public final boolean f47971b;

        /* renamed from: c */
        public final Object f47972c;

        /* renamed from: d */
        public int f47973d;

        public d(long j2, boolean z, long j3, Object obj) {
            this.f47970a = j2;
            this.f47971b = z;
            this.f47972c = obj;
        }
    }

    @SuppressLint
    /* renamed from: com.yandex.mobile.ads.exo.drm.b$e */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i2 = message.what;
            if (i2 == 0) {
                C4715b.m22095a(C4715b.this, obj, obj2);
            } else {
                if (i2 != 1) {
                    return;
                }
                C4715b.this.m22097a(obj, obj2);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.b$f */
    public static final class f extends IOException {
        public f(@Nullable Throwable th) {
            super(th);
        }
    }

    public C4715b(UUID uuid, InterfaceC4726m interfaceC4726m, a aVar, b bVar, @Nullable List<DrmInitData.SchemeData> list, int i2, boolean z, boolean z2, @Nullable byte[] bArr, HashMap<String, String> hashMap, InterfaceC4729p interfaceC4729p, Looper looper, i80 i80Var, uq0 uq0Var) {
        if (i2 == 1 || i2 == 3) {
            C5220ia.m25469a(bArr);
        }
        this.f47956m = uuid;
        this.f47946c = aVar;
        this.f47947d = bVar;
        this.f47945b = interfaceC4726m;
        this.f47948e = i2;
        this.f47949f = z;
        this.f47950g = z2;
        if (bArr != null) {
            this.f47965v = bArr;
            this.f47944a = null;
        } else {
            this.f47944a = Collections.unmodifiableList((List) C5220ia.m25469a(list));
        }
        this.f47951h = hashMap;
        this.f47955l = interfaceC4729p;
        this.f47952i = new C4929cl<>();
        this.f47953j = i80Var;
        this.f47954k = uq0Var;
        this.f47958o = 2;
        this.f47957n = new e(looper);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4718e
    /* renamed from: c */
    public final int mo22111c() {
        return this.f47958o;
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4718e
    /* renamed from: d */
    public final boolean mo22112d() {
        return this.f47949f;
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4718e
    @Nullable
    /* renamed from: e */
    public final Map<String, String> mo22113e() {
        byte[] bArr = this.f47964u;
        if (bArr == null) {
            return null;
        }
        return this.f47945b.mo22193a(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4718e
    /* renamed from: f */
    public final UUID mo22114f() {
        return this.f47956m;
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4718e
    @Nullable
    /* renamed from: g */
    public final InterfaceC4718e.a mo22115g() {
        if (this.f47958o == 1) {
            return this.f47963t;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4718e
    @Nullable
    /* renamed from: h */
    public final InterfaceC5646ql mo22116h() {
        return this.f47962s;
    }

    /* renamed from: i */
    public final void m22117i() {
        InterfaceC4726m.d mo22192a = this.f47945b.mo22192a();
        this.f47967x = mo22192a;
        c cVar = this.f47961r;
        int i2 = s91.f54530a;
        Objects.requireNonNull(mo22192a);
        Objects.requireNonNull(cVar);
        cVar.obtainMessage(0, new d(j80.m25816a(), true, SystemClock.elapsedRealtime(), mo22192a)).sendToTarget();
    }

    /* renamed from: a */
    public final boolean m22109a(byte[] bArr) {
        return Arrays.equals(this.f47964u, bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4718e
    /* renamed from: b */
    public final void mo22110b(@Nullable InterfaceC4719f.a aVar) {
        if (this.f47959p < 0) {
            StringBuilder m26356a = l60.m26356a("Session reference count less than zero: ");
            m26356a.append(this.f47959p);
            d90.m23839b("DefaultDrmSession", m26356a.toString());
            this.f47959p = 0;
        }
        if (aVar != null) {
            this.f47952i.m23307a(aVar);
        }
        int i2 = this.f47959p + 1;
        this.f47959p = i2;
        if (i2 == 1) {
            C5220ia.m25476b(this.f47958o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f47960q = handlerThread;
            handlerThread.start();
            this.f47961r = new c(this.f47960q.getLooper());
            if (m22102b()) {
                m22098a(true);
            }
        } else if (aVar != null) {
            int i3 = this.f47958o;
            if ((i3 == 3 || i3 == 4) && this.f47952i.m23308b(aVar) == 1) {
                aVar.m22179a(this.f47958o);
            }
        }
        C4716c.g gVar = (C4716c.g) this.f47947d;
        if (C4716c.this.f47985l != -9223372036854775807L) {
            C4716c.this.f47988o.remove(this);
            Handler handler = C4716c.this.f47994u;
            Objects.requireNonNull(handler);
            handler.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: a */
    public final void m22104a() {
        if (m22102b()) {
            m22098a(true);
        }
    }

    /* renamed from: a */
    public final void m22107a(Exception exc, boolean z) {
        m22094a(z ? 1 : 3, exc);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4718e
    /* renamed from: a */
    public final boolean mo22108a(String str) {
        return this.f47945b.mo22197a(str, (byte[]) C5220ia.m25474b(this.f47964u));
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4718e
    /* renamed from: a */
    public final void mo22106a(@Nullable InterfaceC4719f.a aVar) {
        int i2 = this.f47959p;
        if (i2 <= 0) {
            d90.m23839b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.f47959p = i3;
        if (i3 == 0) {
            this.f47958o = 0;
            e eVar = this.f47957n;
            int i4 = s91.f54530a;
            eVar.removeCallbacksAndMessages(null);
            this.f47961r.m22118a();
            this.f47961r = null;
            this.f47960q.quit();
            this.f47960q = null;
            this.f47962s = null;
            this.f47963t = null;
            this.f47966w = null;
            this.f47967x = null;
            byte[] bArr = this.f47964u;
            if (bArr != null) {
                this.f47945b.mo22199b(bArr);
                this.f47964u = null;
            }
        }
        if (aVar != null) {
            this.f47952i.m23309c(aVar);
            if (this.f47952i.m23308b(aVar) == 0) {
                aVar.m22184d();
            }
        }
        ((C4716c.g) this.f47947d).m22156a(this, this.f47959p);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: b */
    private boolean m22102b() {
        int i2 = this.f47958o;
        if (i2 == 3 || i2 == 4) {
            return true;
        }
        try {
            byte[] mo22202c = this.f47945b.mo22202c();
            this.f47964u = mo22202c;
            this.f47945b.mo22195a(mo22202c, this.f47954k);
            this.f47962s = this.f47945b.mo22203d(this.f47964u);
            this.f47958o = 3;
            Iterator<InterfaceC4719f.a> it = this.f47952i.m23306a().iterator();
            while (it.hasNext()) {
                m22093a(3, it.next());
            }
            Objects.requireNonNull(this.f47964u);
            return true;
        } catch (NotProvisionedException unused) {
            ((C4716c.f) this.f47946c).m22153b(this);
            return false;
        } catch (Exception e2) {
            m22094a(1, e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22093a(int i2, InterfaceC4719f.a aVar) {
        aVar.m22179a(i2);
    }

    /* renamed from: a */
    public static void m22095a(C4715b c4715b, Object obj, Object obj2) {
        if (obj == c4715b.f47967x) {
            int i2 = c4715b.f47958o;
            if (i2 != 2) {
                if (!(i2 == 3 || i2 == 4)) {
                    return;
                }
            }
            c4715b.f47967x = null;
            if (obj2 instanceof Exception) {
                ((C4716c.f) c4715b.f47946c).m22152a((Exception) obj2, false);
                return;
            }
            try {
                c4715b.f47945b.mo22201c((byte[]) obj2);
                ((C4716c.f) c4715b.f47946c).m22150a();
            } catch (Exception e2) {
                ((C4716c.f) c4715b.f47946c).m22152a(e2, true);
            }
        }
    }

    @RequiresNonNull({"sessionId"})
    /* renamed from: a */
    private void m22098a(boolean z) {
        long min;
        if (this.f47950g) {
            return;
        }
        byte[] bArr = this.f47964u;
        int i2 = s91.f54530a;
        int i3 = this.f47948e;
        boolean z2 = false;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                Objects.requireNonNull(this.f47965v);
                Objects.requireNonNull(this.f47964u);
                m22099a(this.f47965v, 3, z);
                return;
            }
            byte[] bArr2 = this.f47965v;
            if (bArr2 != null) {
                try {
                    this.f47945b.mo22196a(bArr, bArr2);
                    z2 = true;
                } catch (Exception e2) {
                    m22094a(1, e2);
                }
                if (!z2) {
                    return;
                }
            }
            m22099a(bArr, 2, z);
            return;
        }
        byte[] bArr3 = this.f47965v;
        if (bArr3 == null) {
            m22099a(bArr, 1, z);
            return;
        }
        if (this.f47958o != 4) {
            try {
                this.f47945b.mo22196a(bArr, bArr3);
                z2 = true;
            } catch (Exception e3) {
                m22094a(1, e3);
            }
            if (!z2) {
                return;
            }
        }
        if (C5915vf.f55810d.equals(this.f47956m)) {
            Pair<Long, Long> m29946a = yi1.m29946a(this);
            Objects.requireNonNull(m29946a);
            min = Math.min(((Long) m29946a.first).longValue(), ((Long) m29946a.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (this.f47948e == 0 && min <= 60) {
            d90.m23837a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            m22099a(bArr, 2, z);
            return;
        }
        if (min <= 0) {
            m22094a(2, new j70());
            return;
        }
        this.f47958o = 4;
        Iterator<InterfaceC4719f.a> it = this.f47952i.m23306a().iterator();
        while (it.hasNext()) {
            it.next().m22183c();
        }
    }

    /* renamed from: a */
    private void m22099a(byte[] bArr, int i2, boolean z) {
        try {
            InterfaceC4726m.a mo22191a = this.f47945b.mo22191a(bArr, this.f47944a, i2, this.f47951h);
            this.f47966w = mo22191a;
            c cVar = this.f47961r;
            int i3 = s91.f54530a;
            Objects.requireNonNull(mo22191a);
            Objects.requireNonNull(cVar);
            cVar.obtainMessage(1, new d(j80.m25816a(), z, SystemClock.elapsedRealtime(), mo22191a)).sendToTarget();
        } catch (Exception e2) {
            if (e2 instanceof NotProvisionedException) {
                ((C4716c.f) this.f47946c).m22153b(this);
            } else {
                m22094a(1, e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m22097a(Object obj, Object obj2) {
        if (obj == this.f47966w) {
            int i2 = this.f47958o;
            if (i2 == 3 || i2 == 4) {
                this.f47966w = null;
                if (obj2 instanceof Exception) {
                    Exception exc = (Exception) obj2;
                    if (exc instanceof NotProvisionedException) {
                        ((C4716c.f) this.f47946c).m22153b(this);
                        return;
                    } else {
                        m22094a(2, exc);
                        return;
                    }
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (this.f47948e == 3) {
                        InterfaceC4726m interfaceC4726m = this.f47945b;
                        byte[] bArr2 = this.f47965v;
                        int i3 = s91.f54530a;
                        interfaceC4726m.mo22200b(bArr2, bArr);
                        Iterator<InterfaceC4719f.a> it = this.f47952i.m23306a().iterator();
                        while (it.hasNext()) {
                            it.next().m22182b();
                        }
                        return;
                    }
                    byte[] mo22200b = this.f47945b.mo22200b(this.f47964u, bArr);
                    int i4 = this.f47948e;
                    if ((i4 == 2 || (i4 == 0 && this.f47965v != null)) && mo22200b != null && mo22200b.length != 0) {
                        this.f47965v = mo22200b;
                    }
                    this.f47958o = 4;
                    Iterator<InterfaceC4719f.a> it2 = this.f47952i.m23306a().iterator();
                    while (it2.hasNext()) {
                        it2.next().m22178a();
                    }
                } catch (Exception e2) {
                    if (e2 instanceof NotProvisionedException) {
                        ((C4716c.f) this.f47946c).m22153b(this);
                    } else {
                        m22094a(1, e2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m22105a(int i2) {
        if (i2 == 2 && this.f47948e == 0 && this.f47958o == 4) {
            int i3 = s91.f54530a;
            m22098a(false);
        }
    }

    /* renamed from: a */
    private void m22094a(int i2, Exception exc) {
        int i3;
        int i4 = s91.f54530a;
        if (i4 >= 21 && C4722i.m22188a(exc)) {
            i3 = C4722i.m22189b(exc);
        } else {
            if (i4 < 23 || !C4723j.m22190a(exc)) {
                if (i4 < 18 || !C4721h.m22187b(exc)) {
                    if (i4 >= 18 && C4721h.m22186a(exc)) {
                        i3 = 6007;
                    } else if (exc instanceof a91) {
                        i3 = 6001;
                    } else if (exc instanceof C4716c.d) {
                        i3 = 6003;
                    } else if (exc instanceof j70) {
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
        }
        this.f47963t = new InterfaceC4718e.a(exc, i3);
        d90.m23838a("DefaultDrmSession", "DRM session error", exc);
        Iterator<InterfaceC4719f.a> it = this.f47952i.m23306a().iterator();
        while (it.hasNext()) {
            m22096a(exc, it.next());
        }
        if (this.f47958o != 4) {
            this.f47958o = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22096a(Exception exc, InterfaceC4719f.a aVar) {
        aVar.m22181a(exc);
    }
}
