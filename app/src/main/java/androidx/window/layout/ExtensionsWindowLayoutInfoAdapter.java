package androidx.window.layout;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExtensionsWindowLayoutInfoAdapter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/ExtensionsWindowLayoutInfoAdapter;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ExtensionsWindowLayoutInfoAdapter {

    /* renamed from: a */
    @NotNull
    public static final ExtensionsWindowLayoutInfoAdapter f6739a = new ExtensionsWindowLayoutInfoAdapter();

    @Nullable
    /* renamed from: a */
    public final FoldingFeature m4438a(@NotNull Activity activity, @NotNull androidx.window.extensions.layout.FoldingFeature foldingFeature) {
        HardwareFoldingFeature.Type type;
        FoldingFeature.State state;
        Rect rect;
        int i2;
        Rect rect2;
        int type2 = foldingFeature.getType();
        boolean z = true;
        if (type2 == 1) {
            type = HardwareFoldingFeature.Type.f6750b;
        } else {
            if (type2 != 2) {
                return null;
            }
            type = HardwareFoldingFeature.Type.f6751c;
        }
        int state2 = foldingFeature.getState();
        if (state2 == 1) {
            state = FoldingFeature.State.f6744b;
        } else {
            if (state2 != 2) {
                return null;
            }
            state = FoldingFeature.State.f6745c;
        }
        Rect bounds = foldingFeature.getBounds();
        Intrinsics.m32178g(bounds, "oemFeature.bounds");
        Bounds bounds2 = new Bounds(bounds);
        WindowMetricsCalculatorCompat windowMetricsCalculatorCompat = WindowMetricsCalculatorCompat.f6809a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            rect2 = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
            Intrinsics.m32178g(rect2, "activity.windowManager.currentWindowMetrics.bounds");
        } else if (i3 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect2 = new Rect((Rect) invoke);
            } catch (IllegalAccessException e2) {
                Log.w("WindowMetricsCalculatorCompat", e2);
                rect2 = windowMetricsCalculatorCompat.m4466a(activity);
            } catch (NoSuchFieldException e3) {
                Log.w("WindowMetricsCalculatorCompat", e3);
                rect2 = windowMetricsCalculatorCompat.m4466a(activity);
            } catch (NoSuchMethodException e4) {
                Log.w("WindowMetricsCalculatorCompat", e4);
                rect2 = windowMetricsCalculatorCompat.m4466a(activity);
            } catch (InvocationTargetException e5) {
                Log.w("WindowMetricsCalculatorCompat", e5);
                rect2 = windowMetricsCalculatorCompat.m4466a(activity);
            }
        } else if (i3 >= 28) {
            rect2 = windowMetricsCalculatorCompat.m4466a(activity);
        } else {
            if (i3 >= 24) {
                rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    int m4467b = windowMetricsCalculatorCompat.m4467b(activity);
                    int i4 = rect.bottom + m4467b;
                    if (i4 == point.y) {
                        rect.bottom = i4;
                    } else {
                        int i5 = rect.right + m4467b;
                        if (i5 == point.x) {
                            rect.right = i5;
                        }
                    }
                }
            } else {
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Intrinsics.m32178g(defaultDisplay2, "defaultDisplay");
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                rect = new Rect();
                int i6 = point2.x;
                if (i6 == 0 || (i2 = point2.y) == 0) {
                    defaultDisplay2.getRectSize(rect);
                } else {
                    rect.right = i6;
                    rect.bottom = i2;
                }
            }
            rect2 = rect;
        }
        Bounds bounds3 = new WindowMetrics(rect2).f6807a;
        Objects.requireNonNull(bounds3);
        Rect rect3 = new Rect(bounds3.f6680a, bounds3.f6681b, bounds3.f6682c, bounds3.f6683d);
        if ((bounds2.m4415a() == 0 && bounds2.m4416b() == 0) || ((bounds2.m4416b() != rect3.width() && bounds2.m4415a() != rect3.height()) || ((bounds2.m4416b() < rect3.width() && bounds2.m4415a() < rect3.height()) || (bounds2.m4416b() == rect3.width() && bounds2.m4415a() == rect3.height())))) {
            z = false;
        }
        if (!z) {
            return null;
        }
        Rect bounds4 = foldingFeature.getBounds();
        Intrinsics.m32178g(bounds4, "oemFeature.bounds");
        return new HardwareFoldingFeature(new Bounds(bounds4), type, state);
    }

    @NotNull
    /* renamed from: b */
    public final WindowLayoutInfo m4439b(@NotNull Activity activity, @NotNull androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        FoldingFeature foldingFeature;
        Intrinsics.m32179h(activity, "activity");
        List<androidx.window.extensions.layout.FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        Intrinsics.m32178g(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (androidx.window.extensions.layout.FoldingFeature feature : displayFeatures) {
            if (feature instanceof androidx.window.extensions.layout.FoldingFeature) {
                ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = f6739a;
                Intrinsics.m32178g(feature, "feature");
                foldingFeature = extensionsWindowLayoutInfoAdapter.m4438a(activity, feature);
            } else {
                foldingFeature = null;
            }
            if (foldingFeature != null) {
                arrayList.add(foldingFeature);
            }
        }
        return new WindowLayoutInfo(arrayList);
    }
}
