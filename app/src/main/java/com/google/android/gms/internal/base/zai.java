package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zai extends Drawable implements Drawable.Callback {

    /* renamed from: c */
    public long f16216c;

    /* renamed from: d */
    public int f16217d;

    /* renamed from: f */
    public int f16219f;

    /* renamed from: i */
    public boolean f16222i;

    /* renamed from: j */
    public zah f16223j;

    /* renamed from: k */
    public Drawable f16224k;

    /* renamed from: l */
    public Drawable f16225l;

    /* renamed from: m */
    public boolean f16226m;

    /* renamed from: n */
    public boolean f16227n;

    /* renamed from: o */
    public boolean f16228o;

    /* renamed from: p */
    public int f16229p;

    /* renamed from: b */
    public int f16215b = 0;

    /* renamed from: e */
    public int f16218e = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: g */
    public int f16220g = 0;

    /* renamed from: h */
    public boolean f16221h = true;

    public zai(@Nullable zah zahVar) {
        this.f16223j = new zah(zahVar);
    }

    /* renamed from: a */
    public final boolean m8539a() {
        if (!this.f16226m) {
            boolean z = false;
            if (this.f16224k.getConstantState() != null && this.f16225l.getConstantState() != null) {
                z = true;
            }
            this.f16227n = z;
            this.f16226m = true;
        }
        return this.f16227n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r0 == 0) goto L22;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.f16215b
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L39
            if (r0 == r1) goto La
            goto L42
        La:
            long r0 = r7.f16216c
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L42
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f16216c
            long r0 = r0 - r4
            float r0 = (float) r0
            int r1 = r7.f16219f
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L25
            goto L26
        L25:
            r3 = 0
        L26:
            if (r3 == 0) goto L2a
            r7.f16215b = r2
        L2a:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f16217d
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.f16220g = r0
            goto L42
        L39:
            long r3 = android.os.SystemClock.uptimeMillis()
            r7.f16216c = r3
            r7.f16215b = r1
            r3 = 0
        L42:
            int r0 = r7.f16220g
            boolean r1 = r7.f16221h
            android.graphics.drawable.Drawable r4 = r7.f16224k
            android.graphics.drawable.Drawable r5 = r7.f16225l
            if (r3 == 0) goto L61
            if (r1 == 0) goto L51
            if (r0 != 0) goto L56
            goto L52
        L51:
            r2 = r0
        L52:
            r4.draw(r8)
            r0 = r2
        L56:
            int r1 = r7.f16218e
            if (r0 != r1) goto L60
            r5.setAlpha(r1)
            r5.draw(r8)
        L60:
            return
        L61:
            if (r1 == 0) goto L69
            int r2 = r7.f16218e
            int r2 = r2 - r0
            r4.setAlpha(r2)
        L69:
            r4.draw(r8)
            if (r1 == 0) goto L73
            int r1 = r7.f16218e
            r4.setAlpha(r1)
        L73:
            if (r0 <= 0) goto L80
            r5.setAlpha(r0)
            r5.draw(r8)
            int r8 = r7.f16218e
            r5.setAlpha(r8)
        L80:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zai.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zah zahVar = this.f16223j;
        return changingConfigurations | zahVar.f16213a | zahVar.f16214b;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (!m8539a()) {
            return null;
        }
        this.f16223j.f16213a = getChangingConfigurations();
        return this.f16223j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f16224k.getIntrinsicHeight(), this.f16225l.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f16224k.getIntrinsicWidth(), this.f16225l.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f16228o) {
            this.f16229p = Drawable.resolveOpacity(this.f16224k.getOpacity(), this.f16225l.getOpacity());
            this.f16228o = true;
        }
        return this.f16229p;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f16222i && super.mutate() == this) {
            if (!m8539a()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f16224k.mutate();
            this.f16225l.mutate();
            this.f16222i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f16224k.setBounds(rect);
        this.f16225l.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (this.f16220g == this.f16218e) {
            this.f16220g = i2;
        }
        this.f16218e = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f16224k.setColorFilter(colorFilter);
        this.f16225l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
