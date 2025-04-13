package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Recreator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "Companion", "SavedStateProvider", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Recreator implements LifecycleEventObserver {

    /* renamed from: b */
    @NotNull
    public final SavedStateRegistryOwner f5949b;

    /* compiled from: Recreator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Landroidx/savedstate/Recreator$Companion;", "", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    /* compiled from: Recreator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {

        /* renamed from: a */
        @NotNull
        public final Set<String> f5950a = new LinkedHashSet();

        public SavedStateProvider(@NotNull SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m4132c("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        @NotNull
        /* renamed from: a */
        public Bundle mo313a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5950a));
            return bundle;
        }
    }

    public Recreator(@NotNull SavedStateRegistryOwner owner) {
        Intrinsics.m32179h(owner, "owner");
        this.f5949b = owner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* renamed from: c */
    public void mo304c(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.m32179h(source, "source");
        Intrinsics.m32179h(event, "event");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().mo3189c(this);
        Bundle m4130a = this.f5949b.getSavedStateRegistry().m4130a("androidx.savedstate.Restarter");
        if (m4130a == null) {
            return;
        }
        ArrayList<String> stringArrayList = m4130a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
                Intrinsics.m32178g(asSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object newInstance = declaredConstructor.newInstance(new Object[0]);
                        Intrinsics.m32178g(newInstance, "{\n                constr…wInstance()\n            }");
                        ((SavedStateRegistry.AutoRecreated) newInstance).mo3186a(this.f5949b);
                    } catch (Exception e2) {
                        throw new RuntimeException(C0000a.m14k("Failed to instantiate ", str), e2);
                    }
                } catch (NoSuchMethodException e3) {
                    StringBuilder m24u = C0000a.m24u("Class ");
                    m24u.append(asSubclass.getSimpleName());
                    m24u.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(m24u.toString(), e3);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(C0000a.m16m("Class ", str, " wasn't found"), e4);
            }
        }
    }
}
