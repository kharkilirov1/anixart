package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes.dex */
public class TextDrawableHelper {

    /* renamed from: c */
    public float f18353c;

    /* renamed from: e */
    @Nullable
    public WeakReference<TextDrawableDelegate> f18355e;

    /* renamed from: f */
    @Nullable
    public TextAppearance f18356f;

    /* renamed from: a */
    public final TextPaint f18351a = new TextPaint(1);

    /* renamed from: b */
    public final TextAppearanceFontCallback f18352b = new TextAppearanceFontCallback() { // from class: com.google.android.material.internal.TextDrawableHelper.1
        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        /* renamed from: a */
        public void mo9911a(int i2) {
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f18354d = true;
            TextDrawableDelegate textDrawableDelegate = textDrawableHelper.f18355e.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.mo9800a();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        /* renamed from: b */
        public void mo9912b(@NonNull Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f18354d = true;
            TextDrawableDelegate textDrawableDelegate = textDrawableHelper.f18355e.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.mo9800a();
            }
        }
    };

    /* renamed from: d */
    public boolean f18354d = true;

    public interface TextDrawableDelegate {
        /* renamed from: a */
        void mo9800a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public TextDrawableHelper(@Nullable TextDrawableDelegate textDrawableDelegate) {
        this.f18355e = new WeakReference<>(null);
        this.f18355e = new WeakReference<>(textDrawableDelegate);
    }

    /* renamed from: a */
    public float m10153a(String str) {
        if (!this.f18354d) {
            return this.f18353c;
        }
        float measureText = str == null ? 0.0f : this.f18351a.measureText((CharSequence) str, 0, str.length());
        this.f18353c = measureText;
        this.f18354d = false;
        return measureText;
    }

    /* renamed from: b */
    public void m10154b(@Nullable TextAppearance textAppearance, Context context) {
        if (this.f18356f != textAppearance) {
            this.f18356f = textAppearance;
            if (textAppearance != null) {
                textAppearance.m10252f(context, this.f18351a, this.f18352b);
                TextDrawableDelegate textDrawableDelegate = this.f18355e.get();
                if (textDrawableDelegate != null) {
                    this.f18351a.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.m10251e(context, this.f18351a, this.f18352b);
                this.f18354d = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = this.f18355e.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.mo9800a();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }
}
