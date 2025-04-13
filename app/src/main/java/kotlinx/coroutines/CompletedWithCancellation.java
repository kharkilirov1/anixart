package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CompletionState.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/CompletedWithCancellation;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final /* data */ class CompletedWithCancellation {

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Object f66957a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Function1<Throwable, Unit> f66958b;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedWithCancellation(@Nullable Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        this.f66957a = obj;
        this.f66958b = function1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedWithCancellation)) {
            return false;
        }
        CompletedWithCancellation completedWithCancellation = (CompletedWithCancellation) obj;
        return Intrinsics.m32174c(this.f66957a, completedWithCancellation.f66957a) && Intrinsics.m32174c(this.f66958b, completedWithCancellation.f66958b);
    }

    public int hashCode() {
        Object obj = this.f66957a;
        return this.f66958b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CompletedWithCancellation(result=");
        m24u.append(this.f66957a);
        m24u.append(", onCancellation=");
        m24u.append(this.f66958b);
        m24u.append(')');
        return m24u.toString();
    }
}
