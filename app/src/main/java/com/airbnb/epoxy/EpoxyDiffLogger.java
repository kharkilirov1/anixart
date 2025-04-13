package com.airbnb.epoxy;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class EpoxyDiffLogger extends RecyclerView.AdapterDataObserver {

    /* renamed from: a */
    public final String f6913a;

    public EpoxyDiffLogger(String str) {
        this.f6913a = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: b */
    public void mo3411b(int i2, int i3) {
        Log.d(this.f6913a, "Item range changed. Start: " + i2 + " Count: " + i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: c */
    public void mo3412c(int i2, int i3, @Nullable Object obj) {
        if (obj == null) {
            mo3411b(i2, i3);
            return;
        }
        Log.d(this.f6913a, "Item range changed with payloads. Start: " + i2 + " Count: " + i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: d */
    public void mo3413d(int i2, int i3) {
        Log.d(this.f6913a, "Item range inserted. Start: " + i2 + " Count: " + i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: e */
    public void mo3414e(int i2, int i3, int i4) {
        Log.d(this.f6913a, "Item moved. From: " + i2 + " To: " + i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    /* renamed from: f */
    public void mo3415f(int i2, int i3) {
        Log.d(this.f6913a, "Item range removed. Start: " + i2 + " Count: " + i3);
    }
}
