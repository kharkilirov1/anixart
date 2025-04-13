package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
class LegacySavedStateHandleController {

    public static final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        /* renamed from: a */
        public void mo3186a(@NonNull SavedStateRegistryOwner savedStateRegistryOwner) {
            if (!(savedStateRegistryOwner instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) savedStateRegistryOwner).getViewModelStore();
            SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
            Objects.requireNonNull(viewModelStore);
            Iterator it = new HashSet(viewModelStore.f4700a.keySet()).iterator();
            while (it.hasNext()) {
                LegacySavedStateHandleController.m3184a(viewModelStore.f4700a.get((String) it.next()), savedStateRegistry, savedStateRegistryOwner.getLifecycle());
            }
            if (new HashSet(viewModelStore.f4700a.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.m4133d(OnRecreation.class);
        }
    }

    /* renamed from: a */
    public static void m3184a(ViewModel viewModel, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        Object obj;
        Map<String, Object> map = viewModel.f4685a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = viewModel.f4685a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f4664c) {
            return;
        }
        savedStateHandleController.m3234h(savedStateRegistry, lifecycle);
        m3185b(savedStateRegistry, lifecycle);
    }

    /* renamed from: b */
    public static void m3185b(final SavedStateRegistry savedStateRegistry, final Lifecycle lifecycle) {
        Lifecycle.State mo3188b = lifecycle.mo3188b();
        if (mo3188b != Lifecycle.State.INITIALIZED) {
            if (!(mo3188b.compareTo(Lifecycle.State.STARTED) >= 0)) {
                lifecycle.mo3187a(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    /* renamed from: c */
                    public void mo304c(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_START) {
                            Lifecycle.this.mo3189c(this);
                            savedStateRegistry.m4133d(OnRecreation.class);
                        }
                    }
                });
                return;
            }
        }
        savedStateRegistry.m4133d(OnRecreation.class);
    }
}
