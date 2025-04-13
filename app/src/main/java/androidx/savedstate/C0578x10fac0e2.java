package androidx.savedstate;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewTreeSavedStateRegistryOwner.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "Landroid/view/View;", "view", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* renamed from: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1 */
/* loaded from: classes.dex */
final class C0578x10fac0e2 extends Lambda implements Function1<View, View> {
    static {
        new C0578x10fac0e2();
    }

    public C0578x10fac0e2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public View invoke(View view) {
        View view2 = view;
        Intrinsics.m32179h(view2, "view");
        Object parent = view2.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
