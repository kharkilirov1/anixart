package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Bounds;
import androidx.window.core.SpecificationComputer;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SidecarAdapter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/layout/SidecarAdapter;", "", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SidecarAdapter {

    /* renamed from: b */
    @NotNull
    public static final Companion f6760b = new Companion(null);

    /* renamed from: a */
    @NotNull
    public final SpecificationComputer.VerificationMode f6761a;

    /* compiled from: SidecarAdapter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Landroidx/window/layout/SidecarAdapter$Companion;", "", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        @SuppressLint
        @VisibleForTesting
        /* renamed from: a */
        public final int m4451a(@NotNull SidecarDeviceState sidecarDeviceState) {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        /* renamed from: b */
        public final int m4452b(@NotNull SidecarDeviceState sidecarDeviceState) {
            int m4451a = m4451a(sidecarDeviceState);
            if (m4451a < 0 || m4451a > 4) {
                return 0;
            }
            return m4451a;
        }

        @SuppressLint
        @VisibleForTesting
        @NotNull
        /* renamed from: c */
        public final List<SidecarDisplayFeature> m4453c(@NotNull SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            try {
                try {
                    List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? EmptyList.f63144b : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return EmptyList.f63144b;
                }
            } catch (NoSuchFieldError unused2) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            }
        }

        @SuppressLint
        @VisibleForTesting
        /* renamed from: d */
        public final void m4454d(@NotNull SidecarDeviceState sidecarDeviceState, int i2) {
            try {
                try {
                    sidecarDeviceState.posture = i2;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i2));
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SidecarAdapter() {
        this.f6761a = SpecificationComputer.VerificationMode.QUIET;
    }

    /* renamed from: a */
    public final boolean m4446a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.m32174c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.m32174c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* renamed from: b */
    public final boolean m4447b(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (!m4446a(list.get(i2), list2.get(i2))) {
                return false;
            }
            i2 = i3;
        }
        return true;
    }

    @NotNull
    /* renamed from: c */
    public final WindowLayoutInfo m4448c(@Nullable SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @NotNull SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo(EmptyList.f63144b);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        Companion companion = f6760b;
        int m4451a = companion.m4451a(sidecarDeviceState);
        if (m4451a < 0 || m4451a > 4) {
            m4451a = 0;
        }
        companion.m4454d(sidecarDeviceState2, m4451a);
        return new WindowLayoutInfo(m4449d(companion.m4453c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    @NotNull
    /* renamed from: d */
    public final List<DisplayFeature> m4449d(@NotNull List<SidecarDisplayFeature> list, @NotNull SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            DisplayFeature m4450e = m4450e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (m4450e != null) {
                arrayList.add(m4450e);
            }
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: e */
    public final DisplayFeature m4450e(@NotNull SidecarDisplayFeature feature, @NotNull SidecarDeviceState sidecarDeviceState) {
        HardwareFoldingFeature.Type type;
        FoldingFeature.State state;
        Intrinsics.m32179h(feature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) SpecificationComputer.Companion.m4420a(SpecificationComputer.f6690a, feature, "SidecarAdapter", this.f6761a, null, 4).mo4418c("Type must be either TYPE_FOLD or TYPE_HINGE", new Function1<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
                Intrinsics.m32179h(require, "$this$require");
                boolean z = true;
                if (require.getType() != 1 && require.getType() != 2) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).mo4418c("Feature bounds must not be 0", new Function1<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
                Intrinsics.m32179h(require, "$this$require");
                return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
            }
        }).mo4418c("TYPE_FOLD must have 0 area", new Function1<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$3
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
                Intrinsics.m32179h(require, "$this$require");
                boolean z = true;
                if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).mo4418c("Feature be pinned to either left or top", new Function1<SidecarDisplayFeature, Boolean>() { // from class: androidx.window.layout.SidecarAdapter$translate$checkedFeature$4
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
                Intrinsics.m32179h(require, "$this$require");
                return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
            }
        }).mo4417a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type2 = sidecarDisplayFeature.getType();
        if (type2 == 1) {
            type = HardwareFoldingFeature.Type.f6750b;
        } else {
            if (type2 != 2) {
                return null;
            }
            type = HardwareFoldingFeature.Type.f6751c;
        }
        int m4451a = f6760b.m4451a(sidecarDeviceState);
        if (m4451a < 0 || m4451a > 4) {
            m4451a = 0;
        }
        if (m4451a == 0 || m4451a == 1) {
            return null;
        }
        if (m4451a == 2) {
            state = FoldingFeature.State.f6745c;
        } else if (m4451a == 3) {
            state = FoldingFeature.State.f6744b;
        } else {
            if (m4451a == 4) {
                return null;
            }
            state = FoldingFeature.State.f6744b;
        }
        Rect rect = feature.getRect();
        Intrinsics.m32178g(rect, "feature.rect");
        return new HardwareFoldingFeature(new Bounds(rect), type, state);
    }

    public SidecarAdapter(SpecificationComputer.VerificationMode verificationMode, int i2) {
        SpecificationComputer.VerificationMode verificationMode2 = (i2 & 1) != 0 ? SpecificationComputer.VerificationMode.QUIET : null;
        Intrinsics.m32179h(verificationMode2, "verificationMode");
        this.f6761a = verificationMode2;
    }
}
