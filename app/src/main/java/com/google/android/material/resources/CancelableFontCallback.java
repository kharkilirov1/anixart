package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* renamed from: a */
    public final Typeface f18583a;

    /* renamed from: b */
    public final ApplyFont f18584b;

    /* renamed from: c */
    public boolean f18585c;

    public interface ApplyFont {
        /* renamed from: a */
        void mo10141a(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f18583a = typeface;
        this.f18584b = applyFont;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    /* renamed from: a */
    public void mo9911a(int i2) {
        Typeface typeface = this.f18583a;
        if (this.f18585c) {
            return;
        }
        this.f18584b.mo10141a(typeface);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    /* renamed from: b */
    public void mo9912b(Typeface typeface, boolean z) {
        if (this.f18585c) {
            return;
        }
        this.f18584b.mo10141a(typeface);
    }
}
