package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qg0 extends RecyclerView.Adapter<mg0> {

    /* renamed from: a */
    @NotNull
    private final List<z10> f54043a;

    /* renamed from: b */
    @NotNull
    private final ng0 f54044b;

    /* JADX WARN: Multi-variable type inference failed */
    public qg0(@NotNull w10 imageProvider, @NotNull List<? extends z10> imageValues) {
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(imageValues, "imageValues");
        this.f54043a = imageValues;
        this.f54044b = new ng0(imageProvider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f54043a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(mg0 mg0Var, int i2) {
        mg0 holderImage = mg0Var;
        Intrinsics.m32179h(holderImage, "holderImage");
        holderImage.m26671a(this.f54043a.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final mg0 onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.m32179h(parent, "parent");
        return this.f54044b.m26905a(parent);
    }
}
