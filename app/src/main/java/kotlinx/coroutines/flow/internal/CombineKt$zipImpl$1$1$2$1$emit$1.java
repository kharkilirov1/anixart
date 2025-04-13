package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Combine.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", m32126f = "Combine.kt", m32127l = {131}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class CombineKt$zipImpl$1$1$2$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f68191e;

    /* renamed from: f */
    public final /* synthetic */ CombineKt$zipImpl$1$1.C68462.AnonymousClass1<T> f68192f;

    /* renamed from: g */
    public int f68193g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1$2$1$emit$1(CombineKt$zipImpl$1$1.C68462.AnonymousClass1<? super T> anonymousClass1, Continuation<? super CombineKt$zipImpl$1$1$2$1$emit$1> continuation) {
        super(continuation);
        this.f68192f = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68191e = obj;
        this.f68193g |= Integer.MIN_VALUE;
        return this.f68192f.mo4139f(null, this);
    }
}
