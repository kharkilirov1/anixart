package com.yandex.mobile.ads.exo.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4701q0;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r;
import com.yandex.mobile.ads.embedded.guava.collect.C4693m0;
import com.yandex.mobile.ads.exo.drm.C4715b;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.exo.drm.InterfaceC4720g;
import com.yandex.mobile.ads.exo.drm.InterfaceC4726m;
import com.yandex.mobile.ads.impl.C5220ia;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.C5915vf;
import com.yandex.mobile.ads.impl.C5981wn;
import com.yandex.mobile.ads.impl.i80;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.uq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@RequiresApi
/* renamed from: com.yandex.mobile.ads.exo.drm.c */
/* loaded from: classes2.dex */
public final class C4716c implements InterfaceC4720g {

    /* renamed from: b */
    private final UUID f47975b;

    /* renamed from: c */
    private final InterfaceC4726m.c f47976c;

    /* renamed from: d */
    private final InterfaceC4729p f47977d;

    /* renamed from: e */
    private final HashMap<String, String> f47978e;

    /* renamed from: f */
    private final boolean f47979f;

    /* renamed from: g */
    private final int[] f47980g;

    /* renamed from: h */
    private final boolean f47981h;

    /* renamed from: i */
    private final f f47982i;

    /* renamed from: j */
    private final i80 f47983j;

    /* renamed from: k */
    private final g f47984k;

    /* renamed from: l */
    private final long f47985l;

    /* renamed from: m */
    private final ArrayList f47986m;

    /* renamed from: n */
    private final Set<e> f47987n;

    /* renamed from: o */
    private final Set<C4715b> f47988o;

    /* renamed from: p */
    private int f47989p;

    /* renamed from: q */
    @Nullable
    private InterfaceC4726m f47990q;

    /* renamed from: r */
    @Nullable
    private C4715b f47991r;

    /* renamed from: s */
    @Nullable
    private C4715b f47992s;

    /* renamed from: t */
    private Looper f47993t;

    /* renamed from: u */
    private Handler f47994u;

    /* renamed from: v */
    private int f47995v;

    /* renamed from: w */
    @Nullable
    private byte[] f47996w;

    /* renamed from: x */
    private uq0 f47997x;

    /* renamed from: y */
    @Nullable
    public volatile c f47998y;

    /* renamed from: com.yandex.mobile.ads.exo.drm.c$b */
    public class b implements InterfaceC4726m.b {
        private b() {
        }

        public /* synthetic */ b(C4716c c4716c, int i2) {
            this();
        }
    }

    @SuppressLint
    /* renamed from: com.yandex.mobile.ads.exo.drm.c$c */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = C4716c.this.f47986m.iterator();
            while (it.hasNext()) {
                C4715b c4715b = (C4715b) it.next();
                if (c4715b.m22109a(bArr)) {
                    c4715b.m22105a(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.c$d */
    public static final class d extends Exception {
        public /* synthetic */ d(UUID uuid, int i2) {
            this(uuid);
        }

        private d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.c$g */
    public class g implements C4715b.b {
        private g() {
        }

        /* renamed from: a */
        public final void m22156a(C4715b c4715b, int i2) {
            int i3 = 1;
            if (i2 == 1 && C4716c.this.f47989p > 0 && C4716c.this.f47985l != -9223372036854775807L) {
                C4716c.this.f47988o.add(c4715b);
                Handler handler = C4716c.this.f47994u;
                Objects.requireNonNull(handler);
                handler.postAtTime(new RunnableC4730q(c4715b, i3), c4715b, C4716c.this.f47985l + SystemClock.uptimeMillis());
            } else if (i2 == 0) {
                C4716c.this.f47986m.remove(c4715b);
                if (C4716c.this.f47991r == c4715b) {
                    C4716c.this.f47991r = null;
                }
                if (C4716c.this.f47992s == c4715b) {
                    C4716c.this.f47992s = null;
                }
                C4716c.this.f47982i.m22151a(c4715b);
                if (C4716c.this.f47985l != -9223372036854775807L) {
                    Handler handler2 = C4716c.this.f47994u;
                    Objects.requireNonNull(handler2);
                    handler2.removeCallbacksAndMessages(c4715b);
                    C4716c.this.f47988o.remove(c4715b);
                }
            }
            C4716c.m22125d(C4716c.this);
        }

        public /* synthetic */ g(C4716c c4716c, int i2) {
            this();
        }
    }

    public /* synthetic */ C4716c(UUID uuid, InterfaceC4726m.c cVar, C4728o c4728o, HashMap hashMap, boolean z, int[] iArr, boolean z2, C5981wn c5981wn, long j2, int i2) {
        this(uuid, cVar, c4728o, hashMap, z, iArr, z2, c5981wn, j2);
    }

    /* renamed from: d */
    public static void m22125d(C4716c c4716c) {
        if (c4716c.f47990q != null && c4716c.f47989p == 0 && c4716c.f47986m.isEmpty() && c4716c.f47987n.isEmpty()) {
            InterfaceC4726m interfaceC4726m = c4716c.f47990q;
            Objects.requireNonNull(interfaceC4726m);
            interfaceC4726m.release();
            c4716c.f47990q = null;
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
    public final void prepare() {
        int i2 = this.f47989p;
        this.f47989p = i2 + 1;
        if (i2 != 0) {
            return;
        }
        int i3 = 0;
        if (this.f47990q == null) {
            InterfaceC4726m mo17752a = this.f47976c.mo17752a(this.f47975b);
            this.f47990q = mo17752a;
            mo17752a.mo22194a(new b(this, i3));
        } else if (this.f47985l != -9223372036854775807L) {
            while (i3 < this.f47986m.size()) {
                ((C4715b) this.f47986m.get(i3)).mo22110b(null);
                i3++;
            }
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
    public final void release() {
        int i2 = this.f47989p - 1;
        this.f47989p = i2;
        if (i2 != 0) {
            return;
        }
        if (this.f47985l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f47986m);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((C4715b) arrayList.get(i3)).mo22106a((InterfaceC4719f.a) null);
            }
        }
        Iterator it = AbstractC4702r.m22073a(this.f47987n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
        if (this.f47990q != null && this.f47989p == 0 && this.f47986m.isEmpty() && this.f47987n.isEmpty()) {
            InterfaceC4726m interfaceC4726m = this.f47990q;
            Objects.requireNonNull(interfaceC4726m);
            interfaceC4726m.release();
            this.f47990q = null;
        }
    }

    private C4716c(UUID uuid, InterfaceC4726m.c cVar, C4728o c4728o, HashMap hashMap, boolean z, int[] iArr, boolean z2, C5981wn c5981wn, long j2) {
        C5220ia.m25469a(uuid);
        C5220ia.m25472a("Use C.CLEARKEY_UUID instead", !C5915vf.f55808b.equals(uuid));
        this.f47975b = uuid;
        this.f47976c = cVar;
        this.f47977d = c4728o;
        this.f47978e = hashMap;
        this.f47979f = z;
        this.f47980g = iArr;
        this.f47981h = z2;
        this.f47983j = c5981wn;
        this.f47982i = new f();
        this.f47984k = new g(this, 0);
        this.f47995v = 0;
        this.f47986m = new ArrayList();
        this.f47987n = C4693m0.m22041a();
        this.f47988o = C4693m0.m22041a();
        this.f47985l = j2;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC4718e m22122a(C4716c c4716c, Looper looper, InterfaceC4719f.a aVar, C5606pv c5606pv) {
        return c4716c.m22121a(looper, aVar, c5606pv, false);
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
    /* renamed from: b */
    public final InterfaceC4720g.b mo22139b(@Nullable InterfaceC4719f.a aVar, C5606pv c5606pv) {
        C5220ia.m25476b(this.f47989p > 0);
        C5220ia.m25474b(this.f47993t);
        e eVar = new e(aVar);
        eVar.m22149a(c5606pv);
        return eVar;
    }

    /* renamed from: a */
    public final void m22138a(@Nullable byte[] bArr) {
        C5220ia.m25476b(this.f47986m.isEmpty());
        this.f47995v = 0;
        this.f47996w = bArr;
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.c$a */
    public static final class a {

        /* renamed from: d */
        private boolean f48002d;

        /* renamed from: f */
        private boolean f48004f;

        /* renamed from: a */
        private final HashMap<String, String> f47999a = new HashMap<>();

        /* renamed from: b */
        private UUID f48000b = C5915vf.f55810d;

        /* renamed from: c */
        private InterfaceC4726m.c f48001c = C4727n.f48033e;

        /* renamed from: g */
        private C5981wn f48005g = new C5981wn();

        /* renamed from: e */
        private int[] f48003e = new int[0];

        /* renamed from: h */
        private long f48006h = 300000;

        /* renamed from: a */
        public final a m22140a(UUID uuid, InterfaceC4726m.c cVar) {
            Objects.requireNonNull(uuid);
            this.f48000b = uuid;
            Objects.requireNonNull(cVar);
            this.f48001c = cVar;
            return this;
        }

        /* renamed from: b */
        public final a m22144b(boolean z) {
            this.f48004f = z;
            return this;
        }

        /* renamed from: a */
        public final a m22141a(boolean z) {
            this.f48002d = z;
            return this;
        }

        /* renamed from: a */
        public final a m22142a(int... iArr) {
            for (int i2 : iArr) {
                boolean z = true;
                if (i2 != 2 && i2 != 1) {
                    z = false;
                }
                C5220ia.m25473a(z);
            }
            this.f48003e = (int[]) iArr.clone();
            return this;
        }

        /* renamed from: a */
        public final C4716c m22143a(C4728o c4728o) {
            return new C4716c(this.f48000b, this.f48001c, c4728o, this.f47999a, this.f48002d, this.f48003e, this.f48004f, this.f48005g, this.f48006h, 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.c$e */
    public class e implements InterfaceC4720g.b {

        /* renamed from: b */
        @Nullable
        private final InterfaceC4719f.a f48009b;

        /* renamed from: c */
        @Nullable
        private InterfaceC4718e f48010c;

        /* renamed from: d */
        private boolean f48011d;

        public e(@Nullable InterfaceC4719f.a aVar) {
            this.f48009b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m22148b(C5606pv c5606pv) {
            if (C4716c.this.f47989p == 0 || this.f48011d) {
                return;
            }
            C4716c c4716c = C4716c.this;
            Looper looper = c4716c.f47993t;
            Objects.requireNonNull(looper);
            this.f48010c = C4716c.m22122a(c4716c, looper, this.f48009b, c5606pv);
            C4716c.this.f47987n.add(this);
        }

        /* renamed from: a */
        public final void m22149a(C5606pv c5606pv) {
            Handler handler = C4716c.this.f47994u;
            Objects.requireNonNull(handler);
            handler.post(new RunnableC4733t(this, c5606pv, 4));
        }

        @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g.b
        public final void release() {
            Handler handler = C4716c.this.f47994u;
            Objects.requireNonNull(handler);
            s91.m28106a(handler, (Runnable) new RunnableC4730q(this, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m22145a() {
            if (this.f48011d) {
                return;
            }
            InterfaceC4718e interfaceC4718e = this.f48010c;
            if (interfaceC4718e != null) {
                interfaceC4718e.mo22106a(this.f48009b);
            }
            C4716c.this.f47987n.remove(this);
            this.f48011d = true;
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
    /* renamed from: a */
    public final void mo22137a(Looper looper, uq0 uq0Var) {
        synchronized (this) {
            Looper looper2 = this.f47993t;
            if (looper2 == null) {
                this.f47993t = looper;
                this.f47994u = new Handler(looper);
            } else {
                C5220ia.m25476b(looper2 == looper);
                Objects.requireNonNull(this.f47994u);
            }
        }
        this.f47997x = uq0Var;
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.c$f */
    public class f implements C4715b.a {

        /* renamed from: a */
        private final HashSet f48013a = new HashSet();

        /* renamed from: b */
        @Nullable
        private C4715b f48014b;

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m22150a() {
            this.f48014b = null;
            AbstractC4698p m22050a = AbstractC4698p.m22050a((Collection) this.f48013a);
            this.f48013a.clear();
            AbstractC4701q0 listIterator = m22050a.listIterator(0);
            while (listIterator.hasNext()) {
                ((C4715b) listIterator.next()).m22104a();
            }
        }

        /* renamed from: b */
        public final void m22153b(C4715b c4715b) {
            this.f48013a.add(c4715b);
            if (this.f48014b != null) {
                return;
            }
            this.f48014b = c4715b;
            c4715b.m22117i();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m22152a(Exception exc, boolean z) {
            this.f48014b = null;
            AbstractC4698p m22050a = AbstractC4698p.m22050a((Collection) this.f48013a);
            this.f48013a.clear();
            AbstractC4701q0 listIterator = m22050a.listIterator(0);
            while (listIterator.hasNext()) {
                ((C4715b) listIterator.next()).m22107a(exc, z);
            }
        }

        /* renamed from: a */
        public final void m22151a(C4715b c4715b) {
            this.f48013a.remove(c4715b);
            if (this.f48014b == c4715b) {
                this.f48014b = null;
                if (this.f48013a.isEmpty()) {
                    return;
                }
                C4715b c4715b2 = (C4715b) this.f48013a.iterator().next();
                this.f48014b = c4715b2;
                c4715b2.m22117i();
            }
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
    @Nullable
    /* renamed from: a */
    public final InterfaceC4718e mo22136a(@Nullable InterfaceC4719f.a aVar, C5606pv c5606pv) {
        C5220ia.m25476b(this.f47989p > 0);
        C5220ia.m25474b(this.f47993t);
        return m22121a(this.f47993t, aVar, c5606pv, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if ((r7.equals(r6.f47940b) || com.yandex.mobile.ads.impl.C5915vf.f55808b.equals(r6.f47940b)) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.exo.drm.InterfaceC4720g
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo22135a(com.yandex.mobile.ads.impl.C5606pv r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.C4716c.mo22135a(com.yandex.mobile.ads.impl.pv):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0181, code lost:
    
        if ((r13.equals(r12.f47940b) || com.yandex.mobile.ads.impl.C5915vf.f55808b.equals(r12.f47940b)) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01fc, code lost:
    
        if ((r3.getCause() instanceof android.media.ResourceBusyException) != false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x024c, code lost:
    
        if ((r3.getCause() instanceof android.media.ResourceBusyException) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if ((r3.getCause() instanceof android.media.ResourceBusyException) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
    
        if ((r3.getCause() instanceof android.media.ResourceBusyException) != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021b A[LOOP:5: B:136:0x0215->B:138:0x021b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026c A[LOOP:6: B:155:0x0266->B:157:0x026c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098 A[LOOP:1: B:35:0x0092->B:37:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8 A[LOOP:2: B:55:0x00e2->B:57:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.mobile.ads.exo.drm.InterfaceC4718e m22121a(android.os.Looper r17, @androidx.annotation.Nullable com.yandex.mobile.ads.exo.drm.InterfaceC4719f.a r18, com.yandex.mobile.ads.impl.C5606pv r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.C4716c.m22121a(android.os.Looper, com.yandex.mobile.ads.exo.drm.f$a, com.yandex.mobile.ads.impl.pv, boolean):com.yandex.mobile.ads.exo.drm.e");
    }

    /* renamed from: a */
    private C4715b m22120a(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable InterfaceC4719f.a aVar) {
        Objects.requireNonNull(this.f47990q);
        boolean z2 = this.f47981h | z;
        UUID uuid = this.f47975b;
        InterfaceC4726m interfaceC4726m = this.f47990q;
        f fVar = this.f47982i;
        g gVar = this.f47984k;
        int i2 = this.f47995v;
        byte[] bArr = this.f47996w;
        HashMap<String, String> hashMap = this.f47978e;
        InterfaceC4729p interfaceC4729p = this.f47977d;
        Looper looper = this.f47993t;
        Objects.requireNonNull(looper);
        i80 i80Var = this.f47983j;
        uq0 uq0Var = this.f47997x;
        Objects.requireNonNull(uq0Var);
        C4715b c4715b = new C4715b(uuid, interfaceC4726m, fVar, gVar, list, i2, z2, z, bArr, hashMap, interfaceC4729p, looper, i80Var, uq0Var);
        c4715b.mo22110b(aVar);
        if (this.f47985l != -9223372036854775807L) {
            c4715b.mo22110b(null);
        }
        return c4715b;
    }
}
