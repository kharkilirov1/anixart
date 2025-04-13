package kotlinx.coroutines.debug.internal;

import com.yandex.mobile.ads.C4632R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugCoroutineInfoImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 6, 0})
@DebugMetadata(m32125c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", m32126f = "DebugCoroutineInfoImpl.kt", m32127l = {C4632R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DebugCoroutineInfoImpl$creationStackTrace$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super StackTraceElement>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public int f67417d;

    /* renamed from: e */
    public /* synthetic */ Object f67418e;

    /* renamed from: f */
    public final /* synthetic */ DebugCoroutineInfoImpl f67419f;

    /* renamed from: g */
    public final /* synthetic */ StackTraceFrame f67420g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$creationStackTrace$1(DebugCoroutineInfoImpl debugCoroutineInfoImpl, StackTraceFrame stackTraceFrame, Continuation<? super DebugCoroutineInfoImpl$creationStackTrace$1> continuation) {
        super(2, continuation);
        this.f67419f = debugCoroutineInfoImpl;
        this.f67420g = stackTraceFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.f67419f, this.f67420g, continuation);
        debugCoroutineInfoImpl$creationStackTrace$1.f67418e = obj;
        return debugCoroutineInfoImpl$creationStackTrace$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<? super StackTraceElement> sequenceScope, Continuation<? super Unit> continuation) {
        DebugCoroutineInfoImpl$creationStackTrace$1 debugCoroutineInfoImpl$creationStackTrace$1 = new DebugCoroutineInfoImpl$creationStackTrace$1(this.f67419f, this.f67420g, continuation);
        debugCoroutineInfoImpl$creationStackTrace$1.f67418e = sequenceScope;
        return debugCoroutineInfoImpl$creationStackTrace$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f67417d;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            SequenceScope sequenceScope = (SequenceScope) this.f67418e;
            DebugCoroutineInfoImpl debugCoroutineInfoImpl = this.f67419f;
            Objects.requireNonNull(this.f67420g);
            this.f67417d = 1;
            if (DebugCoroutineInfoImpl.m34202a(debugCoroutineInfoImpl, sequenceScope, null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m31892b(obj);
        }
        return Unit.f63088a;
    }
}
