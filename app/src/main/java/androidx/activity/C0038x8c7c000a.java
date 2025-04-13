package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
@Metadata(m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "Landroid/view/View;", "it", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1 */
/* loaded from: classes.dex */
final class C0038x8c7c000a extends Lambda implements Function1<View, View> {
    static {
        new C0038x8c7c000a();
    }

    public C0038x8c7c000a() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public View invoke(View view) {
        View it = view;
        Intrinsics.m32179h(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
