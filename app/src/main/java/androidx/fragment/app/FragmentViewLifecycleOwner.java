package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

/* loaded from: classes.dex */
class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* renamed from: b */
    public final Fragment f4470b;

    /* renamed from: c */
    public final ViewModelStore f4471c;

    /* renamed from: d */
    public LifecycleRegistry f4472d = null;

    /* renamed from: e */
    public SavedStateRegistryController f4473e = null;

    public FragmentViewLifecycleOwner(@NonNull Fragment fragment, @NonNull ViewModelStore viewModelStore) {
        this.f4470b = fragment;
        this.f4471c = viewModelStore;
    }

    /* renamed from: a */
    public void m3143a(@NonNull Lifecycle.Event event) {
        LifecycleRegistry lifecycleRegistry = this.f4472d;
        lifecycleRegistry.m3198e("handleLifecycleEvent");
        lifecycleRegistry.m3200h(event.m3193b());
    }

    /* renamed from: b */
    public void m3144b() {
        if (this.f4472d == null) {
            this.f4472d = new LifecycleRegistry(this);
            SavedStateRegistryController m4134a = SavedStateRegistryController.m4134a(this);
            this.f4473e = m4134a;
            m4134a.m4135b();
            SavedStateHandleSupport.m3236b(this);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f4470b.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.m3250b(ViewModelProvider.AndroidViewModelFactory.f4693g, application);
        }
        mutableCreationExtras.m3250b(SavedStateHandleSupport.f4666a, this);
        mutableCreationExtras.m3250b(SavedStateHandleSupport.f4667b, this);
        if (this.f4470b.getArguments() != null) {
            mutableCreationExtras.m3250b(SavedStateHandleSupport.f4668c, this.f4470b.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        m3144b();
        return this.f4472d;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public SavedStateRegistry getSavedStateRegistry() {
        m3144b();
        return this.f4473e.f5958b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        m3144b();
        return this.f4471c;
    }
}
