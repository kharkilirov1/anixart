package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "lifecycle-viewmodel-savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a */
    @NotNull
    public final SavedStateRegistry f4670a;

    /* renamed from: b */
    public boolean f4671b;

    /* renamed from: c */
    @Nullable
    public Bundle f4672c;

    /* renamed from: d */
    @NotNull
    public final Lazy f4673d;

    public SavedStateHandlesProvider(@NotNull SavedStateRegistry savedStateRegistry, @NotNull final ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.m32179h(savedStateRegistry, "savedStateRegistry");
        this.f4670a = savedStateRegistry;
        this.f4673d = LazyKt.m31881b(new Function0<SavedStateHandlesVM>() { // from class: androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public SavedStateHandlesVM invoke() {
                return SavedStateHandleSupport.m3237c(ViewModelStoreOwner.this);
            }
        });
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    @NotNull
    /* renamed from: a */
    public Bundle mo313a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4672c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, SavedStateHandle> entry : ((SavedStateHandlesVM) this.f4673d.getValue()).f4675d.entrySet()) {
            String key = entry.getKey();
            Bundle mo313a = entry.getValue().f4661e.mo313a();
            if (!Intrinsics.m32174c(mo313a, Bundle.EMPTY)) {
                bundle.putBundle(key, mo313a);
            }
        }
        this.f4671b = false;
        return bundle;
    }

    /* renamed from: b */
    public final void m3238b() {
        if (this.f4671b) {
            return;
        }
        this.f4672c = this.f4670a.m4130a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f4671b = true;
    }
}
