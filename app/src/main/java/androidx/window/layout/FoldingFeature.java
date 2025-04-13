package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: FoldingFeature.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/window/layout/FoldingFeature;", "Landroidx/window/layout/DisplayFeature;", "OcclusionType", "Orientation", "State", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface FoldingFeature extends DisplayFeature {

    /* compiled from: FoldingFeature.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType;", "", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class OcclusionType {

        /* renamed from: a */
        @NotNull
        public final String f6740a;

        /* compiled from: FoldingFeature.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType$Companion;", "", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "FULL", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "NONE", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
        }

        @NotNull
        /* renamed from: toString, reason: from getter */
        public String getF6740a() {
            return this.f6740a;
        }
    }

    /* compiled from: FoldingFeature.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/layout/FoldingFeature$Orientation;", "", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Orientation {

        /* renamed from: b */
        @JvmField
        @NotNull
        public static final Orientation f6741b = new Orientation("VERTICAL");

        /* renamed from: c */
        @JvmField
        @NotNull
        public static final Orientation f6742c = new Orientation("HORIZONTAL");

        /* renamed from: a */
        @NotNull
        public final String f6743a;

        /* compiled from: FoldingFeature.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Landroidx/window/layout/FoldingFeature$Orientation$Companion;", "", "Landroidx/window/layout/FoldingFeature$Orientation;", "HORIZONTAL", "Landroidx/window/layout/FoldingFeature$Orientation;", "VERTICAL", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
        }

        public Orientation(String str) {
            this.f6743a = str;
        }

        @NotNull
        /* renamed from: toString, reason: from getter */
        public String getF6743a() {
            return this.f6743a;
        }
    }

    /* compiled from: FoldingFeature.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/window/layout/FoldingFeature$State;", "", "Companion", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class State {

        /* renamed from: b */
        @JvmField
        @NotNull
        public static final State f6744b = new State("FLAT");

        /* renamed from: c */
        @JvmField
        @NotNull
        public static final State f6745c = new State("HALF_OPENED");

        /* renamed from: a */
        @NotNull
        public final String f6746a;

        /* compiled from: FoldingFeature.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Landroidx/window/layout/FoldingFeature$State$Companion;", "", "Landroidx/window/layout/FoldingFeature$State;", "FLAT", "Landroidx/window/layout/FoldingFeature$State;", "HALF_OPENED", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
        public static final class Companion {
        }

        public State(String str) {
            this.f6746a = str;
        }

        @NotNull
        /* renamed from: toString, reason: from getter */
        public String getF6746a() {
            return this.f6746a;
        }
    }

    /* renamed from: a */
    boolean mo4440a();

    @NotNull
    /* renamed from: b */
    Orientation mo4441b();
}
