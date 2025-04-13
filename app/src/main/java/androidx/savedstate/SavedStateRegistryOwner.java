package androidx.savedstate;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SavedStateRegistryOwner.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/LifecycleOwner;", "savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface SavedStateRegistryOwner extends LifecycleOwner {
    @NotNull
    SavedStateRegistry getSavedStateRegistry();
}
