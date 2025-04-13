package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class ChildHelper {

    /* renamed from: a */
    public final Callback f5186a;

    /* renamed from: b */
    public final Bucket f5187b = new Bucket();

    /* renamed from: c */
    public final List<View> f5188c = new ArrayList();

    public static class Bucket {

        /* renamed from: a */
        public long f5189a = 0;

        /* renamed from: b */
        public Bucket f5190b;

        /* renamed from: a */
        public void m3504a(int i2) {
            if (i2 < 64) {
                this.f5189a &= ~(1 << i2);
                return;
            }
            Bucket bucket = this.f5190b;
            if (bucket != null) {
                bucket.m3504a(i2 - 64);
            }
        }

        /* renamed from: b */
        public int m3505b(int i2) {
            Bucket bucket = this.f5190b;
            if (bucket == null) {
                return i2 >= 64 ? Long.bitCount(this.f5189a) : Long.bitCount(this.f5189a & ((1 << i2) - 1));
            }
            if (i2 < 64) {
                return Long.bitCount(this.f5189a & ((1 << i2) - 1));
            }
            return Long.bitCount(this.f5189a) + bucket.m3505b(i2 - 64);
        }

        /* renamed from: c */
        public final void m3506c() {
            if (this.f5190b == null) {
                this.f5190b = new Bucket();
            }
        }

        /* renamed from: d */
        public boolean m3507d(int i2) {
            if (i2 < 64) {
                return (this.f5189a & (1 << i2)) != 0;
            }
            m3506c();
            return this.f5190b.m3507d(i2 - 64);
        }

        /* renamed from: e */
        public void m3508e(int i2, boolean z) {
            if (i2 >= 64) {
                m3506c();
                this.f5190b.m3508e(i2 - 64, z);
                return;
            }
            long j2 = this.f5189a;
            boolean z2 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.f5189a = ((j2 & (~j3)) << 1) | (j2 & j3);
            if (z) {
                m3511h(i2);
            } else {
                m3504a(i2);
            }
            if (z2 || this.f5190b != null) {
                m3506c();
                this.f5190b.m3508e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean m3509f(int i2) {
            if (i2 >= 64) {
                m3506c();
                return this.f5190b.m3509f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.f5189a;
            boolean z = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.f5189a = j4;
            long j5 = j2 - 1;
            this.f5189a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            Bucket bucket = this.f5190b;
            if (bucket != null) {
                if (bucket.m3507d(0)) {
                    m3511h(63);
                }
                this.f5190b.m3509f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void m3510g() {
            this.f5189a = 0L;
            Bucket bucket = this.f5190b;
            if (bucket != null) {
                bucket.m3510g();
            }
        }

        /* renamed from: h */
        public void m3511h(int i2) {
            if (i2 < 64) {
                this.f5189a |= 1 << i2;
            } else {
                m3506c();
                this.f5190b.m3511h(i2 - 64);
            }
        }

        public String toString() {
            if (this.f5190b == null) {
                return Long.toBinaryString(this.f5189a);
            }
            return this.f5190b.toString() + "xx" + Long.toBinaryString(this.f5189a);
        }
    }

    public interface Callback {
        /* renamed from: a */
        View mo3512a(int i2);

        /* renamed from: b */
        void mo3513b(View view);

        /* renamed from: c */
        int mo3514c();

        /* renamed from: d */
        void mo3515d();

        /* renamed from: e */
        int mo3516e(View view);

        /* renamed from: f */
        RecyclerView.ViewHolder mo3517f(View view);

        /* renamed from: g */
        void mo3518g(int i2);

        /* renamed from: h */
        void mo3519h(View view);

        /* renamed from: i */
        void mo3520i(View view, int i2);

        /* renamed from: j */
        void mo3521j(int i2);

        /* renamed from: k */
        void mo3522k(View view, int i2, ViewGroup.LayoutParams layoutParams);
    }

    public ChildHelper(Callback callback) {
        this.f5186a = callback;
    }

    /* renamed from: a */
    public void m3494a(View view, int i2, boolean z) {
        int mo3514c = i2 < 0 ? this.f5186a.mo3514c() : m3498e(i2);
        this.f5187b.m3508e(mo3514c, z);
        if (z) {
            this.f5188c.add(view);
            this.f5186a.mo3513b(view);
        }
        this.f5186a.mo3520i(view, mo3514c);
    }

    /* renamed from: b */
    public void m3495b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int mo3514c = i2 < 0 ? this.f5186a.mo3514c() : m3498e(i2);
        this.f5187b.m3508e(mo3514c, z);
        if (z) {
            this.f5188c.add(view);
            this.f5186a.mo3513b(view);
        }
        this.f5186a.mo3522k(view, mo3514c, layoutParams);
    }

    /* renamed from: c */
    public View m3496c(int i2) {
        return this.f5186a.mo3512a(m3498e(i2));
    }

    /* renamed from: d */
    public int m3497d() {
        return this.f5186a.mo3514c() - this.f5188c.size();
    }

    /* renamed from: e */
    public final int m3498e(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int mo3514c = this.f5186a.mo3514c();
        int i3 = i2;
        while (i3 < mo3514c) {
            int m3505b = i2 - (i3 - this.f5187b.m3505b(i3));
            if (m3505b == 0) {
                while (this.f5187b.m3507d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += m3505b;
        }
        return -1;
    }

    /* renamed from: f */
    public View m3499f(int i2) {
        return this.f5186a.mo3512a(i2);
    }

    /* renamed from: g */
    public int m3500g() {
        return this.f5186a.mo3514c();
    }

    /* renamed from: h */
    public int m3501h(View view) {
        int mo3516e = this.f5186a.mo3516e(view);
        if (mo3516e == -1 || this.f5187b.m3507d(mo3516e)) {
            return -1;
        }
        return mo3516e - this.f5187b.m3505b(mo3516e);
    }

    /* renamed from: i */
    public boolean m3502i(View view) {
        return this.f5188c.contains(view);
    }

    /* renamed from: j */
    public final boolean m3503j(View view) {
        if (!this.f5188c.remove(view)) {
            return false;
        }
        this.f5186a.mo3519h(view);
        return true;
    }

    public String toString() {
        return this.f5187b.toString() + ", hidden list:" + this.f5188c.size();
    }
}
