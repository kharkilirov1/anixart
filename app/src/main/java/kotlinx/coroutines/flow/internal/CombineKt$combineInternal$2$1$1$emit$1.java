package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Combine.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m32126f = "Combine.kt", m32127l = {35, 36}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f68162e;

    /* renamed from: f */
    public final /* synthetic */ CombineKt$combineInternal$2.C68441.AnonymousClass1<T> f68163f;

    /* renamed from: g */
    public int f68164g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.C68441.AnonymousClass1<? super T> anonymousClass1, Continuation<? super CombineKt$combineInternal$2$1$1$emit$1> continuation) {
        super(continuation);
        this.f68163f = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68162e = obj;
        this.f68164g |= Integer.MIN_VALUE;
        return this.f68163f.mo4139f(null, this);
    }
}
