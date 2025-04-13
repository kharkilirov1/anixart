package com.yandex.div.core.view2.divs;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.internal.util.SizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PagerSnapStartHelper.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/divs/PagerSnapStartHelper;", "Landroidx/recyclerview/widget/PagerSnapHelper;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class PagerSnapStartHelper extends PagerSnapHelper {

    /* renamed from: f */
    public int f32546f = SizeKt.m17396b(8);

    /* renamed from: g */
    @Nullable
    public OrientationHelper f32547g;

    /* renamed from: h */
    @Nullable
    public OrientationHelper f32548h;

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    @NotNull
    /* renamed from: c */
    public int[] mo3726c(@NotNull RecyclerView.LayoutManager layoutManager, @NotNull View targetView) {
        Intrinsics.m32179h(layoutManager, "layoutManager");
        Intrinsics.m32179h(targetView, "targetView");
        int[] iArr = new int[2];
        OrientationHelper orientationHelper = null;
        if (layoutManager.mo3700v()) {
            OrientationHelper orientationHelper2 = this.f32548h;
            if (orientationHelper2 != null && !(true ^ Intrinsics.m32174c(orientationHelper2.f5457a, layoutManager))) {
                orientationHelper = orientationHelper2;
            }
            if (orientationHelper == null) {
                orientationHelper = OrientationHelper.m3735a(layoutManager);
                this.f32548h = orientationHelper;
            }
            iArr[0] = m17053l(targetView, orientationHelper);
        } else if (layoutManager.mo3701w()) {
            OrientationHelper orientationHelper3 = this.f32547g;
            if (orientationHelper3 != null && !(!Intrinsics.m32174c(orientationHelper3.f5457a, layoutManager))) {
                orientationHelper = orientationHelper3;
            }
            if (orientationHelper == null) {
                orientationHelper = OrientationHelper.m3737c(layoutManager);
                this.f32547g = orientationHelper;
            }
            iArr[1] = m17053l(targetView, orientationHelper);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    /* renamed from: f */
    public int mo3728f(@NotNull RecyclerView.LayoutManager manager, int i2, int i3) {
        Intrinsics.m32179h(manager, "manager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) manager;
        int m3692o1 = linearLayoutManager.m3692o1();
        if (m3692o1 != -1) {
            return m3692o1;
        }
        int m3697s1 = linearLayoutManager.m3697s1();
        if (m3697s1 == linearLayoutManager.m3695r1()) {
            if (m3697s1 != -1) {
                return m3697s1;
            }
            return 0;
        }
        if (linearLayoutManager.f5413s != 0) {
            i2 = i3;
        }
        return i2 >= 0 ? m3697s1 : m3697s1 - 1;
    }

    /* renamed from: l */
    public final int m17053l(View view, OrientationHelper orientationHelper) {
        return orientationHelper.mo3741g(view) - (orientationHelper.f5457a.m3894i0(view) == 0 ? orientationHelper.mo3747m() : this.f32546f / 2);
    }
}
