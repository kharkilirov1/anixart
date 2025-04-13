package androidx.window.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SpecificationComputer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/window/core/SpecificationComputer;", "", "T", "Companion", "VerificationMode", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class SpecificationComputer<T> {

    /* renamed from: a */
    @NotNull
    public static final Companion f6690a = new Companion(null);

    /* compiled from: SpecificationComputer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/core/SpecificationComputer$Companion;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public static SpecificationComputer m4420a(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i2) {
            if ((i2 & 2) != 0) {
                verificationMode = VerificationMode.QUIET;
            }
            AndroidLogger logger2 = (i2 & 4) != 0 ? AndroidLogger.f6679a : null;
            Intrinsics.m32179h(verificationMode, "verificationMode");
            Intrinsics.m32179h(logger2, "logger");
            return new ValidSpecification(obj, str, verificationMode, logger2);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: SpecificationComputer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Landroidx/window/core/SpecificationComputer$VerificationMode;", "", "STRICT", "LOG", "QUIET", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    @Nullable
    /* renamed from: a */
    public abstract T mo4417a();

    @NotNull
    /* renamed from: b */
    public final String m4419b(@NotNull Object value, @NotNull String message) {
        Intrinsics.m32179h(value, "value");
        Intrinsics.m32179h(message, "message");
        return message + " value: " + value;
    }

    @NotNull
    /* renamed from: c */
    public abstract SpecificationComputer<T> mo4418c(@NotNull String str, @NotNull Function1<? super T, Boolean> function1);
}
