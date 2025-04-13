package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ViewGroup.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"core-ktx_release"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ViewGroupKt {
    @NotNull
    /* renamed from: a */
    public static final View m2376a(@NotNull ViewGroup viewGroup, int i2) {
        Intrinsics.m32179h(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder m25v = C0000a.m25v("Index: ", i2, ", Size: ");
        m25v.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(m25v.toString());
    }

    @NotNull
    /* renamed from: b */
    public static final Sequence<View> m2377b(@NotNull ViewGroup viewGroup) {
        Intrinsics.m32179h(viewGroup, "<this>");
        return new ViewGroupKt$children$1(viewGroup);
    }
}
