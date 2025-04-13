package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;

/* loaded from: classes.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    /* renamed from: a */
    public final <T extends ViewModel> T mo3071a(@NonNull Class<T> cls) {
        if (cls.getCanonicalName() != null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    /* renamed from: b */
    public final <T extends ViewModel> T mo3072b(@NonNull Class<T> cls, @NonNull CreationExtras creationExtras) {
        ViewModelProvider.NewInstanceFactory.Companion companion = ViewModelProvider.NewInstanceFactory.f4696a;
        String str = (String) creationExtras.mo3249a(ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.f4699a);
        if (str != null) {
            return (T) m3173d(str, cls, SavedStateHandleSupport.m3235a(creationExtras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @RestrictTo
    /* renamed from: c */
    public void mo3172c(@NonNull ViewModel viewModel) {
    }

    @NonNull
    /* renamed from: d */
    public abstract <T extends ViewModel> T m3173d(@NonNull String str, @NonNull Class<T> cls, @NonNull SavedStateHandle savedStateHandle);
}
