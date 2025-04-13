package com.yandex.div.core.view2.backbutton;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BackKeyPressedHelper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/core/view2/backbutton/BackKeyPressedHelper;", "", "OnBackClickListener", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class BackKeyPressedHelper {

    /* renamed from: a */
    @NotNull
    public final View f31802a;

    /* renamed from: b */
    @Nullable
    public OnBackClickListener f31803b;

    /* compiled from: BackKeyPressedHelper.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/view2/backbutton/BackKeyPressedHelper$OnBackClickListener;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public interface OnBackClickListener {
        /* renamed from: a */
        boolean mo16798a();
    }

    public BackKeyPressedHelper(@NotNull View view) {
        this.f31802a = view;
    }

    /* renamed from: a */
    public final void m16910a() {
        View rootView;
        if (this.f31803b == null || !this.f31802a.hasWindowFocus()) {
            return;
        }
        View view = this.f31802a;
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        if (view.isShown()) {
            view.requestFocus();
        } else {
            if (!view.hasFocus() || (rootView = view.getRootView()) == null) {
                return;
            }
            rootView.requestFocus(33);
        }
    }
}
