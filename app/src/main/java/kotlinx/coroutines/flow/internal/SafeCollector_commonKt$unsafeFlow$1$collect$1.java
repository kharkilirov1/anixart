package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeCollector.common.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 176)
/* loaded from: classes3.dex */
public final class SafeCollector_commonKt$unsafeFlow$1$collect$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f68221e;

    /* renamed from: f */
    public int f68222f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68221e = obj;
        this.f68222f |= Integer.MIN_VALUE;
        throw null;
    }
}
