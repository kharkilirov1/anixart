package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
final class ScrollEventAdapter extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public ViewPager2.OnPageChangeCallback f6624a;

    /* renamed from: b */
    @NonNull
    public final ViewPager2 f6625b;

    /* renamed from: c */
    @NonNull
    public final RecyclerView f6626c;

    /* renamed from: d */
    @NonNull
    public final LinearLayoutManager f6627d;

    /* renamed from: e */
    public int f6628e;

    /* renamed from: f */
    public int f6629f;

    /* renamed from: g */
    public ScrollEventValues f6630g;

    /* renamed from: h */
    public int f6631h;

    /* renamed from: i */
    public int f6632i;

    /* renamed from: j */
    public boolean f6633j;

    /* renamed from: k */
    public boolean f6634k;

    /* renamed from: l */
    public boolean f6635l;

    /* renamed from: m */
    public boolean f6636m;

    public static final class ScrollEventValues {

        /* renamed from: a */
        public int f6637a;

        /* renamed from: b */
        public float f6638b;

        /* renamed from: c */
        public int f6639c;

        /* renamed from: a */
        public void m4386a() {
            this.f6637a = -1;
            this.f6638b = 0.0f;
            this.f6639c = 0;
        }
    }

    public ScrollEventAdapter(@NonNull ViewPager2 viewPager2) {
        this.f6625b = viewPager2;
        RecyclerView recyclerView = viewPager2.f6649k;
        this.f6626c = recyclerView;
        this.f6627d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f6630g = new ScrollEventValues();
        m4384g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /* renamed from: a */
    public void mo3914a(@NonNull RecyclerView recyclerView, int i2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback;
        int i3 = this.f6628e;
        boolean z = true;
        if (!(i3 == 1 && this.f6629f == 1) && i2 == 1) {
            this.f6636m = false;
            this.f6628e = 1;
            int i4 = this.f6632i;
            if (i4 != -1) {
                this.f6631h = i4;
                this.f6632i = -1;
            } else if (this.f6631h == -1) {
                this.f6631h = this.f6627d.m3695r1();
            }
            m4383f(1);
            return;
        }
        if ((i3 == 1 || i3 == 4) && i2 == 2) {
            if (this.f6634k) {
                m4383f(2);
                this.f6633j = true;
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 4) && i2 == 0) {
            m4385h();
            if (this.f6634k) {
                ScrollEventValues scrollEventValues = this.f6630g;
                if (scrollEventValues.f6639c == 0) {
                    int i5 = this.f6631h;
                    int i6 = scrollEventValues.f6637a;
                    if (i5 != i6) {
                        m4382e(i6);
                    }
                } else {
                    z = false;
                }
            } else {
                int i7 = this.f6630g.f6637a;
                if (i7 != -1 && (onPageChangeCallback = this.f6624a) != null) {
                    onPageChangeCallback.onPageScrolled(i7, 0.0f, 0);
                }
            }
            if (z) {
                m4383f(0);
                m4384g();
            }
        }
        if (this.f6628e == 2 && i2 == 0 && this.f6635l) {
            m4385h();
            ScrollEventValues scrollEventValues2 = this.f6630g;
            if (scrollEventValues2.f6639c == 0) {
                int i8 = this.f6632i;
                int i9 = scrollEventValues2.f6637a;
                if (i8 != i9) {
                    if (i9 == -1) {
                        i9 = 0;
                    }
                    m4382e(i9);
                }
                m4383f(0);
                m4384g();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r6 < 0) == r4.f6625b.m4388b()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo3586c(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.f6634k = r5
            r4.m4385h()
            boolean r0 = r4.f6633j
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L3d
            r4.f6633j = r1
            if (r7 > 0) goto L22
            if (r7 != 0) goto L20
            if (r6 >= 0) goto L16
            r6 = 1
            goto L17
        L16:
            r6 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.f6625b
            boolean r7 = r7.m4388b()
            if (r6 != r7) goto L20
            goto L22
        L20:
            r6 = 0
            goto L23
        L22:
            r6 = 1
        L23:
            if (r6 == 0) goto L2f
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r4.f6630g
            int r7 = r6.f6639c
            if (r7 == 0) goto L2f
            int r6 = r6.f6637a
            int r6 = r6 + r5
            goto L33
        L2f:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r4.f6630g
            int r6 = r6.f6637a
        L33:
            r4.f6632i = r6
            int r7 = r4.f6631h
            if (r7 == r6) goto L4b
            r4.m4382e(r6)
            goto L4b
        L3d:
            int r6 = r4.f6628e
            if (r6 != 0) goto L4b
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r4.f6630g
            int r6 = r6.f6637a
            if (r6 != r2) goto L48
            r6 = 0
        L48:
            r4.m4382e(r6)
        L4b:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r4.f6630g
            int r7 = r6.f6637a
            if (r7 != r2) goto L52
            r7 = 0
        L52:
            float r0 = r6.f6638b
            int r6 = r6.f6639c
            androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r3 = r4.f6624a
            if (r3 == 0) goto L5d
            r3.onPageScrolled(r7, r0, r6)
        L5d:
            androidx.viewpager2.widget.ScrollEventAdapter$ScrollEventValues r6 = r4.f6630g
            int r7 = r6.f6637a
            int r0 = r4.f6632i
            if (r7 == r0) goto L67
            if (r0 != r2) goto L75
        L67:
            int r6 = r6.f6639c
            if (r6 != 0) goto L75
            int r6 = r4.f6629f
            if (r6 == r5) goto L75
            r4.m4383f(r1)
            r4.m4384g()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ScrollEventAdapter.mo3586c(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: e */
    public final void m4382e(int i2) {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f6624a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageSelected(i2);
        }
    }

    /* renamed from: f */
    public final void m4383f(int i2) {
        if ((this.f6628e == 3 && this.f6629f == 0) || this.f6629f == i2) {
            return;
        }
        this.f6629f = i2;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f6624a;
        if (onPageChangeCallback != null) {
            onPageChangeCallback.onPageScrollStateChanged(i2);
        }
    }

    /* renamed from: g */
    public final void m4384g() {
        this.f6628e = 0;
        this.f6629f = 0;
        this.f6630g.m4386a();
        this.f6631h = -1;
        this.f6632i = -1;
        this.f6633j = false;
        this.f6634k = false;
        this.f6636m = false;
        this.f6635l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0151, code lost:
    
        if (r4[r2 - 1][1] >= r3) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018b  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4385h() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ScrollEventAdapter.m4385h():void");
    }
}
