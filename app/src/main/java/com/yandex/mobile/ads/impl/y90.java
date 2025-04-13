package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.k61;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class y90 extends AbstractC5868uj<Void> {

    /* renamed from: k */
    private final bc0 f56696k;

    /* renamed from: l */
    private final boolean f56697l;

    /* renamed from: m */
    private final k61.C5323d f56698m;

    /* renamed from: n */
    private final k61.C5321b f56699n;

    /* renamed from: o */
    private C6064a f56700o;

    /* renamed from: p */
    @Nullable
    private x90 f56701p;

    /* renamed from: q */
    private boolean f56702q;

    /* renamed from: r */
    private boolean f56703r;

    /* renamed from: s */
    private boolean f56704s;

    /* renamed from: com.yandex.mobile.ads.impl.y90$a */
    public static final class C6064a extends AbstractC5762sv {

        /* renamed from: e */
        public static final Object f56705e = new Object();

        /* renamed from: c */
        @Nullable
        private final Object f56706c;

        /* renamed from: d */
        @Nullable
        private final Object f56707d;

        private C6064a(k61 k61Var, @Nullable Object obj, @Nullable Object obj2) {
            super(k61Var);
            this.f56706c = obj;
            this.f56707d = obj2;
        }

        /* renamed from: a */
        public static C6064a m29878a(pb0 pb0Var) {
            return new C6064a(new C6065b(pb0Var), k61.C5323d.f51860r, f56705e);
        }

        /* renamed from: a */
        public static C6064a m29877a(k61 k61Var, @Nullable Object obj, @Nullable Object obj2) {
            return new C6064a(k61Var, obj, obj2);
        }

        /* renamed from: a */
        public final C6064a m29880a(k61 k61Var) {
            return new C6064a(k61Var, this.f56706c, this.f56707d);
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final k61.C5323d mo23974a(int i2, k61.C5323d c5323d, long j2) {
            this.f54810b.mo23974a(i2, c5323d, j2);
            if (s91.m28112a(c5323d.f51864a, this.f56706c)) {
                c5323d.f51864a = k61.C5323d.f51860r;
            }
            return c5323d;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final k61.C5321b mo23972a(int i2, k61.C5321b c5321b, boolean z) {
            this.f54810b.mo23972a(i2, c5321b, z);
            if (s91.m28112a(c5321b.f51850b, this.f56707d) && z) {
                c5321b.f51850b = f56705e;
            }
            return c5321b;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5762sv, com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final int mo23970a(Object obj) {
            Object obj2;
            k61 k61Var = this.f54810b;
            if (f56705e.equals(obj) && (obj2 = this.f56707d) != null) {
                obj = obj2;
            }
            return k61Var.mo23970a(obj);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5762sv, com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final Object mo23975a(int i2) {
            Object mo23975a = this.f54810b.mo23975a(i2);
            return s91.m28112a(mo23975a, this.f56707d) ? f56705e : mo23975a;
        }
    }

    public y90(bc0 bc0Var, boolean z) {
        boolean z2;
        this.f56696k = bc0Var;
        if (z) {
            Objects.requireNonNull(bc0Var);
            z2 = true;
        } else {
            z2 = false;
        }
        this.f56697l = z2;
        this.f56698m = new k61.C5323d();
        this.f56699n = new k61.C5321b();
        Objects.requireNonNull(bc0Var);
        this.f56700o = C6064a.m29878a(bc0Var.getMediaItem());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r8 != r18.f56700o.mo23974a(0, r18.f56698m, 0).f51876m) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.AbstractC5868uj
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m29023a(java.lang.Void r19, com.yandex.mobile.ads.impl.bc0 r20, com.yandex.mobile.ads.impl.k61 r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y90.m29023a(java.lang.Object, com.yandex.mobile.ads.impl.bc0, com.yandex.mobile.ads.impl.k61):void");
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5868uj, com.yandex.mobile.ads.impl.AbstractC4917ce
    /* renamed from: e */
    public final void mo23244e() {
        this.f56703r = false;
        this.f56702q = false;
        super.mo23244e();
    }

    /* renamed from: f */
    public final k61 m29876f() {
        return this.f56700o;
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    public final pb0 getMediaItem() {
        return this.f56696k.getMediaItem();
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.y90$b */
    public static final class C6065b extends k61 {

        /* renamed from: b */
        private final pb0 f56708b;

        public C6065b(pb0 pb0Var) {
            this.f56708b = pb0Var;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final int mo25934a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final k61.C5323d mo23974a(int i2, k61.C5323d c5323d, long j2) {
            c5323d.m26064a(k61.C5323d.f51860r, this.f56708b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            c5323d.f51875l = true;
            return c5323d;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: b */
        public final int mo25935b() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final k61.C5321b mo23972a(int i2, k61.C5321b c5321b, boolean z) {
            c5321b.m26051a(z ? 0 : null, z ? C6064a.f56705e : null, 0, -9223372036854775807L, 0L, C6054y3.f56644g, true);
            return c5321b;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final int mo23970a(Object obj) {
            return obj == C6064a.f56705e ? 0 : -1;
        }

        @Override // com.yandex.mobile.ads.impl.k61
        /* renamed from: a */
        public final Object mo23975a(int i2) {
            return C6064a.f56705e;
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5868uj
    @Nullable
    /* renamed from: a */
    public final bc0.C4858b mo29025a(Void r2, bc0.C4858b c4858b) {
        Object obj = c4858b.f56449a;
        if (this.f56700o.f56707d != null && this.f56700o.f56707d.equals(obj)) {
            obj = C6064a.f56705e;
        }
        return c4858b.m22800b(obj);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5868uj, com.yandex.mobile.ads.impl.AbstractC4917ce
    /* renamed from: a */
    public final void mo23238a(@Nullable v71 v71Var) {
        super.mo23238a(v71Var);
        if (this.f56697l) {
            return;
        }
        this.f56702q = true;
        m29026a((y90) null, this.f56696k);
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: a */
    public final void mo22797a(vb0 vb0Var) {
        ((x90) vb0Var).m29706c();
        if (vb0Var == this.f56701p) {
            this.f56701p = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.bc0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final x90 mo22790a(bc0.C4858b c4858b, InterfaceC5476n8 interfaceC5476n8, long j2) {
        x90 x90Var = new x90(c4858b, interfaceC5476n8, j2);
        x90Var.m29704a(this.f56696k);
        if (this.f56703r) {
            Object obj = c4858b.f56449a;
            if (this.f56700o.f56707d != null && obj.equals(C6064a.f56705e)) {
                obj = this.f56700o.f56707d;
            }
            x90Var.m29703a(c4858b.m22800b(obj));
        } else {
            this.f56701p = x90Var;
            if (!this.f56702q) {
                this.f56702q = true;
                m29026a((y90) null, this.f56696k);
            }
        }
        return x90Var;
    }
}
