package kotlin.sequences;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m31884d2 = {"T", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", m32126f = "Sequences.kt", m32127l = {145}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f66730d;

    /* renamed from: e */
    public int f66731e;

    /* renamed from: f */
    public /* synthetic */ Object f66732f;

    /* renamed from: g */
    public final /* synthetic */ Sequence<Object> f66733g;

    /* renamed from: h */
    public final /* synthetic */ Random f66734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$shuffled$1(Sequence<Object> sequence, Random random, Continuation<? super SequencesKt__SequencesKt$shuffled$1> continuation) {
        super(2, continuation);
        this.f66733g = sequence;
        this.f66734h = random;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.f66733g, this.f66734h, continuation);
        sequencesKt__SequencesKt$shuffled$1.f66732f = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.f66733g, this.f66734h, continuation);
        sequencesKt__SequencesKt$shuffled$1.f66732f = sequenceScope;
        return sequencesKt__SequencesKt$shuffled$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        List m33832B;
        SequenceScope sequenceScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f66731e;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.f66732f;
            m33832B = SequencesKt.m33832B(this.f66733g);
            sequenceScope = sequenceScope2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m33832B = (List) this.f66730d;
            sequenceScope = (SequenceScope) this.f66732f;
            ResultKt.m31892b(obj);
        }
        while (!m33832B.isEmpty()) {
            int mo32227c = this.f66734h.mo32227c(m33832B.size());
            Object m32006S = CollectionsKt.m32006S(m33832B);
            if (mo32227c < m33832B.size()) {
                m32006S = m33832B.set(mo32227c, m32006S);
            }
            this.f66732f = sequenceScope;
            this.f66730d = m33832B;
            this.f66731e = 1;
            if (sequenceScope.mo33827a(m32006S, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f63088a;
    }
}
