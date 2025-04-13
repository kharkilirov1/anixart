package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.PagerSnapStartHelper;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import com.yandex.div.internal.widget.OnInterceptTouchEventListenerHost;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivGallery;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivRecyclerView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivRecyclerView;", "Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListenerHost;", "Lcom/yandex/div/internal/widget/TransientView;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "", "value", "K0", "Z", "c", "()Z", "setTransient", "(Z)V", "isTransient", "Lcom/yandex/div2/DivGallery;", "L0", "Lcom/yandex/div2/DivGallery;", "getDiv", "()Lcom/yandex/div2/DivGallery;", "setDiv", "(Lcom/yandex/div2/DivGallery;)V", "div", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "M0", "Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "getOnInterceptTouchEventListener", "()Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;", "setOnInterceptTouchEventListener", "(Lcom/yandex/div/internal/widget/OnInterceptTouchEventListener;)V", "onInterceptTouchEventListener", "Lcom/yandex/div/core/view2/divs/PagerSnapStartHelper;", "N0", "Lcom/yandex/div/core/view2/divs/PagerSnapStartHelper;", "getPagerSnapStartHelper", "()Lcom/yandex/div/core/view2/divs/PagerSnapStartHelper;", "setPagerSnapStartHelper", "(Lcom/yandex/div/core/view2/divs/PagerSnapStartHelper;)V", "pagerSnapStartHelper", "", "Lcom/yandex/div/core/Disposable;", "O0", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/DivBorder;", "getBorder", "()Lcom/yandex/div2/DivBorder;", "border", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivRecyclerView extends BackHandlingRecyclerView implements DivBorderSupports, OnInterceptTouchEventListenerHost, TransientView, ExpressionSubscriber {

    /* renamed from: J0 */
    @Nullable
    public DivBorderDrawer f32805J0;

    /* renamed from: K0, reason: from kotlin metadata */
    public boolean isTransient;

    /* renamed from: L0, reason: from kotlin metadata */
    @Nullable
    public DivGallery div;

    /* renamed from: M0, reason: from kotlin metadata */
    @Nullable
    public OnInterceptTouchEventListener onInterceptTouchEventListener;

    /* renamed from: N0, reason: from kotlin metadata */
    @Nullable
    public PagerSnapStartHelper pagerSnapStartHelper;

    /* renamed from: O0, reason: from kotlin metadata */
    @NotNull
    public final List<Disposable> subscriptions;

    /* renamed from: P0 */
    public boolean f32811P0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DivRecyclerView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.DivRecyclerView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    /* renamed from: a */
    public void mo17098a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        this.f32805J0 = BaseDivViewExtensionsKt.m16944d0(this, divBorder, resolver);
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
        if (this.f32811P0) {
            super.dispatchDraw(canvas);
            return;
        }
        DivBorderDrawer divBorderDrawer = this.f32805J0;
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        this.f32811P0 = true;
        DivBorderDrawer divBorderDrawer = this.f32805J0;
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
        this.f32811P0 = false;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorder getBorder() {
        DivBorderDrawer divBorderDrawer = this.f32805J0;
        if (divBorderDrawer == null) {
            return null;
        }
        return divBorderDrawer.f32716e;
    }

    @Nullable
    public DivGallery getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getF32775l() {
        return this.f32805J0;
    }

    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    @Nullable
    public PagerSnapStartHelper getPagerSnapStartHelper() {
        return this.pagerSnapStartHelper;
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.m32179h(event, "event");
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        return (onInterceptTouchEventListener == null ? false : onInterceptTouchEventListener.mo17109a(this, event)) || super.onInterceptTouchEvent(event);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        DivBorderDrawer divBorderDrawer = this.f32805J0;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.m17093k();
        divBorderDrawer.m17092j();
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
        DivBorderDrawer divBorderDrawer = this.f32805J0;
        if (divBorderDrawer != null) {
            divBorderDrawer.mo16764h();
        }
        Object adapter = getAdapter();
        if (adapter instanceof Releasable) {
            ((Releasable) adapter).release();
        }
    }

    public void setDiv(@Nullable DivGallery divGallery) {
        this.div = divGallery;
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerSnapStartHelper(@Nullable PagerSnapStartHelper pagerSnapStartHelper) {
        this.pagerSnapStartHelper = pagerSnapStartHelper;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void setTransient(boolean z) {
        this.isTransient = z;
        invalidate();
    }
}
