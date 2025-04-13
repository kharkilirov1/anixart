package com.mukesh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes2.dex */
public class OtpView extends AppCompatEditText {

    /* renamed from: J */
    public static final InputFilter[] f24519J = new InputFilter[0];

    /* renamed from: K */
    public static final int[] f24520K = {android.R.attr.state_selected};

    /* renamed from: L */
    public static final int[] f24521L = {C2507R.attr.state_filled};

    /* renamed from: A */
    public boolean f24522A;

    /* renamed from: B */
    public float f24523B;

    /* renamed from: C */
    public int f24524C;

    /* renamed from: D */
    public int f24525D;

    /* renamed from: E */
    public int f24526E;

    /* renamed from: F */
    public Drawable f24527F;

    /* renamed from: G */
    public boolean f24528G;

    /* renamed from: H */
    public boolean f24529H;

    /* renamed from: I */
    public OnOtpCompletionListener f24530I;

    /* renamed from: g */
    public int f24531g;

    /* renamed from: h */
    public int f24532h;

    /* renamed from: i */
    public int f24533i;

    /* renamed from: j */
    public int f24534j;

    /* renamed from: k */
    public int f24535k;

    /* renamed from: l */
    public int f24536l;

    /* renamed from: m */
    public final Paint f24537m;

    /* renamed from: n */
    public final TextPaint f24538n;

    /* renamed from: o */
    public ColorStateList f24539o;

    /* renamed from: p */
    public int f24540p;

    /* renamed from: q */
    public int f24541q;

    /* renamed from: r */
    public final Rect f24542r;

    /* renamed from: s */
    public final RectF f24543s;

    /* renamed from: t */
    public final RectF f24544t;

    /* renamed from: u */
    public final Path f24545u;

    /* renamed from: v */
    public final PointF f24546v;

    /* renamed from: w */
    public ValueAnimator f24547w;

    /* renamed from: x */
    public boolean f24548x;

    /* renamed from: y */
    public Blink f24549y;

    /* renamed from: z */
    public boolean f24550z;

    public class Blink implements Runnable {

        /* renamed from: b */
        public boolean f24552b;

        public Blink(C24441 c24441) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24552b) {
                return;
            }
            OtpView.this.removeCallbacks(this);
            OtpView otpView = OtpView.this;
            InputFilter[] inputFilterArr = OtpView.f24519J;
            if (otpView.isCursorVisible() && otpView.isFocused()) {
                OtpView otpView2 = OtpView.this;
                boolean z = otpView2.f24522A;
                boolean z2 = !z;
                if (z != z2) {
                    otpView2.f24522A = z2;
                    otpView2.invalidate();
                }
                OtpView.this.postDelayed(this, 500L);
            }
        }
    }

    public OtpView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.otpViewStyle);
        TextPaint textPaint = new TextPaint();
        this.f24538n = textPaint;
        this.f24540p = -16777216;
        this.f24542r = new Rect();
        this.f24543s = new RectF();
        this.f24544t = new RectF();
        this.f24545u = new Path();
        this.f24546v = new PointF();
        this.f24548x = false;
        Resources resources = getResources();
        Paint paint = new Paint(1);
        this.f24537m = paint;
        paint.setStyle(Paint.Style.STROKE);
        textPaint.set(getPaint());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2445R.styleable.f24554a, C2507R.attr.otpViewStyle, 0);
        this.f24531g = obtainStyledAttributes.getInt(14, 0);
        this.f24532h = obtainStyledAttributes.getInt(5, 4);
        this.f24534j = (int) obtainStyledAttributes.getDimension(6, resources.getDimensionPixelSize(C2507R.dimen.otp_view_item_size));
        this.f24533i = (int) obtainStyledAttributes.getDimension(9, resources.getDimensionPixelSize(C2507R.dimen.otp_view_item_size));
        this.f24536l = obtainStyledAttributes.getDimensionPixelSize(8, resources.getDimensionPixelSize(C2507R.dimen.otp_view_item_spacing));
        this.f24535k = (int) obtainStyledAttributes.getDimension(7, 0.0f);
        this.f24541q = (int) obtainStyledAttributes.getDimension(11, resources.getDimensionPixelSize(C2507R.dimen.otp_view_item_line_width));
        this.f24539o = obtainStyledAttributes.getColorStateList(10);
        this.f24550z = obtainStyledAttributes.getBoolean(1, true);
        this.f24525D = obtainStyledAttributes.getColor(2, getCurrentTextColor());
        this.f24524C = obtainStyledAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(C2507R.dimen.otp_view_cursor_width));
        this.f24527F = obtainStyledAttributes.getDrawable(0);
        this.f24528G = obtainStyledAttributes.getBoolean(4, false);
        this.f24529H = obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.recycle();
        ColorStateList colorStateList = this.f24539o;
        if (colorStateList != null) {
            this.f24540p = colorStateList.getDefaultColor();
        }
        m13808r();
        m13796d();
        setMaxLength(this.f24532h);
        paint.setStrokeWidth(this.f24541q);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.f24547w = ofFloat;
        ofFloat.setDuration(150L);
        this.f24547w.setInterpolator(new DecelerateInterpolator());
        this.f24547w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mukesh.OtpView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                OtpView otpView = OtpView.this;
                otpView.f24538n.setTextSize(otpView.getTextSize() * floatValue);
                OtpView.this.f24538n.setAlpha((int) (255.0f * floatValue));
                OtpView.this.postInvalidate();
            }
        });
        super.setCursorVisible(false);
        setTextIsSelectable(false);
    }

    private void setMaxLength(int i2) {
        setFilters(i2 >= 0 ? new InputFilter[]{new InputFilter.LengthFilter(i2)} : f24519J);
    }

    /* renamed from: d */
    public final void m13796d() {
        int i2 = this.f24531g;
        if (i2 == 1) {
            if (this.f24535k > this.f24541q / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than lineWidth when viewType is line");
            }
        } else if (i2 == 0) {
            if (this.f24535k > this.f24533i / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than itemWidth");
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f24539o;
        if (colorStateList == null || colorStateList.isStateful()) {
            m13807q();
        }
    }

    /* renamed from: f */
    public final void m13797f(Canvas canvas, int i2) {
        Paint m13801k = m13801k(i2);
        m13801k.setColor(getCurrentHintTextColor());
        if (!this.f24529H) {
            m13800j(canvas, m13801k, getHint(), i2);
            return;
        }
        int length = (this.f24532h - i2) - getHint().length();
        if (length <= 0) {
            m13800j(canvas, m13801k, getHint(), Math.abs(length));
        }
    }

    /* renamed from: g */
    public final void m13798g(Canvas canvas, int i2) {
        int inputType = getInputType() & 4095;
        if (inputType == 129 || inputType == 225 || inputType == 18) {
            Paint m13801k = m13801k(i2);
            PointF pointF = this.f24546v;
            float f2 = pointF.x;
            float f3 = pointF.y;
            if (!this.f24529H) {
                canvas.drawCircle(f2, f3, m13801k.getTextSize() / 2.0f, m13801k);
                return;
            } else {
                if ((this.f24532h - i2) - getHint().length() <= 0) {
                    canvas.drawCircle(f2, f3, m13801k.getTextSize() / 2.0f, m13801k);
                    return;
                }
                return;
            }
        }
        Paint m13801k2 = m13801k(i2);
        m13801k2.setColor(getCurrentTextColor());
        if (!this.f24529H) {
            if (getText() != null) {
                m13800j(canvas, m13801k2, getText(), i2);
                return;
            }
            return;
        }
        int i3 = this.f24532h - i2;
        if (getText() != null) {
            i3 -= getText().length();
        }
        if (i3 > 0 || getText() == null) {
            return;
        }
        m13800j(canvas, m13801k2, getText(), Math.abs(i3));
    }

    @ColorInt
    public int getCurrentLineColor() {
        return this.f24540p;
    }

    public int getCursorColor() {
        return this.f24525D;
    }

    public int getCursorWidth() {
        return this.f24524C;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public MovementMethod getDefaultMovementMethod() {
        if (DefaultMovementMethod.f24518a == null) {
            DefaultMovementMethod.f24518a = new DefaultMovementMethod();
        }
        return DefaultMovementMethod.f24518a;
    }

    public int getItemCount() {
        return this.f24532h;
    }

    public int getItemHeight() {
        return this.f24534j;
    }

    public int getItemRadius() {
        return this.f24535k;
    }

    @Px
    public int getItemSpacing() {
        return this.f24536l;
    }

    public int getItemWidth() {
        return this.f24533i;
    }

    public ColorStateList getLineColors() {
        return this.f24539o;
    }

    public int getLineWidth() {
        return this.f24541q;
    }

    /* renamed from: i */
    public final void m13799i(Canvas canvas, int i2) {
        if (getText() == null || !this.f24528G || i2 >= getText().length()) {
            canvas.drawPath(this.f24545u, this.f24537m);
        }
    }

    @Override // android.widget.TextView
    public boolean isCursorVisible() {
        return this.f24550z;
    }

    /* renamed from: j */
    public final void m13800j(Canvas canvas, Paint paint, CharSequence charSequence, int i2) {
        int i3 = i2 + 1;
        paint.getTextBounds(charSequence.toString(), i2, i3, this.f24542r);
        PointF pointF = this.f24546v;
        float f2 = pointF.x;
        float f3 = pointF.y;
        float abs = f2 - (Math.abs(this.f24542r.width()) / 2.0f);
        Rect rect = this.f24542r;
        canvas.drawText(charSequence, i2, i3, abs - rect.left, ((Math.abs(rect.height()) / 2.0f) + f3) - this.f24542r.bottom, paint);
    }

    /* renamed from: k */
    public final Paint m13801k(int i2) {
        if (getText() == null || !this.f24548x || i2 != getText().length() - 1) {
            return getPaint();
        }
        this.f24538n.setColor(getPaint().getColor());
        return this.f24538n;
    }

    /* renamed from: l */
    public final void m13802l(boolean z) {
        if (this.f24522A != z) {
            this.f24522A = z;
            invalidate();
        }
    }

    /* renamed from: m */
    public final void m13803m() {
        if (!(isCursorVisible() && isFocused())) {
            Blink blink = this.f24549y;
            if (blink != null) {
                removeCallbacks(blink);
                return;
            }
            return;
        }
        if (this.f24549y == null) {
            this.f24549y = new Blink(null);
        }
        removeCallbacks(this.f24549y);
        this.f24522A = false;
        postDelayed(this.f24549y, 500L);
    }

    /* renamed from: n */
    public final void m13804n() {
        if (getText() != null) {
            setSelection(getText().length());
        }
    }

    /* renamed from: o */
    public final void m13805o() {
        Blink blink = this.f24549y;
        if (blink != null) {
            if (!blink.f24552b) {
                OtpView.this.removeCallbacks(blink);
                blink.f24552b = true;
            }
            m13802l(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Blink blink = this.f24549y;
        if (blink != null) {
            blink.f24552b = false;
            m13803m();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m13805o();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        canvas.save();
        this.f24537m.setColor(this.f24540p);
        this.f24537m.setStyle(Paint.Style.STROKE);
        this.f24537m.setStrokeWidth(this.f24541q);
        getPaint().setColor(getCurrentTextColor());
        int length = this.f24529H ? this.f24532h - 1 : getText() != null ? getText().length() : 0;
        int i4 = 0;
        while (i4 < this.f24532h) {
            boolean z5 = isFocused() && length == i4;
            int[] iArr = null;
            if (i4 < length) {
                iArr = f24521L;
            } else if (z5) {
                iArr = f24520K;
            }
            Paint paint = this.f24537m;
            if (iArr != null) {
                ColorStateList colorStateList = this.f24539o;
                i2 = colorStateList != null ? colorStateList.getColorForState(iArr, this.f24540p) : this.f24540p;
            } else {
                i2 = this.f24540p;
            }
            paint.setColor(i2);
            m13809s(i4);
            m13806p();
            canvas.save();
            if (this.f24531g == 0) {
                m13810t(i4);
                canvas.clipPath(this.f24545u);
            }
            if (this.f24527F != null) {
                float f2 = this.f24541q / 2.0f;
                this.f24527F.setBounds(Math.round(this.f24543s.left - f2), Math.round(this.f24543s.top - f2), Math.round(this.f24543s.right + f2), Math.round(this.f24543s.bottom + f2));
                Drawable drawable = this.f24527F;
                if (iArr == null) {
                    iArr = getDrawableState();
                }
                drawable.setState(iArr);
                this.f24527F.draw(canvas);
            }
            canvas.restore();
            if (z5 && this.f24522A) {
                PointF pointF = this.f24546v;
                float f3 = pointF.x;
                float f4 = pointF.y - (this.f24523B / 2.0f);
                int color = this.f24537m.getColor();
                float strokeWidth = this.f24537m.getStrokeWidth();
                this.f24537m.setColor(this.f24525D);
                this.f24537m.setStrokeWidth(this.f24524C);
                canvas.drawLine(f3, f4, f3, f4 + this.f24523B, this.f24537m);
                this.f24537m.setColor(color);
                this.f24537m.setStrokeWidth(strokeWidth);
            }
            int i5 = this.f24531g;
            if (i5 == 0) {
                m13799i(canvas, i4);
            } else if (i5 == 1 && (getText() == null || !this.f24528G || i4 >= getText().length())) {
                if (this.f24536l != 0 || (i3 = this.f24532h) <= 1) {
                    z = true;
                } else {
                    if (i4 == 0) {
                        z4 = true;
                    } else if (i4 == i3 - 1) {
                        z = false;
                    } else {
                        z4 = false;
                    }
                    z2 = z4;
                    z3 = false;
                    this.f24537m.setStyle(Paint.Style.FILL);
                    this.f24537m.setStrokeWidth(this.f24541q / 10.0f);
                    float f5 = this.f24541q / 2.0f;
                    RectF rectF = this.f24544t;
                    RectF rectF2 = this.f24543s;
                    float f6 = rectF2.left - f5;
                    float f7 = rectF2.bottom;
                    rectF.set(f6, f7 - f5, rectF2.right + f5, f7 + f5);
                    RectF rectF3 = this.f24544t;
                    float f8 = this.f24535k;
                    m13811u(rectF3, f8, f8, z2, z3);
                    canvas.drawPath(this.f24545u, this.f24537m);
                }
                z2 = z;
                z3 = true;
                this.f24537m.setStyle(Paint.Style.FILL);
                this.f24537m.setStrokeWidth(this.f24541q / 10.0f);
                float f52 = this.f24541q / 2.0f;
                RectF rectF4 = this.f24544t;
                RectF rectF22 = this.f24543s;
                float f62 = rectF22.left - f52;
                float f72 = rectF22.bottom;
                rectF4.set(f62, f72 - f52, rectF22.right + f52, f72 + f52);
                RectF rectF32 = this.f24544t;
                float f82 = this.f24535k;
                m13811u(rectF32, f82, f82, z2, z3);
                canvas.drawPath(this.f24545u, this.f24537m);
            }
            if (this.f24529H) {
                if (getText().length() >= this.f24532h - i4) {
                    m13798g(canvas, i4);
                } else if (!TextUtils.isEmpty(getHint()) && getHint().length() == this.f24532h) {
                    m13797f(canvas, i4);
                }
            } else if (getText().length() > i4) {
                m13798g(canvas, i4);
            } else if (!TextUtils.isEmpty(getHint()) && getHint().length() == this.f24532h) {
                m13797f(canvas, i4);
            }
            i4++;
        }
        if (isFocused() && getText() != null && getText().length() != this.f24532h && this.f24531g == 0) {
            int length2 = getText().length();
            m13809s(length2);
            m13806p();
            m13810t(length2);
            Paint paint2 = this.f24537m;
            int[] iArr2 = f24520K;
            ColorStateList colorStateList2 = this.f24539o;
            paint2.setColor(colorStateList2 != null ? colorStateList2.getColorForState(iArr2, this.f24540p) : this.f24540p);
            m13799i(canvas, length2);
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (z) {
            m13804n();
            m13803m();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int i4 = this.f24534j;
        if (mode != 1073741824) {
            int i5 = this.f24532h;
            size = ViewCompat.m2159B(this) + ViewCompat.m2157A(this) + (i5 * this.f24533i) + ((i5 - 1) * this.f24536l);
            if (this.f24536l == 0) {
                size -= (this.f24532h - 1) * this.f24541q;
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingTop() + i4 + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onScreenStateChanged(int i2) {
        super.onScreenStateChanged(i2);
        if (i2 != 1) {
            if (i2 == 0) {
                m13805o();
            }
        } else {
            Blink blink = this.f24549y;
            if (blink != null) {
                blink.f24552b = false;
                m13803m();
            }
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i2, int i3) {
        super.onSelectionChanged(i2, i3);
        if (getText() == null || i3 == getText().length()) {
            return;
        }
        m13804n();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        ValueAnimator valueAnimator;
        OnOtpCompletionListener onOtpCompletionListener;
        if (i2 != charSequence.length()) {
            m13804n();
        }
        if (charSequence.length() == this.f24532h && (onOtpCompletionListener = this.f24530I) != null) {
            onOtpCompletionListener.mo5566b(charSequence.toString());
        }
        m13803m();
        if (this.f24548x) {
            if (!(i4 - i3 > 0) || (valueAnimator = this.f24547w) == null) {
                return;
            }
            valueAnimator.end();
            this.f24547w.start();
        }
    }

    /* renamed from: p */
    public final void m13806p() {
        RectF rectF = this.f24543s;
        float abs = (Math.abs(rectF.width()) / 2.0f) + rectF.left;
        RectF rectF2 = this.f24543s;
        this.f24546v.set(abs, (Math.abs(rectF2.height()) / 2.0f) + rectF2.top);
    }

    /* renamed from: q */
    public final void m13807q() {
        ColorStateList colorStateList = this.f24539o;
        boolean z = false;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(getDrawableState(), 0) : getCurrentTextColor();
        if (colorForState != this.f24540p) {
            this.f24540p = colorForState;
            z = true;
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: r */
    public final void m13808r() {
        float f2 = ((int) ((getResources().getDisplayMetrics().density * 2.0f) + 0.5f)) * 2;
        this.f24523B = ((float) this.f24534j) - getTextSize() > f2 ? getTextSize() + f2 : getTextSize();
    }

    /* renamed from: s */
    public final void m13809s(int i2) {
        float f2 = this.f24541q / 2.0f;
        int m2159B = ViewCompat.m2159B(this) + getScrollX();
        int i3 = this.f24536l;
        int i4 = this.f24533i;
        float f3 = ((i3 + i4) * i2) + m2159B + f2;
        if (i3 == 0 && i2 > 0) {
            f3 -= this.f24541q * i2;
        }
        float paddingTop = getPaddingTop() + getScrollY() + f2;
        this.f24543s.set(f3, paddingTop, (i4 + f3) - this.f24541q, (this.f24534j + paddingTop) - this.f24541q);
    }

    public void setAnimationEnable(boolean z) {
        this.f24548x = z;
    }

    public void setCursorColor(@ColorInt int i2) {
        this.f24525D = i2;
        if (isCursorVisible()) {
            m13802l(true);
        }
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z) {
        if (this.f24550z != z) {
            this.f24550z = z;
            m13802l(z);
            m13803m();
        }
    }

    public void setCursorWidth(@Px int i2) {
        this.f24524C = i2;
        if (isCursorVisible()) {
            m13802l(true);
        }
    }

    public void setHideLineWhenFilled(boolean z) {
        this.f24528G = z;
    }

    public void setItemBackground(Drawable drawable) {
        this.f24526E = 0;
        this.f24527F = drawable;
        invalidate();
    }

    public void setItemBackgroundColor(@ColorInt int i2) {
        Drawable drawable = this.f24527F;
        if (!(drawable instanceof ColorDrawable)) {
            setItemBackground(new ColorDrawable(i2));
        } else {
            ((ColorDrawable) drawable.mutate()).setColor(i2);
            this.f24526E = 0;
        }
    }

    public void setItemBackgroundResources(@DrawableRes int i2) {
        if (i2 == 0 || this.f24526E == i2) {
            Drawable m1733c = ResourcesCompat.m1733c(getResources(), i2, getContext().getTheme());
            this.f24527F = m1733c;
            setItemBackground(m1733c);
            this.f24526E = i2;
        }
    }

    public void setItemCount(int i2) {
        this.f24532h = i2;
        setMaxLength(i2);
        requestLayout();
    }

    public void setItemHeight(@Px int i2) {
        this.f24534j = i2;
        m13808r();
        requestLayout();
    }

    public void setItemRadius(@Px int i2) {
        this.f24535k = i2;
        m13796d();
        requestLayout();
    }

    public void setItemSpacing(@Px int i2) {
        this.f24536l = i2;
        requestLayout();
    }

    public void setItemWidth(@Px int i2) {
        this.f24533i = i2;
        m13796d();
        requestLayout();
    }

    public void setLineColor(@ColorInt int i2) {
        this.f24539o = ColorStateList.valueOf(i2);
        m13807q();
    }

    public void setLineWidth(@Px int i2) {
        this.f24541q = i2;
        m13796d();
        requestLayout();
    }

    public void setOtpCompletionListener(OnOtpCompletionListener onOtpCompletionListener) {
        this.f24530I = onOtpCompletionListener;
    }

    @Override // android.widget.TextView
    public void setTextSize(float f2) {
        super.setTextSize(f2);
        m13808r();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i2) {
        super.setTypeface(typeface, i2);
    }

    /* renamed from: t */
    public final void m13810t(int i2) {
        boolean z;
        boolean z2;
        if (this.f24536l != 0) {
            z = true;
        } else {
            boolean z3 = i2 == 0 && i2 != this.f24532h - 1;
            if (i2 != this.f24532h - 1 || i2 == 0) {
                z = z3;
                z2 = false;
                RectF rectF = this.f24543s;
                int i3 = this.f24535k;
                m13811u(rectF, i3, i3, z, z2);
            }
            z = z3;
        }
        z2 = true;
        RectF rectF2 = this.f24543s;
        int i32 = this.f24535k;
        m13811u(rectF2, i32, i32, z, z2);
    }

    /* renamed from: u */
    public final void m13811u(RectF rectF, float f2, float f3, boolean z, boolean z2) {
        this.f24545u.reset();
        float f4 = rectF.left;
        float f5 = rectF.top;
        float f6 = (rectF.right - f4) - (f2 * 2.0f);
        float f7 = (rectF.bottom - f5) - (2.0f * f3);
        this.f24545u.moveTo(f4, f5 + f3);
        if (z) {
            float f8 = -f3;
            this.f24545u.rQuadTo(0.0f, f8, f2, f8);
        } else {
            this.f24545u.rLineTo(0.0f, -f3);
            this.f24545u.rLineTo(f2, 0.0f);
        }
        this.f24545u.rLineTo(f6, 0.0f);
        if (z2) {
            this.f24545u.rQuadTo(f2, 0.0f, f2, f3);
        } else {
            this.f24545u.rLineTo(f2, 0.0f);
            this.f24545u.rLineTo(0.0f, f3);
        }
        this.f24545u.rLineTo(0.0f, f7);
        if (z2) {
            this.f24545u.rQuadTo(0.0f, f3, -f2, f3);
        } else {
            this.f24545u.rLineTo(0.0f, f3);
            this.f24545u.rLineTo(-f2, 0.0f);
        }
        this.f24545u.rLineTo(-f6, 0.0f);
        if (z) {
            float f9 = -f2;
            this.f24545u.rQuadTo(f9, 0.0f, f9, -f3);
        } else {
            this.f24545u.rLineTo(-f2, 0.0f);
            this.f24545u.rLineTo(0.0f, -f3);
        }
        this.f24545u.rLineTo(0.0f, -f7);
        this.f24545u.close();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        TextPaint textPaint = this.f24538n;
        if (textPaint != null) {
            textPaint.set(getPaint());
        }
    }

    public void setLineColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f24539o = colorStateList;
            m13807q();
            return;
        }
        throw new IllegalArgumentException("Color cannot be null");
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        m13808r();
    }
}
