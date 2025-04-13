package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.C1195R;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public class TextAppearance {

    /* renamed from: a */
    @Nullable
    public final ColorStateList f18586a;

    /* renamed from: b */
    @Nullable
    public final String f18587b;

    /* renamed from: c */
    public final int f18588c;

    /* renamed from: d */
    public final int f18589d;

    /* renamed from: e */
    public final float f18590e;

    /* renamed from: f */
    public final float f18591f;

    /* renamed from: g */
    public final float f18592g;

    /* renamed from: h */
    public final boolean f18593h;

    /* renamed from: i */
    public final float f18594i;

    /* renamed from: j */
    @Nullable
    public ColorStateList f18595j;

    /* renamed from: k */
    public float f18596k;

    /* renamed from: l */
    @FontRes
    public final int f18597l;

    /* renamed from: m */
    public boolean f18598m = false;

    /* renamed from: n */
    public Typeface f18599n;

    public TextAppearance(@NonNull Context context, @StyleRes int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C1195R.styleable.f17311L);
        this.f18596k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f18595j = MaterialResources.m10240a(context, obtainStyledAttributes, 3);
        MaterialResources.m10240a(context, obtainStyledAttributes, 4);
        MaterialResources.m10240a(context, obtainStyledAttributes, 5);
        this.f18588c = obtainStyledAttributes.getInt(2, 0);
        this.f18589d = obtainStyledAttributes.getInt(1, 1);
        int i3 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f18597l = obtainStyledAttributes.getResourceId(i3, 0);
        this.f18587b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.f18586a = MaterialResources.m10240a(context, obtainStyledAttributes, 6);
        this.f18590e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f18591f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f18592g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, C1195R.styleable.f17301B);
        this.f18593h = obtainStyledAttributes2.hasValue(0);
        this.f18594i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m10247a() {
        String str;
        if (this.f18599n == null && (str = this.f18587b) != null) {
            this.f18599n = Typeface.create(str, this.f18588c);
        }
        if (this.f18599n == null) {
            int i2 = this.f18589d;
            if (i2 == 1) {
                this.f18599n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f18599n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f18599n = Typeface.DEFAULT;
            } else {
                this.f18599n = Typeface.MONOSPACE;
            }
            this.f18599n = Typeface.create(this.f18599n, this.f18588c);
        }
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: b */
    public Typeface m10248b(@NonNull Context context) {
        if (this.f18598m) {
            return this.f18599n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m1735e = ResourcesCompat.m1735e(context, this.f18597l);
                this.f18599n = m1735e;
                if (m1735e != null) {
                    this.f18599n = Typeface.create(m1735e, this.f18588c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                StringBuilder m24u = C0000a.m24u("Error loading font ");
                m24u.append(this.f18587b);
                Log.d("TextAppearance", m24u.toString(), e2);
            }
        }
        m10247a();
        this.f18598m = true;
        return this.f18599n;
    }

    /* renamed from: c */
    public void m10249c(@NonNull Context context, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (m10250d(context)) {
            m10248b(context);
        } else {
            m10247a();
        }
        int i2 = this.f18597l;
        if (i2 == 0) {
            this.f18598m = true;
        }
        if (this.f18598m) {
            textAppearanceFontCallback.mo9912b(this.f18599n, true);
            return;
        }
        try {
            ResourcesCompat.FontCallback fontCallback = new ResourcesCompat.FontCallback() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                /* renamed from: d */
                public void mo795d(int i3) {
                    TextAppearance.this.f18598m = true;
                    textAppearanceFontCallback.mo9911a(i3);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                /* renamed from: e */
                public void mo796e(@NonNull Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    textAppearance.f18599n = Typeface.create(typeface, textAppearance.f18588c);
                    TextAppearance textAppearance2 = TextAppearance.this;
                    textAppearance2.f18598m = true;
                    textAppearanceFontCallback.mo9912b(textAppearance2.f18599n, false);
                }
            };
            ThreadLocal<TypedValue> threadLocal = ResourcesCompat.f3339a;
            if (context.isRestricted()) {
                fontCallback.m1744a(-4, null);
            } else {
                ResourcesCompat.m1736f(context, i2, new TypedValue(), 0, fontCallback, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f18598m = true;
            textAppearanceFontCallback.mo9911a(1);
        } catch (Exception e2) {
            StringBuilder m24u = C0000a.m24u("Error loading font ");
            m24u.append(this.f18587b);
            Log.d("TextAppearance", m24u.toString(), e2);
            this.f18598m = true;
            textAppearanceFontCallback.mo9911a(-3);
        }
    }

    /* renamed from: d */
    public final boolean m10250d(Context context) {
        int i2 = this.f18597l;
        Typeface typeface = null;
        if (i2 != 0) {
            ThreadLocal<TypedValue> threadLocal = ResourcesCompat.f3339a;
            if (!context.isRestricted()) {
                typeface = ResourcesCompat.m1736f(context, i2, new TypedValue(), 0, null, null, false, true);
            }
        }
        return typeface != null;
    }

    /* renamed from: e */
    public void m10251e(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        m10252f(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.f18595j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f18592g;
        float f3 = this.f18590e;
        float f4 = this.f18591f;
        ColorStateList colorStateList2 = this.f18586a;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public void m10252f(@NonNull final Context context, @NonNull final TextPaint textPaint, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (m10250d(context)) {
            m10253g(context, textPaint, m10248b(context));
            return;
        }
        m10247a();
        m10253g(context, textPaint, this.f18599n);
        m10249c(context, new TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            /* renamed from: a */
            public void mo9911a(int i2) {
                textAppearanceFontCallback.mo9911a(i2);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            /* renamed from: b */
            public void mo9912b(@NonNull Typeface typeface, boolean z) {
                TextAppearance.this.m10253g(context, textPaint, typeface);
                textAppearanceFontCallback.mo9912b(typeface, z);
            }
        });
    }

    /* renamed from: g */
    public void m10253g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface m10254a = TypefaceUtils.m10254a(context.getResources().getConfiguration(), typeface);
        if (m10254a != null) {
            typeface = m10254a;
        }
        textPaint.setTypeface(typeface);
        int i2 = this.f18588c & (~typeface.getStyle());
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f18596k);
        if (this.f18593h) {
            textPaint.setLetterSpacing(this.f18594i);
        }
    }
}
