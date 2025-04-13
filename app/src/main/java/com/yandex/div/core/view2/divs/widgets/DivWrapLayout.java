package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.wraplayout.WrapLayout;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivContainer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivWrapLayout.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivWrapLayout;", "Lcom/yandex/div/core/widget/wraplayout/WrapLayout;", "Lcom/yandex/div/core/view2/divs/widgets/DivAnimator;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/TransientView;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "Lcom/yandex/div2/DivContainer;", "q", "Lcom/yandex/div2/DivContainer;", "getDiv$div_release", "()Lcom/yandex/div2/DivContainer;", "setDiv$div_release", "(Lcom/yandex/div2/DivContainer;)V", "div", "", "value", "s", "Z", "c", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/Disposable;", "t", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/DivBorder;", "getBorder", "()Lcom/yandex/div2/DivBorder;", "border", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivWrapLayout extends WrapLayout implements DivAnimator, DivBorderSupports, TransientView, ExpressionSubscriber {

    /* renamed from: q, reason: from kotlin metadata */
    @Nullable
    public DivContainer div;

    /* renamed from: r */
    @Nullable
    public DivBorderDrawer f32846r;

    /* renamed from: s, reason: from kotlin metadata */
    public boolean isTransient;

    /* renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final List<Disposable> subscriptions;

    /* renamed from: u */
    public boolean f32849u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivWrapLayout(@NotNull Context context) {
        super(context);
        Intrinsics.m32179h(context, "context");
        this.subscriptions = new ArrayList();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    /* renamed from: a */
    public void mo17098a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        DivBorderDrawer divBorderDrawer = this.f32846r;
        DivBorderDrawer divBorderDrawer2 = null;
        if (Intrinsics.m32174c(divBorder, divBorderDrawer == null ? null : divBorderDrawer.f32716e)) {
            return;
        }
        DivBorderDrawer divBorderDrawer3 = this.f32846r;
        if (divBorderDrawer3 != null) {
            divBorderDrawer3.mo16764h();
        }
        if (divBorder != null) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Intrinsics.m32178g(displayMetrics, "resources.displayMetrics");
            divBorderDrawer2 = new DivBorderDrawer(displayMetrics, this, resolver, divBorder);
        }
        this.f32846r = divBorderDrawer2;
        invalidate();
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
        if (this.f32849u) {
            super.dispatchDraw(canvas);
            return;
        }
        DivBorderDrawer divBorderDrawer = this.f32846r;
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
        this.f32849u = true;
        DivBorderDrawer divBorderDrawer = this.f32846r;
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
        this.f32849u = false;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorder getBorder() {
        DivBorderDrawer divBorderDrawer = this.f32846r;
        if (divBorderDrawer == null) {
            return null;
        }
        return divBorderDrawer.f32716e;
    }

    @Nullable
    /* renamed from: getDiv$div_release, reason: from getter */
    public final DivContainer getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getF32790w() {
        return this.f32846r;
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

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        DivBorderDrawer divBorderDrawer = this.f32846r;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.m17093k();
        divBorderDrawer.m17092j();
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
        DivBorderDrawer divBorderDrawer = this.f32846r;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.mo16764h();
    }

    public final void setDiv$div_release(@Nullable DivContainer divContainer) {
        this.div = divContainer;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void setTransient(boolean z) {
        this.isTransient = z;
        invalidate();
    }
}
