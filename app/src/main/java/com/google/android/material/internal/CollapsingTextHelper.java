package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;
import com.yandex.mobile.ads.C4632R;
import java.util.Objects;
import p000a.C0000a;

@RestrictTo
/* loaded from: classes.dex */
public final class CollapsingTextHelper {

    /* renamed from: A */
    public Typeface f18225A;

    /* renamed from: B */
    public Typeface f18226B;

    /* renamed from: C */
    public Typeface f18227C;

    /* renamed from: D */
    public CancelableFontCallback f18228D;

    /* renamed from: E */
    public CancelableFontCallback f18229E;

    /* renamed from: G */
    @Nullable
    public CharSequence f18231G;

    /* renamed from: H */
    @Nullable
    public CharSequence f18232H;

    /* renamed from: I */
    public boolean f18233I;

    /* renamed from: K */
    @Nullable
    public Bitmap f18235K;

    /* renamed from: L */
    public float f18236L;

    /* renamed from: M */
    public float f18237M;

    /* renamed from: N */
    public float f18238N;

    /* renamed from: O */
    public float f18239O;

    /* renamed from: P */
    public float f18240P;

    /* renamed from: Q */
    public int f18241Q;

    /* renamed from: R */
    public int[] f18242R;

    /* renamed from: S */
    public boolean f18243S;

    /* renamed from: T */
    @NonNull
    public final TextPaint f18244T;

    /* renamed from: U */
    @NonNull
    public final TextPaint f18245U;

    /* renamed from: V */
    public TimeInterpolator f18246V;

    /* renamed from: W */
    public TimeInterpolator f18247W;

    /* renamed from: X */
    public float f18248X;

    /* renamed from: Y */
    public float f18249Y;

    /* renamed from: Z */
    public float f18250Z;

    /* renamed from: a */
    public final View f18251a;

    /* renamed from: a0 */
    public ColorStateList f18252a0;

    /* renamed from: b */
    public float f18253b;

    /* renamed from: b0 */
    public float f18254b0;

    /* renamed from: c */
    public boolean f18255c;

    /* renamed from: c0 */
    public float f18256c0;

    /* renamed from: d */
    public float f18257d;

    /* renamed from: d0 */
    public float f18258d0;

    /* renamed from: e */
    public float f18259e;

    /* renamed from: e0 */
    public ColorStateList f18260e0;

    /* renamed from: f */
    public int f18261f;

    /* renamed from: f0 */
    public float f18262f0;

    /* renamed from: g */
    @NonNull
    public final Rect f18263g;

    /* renamed from: g0 */
    public float f18264g0;

    /* renamed from: h */
    @NonNull
    public final Rect f18265h;

    /* renamed from: h0 */
    public float f18266h0;

    /* renamed from: i */
    @NonNull
    public final RectF f18267i;

    /* renamed from: i0 */
    public StaticLayout f18268i0;

    /* renamed from: j0 */
    public float f18270j0;

    /* renamed from: k0 */
    public float f18272k0;

    /* renamed from: l0 */
    public float f18274l0;

    /* renamed from: m0 */
    public CharSequence f18276m0;

    /* renamed from: n */
    public ColorStateList f18277n;

    /* renamed from: o */
    public ColorStateList f18279o;

    /* renamed from: p */
    public int f18281p;

    /* renamed from: q */
    public float f18283q;

    /* renamed from: r */
    public float f18285r;

    /* renamed from: r0 */
    @Nullable
    public StaticLayoutBuilderConfigurer f18286r0;

    /* renamed from: s */
    public float f18287s;

    /* renamed from: t */
    public float f18288t;

    /* renamed from: u */
    public float f18289u;

    /* renamed from: v */
    public float f18290v;

    /* renamed from: w */
    public Typeface f18291w;

    /* renamed from: x */
    public Typeface f18292x;

    /* renamed from: y */
    public Typeface f18293y;

    /* renamed from: z */
    public Typeface f18294z;

    /* renamed from: j */
    public int f18269j = 16;

    /* renamed from: k */
    public int f18271k = 16;

    /* renamed from: l */
    public float f18273l = 15.0f;

    /* renamed from: m */
    public float f18275m = 15.0f;

    /* renamed from: F */
    public TextUtils.TruncateAt f18230F = TextUtils.TruncateAt.END;

    /* renamed from: J */
    public boolean f18234J = true;

    /* renamed from: n0 */
    public int f18278n0 = 1;

    /* renamed from: o0 */
    public float f18280o0 = 0.0f;

    /* renamed from: p0 */
    public float f18282p0 = 1.0f;

    /* renamed from: q0 */
    public int f18284q0 = StaticLayoutBuilderCompat.f18334n;

    /* renamed from: com.google.android.material.internal.CollapsingTextHelper$2 */
    class C13162 implements CancelableFontCallback.ApplyFont {

        /* renamed from: a */
        public final /* synthetic */ CollapsingTextHelper f18296a;

        @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
        /* renamed from: a */
        public void mo10141a(Typeface typeface) {
            CollapsingTextHelper collapsingTextHelper = this.f18296a;
            if (collapsingTextHelper.m10135u(typeface)) {
                collapsingTextHelper.m10127l(false);
            }
        }
    }

    public CollapsingTextHelper(View view) {
        this.f18251a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f18244T = textPaint;
        this.f18245U = new TextPaint(textPaint);
        this.f18265h = new Rect();
        this.f18263g = new Rect();
        this.f18267i = new RectF();
        float f2 = this.f18257d;
        this.f18259e = C0000a.m4a(1.0f, f2, 0.5f, f2);
        m10126k(view.getContext().getResources().getConfiguration());
    }

    @ColorInt
    /* renamed from: a */
    public static int m10115a(@ColorInt int i2, @ColorInt int i3, @FloatRange float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i3) * f2) + (Color.alpha(i2) * f3)), Math.round((Color.red(i3) * f2) + (Color.red(i2) * f3)), Math.round((Color.green(i3) * f2) + (Color.green(i2) * f3)), Math.round((Color.blue(i3) * f2) + (Color.blue(i2) * f3)));
    }

    /* renamed from: j */
    public static float m10116j(float f2, float f3, float f4, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AnimationUtils.m9737a(f2, f3, f4);
    }

    /* renamed from: m */
    public static boolean m10117m(@NonNull Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    /* renamed from: b */
    public final boolean m10118b(@NonNull CharSequence charSequence) {
        boolean z = ViewCompat.m2231w(this.f18251a) == 1;
        if (this.f18234J) {
            return (z ? TextDirectionHeuristicsCompat.f3544d : TextDirectionHeuristicsCompat.f3543c).mo2015a(charSequence, 0, charSequence.length());
        }
        return z;
    }

    /* renamed from: c */
    public final void m10119c(float f2) {
        float f3;
        if (this.f18255c) {
            this.f18267i.set(f2 < this.f18259e ? this.f18263g : this.f18265h);
        } else {
            this.f18267i.left = m10116j(this.f18263g.left, this.f18265h.left, f2, this.f18246V);
            this.f18267i.top = m10116j(this.f18283q, this.f18285r, f2, this.f18246V);
            this.f18267i.right = m10116j(this.f18263g.right, this.f18265h.right, f2, this.f18246V);
            this.f18267i.bottom = m10116j(this.f18263g.bottom, this.f18265h.bottom, f2, this.f18246V);
        }
        if (!this.f18255c) {
            this.f18289u = m10116j(this.f18287s, this.f18288t, f2, this.f18246V);
            this.f18290v = m10116j(this.f18283q, this.f18285r, f2, this.f18246V);
            m10137w(f2);
            f3 = f2;
        } else if (f2 < this.f18259e) {
            this.f18289u = this.f18287s;
            this.f18290v = this.f18283q;
            m10137w(0.0f);
            f3 = 0.0f;
        } else {
            this.f18289u = this.f18288t;
            this.f18290v = this.f18285r - Math.max(0, this.f18261f);
            m10137w(1.0f);
            f3 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AnimationUtils.f17343b;
        this.f18272k0 = 1.0f - m10116j(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        ViewCompat.m2183W(this.f18251a);
        this.f18274l0 = m10116j(1.0f, 0.0f, f2, timeInterpolator);
        ViewCompat.m2183W(this.f18251a);
        ColorStateList colorStateList = this.f18279o;
        ColorStateList colorStateList2 = this.f18277n;
        if (colorStateList != colorStateList2) {
            this.f18244T.setColor(m10115a(m10125i(colorStateList2), m10124h(), f3));
        } else {
            this.f18244T.setColor(m10124h());
        }
        float f4 = this.f18262f0;
        float f5 = this.f18264g0;
        if (f4 != f5) {
            this.f18244T.setLetterSpacing(m10116j(f5, f4, f2, timeInterpolator));
        } else {
            this.f18244T.setLetterSpacing(f4);
        }
        this.f18238N = m10116j(this.f18254b0, this.f18248X, f2, null);
        this.f18239O = m10116j(this.f18256c0, this.f18249Y, f2, null);
        this.f18240P = m10116j(this.f18258d0, this.f18250Z, f2, null);
        int m10115a = m10115a(m10125i(this.f18260e0), m10125i(this.f18252a0), f2);
        this.f18241Q = m10115a;
        this.f18244T.setShadowLayer(this.f18238N, this.f18239O, this.f18240P, m10115a);
        if (this.f18255c) {
            int alpha = this.f18244T.getAlpha();
            float f6 = this.f18259e;
            this.f18244T.setAlpha((int) ((f2 <= f6 ? AnimationUtils.m9738b(1.0f, 0.0f, this.f18257d, f6, f2) : AnimationUtils.m9738b(0.0f, 1.0f, f6, 1.0f, f2)) * alpha));
        }
        ViewCompat.m2183W(this.f18251a);
    }

    /* renamed from: d */
    public final void m10120d(float f2, boolean z) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z2;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        if (this.f18231G == null) {
            return;
        }
        float width = this.f18265h.width();
        float width2 = this.f18263g.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.f18275m;
            f4 = this.f18262f0;
            this.f18236L = 1.0f;
            typeface = this.f18291w;
        } else {
            float f5 = this.f18273l;
            float f6 = this.f18264g0;
            Typeface typeface2 = this.f18294z;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f18236L = 1.0f;
            } else {
                this.f18236L = m10116j(this.f18273l, this.f18275m, f2, this.f18247W) / this.f18273l;
            }
            float f7 = this.f18275m / this.f18273l;
            width = (!z && width2 * f7 > width) ? Math.min(width / f7, width2) : width2;
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        if (width > 0.0f) {
            boolean z3 = this.f18237M != f3;
            boolean z4 = this.f18266h0 != f4;
            boolean z5 = this.f18227C != typeface;
            StaticLayout staticLayout2 = this.f18268i0;
            z2 = z3 || z4 || (staticLayout2 != null && (width > ((float) staticLayout2.getWidth()) ? 1 : (width == ((float) staticLayout2.getWidth()) ? 0 : -1)) != 0) || z5 || this.f18243S;
            this.f18237M = f3;
            this.f18266h0 = f4;
            this.f18227C = typeface;
            this.f18243S = false;
            this.f18244T.setLinearText(this.f18236L != 1.0f);
        } else {
            z2 = false;
        }
        if (this.f18232H == null || z2) {
            this.f18244T.setTextSize(this.f18237M);
            this.f18244T.setTypeface(this.f18227C);
            this.f18244T.setLetterSpacing(this.f18266h0);
            this.f18233I = m10118b(this.f18231G);
            int i2 = m10140z() ? this.f18278n0 : 1;
            boolean z6 = this.f18233I;
            try {
                if (i2 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f18269j, z6 ? 1 : 0) & 7;
                    alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f18233I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f18233I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
                }
                StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(this.f18231G, this.f18244T, (int) width);
                staticLayoutBuilderCompat.f18349l = this.f18230F;
                staticLayoutBuilderCompat.f18348k = z6;
                staticLayoutBuilderCompat.f18342e = alignment;
                staticLayoutBuilderCompat.f18347j = false;
                staticLayoutBuilderCompat.f18343f = i2;
                float f8 = this.f18280o0;
                float f9 = this.f18282p0;
                staticLayoutBuilderCompat.f18344g = f8;
                staticLayoutBuilderCompat.f18345h = f9;
                staticLayoutBuilderCompat.f18346i = this.f18284q0;
                staticLayoutBuilderCompat.f18350m = this.f18286r0;
                staticLayout = staticLayoutBuilderCompat.m10151a();
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                staticLayout = null;
            }
            Objects.requireNonNull(staticLayout);
            this.f18268i0 = staticLayout;
            this.f18232H = staticLayout.getText();
        }
    }

    /* renamed from: e */
    public final void m10121e() {
        Bitmap bitmap = this.f18235K;
        if (bitmap != null) {
            bitmap.recycle();
            this.f18235K = null;
        }
    }

    /* renamed from: f */
    public void m10122f(@NonNull Canvas canvas) {
        int save = canvas.save();
        if (this.f18232H == null || this.f18267i.width() <= 0.0f || this.f18267i.height() <= 0.0f) {
            return;
        }
        this.f18244T.setTextSize(this.f18237M);
        float f2 = this.f18289u;
        float f3 = this.f18290v;
        float f4 = this.f18236L;
        if (f4 != 1.0f && !this.f18255c) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (!m10140z() || (this.f18255c && this.f18253b <= this.f18259e)) {
            canvas.translate(f2, f3);
            this.f18268i0.draw(canvas);
        } else {
            float lineStart = this.f18289u - this.f18268i0.getLineStart(0);
            int alpha = this.f18244T.getAlpha();
            canvas.translate(lineStart, f3);
            float f5 = alpha;
            this.f18244T.setAlpha((int) (this.f18274l0 * f5));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                TextPaint textPaint = this.f18244T;
                textPaint.setShadowLayer(this.f18238N, this.f18239O, this.f18240P, MaterialColors.m9968a(this.f18241Q, textPaint.getAlpha()));
            }
            this.f18268i0.draw(canvas);
            this.f18244T.setAlpha((int) (this.f18272k0 * f5));
            if (i2 >= 31) {
                TextPaint textPaint2 = this.f18244T;
                textPaint2.setShadowLayer(this.f18238N, this.f18239O, this.f18240P, MaterialColors.m9968a(this.f18241Q, textPaint2.getAlpha()));
            }
            int lineBaseline = this.f18268i0.getLineBaseline(0);
            CharSequence charSequence = this.f18276m0;
            float f6 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, this.f18244T);
            if (i2 >= 31) {
                this.f18244T.setShadowLayer(this.f18238N, this.f18239O, this.f18240P, this.f18241Q);
            }
            if (!this.f18255c) {
                String trim = this.f18276m0.toString().trim();
                if (trim.endsWith("…")) {
                    trim = trim.substring(0, trim.length() - 1);
                }
                String str = trim;
                this.f18244T.setAlpha(alpha);
                canvas.drawText(str, 0, Math.min(this.f18268i0.getLineEnd(0), str.length()), 0.0f, f6, (Paint) this.f18244T);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: g */
    public float m10123g() {
        TextPaint textPaint = this.f18245U;
        textPaint.setTextSize(this.f18275m);
        textPaint.setTypeface(this.f18291w);
        textPaint.setLetterSpacing(this.f18262f0);
        return -this.f18245U.ascent();
    }

    @ColorInt
    /* renamed from: h */
    public int m10124h() {
        return m10125i(this.f18279o);
    }

    @ColorInt
    /* renamed from: i */
    public final int m10125i(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f18242R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: k */
    public void m10126k(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f18293y;
            if (typeface != null) {
                this.f18292x = TypefaceUtils.m10254a(configuration, typeface);
            }
            Typeface typeface2 = this.f18226B;
            if (typeface2 != null) {
                this.f18225A = TypefaceUtils.m10254a(configuration, typeface2);
            }
            Typeface typeface3 = this.f18292x;
            if (typeface3 == null) {
                typeface3 = this.f18293y;
            }
            this.f18291w = typeface3;
            Typeface typeface4 = this.f18225A;
            if (typeface4 == null) {
                typeface4 = this.f18226B;
            }
            this.f18294z = typeface4;
            m10127l(true);
        }
    }

    /* renamed from: l */
    public void m10127l(boolean z) {
        StaticLayout staticLayout;
        if ((this.f18251a.getHeight() <= 0 || this.f18251a.getWidth() <= 0) && !z) {
            return;
        }
        m10120d(1.0f, z);
        CharSequence charSequence = this.f18232H;
        if (charSequence != null && (staticLayout = this.f18268i0) != null) {
            this.f18276m0 = TextUtils.ellipsize(charSequence, this.f18244T, staticLayout.getWidth(), this.f18230F);
        }
        CharSequence charSequence2 = this.f18276m0;
        float f2 = 0.0f;
        if (charSequence2 != null) {
            this.f18270j0 = this.f18244T.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f18270j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f18271k, this.f18233I ? 1 : 0);
        int i2 = absoluteGravity & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i2 == 48) {
            this.f18285r = this.f18265h.top;
        } else if (i2 != 80) {
            this.f18285r = this.f18265h.centerY() - ((this.f18244T.descent() - this.f18244T.ascent()) / 2.0f);
        } else {
            this.f18285r = this.f18244T.ascent() + this.f18265h.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.f18288t = this.f18265h.centerX() - (this.f18270j0 / 2.0f);
        } else if (i3 != 5) {
            this.f18288t = this.f18265h.left;
        } else {
            this.f18288t = this.f18265h.right - this.f18270j0;
        }
        m10120d(0.0f, z);
        float height = this.f18268i0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f18268i0;
        if (staticLayout2 == null || this.f18278n0 <= 1) {
            CharSequence charSequence3 = this.f18232H;
            if (charSequence3 != null) {
                f2 = this.f18244T.measureText(charSequence3, 0, charSequence3.length());
            }
        } else {
            f2 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f18268i0;
        this.f18281p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f18269j, this.f18233I ? 1 : 0);
        int i4 = absoluteGravity2 & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i4 == 48) {
            this.f18283q = this.f18263g.top;
        } else if (i4 != 80) {
            this.f18283q = this.f18263g.centerY() - (height / 2.0f);
        } else {
            this.f18283q = this.f18244T.descent() + (this.f18263g.bottom - height);
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 == 1) {
            this.f18287s = this.f18263g.centerX() - (f2 / 2.0f);
        } else if (i5 != 5) {
            this.f18287s = this.f18263g.left;
        } else {
            this.f18287s = this.f18263g.right - f2;
        }
        m10121e();
        m10137w(this.f18253b);
        m10119c(this.f18253b);
    }

    /* renamed from: n */
    public void m10128n(int i2) {
        TextAppearance textAppearance = new TextAppearance(this.f18251a.getContext(), i2);
        ColorStateList colorStateList = textAppearance.f18595j;
        if (colorStateList != null) {
            this.f18279o = colorStateList;
        }
        float f2 = textAppearance.f18596k;
        if (f2 != 0.0f) {
            this.f18275m = f2;
        }
        ColorStateList colorStateList2 = textAppearance.f18586a;
        if (colorStateList2 != null) {
            this.f18252a0 = colorStateList2;
        }
        this.f18249Y = textAppearance.f18590e;
        this.f18250Z = textAppearance.f18591f;
        this.f18248X = textAppearance.f18592g;
        this.f18262f0 = textAppearance.f18594i;
        CancelableFontCallback cancelableFontCallback = this.f18229E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f18585c = true;
        }
        CancelableFontCallback.ApplyFont applyFont = new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            /* renamed from: a */
            public void mo10141a(Typeface typeface) {
                CollapsingTextHelper collapsingTextHelper = CollapsingTextHelper.this;
                if (collapsingTextHelper.m10131q(typeface)) {
                    collapsingTextHelper.m10127l(false);
                }
            }
        };
        textAppearance.m10247a();
        this.f18229E = new CancelableFontCallback(applyFont, textAppearance.f18599n);
        textAppearance.m10249c(this.f18251a.getContext(), this.f18229E);
        m10127l(false);
    }

    /* renamed from: o */
    public void m10129o(ColorStateList colorStateList) {
        if (this.f18279o != colorStateList) {
            this.f18279o = colorStateList;
            m10127l(false);
        }
    }

    /* renamed from: p */
    public void m10130p(int i2) {
        if (this.f18271k != i2) {
            this.f18271k = i2;
            m10127l(false);
        }
    }

    /* renamed from: q */
    public final boolean m10131q(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.f18229E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f18585c = true;
        }
        if (this.f18293y == typeface) {
            return false;
        }
        this.f18293y = typeface;
        Typeface m10254a = TypefaceUtils.m10254a(this.f18251a.getContext().getResources().getConfiguration(), typeface);
        this.f18292x = m10254a;
        if (m10254a == null) {
            m10254a = this.f18293y;
        }
        this.f18291w = m10254a;
        return true;
    }

    /* renamed from: r */
    public void m10132r(ColorStateList colorStateList) {
        if (this.f18277n != colorStateList) {
            this.f18277n = colorStateList;
            m10127l(false);
        }
    }

    /* renamed from: s */
    public void m10133s(int i2) {
        if (this.f18269j != i2) {
            this.f18269j = i2;
            m10127l(false);
        }
    }

    /* renamed from: t */
    public void m10134t(float f2) {
        if (this.f18273l != f2) {
            this.f18273l = f2;
            m10127l(false);
        }
    }

    /* renamed from: u */
    public final boolean m10135u(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.f18228D;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f18585c = true;
        }
        if (this.f18226B == typeface) {
            return false;
        }
        this.f18226B = typeface;
        Typeface m10254a = TypefaceUtils.m10254a(this.f18251a.getContext().getResources().getConfiguration(), typeface);
        this.f18225A = m10254a;
        if (m10254a == null) {
            m10254a = this.f18226B;
        }
        this.f18294z = m10254a;
        return true;
    }

    /* renamed from: v */
    public void m10136v(float f2) {
        float m1933a = MathUtils.m1933a(f2, 0.0f, 1.0f);
        if (m1933a != this.f18253b) {
            this.f18253b = m1933a;
            m10119c(m1933a);
        }
    }

    /* renamed from: w */
    public final void m10137w(float f2) {
        m10120d(f2, false);
        ViewCompat.m2183W(this.f18251a);
    }

    /* renamed from: x */
    public final boolean m10138x(int[] iArr) {
        ColorStateList colorStateList;
        this.f18242R = iArr;
        ColorStateList colorStateList2 = this.f18279o;
        if (!((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f18277n) != null && colorStateList.isStateful()))) {
            return false;
        }
        m10127l(false);
        return true;
    }

    /* renamed from: y */
    public void m10139y(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f18231G, charSequence)) {
            this.f18231G = charSequence;
            this.f18232H = null;
            m10121e();
            m10127l(false);
        }
    }

    /* renamed from: z */
    public final boolean m10140z() {
        return this.f18278n0 > 1 && (!this.f18233I || this.f18255c);
    }
}
