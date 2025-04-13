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
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, m31884d2 = {"S", "T", "Lkotlin/sequences/SequenceScope;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", m32126f = "_Sequences.kt", m32127l = {2344, 2347}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<Object>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f66760d;

    /* renamed from: e */
    public Object f66761e;

    /* renamed from: f */
    public int f66762f;

    /* renamed from: g */
    public /* synthetic */ Object f66763g;

    /* renamed from: h */
    public final /* synthetic */ Sequence<Object> f66764h;

    /* renamed from: i */
    public final /* synthetic */ Function2<Object, Object, Object> f66765i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningReduce$1(Sequence<Object> sequence, Function2<Object, Object, Object> function2, Continuation<? super SequencesKt___SequencesKt$runningReduce$1> continuation) {
        super(2, continuation);
        this.f66764h = sequence;
        this.f66765i = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.f66764h, this.f66765i, continuation);
        sequencesKt___SequencesKt$runningReduce$1.f66763g = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<Object> sequenceScope, Continuation<? super Unit> continuation) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.f66764h, this.f66765i, continuation);
        sequencesKt___SequencesKt$runningReduce$1.f66763g = sequenceScope;
        return sequencesKt___SequencesKt$runningReduce$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        SequenceScope sequenceScope;
        Object next;
        Iterator<Object> it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f66762f;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            sequenceScope = (SequenceScope) this.f66763g;
            Iterator<Object> it2 = this.f66764h.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                this.f66763g = sequenceScope;
                this.f66760d = it2;
                this.f66761e = next;
                this.f66762f = 1;
                if (sequenceScope.mo33827a(next, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                it = it2;
            }
            return Unit.f63088a;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        next = this.f66761e;
        it = (Iterator) this.f66760d;
        sequenceScope = (SequenceScope) this.f66763g;
        ResultKt.m31892b(obj);
        while (it.hasNext()) {
            next = this.f66765i.invoke(next, it.next());
            this.f66763g = sequenceScope;
            this.f66760d = it;
            this.f66761e = next;
            this.f66762f = 2;
            if (sequenceScope.mo33827a(next, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f63088a;
    }
}
