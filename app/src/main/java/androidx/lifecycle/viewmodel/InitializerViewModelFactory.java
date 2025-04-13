package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: InitializerViewModelFactory.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {

    /* renamed from: a */
    @NotNull
    public final ViewModelInitializer<?>[] f4706a;

    public InitializerViewModelFactory(@NotNull ViewModelInitializer<?>... initializers) {
        Intrinsics.m32179h(initializers, "initializers");
        this.f4706a = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* renamed from: a */
    public ViewModel mo3071a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    /* renamed from: b */
    public <T extends ViewModel> T mo3072b(@NotNull Class<T> cls, @NotNull CreationExtras creationExtras) {
        T t = null;
        for (ViewModelInitializer<?> viewModelInitializer : this.f4706a) {
            if (Intrinsics.m32174c(viewModelInitializer.f4708a, cls)) {
                Object invoke = viewModelInitializer.f4709b.invoke(creationExtras);
                t = invoke instanceof ViewModel ? (T) invoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        StringBuilder m24u = C0000a.m24u("No initializer set for given class ");
        m24u.append(cls.getName());
        throw new IllegalArgumentException(m24u.toString());
    }
}
