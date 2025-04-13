package androidx.savedstate;

import android.view.View;
import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"savedstate_release"}, m31885k = 2, m31886mv = {1, 6, 0})
@JvmName
/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    @JvmName
    /* renamed from: a */
    public static final void m4138a(@NotNull View view, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.m32179h(view, "<this>");
        view.setTag(C2507R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
