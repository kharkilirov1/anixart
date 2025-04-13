package kotlinx.coroutines;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final /* data */ class CompletedContinuation {

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Object f66950a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final CancelHandler f66951b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final Function1<Throwable, Unit> f66952c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final Object f66953d;

    /* renamed from: e */
    @JvmField
    @Nullable
    public final Throwable f66954e;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(@Nullable Object obj, @Nullable CancelHandler cancelHandler, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        this.f66950a = obj;
        this.f66951b = cancelHandler;
        this.f66952c = function1;
        this.f66953d = obj2;
        this.f66954e = th;
    }

    /* renamed from: a */
    public static CompletedContinuation m34003a(CompletedContinuation completedContinuation, Object obj, CancelHandler cancelHandler, Function1 function1, Object obj2, Throwable th, int i2) {
        Object obj3 = (i2 & 1) != 0 ? completedContinuation.f66950a : null;
        if ((i2 & 2) != 0) {
            cancelHandler = completedContinuation.f66951b;
        }
        CancelHandler cancelHandler2 = cancelHandler;
        Function1<Throwable, Unit> function12 = (i2 & 4) != 0 ? completedContinuation.f66952c : null;
        Object obj4 = (i2 & 8) != 0 ? completedContinuation.f66953d : null;
        if ((i2 & 16) != 0) {
            th = completedContinuation.f66954e;
        }
        Objects.requireNonNull(completedContinuation);
        return new CompletedContinuation(obj3, cancelHandler2, function12, obj4, th);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return Intrinsics.m32174c(this.f66950a, completedContinuation.f66950a) && Intrinsics.m32174c(this.f66951b, completedContinuation.f66951b) && Intrinsics.m32174c(this.f66952c, completedContinuation.f66952c) && Intrinsics.m32174c(this.f66953d, completedContinuation.f66953d) && Intrinsics.m32174c(this.f66954e, completedContinuation.f66954e);
    }

    public int hashCode() {
        Object obj = this.f66950a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        CancelHandler cancelHandler = this.f66951b;
        int hashCode2 = (hashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.f66952c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f66953d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f66954e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CompletedContinuation(result=");
        m24u.append(this.f66950a);
        m24u.append(", cancelHandler=");
        m24u.append(this.f66951b);
        m24u.append(", onCancellation=");
        m24u.append(this.f66952c);
        m24u.append(", idempotentResume=");
        m24u.append(this.f66953d);
        m24u.append(", cancelCause=");
        m24u.append(this.f66954e);
        m24u.append(')');
        return m24u.toString();
    }

    public CompletedContinuation(Object obj, CancelHandler cancelHandler, Function1 function1, Object obj2, Throwable th, int i2) {
        cancelHandler = (i2 & 2) != 0 ? null : cancelHandler;
        function1 = (i2 & 4) != 0 ? null : function1;
        obj2 = (i2 & 8) != 0 ? null : obj2;
        th = (i2 & 16) != 0 ? null : th;
        this.f66950a = obj;
        this.f66951b = cancelHandler;
        this.f66952c = function1;
        this.f66953d = obj2;
        this.f66954e = th;
    }
}
