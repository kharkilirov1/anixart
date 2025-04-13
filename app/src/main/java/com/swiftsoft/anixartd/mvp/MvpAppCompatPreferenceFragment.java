package com.swiftsoft.anixartd.mvp;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.PreferenceFragmentCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import moxy.MvpDelegate;
import moxy.MvpDelegateHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MvpAppCompatPreferenceFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/mvp/MvpAppCompatPreferenceFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "Lmoxy/MvpDelegateHolder;", "<init>", "()V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class MvpAppCompatPreferenceFragment extends PreferenceFragmentCompat implements MvpDelegateHolder {

    /* renamed from: j */
    public boolean f25770j;

    /* renamed from: k */
    @Nullable
    public MvpDelegate<? extends MvpAppCompatPreferenceFragment> f25771k;

    /* renamed from: l */
    @NotNull
    public Map<Integer, View> f25772l = new LinkedHashMap();

    /* renamed from: A3 */
    public void mo14168A3() {
        this.f25772l.clear();
    }

    @Override // moxy.MvpDelegateHolder
    @NotNull
    public MvpDelegate<?> getMvpDelegate() {
        if (this.f25771k == null) {
            this.f25771k = new MvpDelegate<>(this);
        }
        MvpDelegate<? extends MvpAppCompatPreferenceFragment> mvpDelegate = this.f25771k;
        Intrinsics.m32177f(mvpDelegate, "null cannot be cast to non-null type moxy.MvpDelegate<out com.swiftsoft.anixartd.mvp.MvpAppCompatPreferenceFragment>");
        return mvpDelegate;
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    /* renamed from: n3 */
    public void mo3417n3(@Nullable Bundle bundle, @Nullable String str) {
        getMvpDelegate().onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        FragmentActivity activity = getActivity();
        Intrinsics.m32176e(activity);
        if (activity.isFinishing()) {
            getMvpDelegate().onDestroy();
            return;
        }
        boolean z = false;
        if (this.f25770j) {
            this.f25770j = false;
            return;
        }
        for (Fragment parentFragment = getParentFragment(); !z && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            z = parentFragment.isRemoving();
        }
        if (isRemoving() || z) {
            getMvpDelegate().onDestroy();
        }
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getMvpDelegate().onDetach();
        getMvpDelegate().onDestroyView();
        mo14168A3();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f25770j = false;
        getMvpDelegate().onAttach();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        super.onSaveInstanceState(outState);
        this.f25770j = true;
        getMvpDelegate().onSaveInstanceState(outState);
        getMvpDelegate().onDetach();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f25770j = false;
        getMvpDelegate().onAttach();
    }

    @Override // androidx.preference.PreferenceFragmentCompat, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getMvpDelegate().onDetach();
    }
}
