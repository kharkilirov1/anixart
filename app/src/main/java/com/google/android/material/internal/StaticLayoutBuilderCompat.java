package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.util.Objects;

@RestrictTo
/* loaded from: classes.dex */
final class StaticLayoutBuilderCompat {

    /* renamed from: n */
    public static final int f18334n;

    /* renamed from: o */
    public static boolean f18335o;

    /* renamed from: p */
    @Nullable
    public static Constructor<StaticLayout> f18336p;

    /* renamed from: q */
    @Nullable
    public static Object f18337q;

    /* renamed from: a */
    public CharSequence f18338a;

    /* renamed from: b */
    public final TextPaint f18339b;

    /* renamed from: c */
    public final int f18340c;

    /* renamed from: d */
    public int f18341d;

    /* renamed from: k */
    public boolean f18348k;

    /* renamed from: m */
    @Nullable
    public StaticLayoutBuilderConfigurer f18350m;

    /* renamed from: e */
    public Layout.Alignment f18342e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f18343f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f18344g = 0.0f;

    /* renamed from: h */
    public float f18345h = 1.0f;

    /* renamed from: i */
    public int f18346i = f18334n;

    /* renamed from: j */
    public boolean f18347j = true;

    /* renamed from: l */
    @Nullable
    public TextUtils.TruncateAt f18349l = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public StaticLayoutBuilderCompatException(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException.<init>(java.lang.Throwable):void");
        }
    }

    static {
        f18334n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f18338a = charSequence;
        this.f18339b = textPaint;
        this.f18340c = i2;
        this.f18341d = charSequence.length();
    }

    /* renamed from: a */
    public StaticLayout m10151a() throws StaticLayoutBuilderCompatException {
        if (this.f18338a == null) {
            this.f18338a = "";
        }
        int max = Math.max(0, this.f18340c);
        CharSequence charSequence = this.f18338a;
        if (this.f18343f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f18339b, max, this.f18349l);
        }
        int min = Math.min(charSequence.length(), this.f18341d);
        this.f18341d = min;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (!f18335o) {
                try {
                    f18337q = this.f18348k && i2 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    f18336p = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    f18335o = true;
                } catch (Exception e2) {
                    throw new StaticLayoutBuilderCompatException(e2);
                }
            }
            try {
                Constructor<StaticLayout> constructor = f18336p;
                Objects.requireNonNull(constructor);
                Object obj = f18337q;
                Objects.requireNonNull(obj);
                return constructor.newInstance(charSequence, 0, Integer.valueOf(this.f18341d), this.f18339b, Integer.valueOf(max), this.f18342e, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f18347j), null, Integer.valueOf(max), Integer.valueOf(this.f18343f));
            } catch (Exception e3) {
                throw new StaticLayoutBuilderCompatException(e3);
            }
        }
        if (this.f18348k && this.f18343f == 1) {
            this.f18342e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f18339b, max);
        obtain.setAlignment(this.f18342e);
        obtain.setIncludePad(this.f18347j);
        obtain.setTextDirection(this.f18348k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f18349l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f18343f);
        float f2 = this.f18344g;
        if (f2 != 0.0f || this.f18345h != 1.0f) {
            obtain.setLineSpacing(f2, this.f18345h);
        }
        if (this.f18343f > 1) {
            obtain.setHyphenationFrequency(this.f18346i);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.f18350m;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.m10152a(obtain);
        }
        return obtain.build();
    }
}
