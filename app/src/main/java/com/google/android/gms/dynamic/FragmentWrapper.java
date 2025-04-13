package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IFragmentWrapper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
@SuppressLint
/* loaded from: classes.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: a */
    public Fragment f15953a;

    public FragmentWrapper(Fragment fragment) {
        this.f15953a = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @NonNull
    /* renamed from: B */
    public final IObjectWrapper mo8257B() {
        return new ObjectWrapper(this.f15953a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: C */
    public final boolean mo8258C() {
        return this.f15953a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: D */
    public final boolean mo8259D() {
        return this.f15953a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: D0 */
    public final boolean mo8260D0() {
        return this.f15953a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: D1 */
    public final void mo8261D1(@NonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m8284t(iObjectWrapper);
        Fragment fragment = this.f15953a;
        Objects.requireNonNull(view, "null reference");
        fragment.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: E */
    public final boolean mo8262E() {
        return this.f15953a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: F */
    public final boolean mo8263F() {
        return this.f15953a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: F0 */
    public final void mo8264F0(@NonNull Intent intent, int i2) {
        this.f15953a.startActivityForResult(intent, i2);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: G */
    public final void mo8265G(boolean z) {
        this.f15953a.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: L */
    public final boolean mo8266L() {
        return this.f15953a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: L1 */
    public final boolean mo8267L1() {
        return this.f15953a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: Q */
    public final void mo8268Q(boolean z) {
        this.f15953a.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: T0 */
    public final boolean mo8269T0() {
        return this.f15953a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    /* renamed from: X1 */
    public final String mo8270X1() {
        return this.f15953a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: a0 */
    public final boolean mo8271a0() {
        return this.f15953a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    /* renamed from: j */
    public final IFragmentWrapper mo8272j() {
        Fragment parentFragment = this.f15953a.getParentFragment();
        if (parentFragment != null) {
            return new FragmentWrapper(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @NonNull
    /* renamed from: k */
    public final IObjectWrapper mo8273k() {
        return new ObjectWrapper(this.f15953a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    /* renamed from: l */
    public final IFragmentWrapper mo8274l() {
        Fragment targetFragment = this.f15953a.getTargetFragment();
        if (targetFragment != null) {
            return new FragmentWrapper(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @NonNull
    /* renamed from: m0 */
    public final IObjectWrapper mo8275m0() {
        return new ObjectWrapper(this.f15953a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: m2 */
    public final void mo8276m2(boolean z) {
        this.f15953a.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: o0 */
    public final void mo8277o0(boolean z) {
        this.f15953a.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: u1 */
    public final void mo8278u1(@NonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m8284t(iObjectWrapper);
        Fragment fragment = this.f15953a;
        Objects.requireNonNull(view, "null reference");
        fragment.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: v */
    public final int mo8279v() {
        return this.f15953a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: w */
    public final int mo8280w() {
        return this.f15953a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    /* renamed from: x */
    public final Bundle mo8281x() {
        return this.f15953a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: x0 */
    public final void mo8282x0(@NonNull Intent intent) {
        this.f15953a.startActivity(intent);
    }
}
