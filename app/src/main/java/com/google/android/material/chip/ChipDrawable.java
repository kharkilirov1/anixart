package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class ChipDrawable extends MaterialShapeDrawable implements Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {

    /* renamed from: I0 */
    public static final int[] f17798I0 = {R.attr.state_enabled};

    /* renamed from: J0 */
    public static final ShapeDrawable f17799J0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A */
    @Nullable
    public ColorStateList f17800A;

    /* renamed from: A0 */
    public int[] f17801A0;

    /* renamed from: B */
    public float f17802B;

    /* renamed from: B0 */
    public boolean f17803B0;

    /* renamed from: C */
    public float f17804C;

    /* renamed from: C0 */
    @Nullable
    public ColorStateList f17805C0;

    /* renamed from: D */
    @Nullable
    public ColorStateList f17806D;

    /* renamed from: D0 */
    @NonNull
    public WeakReference<Delegate> f17807D0;

    /* renamed from: E */
    public float f17808E;

    /* renamed from: E0 */
    public TextUtils.TruncateAt f17809E0;

    /* renamed from: F */
    @Nullable
    public ColorStateList f17810F;

    /* renamed from: F0 */
    public boolean f17811F0;

    /* renamed from: G */
    @Nullable
    public CharSequence f17812G;

    /* renamed from: G0 */
    public int f17813G0;

    /* renamed from: H */
    public boolean f17814H;

    /* renamed from: H0 */
    public boolean f17815H0;

    /* renamed from: I */
    @Nullable
    public Drawable f17816I;

    /* renamed from: J */
    @Nullable
    public ColorStateList f17817J;

    /* renamed from: K */
    public float f17818K;

    /* renamed from: L */
    public boolean f17819L;

    /* renamed from: M */
    public boolean f17820M;

    /* renamed from: N */
    @Nullable
    public Drawable f17821N;

    /* renamed from: O */
    @Nullable
    public Drawable f17822O;

    /* renamed from: P */
    @Nullable
    public ColorStateList f17823P;

    /* renamed from: Q */
    public float f17824Q;

    /* renamed from: R */
    @Nullable
    public CharSequence f17825R;

    /* renamed from: S */
    public boolean f17826S;

    /* renamed from: T */
    public boolean f17827T;

    /* renamed from: U */
    @Nullable
    public Drawable f17828U;

    /* renamed from: V */
    @Nullable
    public ColorStateList f17829V;

    /* renamed from: W */
    @Nullable
    public MotionSpec f17830W;

    /* renamed from: X */
    @Nullable
    public MotionSpec f17831X;

    /* renamed from: Y */
    public float f17832Y;

    /* renamed from: Z */
    public float f17833Z;

    /* renamed from: a0 */
    public float f17834a0;

    /* renamed from: b0 */
    public float f17835b0;

    /* renamed from: c0 */
    public float f17836c0;

    /* renamed from: d0 */
    public float f17837d0;

    /* renamed from: e0 */
    public float f17838e0;

    /* renamed from: f0 */
    public float f17839f0;

    /* renamed from: g0 */
    @NonNull
    public final Context f17840g0;

    /* renamed from: h0 */
    public final Paint f17841h0;

    /* renamed from: i0 */
    public final Paint.FontMetrics f17842i0;

    /* renamed from: j0 */
    public final RectF f17843j0;

    /* renamed from: k0 */
    public final PointF f17844k0;

    /* renamed from: l0 */
    public final Path f17845l0;

    /* renamed from: m0 */
    @NonNull
    public final TextDrawableHelper f17846m0;

    /* renamed from: n0 */
    @ColorInt
    public int f17847n0;

    /* renamed from: o0 */
    @ColorInt
    public int f17848o0;

    /* renamed from: p0 */
    @ColorInt
    public int f17849p0;

    /* renamed from: q0 */
    @ColorInt
    public int f17850q0;

    /* renamed from: r0 */
    @ColorInt
    public int f17851r0;

    /* renamed from: s0 */
    @ColorInt
    public int f17852s0;

    /* renamed from: t0 */
    public boolean f17853t0;

    /* renamed from: u0 */
    @ColorInt
    public int f17854u0;

    /* renamed from: v0 */
    public int f17855v0;

    /* renamed from: w0 */
    @Nullable
    public ColorFilter f17856w0;

    /* renamed from: x0 */
    @Nullable
    public PorterDuffColorFilter f17857x0;

    /* renamed from: y0 */
    @Nullable
    public ColorStateList f17858y0;

    /* renamed from: z */
    @Nullable
    public ColorStateList f17859z;

    /* renamed from: z0 */
    @Nullable
    public PorterDuff.Mode f17860z0;

    public interface Delegate {
        /* renamed from: a */
        void mo9901a();
    }

    public ChipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i2, @StyleRes int i3) {
        super(context, attributeSet, i2, i3);
        this.f17804C = -1.0f;
        this.f17841h0 = new Paint(1);
        this.f17842i0 = new Paint.FontMetrics();
        this.f17843j0 = new RectF();
        this.f17844k0 = new PointF();
        this.f17845l0 = new Path();
        this.f17855v0 = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f17860z0 = PorterDuff.Mode.SRC_IN;
        this.f17807D0 = new WeakReference<>(null);
        m10296s(context);
        this.f17840g0 = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.f17846m0 = textDrawableHelper;
        this.f17812G = "";
        textDrawableHelper.f18351a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f17798I0;
        setState(iArr);
        m9950r0(iArr);
        this.f17811F0 = true;
        f17799J0.setTint(-1);
    }

    /* renamed from: U */
    public static boolean m9913U(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: V */
    public static boolean m9914V(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: A0 */
    public void m9915A0(boolean z) {
        if (this.f17803B0 != z) {
            this.f17803B0 = z;
            this.f17805C0 = z ? RippleUtils.m10258d(this.f17810F) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: B0 */
    public final boolean m9916B0() {
        return this.f17827T && this.f17828U != null && this.f17853t0;
    }

    /* renamed from: C0 */
    public final boolean m9917C0() {
        return this.f17814H && this.f17816I != null;
    }

    /* renamed from: D0 */
    public final boolean m9918D0() {
        return this.f17820M && this.f17821N != null;
    }

    /* renamed from: E0 */
    public final void m9919E0(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: L */
    public final void m9920L(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.m1840l(drawable, DrawableCompat.m1834f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f17821N) {
            if (drawable.isStateful()) {
                drawable.setState(this.f17801A0);
            }
            DrawableCompat.m1842n(drawable, this.f17823P);
            return;
        }
        Drawable drawable2 = this.f17816I;
        if (drawable == drawable2 && this.f17819L) {
            DrawableCompat.m1842n(drawable2, this.f17817J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: M */
    public final void m9921M(@NonNull Rect rect, @NonNull RectF rectF) {
        float f2;
        rectF.setEmpty();
        if (m9917C0() || m9916B0()) {
            float f3 = this.f17832Y + this.f17833Z;
            float m9928T = m9928T();
            if (DrawableCompat.m1834f(this) == 0) {
                float f4 = rect.left + f3;
                rectF.left = f4;
                rectF.right = f4 + m9928T;
            } else {
                float f5 = rect.right - f3;
                rectF.right = f5;
                rectF.left = f5 - m9928T;
            }
            Drawable drawable = this.f17853t0 ? this.f17828U : this.f17816I;
            float f6 = this.f17818K;
            if (f6 <= 0.0f && drawable != null) {
                f6 = (float) Math.ceil(ViewUtils.m10165b(this.f17840g0, 24));
                if (drawable.getIntrinsicHeight() <= f6) {
                    f2 = drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f2 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f2;
                }
            }
            f2 = f6;
            float exactCenterY2 = rect.exactCenterY() - (f2 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f2;
        }
    }

    /* renamed from: N */
    public float m9922N() {
        if (!m9917C0() && !m9916B0()) {
            return 0.0f;
        }
        return m9928T() + this.f17833Z + this.f17834a0;
    }

    /* renamed from: O */
    public final void m9923O(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (m9918D0()) {
            float f2 = this.f17839f0 + this.f17838e0;
            if (DrawableCompat.m1834f(this) == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.f17824Q;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.f17824Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.f17824Q;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    /* renamed from: P */
    public final void m9924P(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (m9918D0()) {
            float f2 = this.f17839f0 + this.f17838e0 + this.f17824Q + this.f17837d0 + this.f17836c0;
            if (DrawableCompat.m1834f(this) == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = i2;
                rectF.right = i2 + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: Q */
    public float m9925Q() {
        if (m9918D0()) {
            return this.f17837d0 + this.f17824Q + this.f17838e0;
        }
        return 0.0f;
    }

    /* renamed from: R */
    public float m9926R() {
        return this.f17815H0 ? m10294q() : this.f17804C;
    }

    @Nullable
    /* renamed from: S */
    public Drawable m9927S() {
        Drawable drawable = this.f17821N;
        if (drawable != null) {
            return DrawableCompat.m1844p(drawable);
        }
        return null;
    }

    /* renamed from: T */
    public final float m9928T() {
        Drawable drawable = this.f17853t0 ? this.f17828U : this.f17816I;
        float f2 = this.f17818K;
        return (f2 > 0.0f || drawable == null) ? f2 : drawable.getIntrinsicWidth();
    }

    /* renamed from: W */
    public void m9929W() {
        Delegate delegate = this.f17807D0.get();
        if (delegate != null) {
            delegate.mo9901a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m9930X(@androidx.annotation.NonNull int[] r9, @androidx.annotation.NonNull int[] r10) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipDrawable.m9930X(int[], int[]):boolean");
    }

    /* renamed from: Y */
    public void m9931Y(boolean z) {
        if (this.f17826S != z) {
            this.f17826S = z;
            float m9922N = m9922N();
            if (!z && this.f17853t0) {
                this.f17853t0 = false;
            }
            float m9922N2 = m9922N();
            invalidateSelf();
            if (m9922N != m9922N2) {
                m9929W();
            }
        }
    }

    /* renamed from: Z */
    public void m9932Z(@Nullable Drawable drawable) {
        if (this.f17828U != drawable) {
            float m9922N = m9922N();
            this.f17828U = drawable;
            float m9922N2 = m9922N();
            m9919E0(this.f17828U);
            m9920L(this.f17828U);
            invalidateSelf();
            if (m9922N != m9922N2) {
                m9929W();
            }
        }
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    /* renamed from: a */
    public void mo9800a() {
        m9929W();
        invalidateSelf();
    }

    /* renamed from: a0 */
    public void m9933a0(@Nullable ColorStateList colorStateList) {
        if (this.f17829V != colorStateList) {
            this.f17829V = colorStateList;
            if (this.f17827T && this.f17828U != null && this.f17826S) {
                DrawableCompat.m1842n(this.f17828U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: b0 */
    public void m9934b0(boolean z) {
        if (this.f17827T != z) {
            boolean m9916B0 = m9916B0();
            this.f17827T = z;
            boolean m9916B02 = m9916B0();
            if (m9916B0 != m9916B02) {
                if (m9916B02) {
                    m9920L(this.f17828U);
                } else {
                    m9919E0(this.f17828U);
                }
                invalidateSelf();
                m9929W();
            }
        }
    }

    /* renamed from: c0 */
    public void m9935c0(@Nullable ColorStateList colorStateList) {
        if (this.f17800A != colorStateList) {
            this.f17800A = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    /* renamed from: d0 */
    public void m9936d0(float f2) {
        if (this.f17804C != f2) {
            this.f17804C = f2;
            setShapeAppearanceModel(getShapeAppearanceModel().m10317g(f2));
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i4 = this.f17855v0;
        if (i4 < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            i2 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i4) : canvas.saveLayerAlpha(f2, f3, f4, f5, i4, 31);
        } else {
            i2 = 0;
        }
        if (!this.f17815H0) {
            this.f17841h0.setColor(this.f17847n0);
            this.f17841h0.setStyle(Paint.Style.FILL);
            this.f17843j0.set(bounds);
            canvas.drawRoundRect(this.f17843j0, m9926R(), m9926R(), this.f17841h0);
        }
        if (!this.f17815H0) {
            this.f17841h0.setColor(this.f17848o0);
            this.f17841h0.setStyle(Paint.Style.FILL);
            Paint paint = this.f17841h0;
            ColorFilter colorFilter = this.f17856w0;
            if (colorFilter == null) {
                colorFilter = this.f17857x0;
            }
            paint.setColorFilter(colorFilter);
            this.f17843j0.set(bounds);
            canvas.drawRoundRect(this.f17843j0, m9926R(), m9926R(), this.f17841h0);
        }
        if (this.f17815H0) {
            super.draw(canvas);
        }
        if (this.f17808E > 0.0f && !this.f17815H0) {
            this.f17841h0.setColor(this.f17850q0);
            this.f17841h0.setStyle(Paint.Style.STROKE);
            if (!this.f17815H0) {
                Paint paint2 = this.f17841h0;
                ColorFilter colorFilter2 = this.f17856w0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f17857x0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.f17843j0;
            float f6 = bounds.left;
            float f7 = this.f17808E / 2.0f;
            rectF.set(f6 + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
            float f8 = this.f17804C - (this.f17808E / 2.0f);
            canvas.drawRoundRect(this.f17843j0, f8, f8, this.f17841h0);
        }
        this.f17841h0.setColor(this.f17851r0);
        this.f17841h0.setStyle(Paint.Style.FILL);
        this.f17843j0.set(bounds);
        if (this.f17815H0) {
            m10281c(new RectF(bounds), this.f17845l0);
            m10285h(canvas, this.f17841h0, this.f17845l0, m10288k());
        } else {
            canvas.drawRoundRect(this.f17843j0, m9926R(), m9926R(), this.f17841h0);
        }
        if (m9917C0()) {
            m9921M(bounds, this.f17843j0);
            RectF rectF2 = this.f17843j0;
            float f9 = rectF2.left;
            float f10 = rectF2.top;
            canvas.translate(f9, f10);
            this.f17816I.setBounds(0, 0, (int) this.f17843j0.width(), (int) this.f17843j0.height());
            this.f17816I.draw(canvas);
            canvas.translate(-f9, -f10);
        }
        if (m9916B0()) {
            m9921M(bounds, this.f17843j0);
            RectF rectF3 = this.f17843j0;
            float f11 = rectF3.left;
            float f12 = rectF3.top;
            canvas.translate(f11, f12);
            this.f17828U.setBounds(0, 0, (int) this.f17843j0.width(), (int) this.f17843j0.height());
            this.f17828U.draw(canvas);
            canvas.translate(-f11, -f12);
        }
        if (this.f17811F0 && this.f17812G != null) {
            PointF pointF = this.f17844k0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.f17812G != null) {
                float m9922N = m9922N() + this.f17832Y + this.f17835b0;
                if (DrawableCompat.m1834f(this) == 0) {
                    pointF.x = bounds.left + m9922N;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - m9922N;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                this.f17846m0.f18351a.getFontMetrics(this.f17842i0);
                Paint.FontMetrics fontMetrics = this.f17842i0;
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.f17843j0;
            rectF4.setEmpty();
            if (this.f17812G != null) {
                float m9922N2 = m9922N() + this.f17832Y + this.f17835b0;
                float m9925Q = m9925Q() + this.f17839f0 + this.f17836c0;
                if (DrawableCompat.m1834f(this) == 0) {
                    rectF4.left = bounds.left + m9922N2;
                    rectF4.right = bounds.right - m9925Q;
                } else {
                    rectF4.left = bounds.left + m9925Q;
                    rectF4.right = bounds.right - m9922N2;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            TextDrawableHelper textDrawableHelper = this.f17846m0;
            if (textDrawableHelper.f18356f != null) {
                textDrawableHelper.f18351a.drawableState = getState();
                TextDrawableHelper textDrawableHelper2 = this.f17846m0;
                textDrawableHelper2.f18356f.m10251e(this.f17840g0, textDrawableHelper2.f18351a, textDrawableHelper2.f18352b);
            }
            this.f17846m0.f18351a.setTextAlign(align);
            boolean z = Math.round(this.f17846m0.m10153a(this.f17812G.toString())) > Math.round(this.f17843j0.width());
            if (z) {
                int save = canvas.save();
                canvas.clipRect(this.f17843j0);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence = this.f17812G;
            if (z && this.f17809E0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f17846m0.f18351a, this.f17843j0.width(), this.f17809E0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.f17844k0;
            canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.f17846m0.f18351a);
            if (z) {
                canvas.restoreToCount(i3);
            }
        }
        if (m9918D0()) {
            m9923O(bounds, this.f17843j0);
            RectF rectF5 = this.f17843j0;
            float f13 = rectF5.left;
            float f14 = rectF5.top;
            canvas.translate(f13, f14);
            this.f17821N.setBounds(0, 0, (int) this.f17843j0.width(), (int) this.f17843j0.height());
            this.f17822O.setBounds(this.f17821N.getBounds());
            this.f17822O.jumpToCurrentState();
            this.f17822O.draw(canvas);
            canvas.translate(-f13, -f14);
        }
        if (this.f17855v0 < 255) {
            canvas.restoreToCount(i2);
        }
    }

    /* renamed from: e0 */
    public void m9937e0(float f2) {
        if (this.f17839f0 != f2) {
            this.f17839f0 = f2;
            invalidateSelf();
            m9929W();
        }
    }

    /* renamed from: f0 */
    public void m9938f0(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f17816I;
        Drawable m1844p = drawable2 != null ? DrawableCompat.m1844p(drawable2) : null;
        if (m1844p != drawable) {
            float m9922N = m9922N();
            this.f17816I = drawable != null ? DrawableCompat.m1845q(drawable).mutate() : null;
            float m9922N2 = m9922N();
            m9919E0(m1844p);
            if (m9917C0()) {
                m9920L(this.f17816I);
            }
            invalidateSelf();
            if (m9922N != m9922N2) {
                m9929W();
            }
        }
    }

    /* renamed from: g0 */
    public void m9939g0(float f2) {
        if (this.f17818K != f2) {
            float m9922N = m9922N();
            this.f17818K = f2;
            float m9922N2 = m9922N();
            invalidateSelf();
            if (m9922N != m9922N2) {
                m9929W();
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17855v0;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.f17856w0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f17802B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(m9925Q() + this.f17846m0.m10153a(this.f17812G.toString()) + m9922N() + this.f17832Y + this.f17835b0 + this.f17836c0 + this.f17839f0), this.f17813G0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi
    public void getOutline(@NonNull Outline outline) {
        if (this.f17815H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f17804C);
        } else {
            outline.setRoundRect(bounds, this.f17804C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h0 */
    public void m9940h0(@Nullable ColorStateList colorStateList) {
        this.f17819L = true;
        if (this.f17817J != colorStateList) {
            this.f17817J = colorStateList;
            if (m9917C0()) {
                DrawableCompat.m1842n(this.f17816I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: i0 */
    public void m9941i0(boolean z) {
        if (this.f17814H != z) {
            boolean m9917C0 = m9917C0();
            this.f17814H = z;
            boolean m9917C02 = m9917C0();
            if (m9917C0 != m9917C02) {
                if (m9917C02) {
                    m9920L(this.f17816I);
                } else {
                    m9919E0(this.f17816I);
                }
                invalidateSelf();
                m9929W();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (m9913U(this.f17859z) || m9913U(this.f17800A) || m9913U(this.f17806D)) {
            return true;
        }
        if (this.f17803B0 && m9913U(this.f17805C0)) {
            return true;
        }
        TextAppearance textAppearance = this.f17846m0.f18356f;
        if ((textAppearance == null || (colorStateList = textAppearance.f18595j) == null || !colorStateList.isStateful()) ? false : true) {
            return true;
        }
        return (this.f17827T && this.f17828U != null && this.f17826S) || m9914V(this.f17816I) || m9914V(this.f17828U) || m9913U(this.f17858y0);
    }

    /* renamed from: j0 */
    public void m9942j0(float f2) {
        if (this.f17802B != f2) {
            this.f17802B = f2;
            invalidateSelf();
            m9929W();
        }
    }

    /* renamed from: k0 */
    public void m9943k0(float f2) {
        if (this.f17832Y != f2) {
            this.f17832Y = f2;
            invalidateSelf();
            m9929W();
        }
    }

    /* renamed from: l0 */
    public void m9944l0(@Nullable ColorStateList colorStateList) {
        if (this.f17806D != colorStateList) {
            this.f17806D = colorStateList;
            if (this.f17815H0) {
                m10275G(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: m0 */
    public void m9945m0(float f2) {
        if (this.f17808E != f2) {
            this.f17808E = f2;
            this.f17841h0.setStrokeWidth(f2);
            if (this.f17815H0) {
                m10276H(f2);
            }
            invalidateSelf();
        }
    }

    /* renamed from: n0 */
    public void m9946n0(@Nullable Drawable drawable) {
        Drawable m9927S = m9927S();
        if (m9927S != drawable) {
            float m9925Q = m9925Q();
            this.f17821N = drawable != null ? DrawableCompat.m1845q(drawable).mutate() : null;
            this.f17822O = new RippleDrawable(RippleUtils.m10258d(this.f17810F), this.f17821N, f17799J0);
            float m9925Q2 = m9925Q();
            m9919E0(m9927S);
            if (m9918D0()) {
                m9920L(this.f17821N);
            }
            invalidateSelf();
            if (m9925Q != m9925Q2) {
                m9929W();
            }
        }
    }

    /* renamed from: o0 */
    public void m9947o0(float f2) {
        if (this.f17838e0 != f2) {
            this.f17838e0 = f2;
            invalidateSelf();
            if (m9918D0()) {
                m9929W();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (m9917C0()) {
            onLayoutDirectionChanged |= DrawableCompat.m1840l(this.f17816I, i2);
        }
        if (m9916B0()) {
            onLayoutDirectionChanged |= DrawableCompat.m1840l(this.f17828U, i2);
        }
        if (m9918D0()) {
            onLayoutDirectionChanged |= DrawableCompat.m1840l(this.f17821N, i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (m9917C0()) {
            onLevelChange |= this.f17816I.setLevel(i2);
        }
        if (m9916B0()) {
            onLevelChange |= this.f17828U.setLevel(i2);
        }
        if (m9918D0()) {
            onLevelChange |= this.f17821N.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.f17815H0) {
            super.onStateChange(iArr);
        }
        return m9930X(iArr, this.f17801A0);
    }

    /* renamed from: p0 */
    public void m9948p0(float f2) {
        if (this.f17824Q != f2) {
            this.f17824Q = f2;
            invalidateSelf();
            if (m9918D0()) {
                m9929W();
            }
        }
    }

    /* renamed from: q0 */
    public void m9949q0(float f2) {
        if (this.f17837d0 != f2) {
            this.f17837d0 = f2;
            invalidateSelf();
            if (m9918D0()) {
                m9929W();
            }
        }
    }

    /* renamed from: r0 */
    public boolean m9950r0(@NonNull int[] iArr) {
        if (Arrays.equals(this.f17801A0, iArr)) {
            return false;
        }
        this.f17801A0 = iArr;
        if (m9918D0()) {
            return m9930X(getState(), iArr);
        }
        return false;
    }

    /* renamed from: s0 */
    public void m9951s0(@Nullable ColorStateList colorStateList) {
        if (this.f17823P != colorStateList) {
            this.f17823P = colorStateList;
            if (m9918D0()) {
                DrawableCompat.m1842n(this.f17821N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f17855v0 != i2) {
            this.f17855v0 = i2;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.f17856w0 != colorFilter) {
            this.f17856w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.f17858y0 != colorStateList) {
            this.f17858y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f17860z0 != mode) {
            this.f17860z0 = mode;
            this.f17857x0 = DrawableUtils.m10046f(this, this.f17858y0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m9917C0()) {
            visible |= this.f17816I.setVisible(z, z2);
        }
        if (m9916B0()) {
            visible |= this.f17828U.setVisible(z, z2);
        }
        if (m9918D0()) {
            visible |= this.f17821N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t0 */
    public void m9952t0(boolean z) {
        if (this.f17820M != z) {
            boolean m9918D0 = m9918D0();
            this.f17820M = z;
            boolean m9918D02 = m9918D0();
            if (m9918D0 != m9918D02) {
                if (m9918D02) {
                    m9920L(this.f17821N);
                } else {
                    m9919E0(this.f17821N);
                }
                invalidateSelf();
                m9929W();
            }
        }
    }

    /* renamed from: u0 */
    public void m9953u0(float f2) {
        if (this.f17834a0 != f2) {
            float m9922N = m9922N();
            this.f17834a0 = f2;
            float m9922N2 = m9922N();
            invalidateSelf();
            if (m9922N != m9922N2) {
                m9929W();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v0 */
    public void m9954v0(float f2) {
        if (this.f17833Z != f2) {
            float m9922N = m9922N();
            this.f17833Z = f2;
            float m9922N2 = m9922N();
            invalidateSelf();
            if (m9922N != m9922N2) {
                m9929W();
            }
        }
    }

    /* renamed from: w0 */
    public void m9955w0(@Nullable ColorStateList colorStateList) {
        if (this.f17810F != colorStateList) {
            this.f17810F = colorStateList;
            this.f17805C0 = this.f17803B0 ? RippleUtils.m10258d(colorStateList) : null;
            onStateChange(getState());
        }
    }

    /* renamed from: x0 */
    public void m9956x0(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f17812G, charSequence)) {
            return;
        }
        this.f17812G = charSequence;
        this.f17846m0.f18354d = true;
        invalidateSelf();
        m9929W();
    }

    /* renamed from: y0 */
    public void m9957y0(float f2) {
        if (this.f17836c0 != f2) {
            this.f17836c0 = f2;
            invalidateSelf();
            m9929W();
        }
    }

    /* renamed from: z0 */
    public void m9958z0(float f2) {
        if (this.f17835b0 != f2) {
            this.f17835b0 = f2;
            invalidateSelf();
            m9929W();
        }
    }
}
