package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInfoTrackerImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl;", "Landroidx/window/layout/WindowInfoTracker;", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {

    /* renamed from: b */
    @NotNull
    public final WindowMetricsCalculator f6798b;

    /* renamed from: c */
    @NotNull
    public final WindowBackend f6799c;

    /* compiled from: WindowInfoTrackerImpl.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/window/layout/WindowInfoTrackerImpl$Companion;", "", "", "BUFFER_CAPACITY", "I", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    public WindowInfoTrackerImpl(@NotNull WindowMetricsCalculator windowMetricsCalculator, @NotNull WindowBackend windowBackend) {
        this.f6798b = windowMetricsCalculator;
        this.f6799c = windowBackend;
    }

    @Override // androidx.window.layout.WindowInfoTracker
    @NotNull
    /* renamed from: a */
    public Flow<WindowLayoutInfo> mo4465a(@NotNull Activity activity) {
        Intrinsics.m32179h(activity, "activity");
        return FlowKt.m34214f(new WindowInfoTrackerImpl$windowLayoutInfo$1(this, activity, null));
    }
}
