package com.swiftsoft.anixartd.p015ui;

import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes2.dex */
public abstract class EndlessRecyclerViewScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public int f27400a;

    /* renamed from: b */
    public int f27401b;

    /* renamed from: c */
    public int f27402c;

    /* renamed from: d */
    public boolean f27403d;

    /* renamed from: e */
    public RecyclerView.LayoutManager f27404e;

    public EndlessRecyclerViewScrollListener(RecyclerView.LayoutManager layoutManager) {
        this.f27400a = 10;
        this.f27401b = 0;
        this.f27402c = 0;
        this.f27403d = true;
        this.f27404e = layoutManager;
        if (layoutManager instanceof GridLayoutManager) {
            this.f27400a = ((GridLayoutManager) layoutManager).f5327I * 10;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            this.f27400a *= ((StaggeredGridLayoutManager) layoutManager).f5668s;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /* renamed from: c */
    public void mo3586c(RecyclerView recyclerView, int i2, int i3) {
        int m3697s1;
        int m3883a0 = this.f27404e.m3883a0();
        RecyclerView.LayoutManager layoutManager = this.f27404e;
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] m3978p1 = ((StaggeredGridLayoutManager) layoutManager).m3978p1(null);
            m3697s1 = 0;
            for (int i4 = 0; i4 < m3978p1.length; i4++) {
                if (i4 == 0) {
                    m3697s1 = m3978p1[i4];
                } else if (m3978p1[i4] > m3697s1) {
                    m3697s1 = m3978p1[i4];
                }
            }
        } else {
            m3697s1 = layoutManager instanceof GridLayoutManager ? ((GridLayoutManager) layoutManager).m3697s1() : layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).m3697s1() : 0;
        }
        if (m3883a0 < this.f27402c) {
            this.f27401b = 0;
            this.f27402c = m3883a0;
            if (m3883a0 == 0) {
                this.f27403d = true;
            }
        }
        if (this.f27403d && m3883a0 > this.f27402c) {
            this.f27403d = false;
            this.f27402c = m3883a0;
        }
        if (this.f27403d || m3697s1 + this.f27400a <= m3883a0) {
            return;
        }
        int i5 = this.f27401b + 1;
        this.f27401b = i5;
        mo15318e(i5, m3883a0, recyclerView);
        this.f27403d = true;
    }

    /* renamed from: e */
    public abstract void mo15318e(int i2, int i3, RecyclerView recyclerView);

    /* renamed from: f */
    public void m15319f(Bundle bundle) {
        bundle.putInt("CURRENT_PAGE_VALUE", this.f27401b);
        bundle.putInt("PREVIOUS_TOTAL_ITEM_COUNT_VALUE", this.f27402c);
        bundle.putBoolean("LOADING_VALUE", this.f27403d);
    }

    /* renamed from: g */
    public void m15320g() {
        this.f27401b = 0;
        this.f27402c = 0;
        this.f27403d = true;
    }

    public EndlessRecyclerViewScrollListener(RecyclerView.LayoutManager layoutManager, Bundle bundle) {
        this(layoutManager);
        if (bundle != null) {
            if (bundle.containsKey("CURRENT_PAGE_VALUE")) {
                this.f27401b = bundle.getInt("CURRENT_PAGE_VALUE");
            }
            if (bundle.containsKey("PREVIOUS_TOTAL_ITEM_COUNT_VALUE")) {
                this.f27402c = bundle.getInt("PREVIOUS_TOTAL_ITEM_COUNT_VALUE");
            }
            if (bundle.containsKey("LOADING_VALUE")) {
                this.f27403d = bundle.getBoolean("LOADING_VALUE");
            }
        }
    }
}
