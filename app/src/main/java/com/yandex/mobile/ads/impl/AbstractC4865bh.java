package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.AbstractC5809tm;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.yandex.mobile.ads.impl.bh */
/* loaded from: classes3.dex */
abstract class AbstractC4865bh implements x41 {

    /* renamed from: a */
    private final ArrayDeque<a> f48869a = new ArrayDeque<>();

    /* renamed from: b */
    private final ArrayDeque<b51> f48870b;

    /* renamed from: c */
    private final PriorityQueue<a> f48871c;

    /* renamed from: d */
    @Nullable
    private a f48872d;

    /* renamed from: e */
    private long f48873e;

    /* renamed from: f */
    private long f48874f;

    /* renamed from: com.yandex.mobile.ads.impl.bh$a */
    public static final class a extends a51 implements Comparable<a> {

        /* renamed from: j */
        private long f48875j;

        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x002f A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002d A[RETURN, SYNTHETIC] */
        @Override // java.lang.Comparable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compareTo(com.yandex.mobile.ads.impl.AbstractC4865bh.a r7) {
            /*
                r6 = this;
                com.yandex.mobile.ads.impl.bh$a r7 = (com.yandex.mobile.ads.impl.AbstractC4865bh.a) r7
                boolean r0 = r6.m26638f()
                boolean r1 = r7.m26638f()
                if (r0 == r1) goto L13
                boolean r7 = r6.m26638f()
                if (r7 == 0) goto L2f
                goto L2d
            L13:
                long r0 = r6.f54759e
                long r2 = r7.f54759e
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L29
                long r0 = r6.f48875j
                long r4 = r7.f48875j
                long r0 = r0 - r4
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 != 0) goto L29
                r7 = 0
                goto L30
            L29:
                int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r7 <= 0) goto L2f
            L2d:
                r7 = 1
                goto L30
            L2f:
                r7 = -1
            L30:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC4865bh.a.compareTo(java.lang.Object):int");
        }

        public /* synthetic */ a(int i2) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.bh$b */
    public static final class b extends b51 {

        /* renamed from: e */
        private AbstractC5809tm.a<b> f48876e;

        public b(AbstractC5809tm.a<b> aVar) {
            this.f48876e = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC5809tm
        /* renamed from: h */
        public final void mo22827h() {
            this.f48876e.mo24220a(this);
        }
    }

    public AbstractC4865bh() {
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            this.f48869a.add(new a(i2));
        }
        this.f48870b = new ArrayDeque<>();
        while (i2 < 2) {
            this.f48870b.add(new b(new en1(this, 1)));
            i2++;
        }
        this.f48871c = new PriorityQueue<>();
    }

    /* renamed from: b */
    public abstract void mo22503b(a51 a51Var);

    /* renamed from: c */
    public abstract w41 mo22504c();

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22818a(a51 a51Var) throws y41 {
        C5220ia.m25473a(a51Var == this.f48872d);
        a aVar = (a) a51Var;
        if (aVar.m26637e()) {
            aVar.mo22727b();
            this.f48869a.add(aVar);
        } else {
            long j2 = this.f48874f;
            this.f48874f = 1 + j2;
            aVar.f48875j = j2;
            this.f48871c.add(aVar);
        }
        this.f48872d = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    @Nullable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a51 mo22820b() throws y41 {
        C5220ia.m25476b(this.f48872d == null);
        if (this.f48869a.isEmpty()) {
            return null;
        }
        a pollFirst = this.f48869a.pollFirst();
        this.f48872d = pollFirst;
        return pollFirst;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    @Nullable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b51 mo22816a() throws y41 {
        if (this.f48870b.isEmpty()) {
            return null;
        }
        while (!this.f48871c.isEmpty()) {
            a peek = this.f48871c.peek();
            int i2 = s91.f54530a;
            if (peek.f54759e > this.f48873e) {
                break;
            }
            a poll = this.f48871c.poll();
            if (poll.m26638f()) {
                b51 pollFirst = this.f48870b.pollFirst();
                pollFirst.m26632b(4);
                poll.mo22727b();
                this.f48869a.add(poll);
                return pollFirst;
            }
            mo22503b(poll);
            if (mo22505h()) {
                w41 mo22504c = mo22504c();
                b51 pollFirst2 = this.f48870b.pollFirst();
                pollFirst2.m22725a(poll.f54759e, mo22504c, Long.MAX_VALUE);
                poll.mo22727b();
                this.f48869a.add(poll);
                return pollFirst2;
            }
            poll.mo22727b();
            this.f48869a.add(poll);
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    public final b51 m22824f() {
        return this.f48870b.pollFirst();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5597pm
    public void flush() {
        this.f48874f = 0L;
        this.f48873e = 0L;
        while (!this.f48871c.isEmpty()) {
            a poll = this.f48871c.poll();
            int i2 = s91.f54530a;
            poll.mo22727b();
            this.f48869a.add(poll);
        }
        a aVar = this.f48872d;
        if (aVar != null) {
            aVar.mo22727b();
            this.f48869a.add(aVar);
            this.f48872d = null;
        }
    }

    /* renamed from: g */
    public final long m22825g() {
        return this.f48873e;
    }

    /* renamed from: h */
    public abstract boolean mo22505h();

    @Override // com.yandex.mobile.ads.impl.x41
    /* renamed from: a */
    public void mo22817a(long j2) {
        this.f48873e = j2;
    }

    /* renamed from: a */
    public final void m22819a(b51 b51Var) {
        b51Var.mo22727b();
        this.f48870b.add(b51Var);
    }
}
