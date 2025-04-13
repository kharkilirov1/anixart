package com.yandex.div.internal.widget.indicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.internal.widget.indicator.IndicatorParams;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator;
import com.yandex.div.internal.widget.indicator.animations.ScaleIndicatorAnimator;
import com.yandex.div.internal.widget.indicator.animations.SliderIndicatorAnimator;
import com.yandex.div.internal.widget.indicator.animations.WormIndicatorAnimator;
import com.yandex.div.internal.widget.indicator.forms.Circle;
import com.yandex.div.internal.widget.indicator.forms.RoundedRect;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerIndicatorView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/internal/widget/indicator/PagerIndicatorView;", "Landroid/view/View;", "Lcom/yandex/div/internal/widget/indicator/IndicatorParams$Style;", "style", "", "setStyle", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class PagerIndicatorView extends View {

    /* renamed from: b */
    @Nullable
    public IndicatorsStripDrawer f34065b;

    /* renamed from: c */
    @Nullable
    public ViewPager2 f34066c;

    /* renamed from: d */
    @Nullable
    public IndicatorParams.Style f34067d;

    /* renamed from: e */
    @NotNull
    public final ViewPager2.OnPageChangeCallback f34068e;

    @JvmOverloads
    public PagerIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f34068e = new ViewPager2.OnPageChangeCallback() { // from class: com.yandex.div.internal.widget.indicator.PagerIndicatorView$onPageChangeListener$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i3, float f2, int i4) {
                PagerIndicatorView pagerIndicatorView = PagerIndicatorView.this;
                IndicatorsStripDrawer indicatorsStripDrawer = pagerIndicatorView.f34065b;
                if (indicatorsStripDrawer == null) {
                    return;
                }
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                } else if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                indicatorsStripDrawer.f34060l = i3;
                indicatorsStripDrawer.f34061m = f2;
                indicatorsStripDrawer.f34051c.mo17437h(i3, f2);
                indicatorsStripDrawer.m17425a(i3, f2);
                pagerIndicatorView.invalidate();
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i3) {
                PagerIndicatorView pagerIndicatorView = PagerIndicatorView.this;
                IndicatorsStripDrawer indicatorsStripDrawer = pagerIndicatorView.f34065b;
                if (indicatorsStripDrawer == null) {
                    return;
                }
                indicatorsStripDrawer.f34060l = i3;
                indicatorsStripDrawer.f34061m = 0.0f;
                indicatorsStripDrawer.f34051c.mo17431b(i3);
                indicatorsStripDrawer.m17425a(i3, 0.0f);
                pagerIndicatorView.invalidate();
            }
        };
    }

    /* renamed from: b */
    public final void m17429b(IndicatorsStripDrawer indicatorsStripDrawer) {
        ViewPager2 viewPager2 = this.f34066c;
        if (viewPager2 == null) {
            return;
        }
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            indicatorsStripDrawer.f34052d = itemCount;
            indicatorsStripDrawer.f34051c.mo17434e(itemCount);
            indicatorsStripDrawer.m17426b();
            indicatorsStripDrawer.f34055g = (indicatorsStripDrawer.f34058j - (indicatorsStripDrawer.f34056h * (indicatorsStripDrawer.f34053e - 1))) / 2.0f;
            indicatorsStripDrawer.f34054f = indicatorsStripDrawer.f34059k / 2.0f;
        }
        int currentItem = viewPager2.getCurrentItem();
        indicatorsStripDrawer.f34060l = currentItem;
        indicatorsStripDrawer.f34061m = 0.0f;
        indicatorsStripDrawer.f34051c.mo17431b(currentItem);
        indicatorsStripDrawer.m17425a(currentItem, 0.0f);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        IndicatorsStripDrawer indicatorsStripDrawer = this.f34065b;
        if (indicatorsStripDrawer == null) {
            return;
        }
        int i2 = indicatorsStripDrawer.f34063o;
        int i3 = indicatorsStripDrawer.f34064p;
        if (i2 <= i3) {
            while (true) {
                int i4 = i2 + 1;
                float m17428d = indicatorsStripDrawer.m17428d(i2) - indicatorsStripDrawer.f34062n;
                if (0.0f <= m17428d && m17428d <= ((float) indicatorsStripDrawer.f34058j)) {
                    IndicatorParams.ItemSize mo17430a = indicatorsStripDrawer.f34051c.mo17430a(i2);
                    float f2 = indicatorsStripDrawer.f34057i;
                    if (!(f2 == 1.0f) && (mo17430a instanceof IndicatorParams.ItemSize.RoundedRect)) {
                        IndicatorParams.ItemSize.RoundedRect roundedRect = (IndicatorParams.ItemSize.RoundedRect) mo17430a;
                        IndicatorParams.ItemSize.RoundedRect roundedRect2 = new IndicatorParams.ItemSize.RoundedRect(roundedRect.f34035a * f2, roundedRect.f34036b, roundedRect.f34037c);
                        indicatorsStripDrawer.f34051c.mo17435f(roundedRect2.f34035a);
                        mo17430a = roundedRect2;
                    }
                    if (indicatorsStripDrawer.f34052d > indicatorsStripDrawer.f34053e) {
                        float f3 = indicatorsStripDrawer.f34056h * 1.3f;
                        float m17422b = indicatorsStripDrawer.f34049a.f34046c.mo17424b().m17422b() / 2;
                        if (i2 == 0 || i2 == indicatorsStripDrawer.f34052d - 1) {
                            f3 = m17422b;
                        }
                        int i5 = indicatorsStripDrawer.f34058j;
                        if (m17428d < f3) {
                            float m17422b2 = (mo17430a.m17422b() * m17428d) / f3;
                            if (m17422b2 <= indicatorsStripDrawer.f34049a.f34047d.mo17424b().m17422b()) {
                                mo17430a = indicatorsStripDrawer.f34049a.f34047d.mo17424b();
                            } else if (m17422b2 < mo17430a.m17422b()) {
                                if (mo17430a instanceof IndicatorParams.ItemSize.RoundedRect) {
                                    IndicatorParams.ItemSize.RoundedRect roundedRect3 = (IndicatorParams.ItemSize.RoundedRect) mo17430a;
                                    roundedRect3.f34035a = m17422b2;
                                    roundedRect3.f34036b = (roundedRect3.f34036b * m17428d) / f3;
                                } else if (mo17430a instanceof IndicatorParams.ItemSize.Circle) {
                                    ((IndicatorParams.ItemSize.Circle) mo17430a).f34034a = m17422b2;
                                }
                            }
                        } else {
                            float f4 = i5;
                            if (m17428d > f4 - f3) {
                                float f5 = (-m17428d) + f4;
                                float m17422b3 = (mo17430a.m17422b() * f5) / f3;
                                if (m17422b3 <= indicatorsStripDrawer.f34049a.f34047d.mo17424b().m17422b()) {
                                    mo17430a = indicatorsStripDrawer.f34049a.f34047d.mo17424b();
                                } else if (m17422b3 < mo17430a.m17422b()) {
                                    if (mo17430a instanceof IndicatorParams.ItemSize.RoundedRect) {
                                        IndicatorParams.ItemSize.RoundedRect roundedRect4 = (IndicatorParams.ItemSize.RoundedRect) mo17430a;
                                        roundedRect4.f34035a = m17422b3;
                                        roundedRect4.f34036b = (roundedRect4.f34036b * f5) / f3;
                                    } else if (mo17430a instanceof IndicatorParams.ItemSize.Circle) {
                                        ((IndicatorParams.ItemSize.Circle) mo17430a).f34034a = m17422b3;
                                    }
                                }
                            }
                        }
                    }
                    indicatorsStripDrawer.f34050b.mo17444b(canvas, m17428d, indicatorsStripDrawer.f34054f, mo17430a, indicatorsStripDrawer.f34051c.mo17436g(i2), indicatorsStripDrawer.f34051c.mo17439j(i2), indicatorsStripDrawer.f34051c.mo17433d(i2));
                }
                if (i2 == i3) {
                    break;
                } else {
                    i2 = i4;
                }
            }
        }
        RectF mo17438i = indicatorsStripDrawer.f34051c.mo17438i(indicatorsStripDrawer.m17428d(indicatorsStripDrawer.f34060l) - indicatorsStripDrawer.f34062n, indicatorsStripDrawer.f34054f);
        if (mo17438i != null) {
            indicatorsStripDrawer.f34050b.mo17443a(canvas, mo17438i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            com.yandex.div.internal.widget.indicator.IndicatorParams$Style r1 = r7.f34067d
            r2 = 0
            if (r1 != 0) goto Lf
        Ld:
            r1 = 0
            goto L1f
        Lf:
            com.yandex.div.internal.widget.indicator.IndicatorParams$Shape r1 = r1.f34045b
            if (r1 != 0) goto L14
            goto Ld
        L14:
            com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize r1 = r1.mo17424b()
            if (r1 != 0) goto L1b
            goto Ld
        L1b:
            float r1 = r1.m17421a()
        L1f:
            int r3 = r7.getPaddingTop()
            float r3 = (float) r3
            float r1 = r1 + r3
            int r3 = r7.getPaddingBottom()
            float r3 = (float) r3
            float r1 = r1 + r3
            int r1 = (int) r1
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r4) goto L36
            if (r0 == r3) goto L3a
            r9 = r1
            goto L3a
        L36:
            int r9 = java.lang.Math.min(r1, r9)
        L3a:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            com.yandex.div.internal.widget.indicator.IndicatorParams$Style r1 = r7.f34067d
            if (r1 != 0) goto L47
            goto L57
        L47:
            com.yandex.div.internal.widget.indicator.IndicatorParams$Shape r1 = r1.f34045b
            if (r1 != 0) goto L4c
            goto L57
        L4c:
            com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize r1 = r1.mo17424b()
            if (r1 != 0) goto L53
            goto L57
        L53:
            float r2 = r1.m17422b()
        L57:
            com.yandex.div.internal.widget.indicator.IndicatorParams$Style r1 = r7.f34067d
            if (r1 != 0) goto L5d
            r1 = 0
            goto L5f
        L5d:
            com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement r1 = r1.f34048e
        L5f:
            boolean r5 = r1 instanceof com.yandex.div.internal.widget.indicator.IndicatorParams.ItemPlacement.Default
            if (r5 == 0) goto L87
            com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement$Default r1 = (com.yandex.div.internal.widget.indicator.IndicatorParams.ItemPlacement.Default) r1
            float r1 = r1.f34031a
            androidx.viewpager2.widget.ViewPager2 r5 = r7.f34066c
            r6 = 0
            if (r5 != 0) goto L6d
            goto L78
        L6d:
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.getAdapter()
            if (r5 != 0) goto L74
            goto L78
        L74:
            int r6 = r5.getItemCount()
        L78:
            float r5 = (float) r6
            float r1 = r1 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            int r2 = r7.getPaddingLeft()
            int r2 = r2 + r1
            int r1 = r7.getPaddingRight()
            goto L99
        L87:
            boolean r5 = r1 instanceof com.yandex.div.internal.widget.indicator.IndicatorParams.ItemPlacement.Stretch
            if (r5 == 0) goto L8d
            r1 = r8
            goto L9a
        L8d:
            if (r1 != 0) goto Lc4
            int r1 = (int) r2
            int r2 = r7.getPaddingLeft()
            int r2 = r2 + r1
            int r1 = r7.getPaddingRight()
        L99:
            int r1 = r1 + r2
        L9a:
            if (r0 == r4) goto La0
            if (r0 == r3) goto La4
            r8 = r1
            goto La4
        La0:
            int r8 = java.lang.Math.min(r1, r8)
        La4:
            r7.setMeasuredDimension(r8, r9)
            com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer r0 = r7.f34065b
            if (r0 != 0) goto Lac
            goto Lc3
        Lac:
            int r1 = r7.getPaddingLeft()
            int r8 = r8 - r1
            int r1 = r7.getPaddingRight()
            int r8 = r8 - r1
            int r1 = r7.getPaddingTop()
            int r9 = r9 - r1
            int r1 = r7.getPaddingBottom()
            int r9 = r9 - r1
            r0.m17427c(r8, r9)
        Lc3:
            return
        Lc4:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.indicator.PagerIndicatorView.onMeasure(int, int):void");
    }

    public final void setStyle(@NotNull IndicatorParams.Style style) {
        SingleIndicatorDrawer circle;
        IndicatorAnimator scaleIndicatorAnimator;
        Intrinsics.m32179h(style, "style");
        this.f34067d = style;
        IndicatorParams.Shape shape = style.f34045b;
        if (shape instanceof IndicatorParams.Shape.RoundedRect) {
            circle = new RoundedRect(style);
        } else {
            if (!(shape instanceof IndicatorParams.Shape.Circle)) {
                throw new NoWhenBranchMatchedException();
            }
            circle = new Circle(style);
        }
        int ordinal = style.f34044a.ordinal();
        if (ordinal == 0) {
            scaleIndicatorAnimator = new ScaleIndicatorAnimator(style);
        } else if (ordinal == 1) {
            scaleIndicatorAnimator = new WormIndicatorAnimator(style);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            scaleIndicatorAnimator = new SliderIndicatorAnimator(style);
        }
        IndicatorsStripDrawer indicatorsStripDrawer = new IndicatorsStripDrawer(style, circle, scaleIndicatorAnimator);
        indicatorsStripDrawer.m17427c((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        m17429b(indicatorsStripDrawer);
        this.f34065b = indicatorsStripDrawer;
        requestLayout();
    }
}
