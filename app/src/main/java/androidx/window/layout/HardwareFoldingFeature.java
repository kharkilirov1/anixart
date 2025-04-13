package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HardwareFoldingFeature.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/window/layout/HardwareFoldingFeature;", "Landroidx/window/layout/FoldingFeature;", "Companion", "Type", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class HardwareFoldingFeature implements FoldingFeature {

    /* renamed from: a */
    @NotNull
    public final Bounds f6747a;

    /* renamed from: b, reason: from toString */
    @NotNull
    public final Type type;

    /* renamed from: c, reason: from toString */
    @NotNull
    public final FoldingFeature.State state;

    /* compiled from: HardwareFoldingFeature.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Companion;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    /* compiled from: HardwareFoldingFeature.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type;", "", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Type {

        /* renamed from: b */
        @NotNull
        public static final Type f6750b = new Type("FOLD");

        /* renamed from: c */
        @NotNull
        public static final Type f6751c = new Type("HINGE");

        /* renamed from: a */
        @NotNull
        public final String f6752a;

        /* compiled from: HardwareFoldingFeature.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type$Companion;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
        }

        public Type(String str) {
            this.f6752a = str;
        }

        @NotNull
        /* renamed from: toString, reason: from getter */
        public String getF6752a() {
            return this.f6752a;
        }
    }

    public HardwareFoldingFeature(@NotNull Bounds bounds, @NotNull Type type, @NotNull FoldingFeature.State state) {
        this.f6747a = bounds;
        this.type = type;
        this.state = state;
        if (!((bounds.m4416b() == 0 && bounds.m4415a() == 0) ? false : true)) {
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
        if (!(bounds.f6680a == 0 || bounds.f6681b == 0)) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
        }
    }

    @Override // androidx.window.layout.FoldingFeature
    /* renamed from: a */
    public boolean mo4440a() {
        if (Intrinsics.m32174c(this.type, Type.f6751c)) {
            return true;
        }
        return Intrinsics.m32174c(this.type, Type.f6750b) && Intrinsics.m32174c(this.state, FoldingFeature.State.f6745c);
    }

    @Override // androidx.window.layout.FoldingFeature
    @NotNull
    /* renamed from: b */
    public FoldingFeature.Orientation mo4441b() {
        return this.f6747a.m4416b() > this.f6747a.m4415a() ? FoldingFeature.Orientation.f6742c : FoldingFeature.Orientation.f6741b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.m32174c(HardwareFoldingFeature.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) obj;
        return Intrinsics.m32174c(this.f6747a, hardwareFoldingFeature.f6747a) && Intrinsics.m32174c(this.type, hardwareFoldingFeature.type) && Intrinsics.m32174c(this.state, hardwareFoldingFeature.state);
    }

    @Override // androidx.window.layout.DisplayFeature
    @NotNull
    public Rect getBounds() {
        Bounds bounds = this.f6747a;
        Objects.requireNonNull(bounds);
        return new Rect(bounds.f6680a, bounds.f6681b, bounds.f6682c, bounds.f6683d);
    }

    public int hashCode() {
        return this.state.hashCode() + ((this.type.hashCode() + (this.f6747a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return ((Object) "HardwareFoldingFeature") + " { " + this.f6747a + ", type=" + this.type + ", state=" + this.state + " }";
    }
}
