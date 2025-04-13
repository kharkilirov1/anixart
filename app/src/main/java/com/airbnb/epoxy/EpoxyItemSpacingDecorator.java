package com.airbnb.epoxy;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class EpoxyItemSpacingDecorator extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public int f6914a = 0;

    /* renamed from: b */
    public boolean f6915b;

    /* renamed from: c */
    public boolean f6916c;

    /* renamed from: d */
    public boolean f6917d;

    /* renamed from: e */
    public boolean f6918e;

    /* renamed from: f */
    public boolean f6919f;

    /* renamed from: g */
    public boolean f6920g;

    /* renamed from: h */
    public boolean f6921h;

    /* renamed from: i */
    public boolean f6922i;

    /* renamed from: j */
    public boolean f6923j;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /* renamed from: f */
    public void mo3404f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z;
        boolean z2;
        boolean z3;
        rect.setEmpty();
        int m3782P = recyclerView.m3782P(view);
        if (m3782P == -1) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int itemCount = recyclerView.getAdapter().getItemCount();
        this.f6917d = m3782P == 0;
        int i2 = itemCount - 1;
        this.f6918e = m3782P == i2;
        this.f6916c = layoutManager.mo3700v();
        this.f6915b = layoutManager.mo3701w();
        boolean z4 = layoutManager instanceof GridLayoutManager;
        this.f6919f = z4;
        if (z4) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.f5332N;
            int mo3627e = spanSizeLookup.mo3627e(m3782P);
            int i3 = gridLayoutManager.f5327I;
            int mo3626d = spanSizeLookup.mo3626d(m3782P, i3);
            this.f6920g = mo3626d == 0;
            this.f6921h = mo3626d + mo3627e == i3;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 > m3782P) {
                    z = true;
                    break;
                }
                i5 += spanSizeLookup.mo3627e(i4);
                if (i5 > i3) {
                    z = false;
                    break;
                }
                i4++;
            }
            this.f6922i = z;
            if (!z) {
                int i6 = 0;
                while (true) {
                    if (i2 < m3782P) {
                        z3 = true;
                        break;
                    }
                    i6 += spanSizeLookup.mo3627e(i2);
                    if (i6 > i3) {
                        z3 = false;
                        break;
                    }
                    i2--;
                }
                if (z3) {
                    z2 = true;
                    this.f6923j = z2;
                }
            }
            z2 = false;
            this.f6923j = z2;
        }
        boolean z5 = this.f6919f;
        boolean z6 = !z5 ? !this.f6916c || this.f6917d : (!this.f6916c || this.f6922i) && (!this.f6915b || this.f6920g);
        boolean z7 = !z5 ? !this.f6916c || this.f6918e : (!this.f6916c || this.f6923j) && (!this.f6915b || this.f6921h);
        boolean z8 = !z5 ? !this.f6915b || this.f6917d : (!this.f6916c || this.f6920g) && (!this.f6915b || this.f6922i);
        boolean z9 = !z5 ? !this.f6915b || this.f6918e : (!this.f6916c || this.f6921h) && (!this.f6915b || this.f6923j);
        boolean z10 = this.f6916c;
        boolean z11 = (layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).f5417w;
        boolean z12 = layoutManager.m3885b0() == 1;
        if (z10 && z12) {
            z11 = !z11;
        }
        if (!z11) {
            boolean z13 = z7;
            z7 = z6;
            z6 = z13;
        } else if (!this.f6916c) {
            boolean z14 = z8;
            z8 = z9;
            z9 = z14;
            boolean z15 = z7;
            z7 = z6;
            z6 = z15;
        }
        int i7 = this.f6914a / 2;
        rect.right = z6 ? i7 : 0;
        rect.left = z7 ? i7 : 0;
        rect.top = z8 ? i7 : 0;
        rect.bottom = z9 ? i7 : 0;
    }
}
