package com.yandex.div.core.view2.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BackHandlingRecyclerView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div/core/view2/backbutton/BackHandlingRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/yandex/div/core/view2/backbutton/BackHandlingView;", "Lcom/yandex/div/core/view2/backbutton/BackKeyPressedHelper$OnBackClickListener;", "listener", "", "setOnBackClickListener", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class BackHandlingRecyclerView extends RecyclerView implements BackHandlingView {

    /* renamed from: I0 */
    @NotNull
    public final BackKeyPressedHelper f31801I0;

    public BackHandlingRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f31801I0 = new BackKeyPressedHelper(this);
    }

    @Override // android.view.View
    @CallSuper
    public boolean onKeyPreIme(int i2, @NotNull KeyEvent event) {
        boolean z;
        Intrinsics.m32179h(event, "event");
        BackKeyPressedHelper backKeyPressedHelper = this.f31801I0;
        Objects.requireNonNull(backKeyPressedHelper);
        if (backKeyPressedHelper.f31803b != null && i2 == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = backKeyPressedHelper.f31802a.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(event, backKeyPressedHelper);
                }
                z = true;
            } else if (event.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = backKeyPressedHelper.f31802a.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(event);
                }
                if (event.isTracking() && !event.isCanceled()) {
                    BackKeyPressedHelper.OnBackClickListener onBackClickListener = backKeyPressedHelper.f31803b;
                    Intrinsics.m32176e(onBackClickListener);
                    z = onBackClickListener.mo16798a();
                }
            }
            return z || super.onKeyPreIme(i2, event);
        }
        z = false;
        if (z) {
            return true;
        }
    }

    @Override // android.view.View
    @CallSuper
    public void onVisibilityChanged(@NotNull View changedView, int i2) {
        Intrinsics.m32179h(changedView, "changedView");
        this.f31801I0.m16910a();
    }

    @Override // android.view.View
    @CallSuper
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        BackKeyPressedHelper backKeyPressedHelper = this.f31801I0;
        Objects.requireNonNull(backKeyPressedHelper);
        if (z) {
            backKeyPressedHelper.m16910a();
        }
    }

    public void setOnBackClickListener(@Nullable BackKeyPressedHelper.OnBackClickListener listener) {
        setDescendantFocusability(listener != null ? 131072 : PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        BackKeyPressedHelper backKeyPressedHelper = this.f31801I0;
        backKeyPressedHelper.f31803b = listener;
        backKeyPressedHelper.m16910a();
    }
}
