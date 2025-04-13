package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseUtils.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/widgets/ReleaseUtils;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ReleaseUtils {

    /* renamed from: a */
    @NotNull
    public static final ReleaseUtils f32861a = new ReleaseUtils();

    /* renamed from: a */
    public final void m17110a(@NotNull ViewGroup viewGroup, @NotNull Div2View divView) {
        Intrinsics.m32179h(viewGroup, "<this>");
        Intrinsics.m32179h(divView, "divView");
        Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b(viewGroup)).iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.m17105a(divView.getReleaseViewVisitor$div_release(), it.next());
        }
        viewGroup.removeAllViews();
    }
}
