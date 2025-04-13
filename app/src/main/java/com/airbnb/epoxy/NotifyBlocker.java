package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class NotifyBlocker extends RecyclerView.AdapterDataObserver {

    /* renamed from: a */
    public boolean f7034a;

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: a */
    public void mo3410a() {
        if (!this.f7034a) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: b */
    public void mo3411b(int i2, int i3) {
        mo3410a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: c */
    public void mo3412c(int i2, int i3, Object obj) {
        mo3410a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: d */
    public void mo3413d(int i2, int i3) {
        mo3410a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: e */
    public void mo3414e(int i2, int i3, int i4) {
        mo3410a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: f */
    public void mo3415f(int i2, int i3) {
        mo3410a();
    }
}
