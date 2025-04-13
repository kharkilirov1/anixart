package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.mobile.ads.C4632R;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {

    /* renamed from: J */
    public static final /* synthetic */ int f18756J = 0;

    /* renamed from: A */
    @NonNull
    public ColorStateList f18757A;

    /* renamed from: B */
    @NonNull
    public ColorStateList f18758B;

    /* renamed from: C */
    @NonNull
    public ColorStateList f18759C;

    /* renamed from: D */
    @NonNull
    public ColorStateList f18760D;

    /* renamed from: E */
    @NonNull
    public ColorStateList f18761E;

    /* renamed from: F */
    @Nullable
    public Drawable f18762F;

    /* renamed from: G */
    @NonNull
    public List<Drawable> f18763G;

    /* renamed from: H */
    public float f18764H;

    /* renamed from: I */
    public int f18765I;

    /* renamed from: b */
    public BaseSlider<S, L, T>.AccessibilityEventSender f18766b;

    /* renamed from: c */
    public boolean f18767c;

    /* renamed from: d */
    public ValueAnimator f18768d;

    /* renamed from: e */
    public ValueAnimator f18769e;

    /* renamed from: f */
    public int f18770f;

    /* renamed from: g */
    public int f18771g;

    /* renamed from: h */
    public int f18772h;

    /* renamed from: i */
    public int f18773i;

    /* renamed from: j */
    public int f18774j;

    /* renamed from: k */
    public int f18775k;

    /* renamed from: l */
    public float f18776l;

    /* renamed from: m */
    public MotionEvent f18777m;

    /* renamed from: n */
    public LabelFormatter f18778n;

    /* renamed from: o */
    public boolean f18779o;

    /* renamed from: p */
    public float f18780p;

    /* renamed from: q */
    public float f18781q;

    /* renamed from: r */
    public ArrayList<Float> f18782r;

    /* renamed from: s */
    public int f18783s;

    /* renamed from: t */
    public int f18784t;

    /* renamed from: u */
    public float f18785u;

    /* renamed from: v */
    public float[] f18786v;

    /* renamed from: w */
    public boolean f18787w;

    /* renamed from: x */
    public int f18788x;

    /* renamed from: y */
    public boolean f18789y;

    /* renamed from: z */
    public boolean f18790z;

    /* renamed from: com.google.android.material.slider.BaseSlider$1 */
    class C13701 implements TooltipDrawableFactory {
    }

    public class AccessibilityEventSender implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ BaseSlider f18793b;

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider baseSlider = this.f18793b;
            int i2 = BaseSlider.f18756J;
            Objects.requireNonNull(baseSlider);
            throw null;
        }
    }

    public static class AccessibilityHelper extends ExploreByTouchHelper {
        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: o */
        public int mo2692o(float f2, float f3) {
            throw null;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: p */
        public void mo2693p(List<Integer> list) {
            throw null;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: s */
        public boolean mo2696s(int i2, int i3, Bundle bundle) {
            throw null;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        /* renamed from: u */
        public void mo2698u(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.m2497a(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f3756o);
            throw null;
        }
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SliderState[] newArray(int i2) {
                return new SliderState[i2];
            }
        };

        /* renamed from: b */
        public float f18794b;

        /* renamed from: c */
        public float f18795c;

        /* renamed from: d */
        public ArrayList<Float> f18796d;

        /* renamed from: e */
        public float f18797e;

        /* renamed from: f */
        public boolean f18798f;

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeFloat(this.f18794b);
            parcel.writeFloat(this.f18795c);
            parcel.writeList(this.f18796d);
            parcel.writeFloat(this.f18797e);
            parcel.writeBooleanArray(new boolean[]{this.f18798f});
        }

        public SliderState(Parcel parcel, C13701 c13701) {
            super(parcel);
            this.f18794b = parcel.readFloat();
            this.f18795c = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f18796d = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f18797e = parcel.readFloat();
            this.f18798f = parcel.createBooleanArray()[0];
        }
    }

    public interface TooltipDrawableFactory {
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f18782r.size() == 1) {
            floatValue2 = this.f18780p;
        }
        float m10356n = m10356n(floatValue2);
        float m10356n2 = m10356n(floatValue);
        return m10352j() ? new float[]{m10356n2, m10356n} : new float[]{m10356n, m10356n2};
    }

    private float getValueOfTouchPosition() {
        double d;
        float f2 = this.f18764H;
        float f3 = this.f18785u;
        if (f3 > 0.0f) {
            d = Math.round(f2 * r1) / ((int) ((this.f18781q - this.f18780p) / f3));
        } else {
            d = f2;
        }
        if (m10352j()) {
            d = 1.0d - d;
        }
        float f4 = this.f18781q;
        return (float) ((d * (f4 - r1)) + this.f18780p);
    }

    private float getValueOfTouchPositionAbsolute() {
        float f2 = this.f18764H;
        if (m10352j()) {
            f2 = 1.0f - f2;
        }
        float f3 = this.f18781q;
        float f4 = this.f18780p;
        return C0000a.m4a(f3, f4, f2, f4);
    }

    private void setValuesInternal(@NonNull ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.f18782r.size() == arrayList.size() && this.f18782r.equals(arrayList)) {
            return;
        }
        this.f18782r = arrayList;
        this.f18790z = true;
        this.f18784t = 0;
        m10362t();
        throw null;
    }

    /* renamed from: a */
    public final void m10343a(Drawable drawable) {
        int i2 = this.f18774j * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i2, i2);
        } else {
            float max = i2 / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    /* renamed from: b */
    public final float m10344b(int i2) {
        float f2 = this.f18785u;
        if (f2 == 0.0f) {
            f2 = 1.0f;
        }
        return (this.f18781q - this.f18780p) / f2 <= i2 ? f2 : Math.round(r1 / r4) * f2;
    }

    /* renamed from: c */
    public final int m10345c() {
        int i2 = this.f18770f / 2;
        if (this.f18771g == 1 || m10358p()) {
            throw null;
        }
        return i2 + 0;
    }

    /* renamed from: d */
    public final ValueAnimator m10346d(boolean z) {
        int m10184c;
        TimeInterpolator m10185d;
        float f2 = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.f18769e : this.f18768d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, z ? 1.0f : 0.0f);
        if (z) {
            m10184c = MotionUtils.m10184c(getContext(), C2507R.attr.motionDurationLong2, 83);
            m10185d = MotionUtils.m10185d(getContext(), C2507R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f17346e);
        } else {
            m10184c = MotionUtils.m10184c(getContext(), C2507R.attr.motionDurationMedium1, C4632R.styleable.AppCompatTheme_windowActionBar);
            m10185d = MotionUtils.m10185d(getContext(), C2507R.attr.motionEasingEmphasizedAccelerateInterpolator, AnimationUtils.f17344c);
        }
        ofFloat.setDuration(m10184c);
        ofFloat.setInterpolator(m10185d);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.BaseSlider.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                BaseSlider baseSlider = BaseSlider.this;
                int i2 = BaseSlider.f18756J;
                Objects.requireNonNull(baseSlider);
                throw null;
            }
        });
        return ofFloat;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m10349g(this.f18761E);
        throw null;
    }

    /* renamed from: e */
    public final void m10347e(@NonNull Canvas canvas, int i2, int i3, float f2, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.f18773i + ((int) (m10356n(f2) * i2))) - (drawable.getBounds().width() / 2.0f), i3 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* renamed from: f */
    public final void m10348f() {
        if (this.f18767c) {
            this.f18767c = false;
            ValueAnimator m10346d = m10346d(false);
            this.f18769e = m10346d;
            this.f18768d = null;
            m10346d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ViewUtils.m10167d(BaseSlider.this);
                    BaseSlider baseSlider = BaseSlider.this;
                    int i2 = BaseSlider.f18756J;
                    Objects.requireNonNull(baseSlider);
                    throw null;
                }
            });
            this.f18769e.start();
        }
    }

    @ColorInt
    /* renamed from: g */
    public final int m10349g(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        throw null;
    }

    public int getActiveThumbIndex() {
        return this.f18783s;
    }

    public int getFocusedThumbIndex() {
        return this.f18784t;
    }

    @Dimension
    public int getHaloRadius() {
        return this.f18775k;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f18757A;
    }

    public int getLabelBehavior() {
        return this.f18771g;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f18785u;
    }

    public float getThumbElevation() {
        throw null;
    }

    @Dimension
    public int getThumbRadius() {
        return this.f18774j;
    }

    public ColorStateList getThumbStrokeColor() {
        throw null;
    }

    public float getThumbStrokeWidth() {
        throw null;
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        throw null;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f18758B;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.f18759C;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.f18759C.equals(this.f18758B)) {
            return this.f18758B;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.f18760D;
    }

    @Dimension
    public int getTrackHeight() {
        return this.f18772h;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.f18761E;
    }

    @Dimension
    public int getTrackSidePadding() {
        return this.f18773i;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.f18761E.equals(this.f18760D)) {
            return this.f18760D;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Dimension
    public int getTrackWidth() {
        return this.f18788x;
    }

    public float getValueFrom() {
        return this.f18780p;
    }

    public float getValueTo() {
        return this.f18781q;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.f18782r);
    }

    /* renamed from: h */
    public final boolean m10350h() {
        ViewParent parent = getParent();
        while (true) {
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: i */
    public final boolean m10351i(float f2) {
        double doubleValue = new BigDecimal(Float.toString(f2)).divide(new BigDecimal(Float.toString(this.f18785u)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    /* renamed from: j */
    public final boolean m10352j() {
        return ViewCompat.m2231w(this) == 1;
    }

    /* renamed from: k */
    public final void m10353k() {
        if (this.f18785u <= 0.0f) {
            return;
        }
        m10363u();
        int min = Math.min((int) (((this.f18781q - this.f18780p) / this.f18785u) + 1.0f), (this.f18788x / (this.f18772h * 2)) + 1);
        float[] fArr = this.f18786v;
        if (fArr == null || fArr.length != min * 2) {
            this.f18786v = new float[min * 2];
        }
        float f2 = this.f18788x / (min - 1);
        for (int i2 = 0; i2 < min * 2; i2 += 2) {
            float[] fArr2 = this.f18786v;
            fArr2[i2] = ((i2 / 2) * f2) + this.f18773i;
            fArr2[i2 + 1] = m10345c();
        }
    }

    /* renamed from: l */
    public final boolean m10354l(int i2) {
        int i3 = this.f18784t;
        long j2 = i3 + i2;
        long size = this.f18782r.size() - 1;
        if (j2 < 0) {
            j2 = 0;
        } else if (j2 > size) {
            j2 = size;
        }
        int i4 = (int) j2;
        this.f18784t = i4;
        if (i4 == i3) {
            return false;
        }
        if (this.f18783s != -1) {
            this.f18783s = i4;
        }
        m10362t();
        postInvalidate();
        return true;
    }

    /* renamed from: m */
    public final boolean m10355m(int i2) {
        if (m10352j()) {
            i2 = i2 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i2;
        }
        return m10354l(i2);
    }

    /* renamed from: n */
    public final float m10356n(float f2) {
        float f3 = this.f18780p;
        float f4 = (f2 - f3) / (this.f18781q - f3);
        return m10352j() ? 1.0f - f4 : f4;
    }

    /* renamed from: o */
    public boolean mo10357o() {
        if (this.f18783s != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float m10356n = (m10356n(valueOfTouchPositionAbsolute) * this.f18788x) + this.f18773i;
        this.f18783s = 0;
        float abs = Math.abs(this.f18782r.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i2 = 1; i2 < this.f18782r.size(); i2++) {
            float abs2 = Math.abs(this.f18782r.get(i2).floatValue() - valueOfTouchPositionAbsolute);
            float m10356n2 = (m10356n(this.f18782r.get(i2).floatValue()) * this.f18788x) + this.f18773i;
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z = !m10352j() ? m10356n2 - m10356n >= 0.0f : m10356n2 - m10356n <= 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.f18783s = i2;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(m10356n2 - m10356n) < 0) {
                        this.f18783s = -1;
                        return false;
                    }
                    if (z) {
                        this.f18783s = i2;
                    }
                }
            }
            abs = abs2;
        }
        return this.f18783s != -1;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AccessibilityEventSender accessibilityEventSender = this.f18766b;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.f18767c = false;
        throw null;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f18790z) {
            m10363u();
            m10353k();
        }
        super.onDraw(canvas);
        int m10345c = m10345c();
        int i2 = this.f18788x;
        float[] activeRange = getActiveRange();
        int i3 = this.f18773i;
        float f2 = i2;
        float f3 = i3 + (activeRange[1] * f2);
        float f4 = i3 + i2;
        if (f3 < f4) {
            float f5 = m10345c;
            canvas.drawLine(f3, f5, f4, f5, null);
        }
        float f6 = this.f18773i;
        float f7 = (activeRange[0] * f2) + f6;
        if (f7 > f6) {
            float f8 = m10345c;
            canvas.drawLine(f6, f8, f7, f8, null);
        }
        if (((Float) Collections.max(getValues())).floatValue() > this.f18780p) {
            int i4 = this.f18788x;
            float[] activeRange2 = getActiveRange();
            float f9 = this.f18773i;
            float f10 = i4;
            float f11 = m10345c;
            canvas.drawLine((activeRange2[0] * f10) + f9, f11, (activeRange2[1] * f10) + f9, f11, null);
        }
        if (this.f18787w && this.f18785u > 0.0f) {
            float[] activeRange3 = getActiveRange();
            int round = Math.round(activeRange3[0] * ((this.f18786v.length / 2) - 1));
            int round2 = Math.round(activeRange3[1] * ((this.f18786v.length / 2) - 1));
            int i5 = round * 2;
            canvas.drawPoints(this.f18786v, 0, i5, null);
            int i6 = round2 * 2;
            canvas.drawPoints(this.f18786v, i5, i6 - i5, null);
            float[] fArr = this.f18786v;
            canvas.drawPoints(fArr, i6, fArr.length - i6, null);
        }
        if ((this.f18779o || isFocused() || m10358p()) && isEnabled()) {
            int i7 = this.f18788x;
            if (m10359q()) {
                int m10356n = (int) ((m10356n(this.f18782r.get(this.f18784t).floatValue()) * i7) + this.f18773i);
                if (Build.VERSION.SDK_INT < 28) {
                    int i8 = this.f18775k;
                    canvas.clipRect(m10356n - i8, m10345c - i8, m10356n + i8, i8 + m10345c, Region.Op.UNION);
                }
                canvas.drawCircle(m10356n, m10345c, this.f18775k, null);
            }
            if (this.f18783s == -1 && !m10358p()) {
                m10348f();
            } else if (this.f18771g != 2) {
                if (this.f18767c) {
                    throw null;
                }
                this.f18767c = true;
                ValueAnimator m10346d = m10346d(true);
                this.f18768d = m10346d;
                this.f18769e = null;
                m10346d.start();
                throw null;
            }
        } else {
            m10348f();
        }
        int i9 = this.f18788x;
        for (int i10 = 0; i10 < this.f18782r.size(); i10++) {
            float floatValue = this.f18782r.get(i10).floatValue();
            Drawable drawable = this.f18762F;
            if (drawable != null) {
                m10347e(canvas, i9, m10345c, floatValue, drawable);
            } else if (i10 < this.f18763G.size()) {
                m10347e(canvas, i9, m10345c, floatValue, this.f18763G.get(i10));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle((m10356n(floatValue) * i9) + this.f18773i, m10345c, this.f18774j, null);
                }
                m10347e(canvas, i9, m10345c, floatValue, null);
            }
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, @Nullable Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (!z) {
            this.f18783s = -1;
            throw null;
        }
        if (i2 == 1) {
            m10354l(Integer.MAX_VALUE);
            throw null;
        }
        if (i2 == 2) {
            m10354l(Integer.MIN_VALUE);
            throw null;
        }
        if (i2 == 17) {
            m10355m(Integer.MAX_VALUE);
            throw null;
        }
        if (i2 != 66) {
            throw null;
        }
        m10355m(Integer.MIN_VALUE);
        throw null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, @NonNull KeyEvent keyEvent) {
        float f2;
        if (!isEnabled()) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (this.f18782r.size() == 1) {
            this.f18783s = 0;
        }
        Float f3 = null;
        Boolean valueOf = null;
        if (this.f18783s == -1) {
            if (i2 != 61) {
                if (i2 != 66) {
                    if (i2 != 81) {
                        if (i2 == 69) {
                            m10354l(-1);
                            valueOf = Boolean.TRUE;
                        } else if (i2 != 70) {
                            switch (i2) {
                                case 21:
                                    m10355m(-1);
                                    valueOf = Boolean.TRUE;
                                    break;
                                case 22:
                                    m10355m(1);
                                    valueOf = Boolean.TRUE;
                                    break;
                            }
                        }
                    }
                    m10354l(1);
                    valueOf = Boolean.TRUE;
                }
                this.f18783s = this.f18784t;
                postInvalidate();
                valueOf = Boolean.TRUE;
            } else {
                valueOf = keyEvent.hasNoModifiers() ? Boolean.valueOf(m10354l(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(m10354l(-1)) : Boolean.FALSE;
            }
            return valueOf != null ? valueOf.booleanValue() : super.onKeyDown(i2, keyEvent);
        }
        boolean isLongPress = this.f18789y | keyEvent.isLongPress();
        this.f18789y = isLongPress;
        if (isLongPress) {
            f2 = m10344b(20);
        } else {
            f2 = this.f18785u;
            if (f2 == 0.0f) {
                f2 = 1.0f;
            }
        }
        if (i2 == 21) {
            if (!m10352j()) {
                f2 = -f2;
            }
            f3 = Float.valueOf(f2);
        } else if (i2 == 22) {
            if (m10352j()) {
                f2 = -f2;
            }
            f3 = Float.valueOf(f2);
        } else if (i2 == 69) {
            f3 = Float.valueOf(-f2);
        } else if (i2 == 70 || i2 == 81) {
            f3 = Float.valueOf(f2);
        }
        if (f3 != null) {
            m10360r(this.f18783s, f3.floatValue() + this.f18782r.get(this.f18783s).floatValue());
            return true;
        }
        if (i2 != 23) {
            if (i2 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m10354l(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return m10354l(-1);
                }
                return false;
            }
            if (i2 != 66) {
                return super.onKeyDown(i2, keyEvent);
            }
        }
        this.f18783s = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, @NonNull KeyEvent keyEvent) {
        this.f18789y = false;
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4 = this.f18770f;
        if (this.f18771g == 1 || m10358p()) {
            throw null;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(i4 + 0, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f18780p = sliderState.f18794b;
        this.f18781q = sliderState.f18795c;
        setValuesInternal(sliderState.f18796d);
        this.f18785u = sliderState.f18797e;
        if (sliderState.f18798f) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f18794b = this.f18780p;
        sliderState.f18795c = this.f18781q;
        sliderState.f18796d = new ArrayList<>(this.f18782r);
        sliderState.f18797e = this.f18785u;
        sliderState.f18798f = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        this.f18788x = Math.max(i2 - (this.f18773i * 2), 0);
        m10353k();
        m10362t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r2 != 3) goto L48;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 != 0 && ViewUtils.m10167d(this) != null) {
            throw null;
        }
    }

    /* renamed from: p */
    public final boolean m10358p() {
        return this.f18771g == 3;
    }

    /* renamed from: q */
    public final boolean m10359q() {
        return !(getBackground() instanceof RippleDrawable);
    }

    /* renamed from: r */
    public final boolean m10360r(int i2, float f2) {
        this.f18784t = i2;
        if (Math.abs(f2 - this.f18782r.get(i2).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.f18765I == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f3 = this.f18780p;
                minSeparation = C0000a.m4a(f3, this.f18781q, (minSeparation - this.f18773i) / this.f18788x, f3);
            }
        }
        if (m10352j()) {
            minSeparation = -minSeparation;
        }
        int i3 = i2 + 1;
        int i4 = i2 - 1;
        this.f18782r.set(i2, Float.valueOf(MathUtils.m1933a(f2, i4 < 0 ? this.f18780p : minSeparation + this.f18782r.get(i4).floatValue(), i3 >= this.f18782r.size() ? this.f18781q : this.f18782r.get(i3).floatValue() - minSeparation)));
        throw null;
    }

    /* renamed from: s */
    public final boolean m10361s() {
        m10360r(this.f18783s, getValueOfTouchPosition());
        return false;
    }

    public void setActiveThumbIndex(int i2) {
        this.f18783s = i2;
    }

    public void setCustomThumbDrawable(@DrawableRes int i2) {
        setCustomThumbDrawable(getResources().getDrawable(i2));
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            drawableArr[i2] = getResources().getDrawable(iArr[i2]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i2) {
        if (i2 < 0 || i2 >= this.f18782r.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f18784t = i2;
        throw null;
    }

    public void setHaloRadius(@IntRange @Dimension int i2) {
        if (i2 == this.f18775k) {
            return;
        }
        this.f18775k = i2;
        Drawable background = getBackground();
        if (m10359q() || !(background instanceof RippleDrawable)) {
            postInvalidate();
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) background;
        int i3 = this.f18775k;
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i3);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i3));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e2);
        }
    }

    public void setHaloRadiusResource(@DimenRes int i2) {
        setHaloRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f18757A)) {
            return;
        }
        this.f18757A = colorStateList;
        Drawable background = getBackground();
        if (m10359q() || !(background instanceof RippleDrawable)) {
            colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            throw null;
        }
        ((RippleDrawable) background).setColor(colorStateList);
    }

    public void setLabelBehavior(int i2) {
        if (this.f18771g != i2) {
            this.f18771g = i2;
            requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable LabelFormatter labelFormatter) {
        this.f18778n = labelFormatter;
    }

    public void setSeparationUnit(int i2) {
        this.f18765I = i2;
        this.f18790z = true;
        postInvalidate();
    }

    public void setStepSize(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f2), Float.valueOf(this.f18780p), Float.valueOf(this.f18781q)));
        }
        if (this.f18785u != f2) {
            this.f18785u = f2;
            this.f18790z = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f2) {
        throw null;
    }

    public void setThumbElevationResource(@DimenRes int i2) {
        setThumbElevation(getResources().getDimension(i2));
    }

    public void setThumbRadius(@IntRange @Dimension int i2) {
        if (i2 == this.f18774j) {
            return;
        }
        this.f18774j = i2;
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        float f2 = this.f18774j;
        CornerTreatment m10307a = MaterialShapeUtils.m10307a(0);
        builder.f18696a = m10307a;
        ShapeAppearanceModel.Builder.m10319b(m10307a);
        builder.f18697b = m10307a;
        ShapeAppearanceModel.Builder.m10319b(m10307a);
        builder.f18698c = m10307a;
        ShapeAppearanceModel.Builder.m10319b(m10307a);
        builder.f18699d = m10307a;
        ShapeAppearanceModel.Builder.m10319b(m10307a);
        builder.m10324f(f2);
        builder.m10325g(f2);
        builder.m10323e(f2);
        builder.m10322d(f2);
        builder.m10320a();
        throw null;
    }

    public void setThumbRadiusResource(@DimenRes int i2) {
        setThumbRadius(getResources().getDimensionPixelSize(i2));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public void setThumbStrokeColorResource(@ColorRes int i2) {
        if (i2 != 0) {
            setThumbStrokeColor(AppCompatResources.m496a(getContext(), i2));
        }
    }

    public void setThumbStrokeWidth(float f2) {
        throw null;
    }

    public void setThumbStrokeWidthResource(@DimenRes int i2) {
        if (i2 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i2));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        throw null;
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f18758B)) {
            return;
        }
        this.f18758B = colorStateList;
        m10349g(colorStateList);
        throw null;
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f18759C)) {
            return;
        }
        this.f18759C = colorStateList;
        m10349g(colorStateList);
        throw null;
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f18787w != z) {
            this.f18787w = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f18760D)) {
            return;
        }
        this.f18760D = colorStateList;
        m10349g(colorStateList);
        throw null;
    }

    public void setTrackHeight(@IntRange @Dimension int i2) {
        if (this.f18772h == i2) {
            return;
        }
        this.f18772h = i2;
        throw null;
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f18761E)) {
            return;
        }
        this.f18761E = colorStateList;
        m10349g(colorStateList);
        throw null;
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.f18780p = f2;
        this.f18790z = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.f18781q = f2;
        this.f18790z = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* renamed from: t */
    public final void m10362t() {
        if (m10359q() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int m10356n = (int) ((m10356n(this.f18782r.get(this.f18784t).floatValue()) * this.f18788x) + this.f18773i);
            int m10345c = m10345c();
            int i2 = this.f18775k;
            DrawableCompat.m1839k(background, m10356n - i2, m10345c - i2, m10356n + i2, m10345c + i2);
        }
    }

    /* renamed from: u */
    public final void m10363u() {
        if (this.f18790z) {
            float f2 = this.f18780p;
            float f3 = this.f18781q;
            if (f2 >= f3) {
                throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(this.f18780p), Float.valueOf(this.f18781q)));
            }
            if (f3 <= f2) {
                throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(this.f18781q), Float.valueOf(this.f18780p)));
            }
            if (this.f18785u > 0.0f && !m10351i(f3 - f2)) {
                throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.f18785u), Float.valueOf(this.f18780p), Float.valueOf(this.f18781q)));
            }
            Iterator<Float> it = this.f18782r.iterator();
            while (it.hasNext()) {
                Float next = it.next();
                if (next.floatValue() < this.f18780p || next.floatValue() > this.f18781q) {
                    throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", next, Float.valueOf(this.f18780p), Float.valueOf(this.f18781q)));
                }
                if (this.f18785u > 0.0f && !m10351i(next.floatValue() - this.f18780p)) {
                    throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", next, Float.valueOf(this.f18780p), Float.valueOf(this.f18785u), Float.valueOf(this.f18785u)));
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(minSeparation)));
            }
            float f4 = this.f18785u;
            if (f4 > 0.0f && minSeparation > 0.0f) {
                if (this.f18765I != 1) {
                    throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f18785u)));
                }
                if (minSeparation < f4 || !m10351i(minSeparation)) {
                    throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(minSeparation), Float.valueOf(this.f18785u), Float.valueOf(this.f18785u)));
                }
            }
            float f5 = this.f18785u;
            if (f5 != 0.0f) {
                if (((int) f5) != f5) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", Float.valueOf(f5)));
                }
                float f6 = this.f18780p;
                if (((int) f6) != f6) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", Float.valueOf(f6)));
                }
                float f7 = this.f18781q;
                if (((int) f7) != f7) {
                    Log.w("BaseSlider", String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", Float.valueOf(f7)));
                }
            }
            this.f18790z = false;
        }
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        m10343a(newDrawable);
        this.f18762F = newDrawable;
        this.f18763G.clear();
        postInvalidate();
    }

    public void setValues(@NonNull List<Float> list) {
        setValuesInternal(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f18762F = null;
        this.f18763G = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List<Drawable> list = this.f18763G;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            m10343a(newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }
}
