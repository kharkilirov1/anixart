package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntrinsicsJvm.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 */
/* loaded from: classes3.dex */
public final class C6530x96e8297a extends RestrictedContinuationImpl {

    /* renamed from: c */
    public int f63240c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public Object mo2379m(@NotNull Object obj) {
        int i2 = this.f63240c;
        if (i2 == 0) {
            this.f63240c = 1;
            ResultKt.m31892b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f63240c = 2;
        ResultKt.m31892b(obj);
        return obj;
    }
}
