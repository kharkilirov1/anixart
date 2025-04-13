package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"lifecycle-viewmodel-savedstate_release"}, m31885k = 2, m31886mv = {1, 6, 0})
@JvmName
/* loaded from: classes.dex */
public final class SavedStateHandleSupport {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final CreationExtras.Key<SavedStateRegistryOwner> f4666a = new CreationExtras.Key<SavedStateRegistryOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
    };

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final CreationExtras.Key<ViewModelStoreOwner> f4667b = new CreationExtras.Key<ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
    };

    /* renamed from: c */
    @JvmField
    @NotNull
    public static final CreationExtras.Key<Bundle> f4668c = new CreationExtras.Key<Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
    };

    @MainThread
    @NotNull
    /* renamed from: a */
    public static final SavedStateHandle m3235a(@NotNull CreationExtras creationExtras) {
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) creationExtras.mo3249a(f4666a);
        if (savedStateRegistryOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.mo3249a(f4667b);
        if (viewModelStoreOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.mo3249a(f4668c);
        ViewModelProvider.NewInstanceFactory.Companion companion = ViewModelProvider.NewInstanceFactory.f4696a;
        String str = (String) creationExtras.mo3249a(ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.f4699a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        SavedStateRegistry.SavedStateProvider m4131b = savedStateRegistryOwner.getSavedStateRegistry().m4131b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        SavedStateHandlesProvider savedStateHandlesProvider = m4131b instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) m4131b : null;
        if (savedStateHandlesProvider == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        SavedStateHandlesVM m3237c = m3237c(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = m3237c.f4675d.get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        SavedStateHandle.Companion companion2 = SavedStateHandle.f4655f;
        savedStateHandlesProvider.m3238b();
        Bundle bundle2 = savedStateHandlesProvider.f4672c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = savedStateHandlesProvider.f4672c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = savedStateHandlesProvider.f4672c;
        if (bundle5 != null && bundle5.isEmpty()) {
            savedStateHandlesProvider.f4672c = null;
        }
        SavedStateHandle m3233a = companion2.m3233a(bundle3, bundle);
        m3237c.f4675d.put(str, m3233a);
        return m3233a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    /* renamed from: b */
    public static final <T extends SavedStateRegistryOwner & ViewModelStoreOwner> void m3236b(@NotNull T t) {
        Intrinsics.m32179h(t, "<this>");
        Lifecycle.State mo3188b = t.getLifecycle().mo3188b();
        Intrinsics.m32178g(mo3188b, "lifecycle.currentState");
        if (!(mo3188b == Lifecycle.State.INITIALIZED || mo3188b == Lifecycle.State.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.getSavedStateRegistry().m4131b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().m4132c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            t.getLifecycle().mo3187a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    @NotNull
    /* renamed from: c */
    public static final SavedStateHandlesVM m3237c(@NotNull ViewModelStoreOwner viewModelStoreOwner) {
        CreationExtras creationExtras;
        Intrinsics.m32179h(viewModelStoreOwner, "<this>");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        SavedStateHandleSupport$savedStateHandlesVM$1$1 initializer = new Function1<CreationExtras, SavedStateHandlesVM>() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1
            @Override // kotlin.jvm.functions.Function1
            public SavedStateHandlesVM invoke(CreationExtras creationExtras2) {
                CreationExtras initializer2 = creationExtras2;
                Intrinsics.m32179h(initializer2, "$this$initializer");
                return new SavedStateHandlesVM();
            }
        };
        KClass clazz = Reflection.m32193a(SavedStateHandlesVM.class);
        Intrinsics.m32179h(clazz, "clazz");
        Intrinsics.m32179h(initializer, "initializer");
        initializerViewModelFactoryBuilder.f4707a.add(new ViewModelInitializer<>(JvmClassMappingKt.m32147b(clazz), initializer));
        Object[] array = initializerViewModelFactoryBuilder.f4707a.toArray(new ViewModelInitializer[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) array;
        InitializerViewModelFactory initializerViewModelFactory = new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        Intrinsics.m32178g(viewModelStore, "owner.viewModelStore");
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            Intrinsics.m32178g(creationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        } else {
            creationExtras = CreationExtras.Empty.f4705b;
        }
        return (SavedStateHandlesVM) new ViewModelProvider(viewModelStore, initializerViewModelFactory, creationExtras).m3245b("androidx.lifecycle.internal.SavedStateHandlesVM", SavedStateHandlesVM.class);
    }
}
