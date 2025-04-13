package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.ViewPager2Wrapper;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivPager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivPagerView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\t\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010,\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020'8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u00100\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivPagerView;", "Lcom/yandex/div/core/widget/ViewPager2Wrapper;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListenerHost;", "Lcom/yandex/div/internal/widget/TransientView;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "Lcom/yandex/div2/DivPager;", "c", "Lcom/yandex/div2/DivPager;", "getDiv$div_release", "()Lcom/yandex/div2/DivPager;", "setDiv$div_release", "(Lcom/yandex/div2/DivPager;)V", "div", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "d", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "getOnInterceptTouchEventListener", "()Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "setOnInterceptTouchEventListener", "(Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;)V", "onInterceptTouchEventListener", "", "value", "f", "Z", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/Disposable;", "g", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "", "getCurrentItem$div_release", "()I", "setCurrentItem$div_release", "(I)V", "currentItem", "Lcom/yandex/div2/DivBorder;", "getBorder", "()Lcom/yandex/div2/DivBorder;", "border", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPagerView extends ViewPager2Wrapper implements DivBorderSupports, OnInterceptTouchEventListenerHost, TransientView, ExpressionSubscriber {

    /* renamed from: c, reason: from kotlin metadata */
    @Nullable
    public DivPager div;

    /* renamed from: d, reason: from kotlin metadata */
    @Nullable
    public OnInterceptTouchEventListener onInterceptTouchEventListener;

    /* renamed from: e */
    @Nullable
    public DivBorderDrawer f32801e;

    /* renamed from: f, reason: from kotlin metadata */
    public boolean isTransient;

    /* renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final List<Disposable> subscriptions;

    /* renamed from: h */
    public boolean f32804h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DivPagerView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
        /*
            r0 = this;
            r2 = 0
            r4 = r4 & 4
            if (r4 == 0) goto L6
            r3 = 0
        L6:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.m32179h(r1, r4)
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.subscriptions = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.DivPagerView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    /* renamed from: a */
    public void mo17098a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        this.f32801e = BaseDivViewExtensionsKt.m16944d0(this, divBorder, resolver);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    /* renamed from: c, reason: from getter */
    public boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        BaseDivViewExtensionsKt.m16963w(this, canvas);
        if (this.f32804h) {
            super.dispatchDraw(canvas);
            return;
        }
        DivBorderDrawer divBorderDrawer = this.f32801e;
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
        this.f32804h = true;
        DivBorderDrawer divBorderDrawer = this.f32801e;
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
        this.f32804h = false;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorder getBorder() {
        DivBorderDrawer divBorderDrawer = this.f32801e;
        if (divBorderDrawer == null) {
            return null;
        }
        return divBorderDrawer.f32716e;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    @Nullable
    /* renamed from: getDiv$div_release, reason: from getter */
    public DivPager getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getF32775l() {
        return this.f32801e;
    }

    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: h */
    public /* synthetic */ void mo16764h() {
        C6855a.m34406b(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.m32179h(event, "event");
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        return (onInterceptTouchEventListener == null ? false : onInterceptTouchEventListener.mo17109a(this, event)) || super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        DivBorderDrawer divBorderDrawer = this.f32801e;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.m17093k();
        divBorderDrawer.m17092j();
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
        DivBorderDrawer divBorderDrawer = this.f32801e;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.mo16764h();
    }

    public void setCurrentItem$div_release(int i2) {
        getViewPager().m4391e(i2, false);
    }

    public void setDiv$div_release(@Nullable DivPager divPager) {
        this.div = divPager;
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void setTransient(boolean z) {
        this.isTransient = z;
        invalidate();
    }
}
