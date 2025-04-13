package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SavedStateRegistry.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "AutoRecreated", "Companion", "SavedStateProvider", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
@SuppressLint
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    public boolean f5952b;

    /* renamed from: c */
    @Nullable
    public Bundle f5953c;

    /* renamed from: d */
    public boolean f5954d;

    /* renamed from: e */
    @Nullable
    public Recreator.SavedStateProvider f5955e;

    /* renamed from: a */
    @NotNull
    public final SafeIterableMap<String, SavedStateProvider> f5951a = new SafeIterableMap<>();

    /* renamed from: f */
    public boolean f5956f = true;

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public interface AutoRecreated {
        /* renamed from: a */
        void mo3186a(@NotNull SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/savedstate/SavedStateRegistry$Companion;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public interface SavedStateProvider {
        @NotNull
        /* renamed from: a */
        Bundle mo313a();
    }

    @MainThread
    @Nullable
    /* renamed from: a */
    public final Bundle m4130a(@NotNull String key) {
        Intrinsics.m32179h(key, "key");
        if (!this.f5954d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f5953c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f5953c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f5953c;
        boolean z = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z = true;
        }
        if (!z) {
            this.f5953c = null;
        }
        return bundle2;
    }

    @Nullable
    /* renamed from: b */
    public final SavedStateProvider m4131b(@NotNull String str) {
        Iterator<Map.Entry<String, SavedStateProvider>> it = this.f5951a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, SavedStateProvider> components = it.next();
            Intrinsics.m32178g(components, "components");
            String key = components.getKey();
            SavedStateProvider value = components.getValue();
            if (Intrinsics.m32174c(key, str)) {
                return value;
            }
        }
        return null;
    }

    @MainThread
    /* renamed from: c */
    public final void m4132c(@NotNull String key, @NotNull SavedStateProvider provider) {
        Intrinsics.m32179h(key, "key");
        Intrinsics.m32179h(provider, "provider");
        if (!(this.f5951a.mo1015e(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @MainThread
    /* renamed from: d */
    public final void m4133d(@NotNull Class<? extends AutoRecreated> cls) {
        if (!this.f5956f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.SavedStateProvider savedStateProvider = this.f5955e;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.f5955e = savedStateProvider;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.SavedStateProvider savedStateProvider2 = this.f5955e;
            if (savedStateProvider2 != null) {
                savedStateProvider2.f5950a.add(cls.getName());
            }
        } catch (NoSuchMethodException e2) {
            StringBuilder m24u = C0000a.m24u("Class ");
            m24u.append(cls.getSimpleName());
            m24u.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(m24u.toString(), e2);
        }
    }
}
