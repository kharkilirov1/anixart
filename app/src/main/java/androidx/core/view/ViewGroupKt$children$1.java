package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewGroup.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"androidx/core/view/ViewGroupKt$children$1", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "core-ktx_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ViewGroupKt$children$1 implements Sequence<View> {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f3659a;

    public ViewGroupKt$children$1(ViewGroup viewGroup) {
        this.f3659a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<View> iterator() {
        ViewGroup viewGroup = this.f3659a;
        Intrinsics.m32179h(viewGroup, "<this>");
        return new ViewGroupKt$iterator$1(viewGroup);
    }
}
