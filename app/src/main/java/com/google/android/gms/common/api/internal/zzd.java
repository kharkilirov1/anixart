package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.C0000a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzd extends Fragment implements LifecycleFragment {

    /* renamed from: e */
    public static final WeakHashMap<FragmentActivity, WeakReference<zzd>> f15615e = new WeakHashMap<>();

    /* renamed from: b */
    public final Map<String, LifecycleCallback> f15616b = Collections.synchronizedMap(new ArrayMap());

    /* renamed from: c */
    public int f15617c = 0;

    /* renamed from: d */
    @Nullable
    public Bundle f15618d;

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f15616b.values().iterator();
        while (it.hasNext()) {
            it.next().mo7994a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    /* renamed from: g0 */
    public final void mo8003g0(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (this.f15616b.containsKey(str)) {
            throw new IllegalArgumentException(C0000a.m21r(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        this.f15616b.put(str, lifecycleCallback);
        if (this.f15617c > 0) {
            new zzi(Looper.getMainLooper()).post(new zzc(this, lifecycleCallback, str));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    @Nullable
    /* renamed from: i1 */
    public final <T extends LifecycleCallback> T mo8004i1(String str, Class<T> cls) {
        return cls.cast(this.f15616b.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator<LifecycleCallback> it = this.f15616b.values().iterator();
        while (it.hasNext()) {
            it.next().mo7996d(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f15617c = 1;
        this.f15618d = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f15616b.entrySet()) {
            entry.getValue().mo7997e(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f15617c = 5;
        Iterator<LifecycleCallback> it = this.f15616b.values().iterator();
        while (it.hasNext()) {
            it.next().mo7998f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f15617c = 3;
        Iterator<LifecycleCallback> it = this.f15616b.values().iterator();
        while (it.hasNext()) {
            it.next().mo7999g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f15616b.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo8000h(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f15617c = 2;
        Iterator<LifecycleCallback> it = this.f15616b.values().iterator();
        while (it.hasNext()) {
            it.next().mo8001i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f15617c = 4;
        Iterator<LifecycleCallback> it = this.f15616b.values().iterator();
        while (it.hasNext()) {
            it.next().mo8002j();
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    @Nullable
    /* renamed from: v1 */
    public final /* synthetic */ Activity mo8005v1() {
        return getActivity();
    }
}
