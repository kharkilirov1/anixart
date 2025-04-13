package com.yandex.div.core.view2.items;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: DivViewWithItems.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivViewWithItemsKt {

    /* compiled from: DivViewWithItems.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Direction.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m17127a(androidx.recyclerview.widget.RecyclerView r7, com.yandex.div.core.view2.items.Direction r8) {
        /*
            androidx.recyclerview.widget.LinearLayoutManager r0 = m17128b(r7)
            r1 = 0
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != 0) goto Lb
            goto L5b
        Lb:
            int r5 = r8.ordinal()
            if (r5 == 0) goto L1e
            if (r5 != r2) goto L18
            int r0 = r0.m3692o1()
            goto L61
        L18:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L1e:
            androidx.recyclerview.widget.LinearLayoutManager r5 = m17128b(r7)
            if (r5 != 0) goto L26
            r5 = r4
            goto L2c
        L26:
            int r5 = r5.f5413s
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L2c:
            if (r5 != 0) goto L2f
            goto L3a
        L2f:
            int r6 = r5.intValue()
            if (r6 != 0) goto L3a
            boolean r5 = r7.canScrollHorizontally(r2)
            goto L49
        L3a:
            if (r5 != 0) goto L3d
            goto L48
        L3d:
            int r5 = r5.intValue()
            if (r5 != r2) goto L48
            boolean r5 = r7.canScrollVertically(r2)
            goto L49
        L48:
            r5 = 0
        L49:
            if (r5 == 0) goto L50
            int r0 = r0.m3692o1()
            goto L61
        L50:
            int r5 = r0.m3869Q()
            int r5 = r5 - r2
            android.view.View r5 = r0.m3699u1(r5, r3, r2, r1)
            if (r5 != 0) goto L5d
        L5b:
            r0 = -1
            goto L61
        L5d:
            int r0 = r0.m3894i0(r5)
        L61:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = r0.intValue()
            if (r5 == r3) goto L6c
            r1 = 1
        L6c:
            if (r1 == 0) goto L6f
            r4 = r0
        L6f:
            if (r4 != 0) goto L91
            androidx.recyclerview.widget.LinearLayoutManager r7 = m17128b(r7)
            if (r7 != 0) goto L78
            goto L95
        L78:
            int r8 = r8.ordinal()
            if (r8 == 0) goto L8b
            if (r8 != r2) goto L85
            int r7 = r7.m3697s1()
            goto L8f
        L85:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L8b:
            int r7 = r7.m3695r1()
        L8f:
            r3 = r7
            goto L95
        L91:
            int r3 = r4.intValue()
        L95:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.view2.items.DivViewWithItemsKt.m17127a(androidx.recyclerview.widget.RecyclerView, com.yandex.div.core.view2.items.Direction):int");
    }

    /* renamed from: b */
    public static final <T extends RecyclerView> LinearLayoutManager m17128b(T t) {
        RecyclerView.LayoutManager layoutManager = t.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }
}
