package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.StartedLazily$command$1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharingStarted.kt */
@Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
@DebugMetadata(m32125c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m32126f = "SharingStarted.kt", m32127l = {158}, m32128m = "emit")
/* loaded from: classes3.dex */
public final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: e */
    public /* synthetic */ Object f68056e;

    /* renamed from: f */
    public final /* synthetic */ StartedLazily$command$1.C68411<T> f68057f;

    /* renamed from: g */
    public int f68058g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StartedLazily$command$1$1$emit$1(StartedLazily$command$1.C68411<? super T> c68411, Continuation<? super StartedLazily$command$1$1$emit$1> continuation) {
        super(continuation);
        this.f68057f = c68411;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        this.f68056e = obj;
        this.f68058g |= Integer.MIN_VALUE;
        return this.f68057f.m34247a(0, this);
    }
}
