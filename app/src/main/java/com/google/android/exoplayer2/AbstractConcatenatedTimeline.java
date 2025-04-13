package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ShuffleOrder;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class AbstractConcatenatedTimeline extends Timeline {

    /* renamed from: c */
    public final int f9423c;

    /* renamed from: d */
    public final ShuffleOrder f9424d;

    /* renamed from: e */
    public final boolean f9425e;

    public AbstractConcatenatedTimeline(boolean z, ShuffleOrder shuffleOrder) {
        this.f9425e = z;
        this.f9424d = shuffleOrder;
        this.f9423c = shuffleOrder.getLength();
    }

    /* renamed from: A */
    public final int m5605A(int i2, boolean z) {
        if (z) {
            return this.f9424d.mo6912d(i2);
        }
        if (i2 < this.f9423c - 1) {
            return i2 + 1;
        }
        return -1;
    }

    /* renamed from: B */
    public final int m5606B(int i2, boolean z) {
        if (z) {
            return this.f9424d.mo6911c(i2);
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        return -1;
    }

    /* renamed from: C */
    public abstract Timeline mo5607C(int i2);

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: c */
    public int mo5608c(boolean z) {
        if (this.f9423c == 0) {
            return -1;
        }
        if (this.f9425e) {
            z = false;
        }
        int mo6910b = z ? this.f9424d.mo6910b() : 0;
        while (mo5607C(mo6910b).m5991s()) {
            mo6910b = m5605A(mo6910b, z);
            if (mo6910b == -1) {
                return -1;
            }
        }
        return mo5607C(mo6910b).mo5608c(z) + mo5622z(mo6910b);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: d */
    public final int mo5609d(Object obj) {
        int mo5609d;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo5617u = mo5617u(obj2);
        if (mo5617u == -1 || (mo5609d = mo5607C(mo5617u).mo5609d(obj3)) == -1) {
            return -1;
        }
        return mo5621y(mo5617u) + mo5609d;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: e */
    public int mo5610e(boolean z) {
        int i2 = this.f9423c;
        if (i2 == 0) {
            return -1;
        }
        if (this.f9425e) {
            z = false;
        }
        int mo6914f = z ? this.f9424d.mo6914f() : i2 - 1;
        while (mo5607C(mo6914f).m5991s()) {
            mo6914f = m5606B(mo6914f, z);
            if (mo6914f == -1) {
                return -1;
            }
        }
        return mo5607C(mo6914f).mo5610e(z) + mo5622z(mo6914f);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: g */
    public int mo5611g(int i2, int i3, boolean z) {
        if (this.f9425e) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        int mo5619w = mo5619w(i2);
        int mo5622z = mo5622z(mo5619w);
        int mo5611g = mo5607C(mo5619w).mo5611g(i2 - mo5622z, i3 != 2 ? i3 : 0, z);
        if (mo5611g != -1) {
            return mo5622z + mo5611g;
        }
        int m5605A = m5605A(mo5619w, z);
        while (m5605A != -1 && mo5607C(m5605A).m5991s()) {
            m5605A = m5605A(m5605A, z);
        }
        if (m5605A != -1) {
            return mo5607C(m5605A).mo5608c(z) + mo5622z(m5605A);
        }
        if (i3 == 2) {
            return mo5608c(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: i */
    public final Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
        int mo5618v = mo5618v(i2);
        int mo5622z = mo5622z(mo5618v);
        mo5607C(mo5618v).mo5612i(i2 - mo5621y(mo5618v), period, z);
        period.f10051d += mo5622z;
        if (z) {
            Object mo5620x = mo5620x(mo5618v);
            Object obj = period.f10050c;
            Objects.requireNonNull(obj);
            period.f10050c = Pair.create(mo5620x, obj);
        }
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: j */
    public final Timeline.Period mo5613j(Object obj, Timeline.Period period) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo5617u = mo5617u(obj2);
        int mo5622z = mo5622z(mo5617u);
        mo5607C(mo5617u).mo5613j(obj3, period);
        period.f10051d += mo5622z;
        period.f10050c = obj;
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: n */
    public int mo5614n(int i2, int i3, boolean z) {
        if (this.f9425e) {
            if (i3 == 1) {
                i3 = 2;
            }
            z = false;
        }
        int mo5619w = mo5619w(i2);
        int mo5622z = mo5622z(mo5619w);
        int mo5614n = mo5607C(mo5619w).mo5614n(i2 - mo5622z, i3 != 2 ? i3 : 0, z);
        if (mo5614n != -1) {
            return mo5622z + mo5614n;
        }
        int m5606B = m5606B(mo5619w, z);
        while (m5606B != -1 && mo5607C(m5606B).m5991s()) {
            m5606B = m5606B(m5606B, z);
        }
        if (m5606B != -1) {
            return mo5607C(m5606B).mo5610e(z) + mo5622z(m5606B);
        }
        if (i3 == 2) {
            return mo5610e(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: o */
    public final Object mo5615o(int i2) {
        int mo5618v = mo5618v(i2);
        return Pair.create(mo5620x(mo5618v), mo5607C(mo5618v).mo5615o(i2 - mo5621y(mo5618v)));
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: q */
    public final Timeline.Window mo5616q(int i2, Timeline.Window window, long j2) {
        int mo5619w = mo5619w(i2);
        int mo5622z = mo5622z(mo5619w);
        int mo5621y = mo5621y(mo5619w);
        mo5607C(mo5619w).mo5616q(i2 - mo5622z, window, j2);
        Object mo5620x = mo5620x(mo5619w);
        if (!Timeline.Window.f10060s.equals(window.f10064b)) {
            mo5620x = Pair.create(mo5620x, window.f10064b);
        }
        window.f10064b = mo5620x;
        window.f10078p += mo5621y;
        window.f10079q += mo5621y;
        return window;
    }

    /* renamed from: u */
    public abstract int mo5617u(Object obj);

    /* renamed from: v */
    public abstract int mo5618v(int i2);

    /* renamed from: w */
    public abstract int mo5619w(int i2);

    /* renamed from: x */
    public abstract Object mo5620x(int i2);

    /* renamed from: y */
    public abstract int mo5621y(int i2);

    /* renamed from: z */
    public abstract int mo5622z(int i2);
}
