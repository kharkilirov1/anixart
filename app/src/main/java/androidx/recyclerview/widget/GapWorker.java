package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.os.TraceCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class GapWorker implements Runnable {

    /* renamed from: f */
    public static final ThreadLocal<GapWorker> f5311f = new ThreadLocal<>();

    /* renamed from: g */
    public static Comparator<Task> f5312g = new Comparator<Task>() { // from class: androidx.recyclerview.widget.GapWorker.1
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        
            r1 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        
            if (r0 != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        
            if (r0 == null) goto L18;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compare(androidx.recyclerview.widget.GapWorker.Task r7, androidx.recyclerview.widget.GapWorker.Task r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.GapWorker$Task r7 = (androidx.recyclerview.widget.GapWorker.Task) r7
                androidx.recyclerview.widget.GapWorker$Task r8 = (androidx.recyclerview.widget.GapWorker.Task) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f5324d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f5324d
                if (r4 != 0) goto L13
                r4 = 1
                goto L14
            L13:
                r4 = 0
            L14:
                r5 = -1
                if (r3 == r4) goto L1a
                if (r0 != 0) goto L22
                goto L23
            L1a:
                boolean r0 = r7.f5321a
                boolean r3 = r8.f5321a
                if (r0 == r3) goto L25
                if (r0 == 0) goto L23
            L22:
                r1 = -1
            L23:
                r2 = r1
                goto L36
            L25:
                int r0 = r8.f5322b
                int r1 = r7.f5322b
                int r0 = r0 - r1
                if (r0 == 0) goto L2e
                r2 = r0
                goto L36
            L2e:
                int r7 = r7.f5323c
                int r8 = r8.f5323c
                int r7 = r7 - r8
                if (r7 == 0) goto L36
                r2 = r7
            L36:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GapWorker.C05101.compare(java.lang.Object, java.lang.Object):int");
        }
    };

    /* renamed from: c */
    public long f5314c;

    /* renamed from: d */
    public long f5315d;

    /* renamed from: b */
    public ArrayList<RecyclerView> f5313b = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<Task> f5316e = new ArrayList<>();

    @SuppressLint
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.LayoutPrefetchRegistry {

        /* renamed from: a */
        public int f5317a;

        /* renamed from: b */
        public int f5318b;

        /* renamed from: c */
        public int[] f5319c;

        /* renamed from: d */
        public int f5320d;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry
        /* renamed from: a */
        public void mo3590a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i4 = this.f5320d * 2;
            int[] iArr = this.f5319c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f5319c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i4 * 2];
                this.f5319c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f5319c;
            iArr4[i4] = i2;
            iArr4[i4 + 1] = i3;
            this.f5320d++;
        }

        /* renamed from: b */
        public void m3591b(RecyclerView recyclerView, boolean z) {
            this.f5320d = 0;
            int[] iArr = this.f5319c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.f5519n;
            if (recyclerView.f5517m == null || layoutManager == null || !layoutManager.f5572l) {
                return;
            }
            if (z) {
                if (!recyclerView.f5501e.m3475i()) {
                    layoutManager.mo3663A(recyclerView.f5517m.getItemCount(), this);
                }
            } else if (!recyclerView.m3785U()) {
                layoutManager.mo3706z(this.f5317a, this.f5318b, recyclerView.f5510i0, this);
            }
            int i2 = this.f5320d;
            if (i2 > layoutManager.f5573m) {
                layoutManager.f5573m = i2;
                layoutManager.f5574n = z;
                recyclerView.f5497c.m3933n();
            }
        }

        /* renamed from: c */
        public boolean m3592c(int i2) {
            if (this.f5319c != null) {
                int i3 = this.f5320d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f5319c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class Task {

        /* renamed from: a */
        public boolean f5321a;

        /* renamed from: b */
        public int f5322b;

        /* renamed from: c */
        public int f5323c;

        /* renamed from: d */
        public RecyclerView f5324d;

        /* renamed from: e */
        public int f5325e;
    }

    /* renamed from: a */
    public void m3587a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f5314c == 0) {
            this.f5314c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.f5508h0;
        layoutPrefetchRegistryImpl.f5317a = i2;
        layoutPrefetchRegistryImpl.f5318b = i3;
    }

    /* renamed from: b */
    public void m3588b(long j2) {
        Task task;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Task task2;
        int size = this.f5313b.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = this.f5313b.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f5508h0.m3591b(recyclerView3, false);
                i2 += recyclerView3.f5508h0.f5320d;
            }
        }
        this.f5316e.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = this.f5313b.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView4.f5508h0;
                int abs = Math.abs(layoutPrefetchRegistryImpl.f5318b) + Math.abs(layoutPrefetchRegistryImpl.f5317a);
                for (int i6 = 0; i6 < layoutPrefetchRegistryImpl.f5320d * 2; i6 += 2) {
                    if (i4 >= this.f5316e.size()) {
                        task2 = new Task();
                        this.f5316e.add(task2);
                    } else {
                        task2 = this.f5316e.get(i4);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.f5319c;
                    int i7 = iArr[i6 + 1];
                    task2.f5321a = i7 <= abs;
                    task2.f5322b = abs;
                    task2.f5323c = i7;
                    task2.f5324d = recyclerView4;
                    task2.f5325e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f5316e, f5312g);
        for (int i8 = 0; i8 < this.f5316e.size() && (recyclerView = (task = this.f5316e.get(i8)).f5324d) != null; i8++) {
            RecyclerView.ViewHolder m3589c = m3589c(recyclerView, task.f5325e, task.f5321a ? Long.MAX_VALUE : j2);
            if (m3589c != null && m3589c.mNestedRecyclerView != null && m3589c.isBound() && !m3589c.isInvalid() && (recyclerView2 = m3589c.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.f5475E && recyclerView2.f5503f.m3500g() != 0) {
                    recyclerView2.m3803k0();
                }
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl2 = recyclerView2.f5508h0;
                layoutPrefetchRegistryImpl2.m3591b(recyclerView2, true);
                if (layoutPrefetchRegistryImpl2.f5320d != 0) {
                    try {
                        TraceCompat.m1969a("RV Nested Prefetch");
                        RecyclerView.State state = recyclerView2.f5510i0;
                        RecyclerView.Adapter adapter = recyclerView2.f5517m;
                        state.f5624d = 1;
                        state.f5625e = adapter.getItemCount();
                        state.f5627g = false;
                        state.f5628h = false;
                        state.f5629i = false;
                        for (int i9 = 0; i9 < layoutPrefetchRegistryImpl2.f5320d * 2; i9 += 2) {
                            m3589c(recyclerView2, layoutPrefetchRegistryImpl2.f5319c[i9], j2);
                        }
                    } finally {
                        TraceCompat.m1970b();
                    }
                } else {
                    continue;
                }
            }
            task.f5321a = false;
            task.f5322b = 0;
            task.f5323c = 0;
            task.f5324d = null;
            task.f5325e = 0;
        }
    }

    /* renamed from: c */
    public final RecyclerView.ViewHolder m3589c(RecyclerView recyclerView, int i2, long j2) {
        boolean z;
        int m3500g = recyclerView.f5503f.m3500g();
        int i3 = 0;
        while (true) {
            if (i3 >= m3500g) {
                z = false;
                break;
            }
            RecyclerView.ViewHolder m3759R = RecyclerView.m3759R(recyclerView.f5503f.m3499f(i3));
            if (m3759R.mPosition == i2 && !m3759R.isInvalid()) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.f5497c;
        try {
            recyclerView.m3794d0();
            RecyclerView.ViewHolder m3931l = recycler.m3931l(i2, false, j2);
            if (m3931l != null) {
                if (!m3931l.isBound() || m3931l.isInvalid()) {
                    recycler.m3920a(m3931l, false);
                } else {
                    recycler.m3927h(m3931l.itemView);
                }
            }
            return m3931l;
        } finally {
            recyclerView.m3795e0(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            TraceCompat.m1969a("RV Prefetch");
            if (!this.f5313b.isEmpty()) {
                int size = this.f5313b.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.f5313b.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    m3588b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f5315d);
                }
            }
        } finally {
            this.f5314c = 0L;
            TraceCompat.m1970b();
        }
    }
}
