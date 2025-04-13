package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedStateViewModelFactory.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel-savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* renamed from: a */
    @Nullable
    public Application f4676a;

    /* renamed from: b */
    @NotNull
    public final ViewModelProvider.Factory f4677b;

    /* renamed from: c */
    @Nullable
    public Bundle f4678c;

    /* renamed from: d */
    @Nullable
    public Lifecycle f4679d;

    /* renamed from: e */
    @Nullable
    public SavedStateRegistry f4680e;

    public SavedStateViewModelFactory() {
        this.f4677b = new ViewModelProvider.AndroidViewModelFactory();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    /* renamed from: a */
    public <T extends ViewModel> T mo3071a(@NotNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) m3239d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    /* renamed from: b */
    public <T extends ViewModel> T mo3072b(@NotNull Class<T> cls, @NotNull CreationExtras creationExtras) {
        ViewModelProvider.NewInstanceFactory.Companion companion = ViewModelProvider.NewInstanceFactory.f4696a;
        String str = (String) creationExtras.mo3249a(ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.f4699a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (creationExtras.mo3249a(SavedStateHandleSupport.f4666a) == null || creationExtras.mo3249a(SavedStateHandleSupport.f4667b) == null) {
            if (this.f4679d != null) {
                return (T) m3239d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        ViewModelProvider.AndroidViewModelFactory.Companion companion2 = ViewModelProvider.AndroidViewModelFactory.f4691e;
        Application application = (Application) creationExtras.mo3249a(ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.f4695a);
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor m3240a = (!isAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.m3240a(cls, SavedStateViewModelFactoryKt.f4682b) : SavedStateViewModelFactoryKt.m3240a(cls, SavedStateViewModelFactoryKt.f4681a);
        return m3240a == null ? (T) this.f4677b.mo3072b(cls, creationExtras) : (!isAssignableFrom || application == null) ? (T) SavedStateViewModelFactoryKt.m3241b(cls, m3240a, SavedStateHandleSupport.m3235a(creationExtras)) : (T) SavedStateViewModelFactoryKt.m3241b(cls, m3240a, application, SavedStateHandleSupport.m3235a(creationExtras));
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @RestrictTo
    /* renamed from: c */
    public void mo3172c(@NotNull ViewModel viewModel) {
        Lifecycle lifecycle = this.f4679d;
        if (lifecycle != null) {
            LegacySavedStateHandleController.m3184a(viewModel, this.f4680e, lifecycle);
        }
    }

    @NotNull
    /* renamed from: d */
    public final <T extends ViewModel> T m3239d(@NotNull String str, @NotNull Class<T> cls) {
        Application application;
        if (this.f4679d == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor m3240a = (!isAssignableFrom || this.f4676a == null) ? SavedStateViewModelFactoryKt.m3240a(cls, SavedStateViewModelFactoryKt.f4682b) : SavedStateViewModelFactoryKt.m3240a(cls, SavedStateViewModelFactoryKt.f4681a);
        if (m3240a == null) {
            if (this.f4676a != null) {
                return (T) this.f4677b.mo3071a(cls);
            }
            ViewModelProvider.NewInstanceFactory.Companion companion = ViewModelProvider.NewInstanceFactory.f4696a;
            if (ViewModelProvider.NewInstanceFactory.f4697b == null) {
                ViewModelProvider.NewInstanceFactory.f4697b = new ViewModelProvider.NewInstanceFactory();
            }
            ViewModelProvider.NewInstanceFactory newInstanceFactory = ViewModelProvider.NewInstanceFactory.f4697b;
            Intrinsics.m32176e(newInstanceFactory);
            return (T) newInstanceFactory.mo3071a(cls);
        }
        SavedStateRegistry savedStateRegistry = this.f4680e;
        Lifecycle lifecycle = this.f4679d;
        SavedStateHandle m3233a = SavedStateHandle.f4655f.m3233a(savedStateRegistry.m4130a(str), this.f4678c);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, m3233a);
        savedStateHandleController.m3234h(savedStateRegistry, lifecycle);
        LegacySavedStateHandleController.m3185b(savedStateRegistry, lifecycle);
        T t = (!isAssignableFrom || (application = this.f4676a) == null) ? (T) SavedStateViewModelFactoryKt.m3241b(cls, m3240a, m3233a) : (T) SavedStateViewModelFactoryKt.m3241b(cls, m3240a, application, m3233a);
        t.m3243c("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return t;
    }

    @SuppressLint
    public SavedStateViewModelFactory(@Nullable Application application, @NotNull SavedStateRegistryOwner savedStateRegistryOwner, @Nullable Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        this.f4680e = savedStateRegistryOwner.getSavedStateRegistry();
        this.f4679d = savedStateRegistryOwner.getLifecycle();
        this.f4678c = bundle;
        this.f4676a = application;
        if (application != null) {
            ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.f4691e;
            if (ViewModelProvider.AndroidViewModelFactory.f4692f == null) {
                ViewModelProvider.AndroidViewModelFactory.f4692f = new ViewModelProvider.AndroidViewModelFactory(application);
            }
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.f4692f;
            Intrinsics.m32176e(androidViewModelFactory);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.f4677b = androidViewModelFactory;
    }
}
