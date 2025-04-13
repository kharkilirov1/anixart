package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: _Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m31884d2 = {"T", "R", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", m32126f = "_Sequences.kt", m32127l = {2864}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f66774d;

    /* renamed from: e */
    public Object f66775e;

    /* renamed from: f */
    public int f66776f;

    /* renamed from: g */
    public /* synthetic */ Object f66777g;

    /* renamed from: h */
    public final /* synthetic */ Sequence<Object> f66778h;

    /* renamed from: i */
    public final /* synthetic */ Function2<Object, Object, Object> f66779i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$zipWithNext$2(Sequence<Object> sequence, Function2<Object, Object, Object> function2, Continuation<? super SequencesKt___SequencesKt$zipWithNext$2> continuation) {
        super(2, continuation);
        this.f66778h = sequence;
        this.f66779i = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.f66778h, this.f66779i, continuation);
        sequencesKt___SequencesKt$zipWithNext$2.f66777g = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.f66778h, this.f66779i, continuation);
        sequencesKt___SequencesKt$zipWithNext$2.f66777g = sequenceScope;
        return sequencesKt___SequencesKt$zipWithNext$2.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        SequenceScope sequenceScope;
        Object next;
        Iterator<Object> it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f66776f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.f66777g;
            Iterator<Object> it2 = this.f66778h.iterator();
            if (!it2.hasNext()) {
                return Unit.f63088a;
            }
            sequenceScope = sequenceScope2;
            next = it2.next();
            it = it2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = this.f66775e;
            it = (Iterator) this.f66774d;
            sequenceScope = (SequenceScope) this.f66777g;
            ResultKt.m31892b(obj);
            next = obj2;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            Object invoke = this.f66779i.invoke(next, next2);
            this.f66777g = sequenceScope;
            this.f66774d = it;
            this.f66775e = next2;
            this.f66776f = 1;
            if (sequenceScope.mo33827a(invoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            next = next2;
        }
        return Unit.f63088a;
    }
}
