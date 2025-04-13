package androidx.window.layout;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowInfoTracker.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/layout/WindowInfoTracker;", "", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface WindowInfoTracker {

    /* renamed from: a */
    @NotNull
    public static final Companion f6795a = Companion.f6796a;

    /* compiled from: WindowInfoTracker.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/WindowInfoTracker$Companion;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f6796a = new Companion();

        /* renamed from: b */
        @NotNull
        public static WindowInfoTrackerDecorator f6797b;

        static {
            Reflection.m32193a(WindowInfoTracker.class).mo32166d();
            f6797b = EmptyDecorator.f6730a;
        }
    }

    @NotNull
    /* renamed from: a */
    Flow<WindowLayoutInfo> mo4465a(@NotNull Activity activity);
}
