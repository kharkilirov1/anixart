package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmbeddingAdapter.kt */
@ExperimentalWindowApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/embedding/EmbeddingAdapter;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class EmbeddingAdapter {
    /* renamed from: a */
    public final SplitInfo m4423a(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        boolean z;
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        Intrinsics.m32178g(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z2 = false;
        try {
            z = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z = false;
        }
        List activities = primaryActivityStack.getActivities();
        Intrinsics.m32178g(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, z);
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        Intrinsics.m32178g(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        Intrinsics.m32178g(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack, new ActivityStack(activities2, z2), splitInfo.getSplitRatio());
    }

    @NotNull
    /* renamed from: b */
    public final List<SplitInfo> m4424b(@NotNull List<? extends androidx.window.extensions.embedding.SplitInfo> list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m4423a((androidx.window.extensions.embedding.SplitInfo) it.next()));
        }
        return arrayList;
    }
}
