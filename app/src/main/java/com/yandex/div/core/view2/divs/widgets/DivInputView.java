package com.yandex.div.core.view2.divs.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextWatcher;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.SuperLineHeightEditText;
import com.yandex.div.internal.widget.TransientView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivInput;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p035l.C6855a;

/* compiled from: DivInputView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001e\u0010\f\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/DivInputView;", "Lcom/yandex/div/internal/widget/SuperLineHeightEditText;", "Lcom/yandex/div/core/view2/divs/widgets/DivAnimator;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "Lcom/yandex/div/internal/widget/TransientView;", "Lcom/yandex/div/internal/core/ExpressionSubscriber;", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderDrawer;", "getDivBorderDrawer", "Lkotlin/Function1;", "Landroid/text/Editable;", "", "action", "setBoundVariableChangeAction", "Lcom/yandex/div2/DivInput;", "k", "Lcom/yandex/div2/DivInput;", "getDiv$div_release", "()Lcom/yandex/div2/DivInput;", "setDiv$div_release", "(Lcom/yandex/div2/DivInput;)V", "div", "", "value", "m", "Z", "c", "()Z", "setTransient", "(Z)V", "isTransient", "", "Lcom/yandex/div/core/Disposable;", "n", "Ljava/util/List;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Lcom/yandex/div2/DivBorder;", "getBorder", "()Lcom/yandex/div2/DivBorder;", "border", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivInputView extends SuperLineHeightEditText implements DivAnimator, DivBorderSupports, TransientView, ExpressionSubscriber {

    /* renamed from: k, reason: from kotlin metadata */
    @Nullable
    public DivInput div;

    /* renamed from: l */
    @Nullable
    public DivBorderDrawer f32775l;

    /* renamed from: m, reason: from kotlin metadata */
    public boolean isTransient;

    /* renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final List<Disposable> subscriptions;

    /* renamed from: o */
    public boolean f32778o;

    /* renamed from: p */
    @Nullable
    public TextWatcher f32779p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivInputView(@NotNull Context context) {
        super(context);
        Intrinsics.m32179h(context, "context");
        this.subscriptions = new ArrayList();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    /* renamed from: a */
    public void mo17098a(@Nullable DivBorder divBorder, @NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        this.f32775l = BaseDivViewExtensionsKt.m16944d0(this, divBorder, resolver);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    /* renamed from: c, reason: from getter */
    public boolean getIsTransient() {
        return this.isTransient;
    }

    @Override // android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        if (this.f32778o) {
            super.dispatchDraw(canvas);
            return;
        }
        DivBorderDrawer divBorderDrawer = this.f32775l;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if (divBorderDrawer == null) {
            super.dispatchDraw(canvas);
            return;
        }
        float f2 = scrollX;
        float f3 = scrollY;
        int save = canvas.save();
        try {
            canvas.translate(f2, f3);
            divBorderDrawer.m17087c(canvas);
            canvas.translate(-f2, -f3);
            super.dispatchDraw(canvas);
            canvas.translate(f2, f3);
            divBorderDrawer.m17088d(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.m32179h(canvas, "canvas");
        this.f32778o = true;
        DivBorderDrawer divBorderDrawer = this.f32775l;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if (divBorderDrawer == null) {
            super.draw(canvas);
        } else {
            float f2 = scrollX;
            float f3 = scrollY;
            int save = canvas.save();
            try {
                canvas.translate(f2, f3);
                divBorderDrawer.m17087c(canvas);
                canvas.translate(-f2, -f3);
                super.draw(canvas);
                canvas.translate(f2, f3);
                divBorderDrawer.m17088d(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        this.f32778o = false;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    /* renamed from: e */
    public /* synthetic */ void mo16763e(Disposable disposable) {
        C6855a.m34405a(this, disposable);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorder getBorder() {
        DivBorderDrawer divBorderDrawer = this.f32775l;
        if (divBorderDrawer == null) {
            return null;
        }
        return divBorderDrawer.f32716e;
    }

    @Nullable
    /* renamed from: getDiv$div_release, reason: from getter */
    public DivInput getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    /* renamed from: getDivBorderDrawer, reason: from getter */
    public DivBorderDrawer getF34298h() {
        return this.f32775l;
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
        DivBorderDrawer divBorderDrawer = this.f32775l;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.m17093k();
        divBorderDrawer.m17092j();
    }

    @Override // com.yandex.div.core.view2.Releasable
    public void release() {
        mo16764h();
        DivBorderDrawer divBorderDrawer = this.f32775l;
        if (divBorderDrawer == null) {
            return;
        }
        divBorderDrawer.mo16764h();
    }

    public void setBoundVariableChangeAction(@NotNull final Function1<? super Editable, Unit> action) {
        Intrinsics.m32179h(action, "action");
        TextWatcher textWatcher = new TextWatcher() { // from class: com.yandex.div.core.view2.divs.widgets.DivInputView$setBoundVariableChangeAction$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                Function1.this.invoke(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }
        };
        addTextChangedListener(textWatcher);
        this.f32779p = textWatcher;
    }

    public void setDiv$div_release(@Nullable DivInput divInput) {
        this.div = divInput;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void setTransient(boolean z) {
        this.isTransient = z;
        invalidate();
    }
}
