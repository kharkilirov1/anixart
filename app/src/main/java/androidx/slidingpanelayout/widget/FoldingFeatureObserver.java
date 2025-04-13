package androidx.slidingpanelayout.widget;

import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FoldingFeatureObserver.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver;", "", "OnFoldingFeatureChangeListener", "slidingpanelayout_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FoldingFeatureObserver {

    /* renamed from: a */
    @NotNull
    public final WindowInfoTracker f5961a;

    /* renamed from: b */
    @NotNull
    public final Executor f5962b;

    /* renamed from: c */
    @Nullable
    public Job f5963c;

    /* renamed from: d */
    @Nullable
    public OnFoldingFeatureChangeListener f5964d;

    /* compiled from: FoldingFeatureObserver.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/slidingpanelayout/widget/FoldingFeatureObserver$OnFoldingFeatureChangeListener;", "", "slidingpanelayout_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public interface OnFoldingFeatureChangeListener {
        /* renamed from: a */
        void mo4141a(@NotNull FoldingFeature foldingFeature);
    }

    public FoldingFeatureObserver(@NotNull WindowInfoTracker windowInfoTracker, @NotNull Executor executor) {
        Intrinsics.m32179h(executor, "executor");
        this.f5961a = windowInfoTracker;
        this.f5962b = executor;
    }
}
