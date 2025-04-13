package androidx.savedstate;

import android.view.View;
import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "Landroidx/savedstate/SavedStateRegistryOwner;", "view", "Landroid/view/View;", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 */
/* loaded from: classes.dex */
final class C0579x10fac0e3 extends Lambda implements Function1<View, SavedStateRegistryOwner> {
    static {
        new C0579x10fac0e3();
    }

    public C0579x10fac0e3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public SavedStateRegistryOwner invoke(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Object tag = view2.getTag(C2507R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof SavedStateRegistryOwner) {
            return (SavedStateRegistryOwner) tag;
        }
        return null;
    }
}
