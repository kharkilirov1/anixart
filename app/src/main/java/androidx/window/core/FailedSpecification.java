package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SpecificationComputer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/window/core/FailedSpecification;", "", "T", "Landroidx/window/core/SpecificationComputer;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {

    /* renamed from: b */
    @NotNull
    public final T f6684b;

    /* renamed from: c */
    @NotNull
    public final String f6685c;

    /* renamed from: d */
    @NotNull
    public final String f6686d;

    /* renamed from: e */
    @NotNull
    public final Logger f6687e;

    /* renamed from: f */
    @NotNull
    public final SpecificationComputer.VerificationMode f6688f;

    /* renamed from: g */
    @NotNull
    public final WindowStrictModeException f6689g;

    /* compiled from: SpecificationComputer.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
        }
    }

    public FailedSpecification(@NotNull T value, @NotNull String tag, @NotNull String str, @NotNull Logger logger, @NotNull SpecificationComputer.VerificationMode verificationMode) {
        Collection collection;
        Intrinsics.m32179h(value, "value");
        Intrinsics.m32179h(tag, "tag");
        Intrinsics.m32179h(logger, "logger");
        Intrinsics.m32179h(verificationMode, "verificationMode");
        this.f6684b = value;
        this.f6685c = tag;
        this.f6686d = str;
        this.f6687e = logger;
        this.f6688f = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(m4419b(value, str));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        Intrinsics.m32178g(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (!(length >= 0)) {
            throw new IllegalArgumentException(C0000a.m8e("Requested element count ", length, " is less than zero.").toString());
        }
        if (length == 0) {
            collection = EmptyList.f63144b;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = ArraysKt.m31952b0(stackTrace);
            } else if (length == 1) {
                collection = CollectionsKt.m31993F(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i2 = length2 - length; i2 < length2; i2++) {
                    arrayList.add(stackTrace[i2]);
                }
                collection = arrayList;
            }
        }
        Object[] array = collection.toArray(new StackTraceElement[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.f6689g = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    @Nullable
    /* renamed from: a */
    public T mo4417a() {
        int ordinal = this.f6688f.ordinal();
        if (ordinal == 0) {
            throw this.f6689g;
        }
        if (ordinal == 1) {
            this.f6687e.mo4414a(this.f6685c, m4419b(this.f6684b, this.f6686d));
            return null;
        }
        if (ordinal == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    /* renamed from: c */
    public SpecificationComputer<T> mo4418c(@NotNull String str, @NotNull Function1<? super T, Boolean> condition) {
        Intrinsics.m32179h(condition, "condition");
        return this;
    }
}
