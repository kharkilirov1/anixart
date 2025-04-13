package com.yandex.div.internal.widget.slider;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Px;
import com.yandex.div.core.ObserverList;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SliderView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b!\b\u0016\u0018\u00002\u00020\u0001:\u0003hijJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010(\u001a\u00020!2\u0006\u0010\t\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010,\u001a\u00020!2\u0006\u0010\t\u001a\u00020!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R.\u00104\u001a\u0004\u0018\u00010-2\b\u0010\t\u001a\u0004\u0018\u00010-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R.\u00108\u001a\u0004\u0018\u00010-2\b\u0010\t\u001a\u0004\u0018\u00010-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R.\u0010<\u001a\u0004\u0018\u00010-2\b\u0010\t\u001a\u0004\u0018\u00010-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010/\u001a\u0004\b:\u00101\"\u0004\b;\u00103R.\u0010@\u001a\u0004\u0018\u00010-2\b\u0010\t\u001a\u0004\u0018\u00010-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010/\u001a\u0004\b>\u00101\"\u0004\b?\u00103R$\u0010D\u001a\u00020!2\u0006\u0010A\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u0010#\u001a\u0004\bC\u0010%R.\u0010I\u001a\u0004\u0018\u00010-2\b\u0010E\u001a\u0004\u0018\u00010-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010/\u001a\u0004\bG\u00101\"\u0004\bH\u00103R.\u0010Q\u001a\u0004\u0018\u00010J2\b\u0010E\u001a\u0004\u0018\u00010J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR(\u0010V\u001a\u0004\u0018\u00010!2\b\u0010A\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR.\u0010Z\u001a\u0004\u0018\u00010-2\b\u0010\t\u001a\u0004\u0018\u00010-8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010/\u001a\u0004\bX\u00101\"\u0004\bY\u00103R.\u0010^\u001a\u0004\u0018\u00010J2\b\u0010E\u001a\u0004\u0018\u00010J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010L\u001a\u0004\b\\\u0010N\"\u0004\b]\u0010PR\u001c\u0010c\u001a\u00020\u00058B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\"\u0010g\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010\u001b\u001a\u0004\be\u0010\u001d\"\u0004\bf\u0010\u001f¨\u0006k"}, m31884d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView;", "Landroid/view/View;", "Landroid/animation/ValueAnimator;", "", "setBaseParams", "", "getSuggestedMinimumHeight", "getSuggestedMinimumWidth", "", "value", "h", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "i", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "getAnimationInterpolator", "()Landroid/view/animation/AccelerateDecelerateInterpolator;", "setAnimationInterpolator", "(Landroid/view/animation/AccelerateDecelerateInterpolator;)V", "animationInterpolator", "", "j", "Z", "getAnimationEnabled", "()Z", "setAnimationEnabled", "(Z)V", "animationEnabled", "", "k", "F", "getMinValue", "()F", "setMinValue", "(F)V", "minValue", "l", "getMaxValue", "setMaxValue", "maxValue", "Landroid/graphics/drawable/Drawable;", "m", "Landroid/graphics/drawable/Drawable;", "getActiveTickMarkDrawable", "()Landroid/graphics/drawable/Drawable;", "setActiveTickMarkDrawable", "(Landroid/graphics/drawable/Drawable;)V", "activeTickMarkDrawable", "n", "getInactiveTickMarkDrawable", "setInactiveTickMarkDrawable", "inactiveTickMarkDrawable", "o", "getActiveTrackDrawable", "setActiveTrackDrawable", "activeTrackDrawable", "p", "getInactiveTrackDrawable", "setInactiveTrackDrawable", "inactiveTrackDrawable", "<set-?>", "q", "getThumbValue", "thumbValue", "drawable", "r", "getThumbDrawable", "setThumbDrawable", "thumbDrawable", "Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "s", "Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "getThumbTextDrawable", "()Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;", "setThumbTextDrawable", "(Lcom/yandex/div/internal/widget/slider/shapes/TextDrawable;)V", "thumbTextDrawable", "t", "Ljava/lang/Float;", "getThumbSecondaryValue", "()Ljava/lang/Float;", "thumbSecondaryValue", "u", "getThumbSecondaryDrawable", "setThumbSecondaryDrawable", "thumbSecondaryDrawable", "v", "getThumbSecondTextDrawable", "setThumbSecondTextDrawable", "thumbSecondTextDrawable", "w", "I", "getMaxTickmarkOrThumbWidth", "()I", "maxTickmarkOrThumbWidth", "z", "getInteractive", "setInteractive", "interactive", "ActiveRange", "ChangedListener", "Thumb", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class SliderView extends View {

    /* renamed from: A */
    public static final /* synthetic */ int f34100A = 0;

    /* renamed from: b */
    @NotNull
    public final SliderDrawDelegate f34101b;

    /* renamed from: c */
    @NotNull
    public final ObserverList<ChangedListener> f34102c;

    /* renamed from: d */
    @Nullable
    public ValueAnimator f34103d;

    /* renamed from: e */
    @Nullable
    public ValueAnimator f34104e;

    /* renamed from: f */
    @NotNull
    public final SliderView$animatorListener$1 f34105f;

    /* renamed from: g */
    @NotNull
    public final SliderView$animatorSecondaryListener$1 f34106g;

    /* renamed from: h, reason: from kotlin metadata */
    public long animationDuration;

    /* renamed from: i, reason: from kotlin metadata */
    @NotNull
    public AccelerateDecelerateInterpolator animationInterpolator;

    /* renamed from: j, reason: from kotlin metadata */
    public boolean animationEnabled;

    /* renamed from: k, reason: from kotlin metadata */
    public float minValue;

    /* renamed from: l, reason: from kotlin metadata */
    public float maxValue;

    /* renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Drawable activeTickMarkDrawable;

    /* renamed from: n, reason: from kotlin metadata */
    @Nullable
    public Drawable inactiveTickMarkDrawable;

    /* renamed from: o, reason: from kotlin metadata */
    @Nullable
    public Drawable activeTrackDrawable;

    /* renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Drawable inactiveTrackDrawable;

    /* renamed from: q, reason: from kotlin metadata */
    public float thumbValue;

    /* renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Drawable thumbDrawable;

    /* renamed from: s, reason: from kotlin metadata */
    @Nullable
    public TextDrawable thumbTextDrawable;

    /* renamed from: t, reason: from kotlin metadata */
    @Nullable
    public Float thumbSecondaryValue;

    /* renamed from: u, reason: from kotlin metadata */
    @Nullable
    public Drawable thumbSecondaryDrawable;

    /* renamed from: v, reason: from kotlin metadata */
    @Nullable
    public TextDrawable thumbSecondTextDrawable;

    /* renamed from: w, reason: from kotlin metadata */
    public int maxTickmarkOrThumbWidth;

    /* renamed from: x */
    @NotNull
    public final ActiveRange f34123x;

    /* renamed from: y */
    @NotNull
    public Thumb f34124y;

    /* renamed from: z, reason: from kotlin metadata */
    public boolean interactive;

    /* compiled from: SliderView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView$ActiveRange;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class ActiveRange {
        public ActiveRange() {
        }
    }

    /* compiled from: SliderView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView$ChangedListener;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface ChangedListener {
        /* renamed from: a */
        void mo17031a(@Nullable Float f2);

        /* renamed from: b */
        void mo17032b(float f2);
    }

    /* compiled from: SliderView.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/internal/widget/slider/SliderView$Thumb;", "", "THUMB", "THUMB_SECONDARY", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Thumb {
        THUMB,
        THUMB_SECONDARY
    }

    /* compiled from: SliderView.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Thumb.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
        }
    }

    @JvmOverloads
    public SliderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f34101b = new SliderDrawDelegate();
        this.f34102c = new ObserverList<>();
        this.f34105f = new SliderView$animatorListener$1(this);
        this.f34106g = new SliderView$animatorSecondaryListener$1(this);
        this.animationDuration = 300L;
        this.animationInterpolator = new AccelerateDecelerateInterpolator();
        this.animationEnabled = true;
        this.maxValue = 100.0f;
        this.thumbValue = this.minValue;
        this.maxTickmarkOrThumbWidth = -1;
        this.f34123x = new ActiveRange();
        this.f34124y = Thumb.THUMB;
        this.interactive = true;
    }

    private final int getMaxTickmarkOrThumbWidth() {
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        if (this.maxTickmarkOrThumbWidth == -1) {
            Drawable drawable = this.activeTickMarkDrawable;
            int i2 = 0;
            int width = (drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.width();
            Drawable drawable2 = this.inactiveTickMarkDrawable;
            int max = Math.max(width, (drawable2 == null || (bounds2 = drawable2.getBounds()) == null) ? 0 : bounds2.width());
            Drawable drawable3 = this.thumbDrawable;
            int width2 = (drawable3 == null || (bounds3 = drawable3.getBounds()) == null) ? 0 : bounds3.width();
            Drawable drawable4 = this.thumbSecondaryDrawable;
            if (drawable4 != null && (bounds4 = drawable4.getBounds()) != null) {
                i2 = bounds4.width();
            }
            this.maxTickmarkOrThumbWidth = Math.max(max, Math.max(width2, i2));
        }
        return this.maxTickmarkOrThumbWidth;
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.animationDuration);
        valueAnimator.setInterpolator(this.animationInterpolator);
    }

    /* renamed from: b */
    public final float m17449b(int i2) {
        return (this.inactiveTickMarkDrawable == null && this.activeTickMarkDrawable == null) ? m17459o(i2) : MathKt.m32223c(m17459o(i2));
    }

    /* renamed from: d */
    public final float m17450d(float f2) {
        return Math.min(Math.max(f2, this.minValue), this.maxValue);
    }

    /* renamed from: f */
    public final boolean m17451f() {
        return this.thumbSecondaryValue != null;
    }

    /* renamed from: g */
    public final int m17452g(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i2 : size : Math.min(i2, size);
    }

    @Nullable
    public final Drawable getActiveTickMarkDrawable() {
        return this.activeTickMarkDrawable;
    }

    @Nullable
    public final Drawable getActiveTrackDrawable() {
        return this.activeTrackDrawable;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    @NotNull
    public final AccelerateDecelerateInterpolator getAnimationInterpolator() {
        return this.animationInterpolator;
    }

    @Nullable
    public final Drawable getInactiveTickMarkDrawable() {
        return this.inactiveTickMarkDrawable;
    }

    @Nullable
    public final Drawable getInactiveTrackDrawable() {
        return this.inactiveTrackDrawable;
    }

    public final boolean getInteractive() {
        return this.interactive;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        Drawable drawable = this.activeTrackDrawable;
        int i2 = 0;
        int height = (drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.height();
        Drawable drawable2 = this.inactiveTrackDrawable;
        int max = Math.max(height, (drawable2 == null || (bounds2 = drawable2.getBounds()) == null) ? 0 : bounds2.height());
        Drawable drawable3 = this.thumbDrawable;
        int height2 = (drawable3 == null || (bounds3 = drawable3.getBounds()) == null) ? 0 : bounds3.height();
        Drawable drawable4 = this.thumbSecondaryDrawable;
        if (drawable4 != null && (bounds4 = drawable4.getBounds()) != null) {
            i2 = bounds4.height();
        }
        return Math.max(Math.max(height2, i2), max);
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        Rect bounds;
        Rect bounds2;
        Rect bounds3;
        Rect bounds4;
        int i2 = (int) ((this.maxValue - this.minValue) + 1);
        Drawable drawable = this.activeTrackDrawable;
        int width = ((drawable == null || (bounds = drawable.getBounds()) == null) ? 0 : bounds.width()) * i2;
        Drawable drawable2 = this.inactiveTrackDrawable;
        int max = Math.max(width, ((drawable2 == null || (bounds2 = drawable2.getBounds()) == null) ? 0 : bounds2.width()) * i2);
        Drawable drawable3 = this.thumbDrawable;
        int width2 = (drawable3 == null || (bounds3 = drawable3.getBounds()) == null) ? 0 : bounds3.width();
        Drawable drawable4 = this.thumbSecondaryDrawable;
        int max2 = Math.max(Math.max(width2, (drawable4 == null || (bounds4 = drawable4.getBounds()) == null) ? 0 : bounds4.width()), max);
        TextDrawable textDrawable = this.thumbTextDrawable;
        int intrinsicWidth = textDrawable == null ? 0 : textDrawable.getIntrinsicWidth();
        TextDrawable textDrawable2 = this.thumbSecondTextDrawable;
        return Math.max(max2, Math.max(intrinsicWidth, textDrawable2 != null ? textDrawable2.getIntrinsicWidth() : 0));
    }

    @Nullable
    public final Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @Nullable
    public final TextDrawable getThumbSecondTextDrawable() {
        return this.thumbSecondTextDrawable;
    }

    @Nullable
    public final Drawable getThumbSecondaryDrawable() {
        return this.thumbSecondaryDrawable;
    }

    @Nullable
    public final Float getThumbSecondaryValue() {
        return this.thumbSecondaryValue;
    }

    @Nullable
    public final TextDrawable getThumbTextDrawable() {
        return this.thumbTextDrawable;
    }

    public final float getThumbValue() {
        return this.thumbValue;
    }

    /* renamed from: i */
    public final void m17453i(Float f2, float f3) {
        if (f2 != null && f2.floatValue() == f3) {
            return;
        }
        Iterator<ChangedListener> it = this.f34102c.iterator();
        while (it.hasNext()) {
            it.next().mo17032b(f3);
        }
    }

    /* renamed from: j */
    public final void m17454j(Float f2, Float f3) {
        if (Intrinsics.m32173b(f2, f3)) {
            return;
        }
        Iterator<ChangedListener> it = this.f34102c.iterator();
        while (it.hasNext()) {
            it.next().mo17031a(f3);
        }
    }

    /* renamed from: k */
    public final void m17455k() {
        m17461q(m17450d(this.thumbValue), false, true);
        if (m17451f()) {
            Float f2 = this.thumbSecondaryValue;
            m17460p(f2 == null ? null : Float.valueOf(m17450d(f2.floatValue())), false, true);
        }
    }

    /* renamed from: l */
    public final void m17456l() {
        m17461q(MathKt.m32223c(this.thumbValue), false, true);
        if (this.thumbSecondaryValue == null) {
            return;
        }
        m17460p(Float.valueOf(MathKt.m32223c(r0.floatValue())), false, true);
    }

    /* renamed from: m */
    public final void m17457m(Thumb thumb, float f2, boolean z) {
        int ordinal = thumb.ordinal();
        if (ordinal == 0) {
            m17461q(f2, z, false);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            m17460p(Float.valueOf(f2), z, false);
        }
    }

    @Px
    /* renamed from: n */
    public final int m17458n(float f2) {
        return (int) (((f2 - this.minValue) * (((getWidth() - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth())) / (this.maxValue - this.minValue));
    }

    /* renamed from: o */
    public final float m17459o(int i2) {
        return (((this.maxValue - this.minValue) * i2) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth())) + this.minValue;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float min;
        float max;
        Intrinsics.m32179h(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft() + (getMaxTickmarkOrThumbWidth() / 2), getPaddingTop());
        SliderDrawDelegate sliderDrawDelegate = this.f34101b;
        Drawable drawable = this.inactiveTrackDrawable;
        Objects.requireNonNull(sliderDrawDelegate);
        if (drawable != null) {
            drawable.setBounds(0, (sliderDrawDelegate.f34094b / 2) - (drawable.getIntrinsicHeight() / 2), sliderDrawDelegate.f34093a, (drawable.getIntrinsicHeight() / 2) + (sliderDrawDelegate.f34094b / 2));
            drawable.draw(canvas);
        }
        ActiveRange activeRange = this.f34123x;
        if (SliderView.this.m17451f()) {
            float thumbValue = SliderView.this.getThumbValue();
            Float thumbSecondaryValue = SliderView.this.getThumbSecondaryValue();
            if (thumbSecondaryValue == null) {
                min = thumbValue;
            } else {
                thumbSecondaryValue.floatValue();
                min = Math.min(thumbValue, thumbSecondaryValue.floatValue());
            }
        } else {
            min = SliderView.this.getMinValue();
        }
        ActiveRange activeRange2 = this.f34123x;
        if (SliderView.this.m17451f()) {
            float thumbValue2 = SliderView.this.getThumbValue();
            Float thumbSecondaryValue2 = SliderView.this.getThumbSecondaryValue();
            if (thumbSecondaryValue2 == null) {
                max = thumbValue2;
            } else {
                thumbSecondaryValue2.floatValue();
                max = Math.max(thumbValue2, thumbSecondaryValue2.floatValue());
            }
        } else {
            max = SliderView.this.getThumbValue();
        }
        SliderDrawDelegate sliderDrawDelegate2 = this.f34101b;
        Drawable drawable2 = this.activeTrackDrawable;
        int m17458n = m17458n(min);
        int m17458n2 = m17458n(max);
        Objects.requireNonNull(sliderDrawDelegate2);
        if (drawable2 != null) {
            drawable2.setBounds(m17458n, (sliderDrawDelegate2.f34094b / 2) - (drawable2.getIntrinsicHeight() / 2), m17458n2, (drawable2.getIntrinsicHeight() / 2) + (sliderDrawDelegate2.f34094b / 2));
            drawable2.draw(canvas);
        }
        int i2 = (int) this.minValue;
        int i3 = (int) this.maxValue;
        if (i2 <= i3) {
            while (true) {
                int i4 = i2 + 1;
                this.f34101b.m17447a(canvas, i2 <= ((int) max) && ((int) min) <= i2 ? this.activeTickMarkDrawable : this.inactiveTickMarkDrawable, m17458n(i2));
                if (i2 == i3) {
                    break;
                } else {
                    i2 = i4;
                }
            }
        }
        this.f34101b.m17448b(canvas, m17458n(this.thumbValue), this.thumbDrawable, (int) this.thumbValue, this.thumbTextDrawable);
        if (m17451f()) {
            SliderDrawDelegate sliderDrawDelegate3 = this.f34101b;
            Float f2 = this.thumbSecondaryValue;
            Intrinsics.m32176e(f2);
            int m17458n3 = m17458n(f2.floatValue());
            Drawable drawable3 = this.thumbSecondaryDrawable;
            Float f3 = this.thumbSecondaryValue;
            Intrinsics.m32176e(f3);
            sliderDrawDelegate3.m17448b(canvas, m17458n3, drawable3, (int) f3.floatValue(), this.thumbSecondTextDrawable);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft() + getSuggestedMinimumWidth();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight();
        int m17452g = m17452g(paddingRight, i2);
        int m17452g2 = m17452g(paddingBottom, i3);
        setMeasuredDimension(m17452g, m17452g2);
        SliderDrawDelegate sliderDrawDelegate = this.f34101b;
        int paddingLeft = ((m17452g - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
        int paddingTop = (m17452g2 - getPaddingTop()) - getPaddingBottom();
        sliderDrawDelegate.f34093a = paddingLeft;
        sliderDrawDelegate.f34094b = paddingTop;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.m32179h(ev, "ev");
        if (!this.interactive) {
            return false;
        }
        int x = (((int) ev.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
        int action = ev.getAction();
        if (action != 0) {
            if (action == 1) {
                m17457m(this.f34124y, m17449b(x), this.animationEnabled);
                return true;
            }
            if (action != 2) {
                return false;
            }
            m17457m(this.f34124y, m17449b(x), false);
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        Thumb thumb = Thumb.THUMB;
        if (m17451f()) {
            int abs = Math.abs(x - m17458n(this.thumbValue));
            Float f2 = this.thumbSecondaryValue;
            Intrinsics.m32176e(f2);
            if (abs >= Math.abs(x - m17458n(f2.floatValue()))) {
                thumb = Thumb.THUMB_SECONDARY;
            }
        }
        this.f34124y = thumb;
        m17457m(thumb, m17449b(x), this.animationEnabled);
        return true;
    }

    /* renamed from: p */
    public final void m17460p(Float f2, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        Float f3;
        Float valueOf = f2 == null ? null : Float.valueOf(m17450d(f2.floatValue()));
        if (Intrinsics.m32173b(this.thumbSecondaryValue, valueOf)) {
            return;
        }
        if (!z || !this.animationEnabled || (f3 = this.thumbSecondaryValue) == null || valueOf == null) {
            if (z2 && (valueAnimator = this.f34104e) != null) {
                valueAnimator.cancel();
            }
            if (z2 || this.f34104e == null) {
                SliderView$animatorSecondaryListener$1 sliderView$animatorSecondaryListener$1 = this.f34106g;
                Float f4 = this.thumbSecondaryValue;
                sliderView$animatorSecondaryListener$1.f34133a = f4;
                this.thumbSecondaryValue = valueOf;
                m17454j(f4, valueOf);
            }
        } else {
            ValueAnimator valueAnimator2 = this.f34104e;
            if (valueAnimator2 == null) {
                this.f34106g.f34133a = f3;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            Float f5 = this.thumbSecondaryValue;
            Intrinsics.m32176e(f5);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f5.floatValue(), valueOf.floatValue());
            ofFloat.addUpdateListener(new C2909a(this, 1));
            ofFloat.addListener(this.f34106g);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.f34104e = ofFloat;
        }
        invalidate();
    }

    /* renamed from: q */
    public final void m17461q(float f2, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        float min = Math.min(Math.max(f2, this.minValue), this.maxValue);
        float f3 = this.thumbValue;
        if (f3 == min) {
            return;
        }
        if (z && this.animationEnabled) {
            ValueAnimator valueAnimator2 = this.f34103d;
            if (valueAnimator2 == null) {
                this.f34105f.f34130a = f3;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.thumbValue, min);
            ofFloat.addUpdateListener(new C2909a(this, 0));
            ofFloat.addListener(this.f34105f);
            setBaseParams(ofFloat);
            ofFloat.start();
            this.f34103d = ofFloat;
        } else {
            if (z2 && (valueAnimator = this.f34103d) != null) {
                valueAnimator.cancel();
            }
            if (z2 || this.f34103d == null) {
                SliderView$animatorListener$1 sliderView$animatorListener$1 = this.f34105f;
                float f4 = this.thumbValue;
                sliderView$animatorListener$1.f34130a = f4;
                this.thumbValue = min;
                m17453i(Float.valueOf(f4), this.thumbValue);
            }
        }
        invalidate();
    }

    public final void setActiveTickMarkDrawable(@Nullable Drawable drawable) {
        this.activeTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        m17456l();
        invalidate();
    }

    public final void setActiveTrackDrawable(@Nullable Drawable drawable) {
        this.activeTrackDrawable = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j2) {
        if (this.animationDuration == j2 || j2 < 0) {
            return;
        }
        this.animationDuration = j2;
    }

    public final void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    public final void setAnimationInterpolator(@NotNull AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        Intrinsics.m32179h(accelerateDecelerateInterpolator, "<set-?>");
        this.animationInterpolator = accelerateDecelerateInterpolator;
    }

    public final void setInactiveTickMarkDrawable(@Nullable Drawable drawable) {
        this.inactiveTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        m17456l();
        invalidate();
    }

    public final void setInactiveTrackDrawable(@Nullable Drawable drawable) {
        this.inactiveTrackDrawable = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z) {
        this.interactive = z;
    }

    public final void setMaxValue(float f2) {
        if (this.maxValue == f2) {
            return;
        }
        setMinValue(Math.min(this.minValue, f2 - 1.0f));
        this.maxValue = f2;
        m17455k();
        invalidate();
    }

    public final void setMinValue(float f2) {
        if (this.minValue == f2) {
            return;
        }
        setMaxValue(Math.max(this.maxValue, 1.0f + f2));
        this.minValue = f2;
        m17455k();
        invalidate();
    }

    public final void setThumbDrawable(@Nullable Drawable drawable) {
        this.thumbDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(@Nullable TextDrawable textDrawable) {
        this.thumbSecondTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(@Nullable Drawable drawable) {
        this.thumbSecondaryDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbTextDrawable(@Nullable TextDrawable textDrawable) {
        this.thumbTextDrawable = textDrawable;
        invalidate();
    }
}
