package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zah extends Drawable.ConstantState {

    /* renamed from: a */
    public int f16213a;

    /* renamed from: b */
    public int f16214b;

    public zah(@Nullable zah zahVar) {
        if (zahVar != null) {
            this.f16213a = zahVar.f16213a;
            this.f16214b = zahVar.f16214b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f16213a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new zai(this);
    }
}
