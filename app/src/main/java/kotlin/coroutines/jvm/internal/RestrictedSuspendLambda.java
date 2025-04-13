package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContinuationImpl.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/FunctionBase;", "", "Lkotlin/coroutines/jvm/internal/SuspendFunction;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements FunctionBase<Object>, SuspendFunction {

    /* renamed from: c */
    public final int f63251c;

    public RestrictedSuspendLambda(int i2, @Nullable Continuation<Object> continuation) {
        super(continuation);
        this.f63251c = i2;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: getArity, reason: from getter */
    public int getF63251c() {
        return this.f63251c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public String toString() {
        if (this.f63242b != null) {
            return super.toString();
        }
        String m32198f = Reflection.m32198f(this);
        Intrinsics.m32178g(m32198f, "renderLambdaToString(this)");
        return m32198f;
    }
}
