package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.metrica.uiaccessor.C4630a;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class FragmentLifecycleCallback extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a */
    @NonNull
    public final C4630a.a f47602a;

    /* renamed from: b */
    @NonNull
    public final WeakReference<Activity> f47603b;

    public FragmentLifecycleCallback(@NonNull C4630a.a aVar, @NonNull Activity activity) {
        this.f47602a = aVar;
        this.f47603b = new WeakReference<>(activity);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        super.onFragmentAttached(fragmentManager, fragment, context);
        Activity activity = this.f47603b.get();
        if (activity != null) {
            this.f47602a.fragmentAttached(activity);
        }
    }
}
