package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: b */
    @NonNull
    @KeepForSdk
    public final LifecycleFragment f15430b;

    @KeepForSdk
    public LifecycleCallback(@NonNull LifecycleFragment lifecycleFragment) {
        this.f15430b = lifecycleFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r3 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r3 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L37;
     */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.api.internal.LifecycleFragment m7993c(@androidx.annotation.NonNull android.app.Activity r6) {
        /*
            com.google.android.gms.common.api.internal.LifecycleActivity r0 = new com.google.android.gms.common.api.internal.LifecycleActivity
            r0.<init>(r6)
            java.lang.Object r6 = r0.f15429a
            boolean r0 = r6 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L5a
            androidx.fragment.app.FragmentActivity r6 = (androidx.fragment.app.FragmentActivity) r6
            java.lang.String r0 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap<androidx.fragment.app.FragmentActivity, java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zzd>> r1 = com.google.android.gms.common.api.internal.zzd.f15615e
            java.lang.Object r2 = r1.get(r6)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L21
            java.lang.Object r2 = r2.get()
            com.google.android.gms.common.api.internal.zzd r2 = (com.google.android.gms.common.api.internal.zzd) r2
            if (r2 != 0) goto La2
        L21:
            androidx.fragment.app.FragmentManager r2 = r6.getSupportFragmentManager()     // Catch: java.lang.ClassCastException -> L51
            androidx.fragment.app.Fragment r2 = r2.m3000H(r0)     // Catch: java.lang.ClassCastException -> L51
            com.google.android.gms.common.api.internal.zzd r2 = (com.google.android.gms.common.api.internal.zzd) r2     // Catch: java.lang.ClassCastException -> L51
            if (r2 == 0) goto L33
            boolean r3 = r2.isRemoving()
            if (r3 == 0) goto L48
        L33:
            com.google.android.gms.common.api.internal.zzd r2 = new com.google.android.gms.common.api.internal.zzd
            r2.<init>()
            androidx.fragment.app.FragmentManager r3 = r6.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r3.m3024d()
            r4 = 0
            r5 = 1
            r3.mo2941k(r4, r2, r0, r5)
            r3.mo2937f()
        L48:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.put(r6, r0)
            goto La2
        L51:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            r0.<init>(r1, r6)
            throw r0
        L5a:
            boolean r0 = r6 instanceof android.app.Activity
            if (r0 == 0) goto Lac
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.String r0 = "LifecycleFragmentImpl"
            java.util.WeakHashMap<android.app.Activity, java.lang.ref.WeakReference<com.google.android.gms.common.api.internal.zzb>> r1 = com.google.android.gms.common.api.internal.zzb.f15608e
            java.lang.Object r2 = r1.get(r6)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L74
            java.lang.Object r2 = r2.get()
            com.google.android.gms.common.api.internal.zzb r2 = (com.google.android.gms.common.api.internal.zzb) r2
            if (r2 != 0) goto La2
        L74:
            android.app.FragmentManager r2 = r6.getFragmentManager()     // Catch: java.lang.ClassCastException -> La3
            android.app.Fragment r2 = r2.findFragmentByTag(r0)     // Catch: java.lang.ClassCastException -> La3
            com.google.android.gms.common.api.internal.zzb r2 = (com.google.android.gms.common.api.internal.zzb) r2     // Catch: java.lang.ClassCastException -> La3
            if (r2 == 0) goto L86
            boolean r3 = r2.isRemoving()
            if (r3 == 0) goto L9a
        L86:
            com.google.android.gms.common.api.internal.zzb r2 = new com.google.android.gms.common.api.internal.zzb
            r2.<init>()
            android.app.FragmentManager r3 = r6.getFragmentManager()
            android.app.FragmentTransaction r3 = r3.beginTransaction()
            android.app.FragmentTransaction r0 = r3.add(r2, r0)
            r0.commitAllowingStateLoss()
        L9a:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.put(r6, r0)
        La2:
            return r2
        La3:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            r0.<init>(r1, r6)
            throw r0
        Lac:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't get fragment for unexpected activity."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.m7993c(android.app.Activity):com.google.android.gms.common.api.internal.LifecycleFragment");
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk
    @MainThread
    /* renamed from: a */
    public void mo7994a(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public Activity m7995b() {
        Activity mo8005v1 = this.f15430b.mo8005v1();
        Objects.requireNonNull(mo8005v1, "null reference");
        return mo8005v1;
    }

    @KeepForSdk
    @MainThread
    /* renamed from: d */
    public void mo7996d(int i2, int i3, @NonNull Intent intent) {
    }

    @KeepForSdk
    @MainThread
    /* renamed from: e */
    public void mo7997e(@Nullable Bundle bundle) {
    }

    @KeepForSdk
    @MainThread
    /* renamed from: f */
    public void mo7998f() {
    }

    @KeepForSdk
    @MainThread
    /* renamed from: g */
    public void mo7999g() {
    }

    @KeepForSdk
    @MainThread
    /* renamed from: h */
    public void mo8000h(@NonNull Bundle bundle) {
    }

    @KeepForSdk
    @MainThread
    /* renamed from: i */
    public void mo8001i() {
    }

    @KeepForSdk
    @MainThread
    /* renamed from: j */
    public void mo8002j() {
    }
}
