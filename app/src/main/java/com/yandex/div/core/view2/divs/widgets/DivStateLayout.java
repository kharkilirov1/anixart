package com.yandex.div.core.view2.divs.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.math.MathUtils;
import androidx.core.view.GestureDetectorCompat;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivStateLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001@J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0013\u0010;\u001a\u0004\u0018\u0001088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010?\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/internal/widget/TransientView;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "Lcom/yandex/div/core/state/DivStatePath;", "m", "Lcom/yandex/div/core/state/DivStatePath;", "getPath", "()Lcom/yandex/div/core/state/DivStatePath;", "setPath", "(Lcom/yandex/div/core/state/DivStatePath;)V", "path", "Lkotlin/Function0;", "", "p", "Lkotlin/jvm/functions/Function0;", "getSwipeOutCallback", "()Lkotlin/jvm/functions/Function0;", "setSwipeOutCallback", "(Lkotlin/jvm/functions/Function0;)V", "swipeOutCallback", "Lcom/yandex/div2/DivState;", "q", "Lcom/yandex/div2/DivState;", "getDivState$div_release", "()Lcom/yandex/div2/DivState;", "setDivState$div_release", "(Lcom/yandex/div2/DivState;)V", "divState", "Lcom/yandex/div2/Div;", "r", "Lcom/yandex/div2/Div;", "getActiveStateDiv$div_release", "()Lcom/yandex/div2/Div;", "setActiveStateDiv$div_release", "(Lcom/yandex/div2/Div;)V", "activeStateDiv", "", "value", "s", "Z", "c", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/Disposable;", "u", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "", "getStateId", "()Ljava/lang/String;", "stateId", "Lcom/yandex/div2/DivBorder;", "getBorder", "()Lcom/yandex/div2/DivBorder;", "border", "SwipeListener", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivStateLayout extends FrameContainerLayout implements DivBorderSupports, ExpressionSubscriber, TransientView {

    /* renamed from: m, reason: from kotlin metadata */
    @Nullable
    public DivStatePath path;

    /* renamed from: n */
    @NotNull
    public final SwipeListener f32829n;

    /* renamed from: o */
    @NotNull
    public final GestureDetectorCompat f32830o;

    /* renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> swipeOutCallback;

    /* renamed from: q, reason: from kotlin metadata */
    @Nullable
    public DivState divState;

    /* renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Div activeStateDiv;

    /* renamed from: s, reason: from kotlin metadata */
    public boolean isTransient;

    /* renamed from: t */
    @Nullable
    public DivBorderDrawer f32835t;

    /* renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final List<Disposable> subscriptions;

    /* renamed from: v */
    public boolean f32837v;

    /* compiled from: DivStateLayout.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivStateLayout$SwipeListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class SwipeListener extends GestureDetector.SimpleOnGestureListener {
        public SwipeListener() {
        }

        /* renamed from: a */
        public final boolean m17102a(View view, float f2, float f3, int i2) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount() - 1;
                if (childCount >= 0) {
                    while (true) {
                        int i3 = childCount - 1;
                        View childAt = viewGroup.getChildAt(childCount);
                        if (f2 >= childAt.getLeft() && f2 < childAt.getRight() && f3 >= childAt.getTop() && f3 < childAt.getBottom() && m17102a(childAt, f2 - childAt.getLeft(), f3 - childAt.getTop(), i2)) {
                            return true;
                        }
                        if (i3 < 0) {
                            break;
                        }
                        childCount = i3;
                    }
                }
            }
            return view.canScrollHorizontally(i2);
        }

        /* renamed from: b */
        public final boolean m17103b() {
            View m17104c = m17104c();
            return !((m17104c == null ? 0.0f : m17104c.getTranslationX()) == 0.0f);
        }

        /* renamed from: c */
        public final View m17104c() {
            if (DivStateLayout.this.getChildCount() > 0) {
                return DivStateLayout.this.getChildAt(0);
            }
            return null;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(@NotNull MotionEvent e2) {
            Intrinsics.m32179h(e2, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@NotNull MotionEvent e1, @NotNull MotionEvent e2, float f2, float f3) {
            Intrinsics.m32179h(e1, "e1");
            Intrinsics.m32179h(e2, "e2");
            View m17104c = m17104c();
            if (m17104c == null) {
                return false;
            }
            int signum = (int) Math.signum(f2);
            if (m17104c.getTranslationX() == 0.0f) {
                if (Math.abs(f2) > Math.abs(f3) * 2 && m17102a(m17104c, e1.getX(), e1.getY(), signum)) {
                    return false;
                }
            }
            m17104c.setTranslationX(MathUtils.m1933a(m17104c.getTranslationX() - f2, -m17104c.getWidth(), m17104c.getWidth()));
            return !(m17104c.getTranslationX() == 0.0f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DivStateLayout(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r3 = 0
            r5 = r5 & 4
            if (r5 == 0) goto L6
            r4 = 0
        L6:
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.m32179h(r2, r5)
            r1.<init>(r2, r3, r4)
            com.yandex.div.core.view2.divs.widgets.DivStateLayout$SwipeListener r3 = new com.yandex.div.core.view2.divs.widgets.DivStateLayout$SwipeListener
            r3.<init>()
            r1.f32829n = r3
            androidx.core.view.GestureDetectorCompat r4 = new androidx.core.view.GestureDetectorCompat
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>(r0)
            r4.<init>(r2, r3, r5)
            r1.f32830o = r4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.subscriptions = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.DivStateLayout.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    /* renamed from: a */
    public void mo17098a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        this.f32835t = BaseDivViewExtensionsKt.m16944d0(this, divBorder, resolver);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    /* renamed from: c, reason: from getter */
    public boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (super.canScrollHorizontally(i2)) {
            return true;
        }
        if (getChildCount() < 1 || this.swipeOutCallback == null) {
            return super.canScrollHorizontally(i2);
        }
        View childAt = getChildAt(0);
        if (i2 < 0) {
            if (childAt.getTranslationX() <= childAt.getWidth()) {
                return true;
            }
        } else if ((-childAt.getTranslationX()) <= childAt.getWidth()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        BaseDivViewExtensionsKt.m16963w(this, canvas);
        if (this.f32837v) {
            super.dispatchDraw(canvas);
            return;
        }
        DivBorderDrawer divBorderDrawer = this.f32835t;
        if (divBorderDrawer == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.m17087c(canvas);
            super.dispatchDraw(canvas);
            divBorderDrawer.m17088d(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        this.f32837v = true;
        DivBorderDrawer divBorderDrawer = this.f32835t;
        if (divBorderDrawer != null) {
            int save = canvas.save();
            try {
                divBorderDrawer.m17087c(canvas);
                super.draw(canvas);
                divBorderDrawer.m17088d(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            super.draw(canvas);
        }
        this.f32837v = false;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Nullable
    /* renamed from: getActiveStateDiv$div_release, reason: from getter */
    public final Div getActiveStateDiv() {
        return this.activeStateDiv;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorder getBorder() {
        DivBorderDrawer divBorderDrawer = this.f32835t;
        if (divBorderDrawer == null) {
            return null;
        }
        return divBorderDrawer.f32716e;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getF32790w() {
        return this.f32835t;
    }

    @Nullable
    /* renamed from: getDivState$div_release, reason: from getter */
    public final DivState getDivState() {
        return this.divState;
    }

    @Nullable
    public final DivStatePath getPath() {
        return this.path;
    }

    @Nullable
    public final String getStateId() {
        DivStatePath divStatePath = this.path;
        if (divStatePath == null) {
            return null;
        }
        return divStatePath.m16716a();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @Nullable
    public final Function0<Unit> getSwipeOutCallback() {
        return this.swipeOutCallback;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: h */
    public /* synthetic */ void mo16764h() {
        C6855a.m34406b(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.m32179h(event, "event");
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return false;
        }
        this.f32830o.m2082a(event);
        requestDisallowInterceptTouchEvent(this.f32829n.m17103b());
        if (this.f32829n.m17103b()) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        DivBorderDrawer divBorderDrawer = this.f32835t;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.m17093k();
        divBorderDrawer.m17092j();
    }

    @Override // android.view.View
    @SuppressLint
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        SwipeListener swipeListener;
        View m17104c;
        float abs;
        AnimatorListenerAdapter animatorListenerAdapter;
        float f2;
        Intrinsics.m32179h(event, "event");
        if (this.swipeOutCallback == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.onTouchEvent(event);
        }
        if ((event.getAction() == 1 || event.getAction() == 3) && (m17104c = (swipeListener = this.f32829n).m17104c()) != null) {
            if (Math.abs(m17104c.getTranslationX()) > m17104c.getWidth() / 2) {
                abs = (Math.abs(m17104c.getWidth() - m17104c.getTranslationX()) * 300.0f) / m17104c.getWidth();
                f2 = Math.signum(m17104c.getTranslationX()) * m17104c.getWidth();
                final DivStateLayout divStateLayout = DivStateLayout.this;
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.yandex.div.core.view2.divs.widgets.DivStateLayout$SwipeListener$finishSwipe$1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(@NotNull Animator animation) {
                        Intrinsics.m32179h(animation, "animation");
                        Function0<Unit> swipeOutCallback = DivStateLayout.this.getSwipeOutCallback();
                        if (swipeOutCallback == null) {
                            return;
                        }
                        swipeOutCallback.invoke();
                    }
                };
            } else {
                abs = (Math.abs(m17104c.getTranslationX()) * 300.0f) / m17104c.getWidth();
                animatorListenerAdapter = null;
                f2 = 0.0f;
            }
            m17104c.animate().cancel();
            m17104c.animate().setDuration((long) MathUtils.m1933a(abs, 0.0f, 300.0f)).translationX(f2).setListener(animatorListenerAdapter).start();
        }
        if (this.f32830o.m2082a(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
        DivBorderDrawer divBorderDrawer = this.f32835t;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.mo16764h();
    }

    public final void setActiveStateDiv$div_release(@Nullable Div div) {
        this.activeStateDiv = div;
    }

    public final void setDivState$div_release(@Nullable DivState divState) {
        this.divState = divState;
    }

    public final void setPath(@Nullable DivStatePath divStatePath) {
        this.path = divStatePath;
    }

    public final void setSwipeOutCallback(@Nullable Function0<Unit> function0) {
        this.swipeOutCallback = function0;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void setTransient(boolean z) {
        this.isTransient = z;
        invalidate();
    }
}
