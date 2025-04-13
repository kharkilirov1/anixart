package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.text.DivTextRangesBackgroundHelper;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.SuperLineHeightTextView;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivLineHeightTextView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "Lcom/yandex/div/internal/widget/SuperLineHeightTextView;", "Lcom/yandex/div/core/view2/divs/widgets/DivAnimator;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/TransientView;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "Lcom/yandex/div2/DivText;", "w", "Lcom/yandex/div2/DivText;", "getDiv$div_release", "()Lcom/yandex/div2/DivText;", "setDiv$div_release", "(Lcom/yandex/div2/DivText;)V", "div", "Lcom/yandex/div/core/widget/AdaptiveMaxLines;", "x", "Lcom/yandex/div/core/widget/AdaptiveMaxLines;", "getAdaptiveMaxLines$div_release", "()Lcom/yandex/div/core/widget/AdaptiveMaxLines;", "setAdaptiveMaxLines$div_release", "(Lcom/yandex/div/core/widget/AdaptiveMaxLines;)V", "adaptiveMaxLines", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;", "y", "Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;", "getTextRoundedBgHelper$div_release", "()Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;", "setTextRoundedBgHelper$div_release", "(Lcom/yandex/div/core/util/text/DivTextRangesBackgroundHelper;)V", "textRoundedBgHelper", "", "z", "J", "getAnimationStartDelay$div_release", "()J", "setAnimationStartDelay$div_release", "(J)V", "animationStartDelay", "", "value", "B", "Z", "c", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/Disposable;", "C", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/DivBorder;", "getBorder", "()Lcom/yandex/div2/DivBorder;", "border", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivLineHeightTextView extends SuperLineHeightTextView implements DivAnimator, DivBorderSupports, TransientView, ExpressionSubscriber {

    /* renamed from: A */
    @Nullable
    public DivBorderDrawer f32781A;

    /* renamed from: B, reason: from kotlin metadata */
    public boolean isTransient;

    /* renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final List<Disposable> subscriptions;

    /* renamed from: D */
    public boolean f32784D;

    /* renamed from: w, reason: from kotlin metadata */
    @Nullable
    public DivText div;

    /* renamed from: x, reason: from kotlin metadata */
    @Nullable
    public AdaptiveMaxLines adaptiveMaxLines;

    /* renamed from: y, reason: from kotlin metadata */
    @Nullable
    public DivTextRangesBackgroundHelper textRoundedBgHelper;

    /* renamed from: z, reason: from kotlin metadata */
    public long animationStartDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DivLineHeightTextView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
        /*
            r0 = this;
            r2 = 0
            r4 = r4 & 4
            if (r4 == 0) goto L8
            r3 = 2130968988(0x7f04019c, float:1.7546645E38)
        L8:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.m32179h(r1, r4)
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.subscriptions = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    /* renamed from: a */
    public void mo17098a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        this.f32781A = BaseDivViewExtensionsKt.m16944d0(this, divBorder, resolver);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    /* renamed from: c, reason: from getter */
    public boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        if (this.f32784D) {
            super.dispatchDraw(canvas);
            return;
        }
        DivBorderDrawer divBorderDrawer = this.f32781A;
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
        this.f32784D = true;
        DivBorderDrawer divBorderDrawer = this.f32781A;
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
        this.f32784D = false;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Nullable
    /* renamed from: getAdaptiveMaxLines$div_release, reason: from getter */
    public AdaptiveMaxLines getAdaptiveMaxLines() {
        return this.adaptiveMaxLines;
    }

    /* renamed from: getAnimationStartDelay$div_release, reason: from getter */
    public long getAnimationStartDelay() {
        return this.animationStartDelay;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorder getBorder() {
        DivBorderDrawer divBorderDrawer = this.f32781A;
        if (divBorderDrawer == null) {
            return null;
        }
        return divBorderDrawer.f32716e;
    }

    @Nullable
    /* renamed from: getDiv$div_release, reason: from getter */
    public DivText getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getF32790w() {
        return this.f32781A;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    @Nullable
    /* renamed from: getTextRoundedBgHelper$div_release, reason: from getter */
    public DivTextRangesBackgroundHelper getTextRoundedBgHelper() {
        return this.textRoundedBgHelper;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: h */
    public /* synthetic */ void mo16764h() {
        C6855a.m34406b(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        if ((getText() instanceof Spanned) && getLayout() != null) {
            boolean z = false;
            if (getTextRoundedBgHelper() != null && (!r0.f31506c.isEmpty())) {
                z = true;
            }
            if (z) {
                float totalPaddingLeft = getTotalPaddingLeft();
                float totalPaddingTop = getTotalPaddingTop();
                int save = canvas.save();
                canvas.translate(totalPaddingLeft, totalPaddingTop);
                try {
                    DivTextRangesBackgroundHelper textRoundedBgHelper = getTextRoundedBgHelper();
                    if (textRoundedBgHelper != null) {
                        Spanned spanned = (Spanned) getText();
                        Layout layout = getLayout();
                        Intrinsics.m32178g(layout, "layout");
                        textRoundedBgHelper.m16790a(canvas, spanned, layout);
                    }
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        DivBorderDrawer divBorderDrawer = this.f32781A;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.m17093k();
        divBorderDrawer.m17092j();
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
        DivBorderDrawer divBorderDrawer = this.f32781A;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.mo16764h();
    }

    @Override // android.view.View
    public void requestLayout() {
        super.requestLayout();
    }

    public void setAdaptiveMaxLines$div_release(@Nullable AdaptiveMaxLines adaptiveMaxLines) {
        this.adaptiveMaxLines = adaptiveMaxLines;
    }

    public void setAnimationStartDelay$div_release(long j2) {
        this.animationStartDelay = j2;
    }

    public void setDiv$div_release(@Nullable DivText divText) {
        this.div = divText;
    }

    public void setTextRoundedBgHelper$div_release(@Nullable DivTextRangesBackgroundHelper divTextRangesBackgroundHelper) {
        this.textRoundedBgHelper = divTextRangesBackgroundHelper;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void setTransient(boolean z) {
        this.isTransient = z;
        invalidate();
    }
}
