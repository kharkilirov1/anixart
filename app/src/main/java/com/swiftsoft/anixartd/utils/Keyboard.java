package com.swiftsoft.anixartd.utils;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Keyboard.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Keyboard;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Keyboard {

    /* renamed from: a */
    @NotNull
    public static final Keyboard f30166a = new Keyboard();

    /* renamed from: a */
    public final void m16340a(@NotNull Fragment fragment) {
        View findViewById;
        Intrinsics.m32179h(fragment, "fragment");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || (findViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(findViewById.getWindowToken(), 0);
    }
}
