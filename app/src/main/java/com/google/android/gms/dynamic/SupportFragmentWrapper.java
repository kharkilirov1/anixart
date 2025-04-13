package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IFragmentWrapper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: a */
    public Fragment f15957a;

    public SupportFragmentWrapper(Fragment fragment) {
        this.f15957a = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @NonNull
    /* renamed from: B */
    public final IObjectWrapper mo8257B() {
        return new ObjectWrapper(this.f15957a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: C */
    public final boolean mo8258C() {
        return this.f15957a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: D */
    public final boolean mo8259D() {
        return this.f15957a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: D0 */
    public final boolean mo8260D0() {
        return this.f15957a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: D1 */
    public final void mo8261D1(@NonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m8284t(iObjectWrapper);
        Fragment fragment = this.f15957a;
        Objects.requireNonNull(view, "null reference");
        fragment.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: E */
    public final boolean mo8262E() {
        return this.f15957a.isVisible();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: F */
    public final boolean mo8263F() {
        return this.f15957a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: F0 */
    public final void mo8264F0(@NonNull Intent intent, int i2) {
        this.f15957a.startActivityForResult(intent, i2);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: G */
    public final void mo8265G(boolean z) {
        this.f15957a.setHasOptionsMenu(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: L */
    public final boolean mo8266L() {
        return this.f15957a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: L1 */
    public final boolean mo8267L1() {
        return this.f15957a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: Q */
    public final void mo8268Q(boolean z) {
        this.f15957a.setMenuVisibility(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: T0 */
    public final boolean mo8269T0() {
        return this.f15957a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    /* renamed from: X1 */
    public final String mo8270X1() {
        return this.f15957a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: a0 */
    public final boolean mo8271a0() {
        return this.f15957a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    /* renamed from: j */
    public final IFragmentWrapper mo8272j() {
        Fragment parentFragment = this.f15957a.getParentFragment();
        if (parentFragment != null) {
            return new SupportFragmentWrapper(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @NonNull
    /* renamed from: k */
    public final IObjectWrapper mo8273k() {
        return new ObjectWrapper(this.f15957a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    /* renamed from: l */
    public final IFragmentWrapper mo8274l() {
        Fragment targetFragment = this.f15957a.getTargetFragment();
        if (targetFragment != null) {
            return new SupportFragmentWrapper(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @NonNull
    /* renamed from: m0 */
    public final IObjectWrapper mo8275m0() {
        return new ObjectWrapper(this.f15957a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: m2 */
    public final void mo8276m2(boolean z) {
        this.f15957a.setUserVisibleHint(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: o0 */
    public final void mo8277o0(boolean z) {
        this.f15957a.setRetainInstance(z);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: u1 */
    public final void mo8278u1(@NonNull IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.m8284t(iObjectWrapper);
        Fragment fragment = this.f15957a;
        Objects.requireNonNull(view, "null reference");
        fragment.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: v */
    public final int mo8279v() {
        return this.f15957a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: w */
    public final int mo8280w() {
        return this.f15957a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    @Nullable
    /* renamed from: x */
    public final Bundle mo8281x() {
        return this.f15957a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    /* renamed from: x0 */
    public final void mo8282x0(@NonNull Intent intent) {
        this.f15957a.startActivity(intent);
    }
}
