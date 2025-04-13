package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Canvas;
import android.net.Uri;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivGifImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivGifImageView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivGifImageView;", "Lcom/yandex/div/core/widget/LoadableImageView;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/TransientView;", "Lcom/yandex/div/core/widget/DivExtendableView;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "Lcom/yandex/div2/DivGifImage;", "p", "Lcom/yandex/div2/DivGifImage;", "getDiv$div_release", "()Lcom/yandex/div2/DivGifImage;", "setDiv$div_release", "(Lcom/yandex/div2/DivGifImage;)V", "div", "Landroid/net/Uri;", "q", "Landroid/net/Uri;", "getGifUrl$div_release", "()Landroid/net/Uri;", "setGifUrl$div_release", "(Landroid/net/Uri;)V", "gifUrl", "", "value", "s", "Z", "c", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/Disposable;", "t", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/DivBorder;", "getBorder", "()Lcom/yandex/div2/DivBorder;", "border", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivGifImageView extends LoadableImageView implements DivBorderSupports, TransientView, ExpressionSubscriber {

    /* renamed from: p, reason: from kotlin metadata */
    @Nullable
    public DivGifImage div;

    /* renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Uri gifUrl;

    /* renamed from: r */
    @Nullable
    public DivBorderDrawer f32757r;

    /* renamed from: s, reason: from kotlin metadata */
    public boolean isTransient;

    /* renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final List<Disposable> subscriptions;

    /* renamed from: u */
    public boolean f32760u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DivGifImageView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
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
            r1 = 1
            r0.setCropToPadding(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.DivGifImageView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    /* renamed from: a */
    public void mo17098a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        this.f32757r = BaseDivViewExtensionsKt.m16944d0(this, divBorder, resolver);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    /* renamed from: c, reason: from getter */
    public boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        if (this.f32760u) {
            super.dispatchDraw(canvas);
            return;
        }
        DivBorderDrawer divBorderDrawer = this.f32757r;
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
        this.f32760u = true;
        DivBorderDrawer divBorderDrawer = this.f32757r;
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
        this.f32760u = false;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorder getBorder() {
        DivBorderDrawer divBorderDrawer = this.f32757r;
        if (divBorderDrawer == null) {
            return null;
        }
        return divBorderDrawer.f32716e;
    }

    @Nullable
    /* renamed from: getDiv$div_release, reason: from getter */
    public final DivGifImage getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getF34298h() {
        return this.f32757r;
    }

    @Nullable
    /* renamed from: getGifUrl$div_release, reason: from getter */
    public final Uri getGifUrl() {
        return this.gifUrl;
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

    @Override // com.yandex.div.core.widget.LoadableImageView
    /* renamed from: l */
    public void mo17100l() {
        super.mo17100l();
        this.gifUrl = null;
    }

    @Override // com.yandex.div.internal.widget.AspectImageView, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        DivBorderDrawer divBorderDrawer = this.f32757r;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.m17093k();
        divBorderDrawer.m17092j();
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
        DivBorderDrawer divBorderDrawer = this.f32757r;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.mo16764h();
    }

    public final void setDiv$div_release(@Nullable DivGifImage divGifImage) {
        this.div = divGifImage;
    }

    public final void setGifUrl$div_release(@Nullable Uri uri) {
        this.gifUrl = uri;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void setTransient(boolean z) {
        this.isTransient = z;
        invalidate();
    }
}
