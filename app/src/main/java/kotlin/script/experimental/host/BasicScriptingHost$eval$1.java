package kotlin.script.experimental.host;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.script.experimental.api.CompiledScript;
import kotlin.script.experimental.api.ErrorHandlingKt;
import kotlin.script.experimental.api.EvaluationResult;
import kotlin.script.experimental.api.ResultWithDiagnostics;
import kotlin.script.experimental.api.ScriptCompilationConfiguration;
import kotlin.script.experimental.api.ScriptEvaluationConfiguration;
import kotlin.script.experimental.api.SourceCode;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicScriptingHost.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "Lkotlin/script/experimental/api/ResultWithDiagnostics;", "Lkotlin/script/experimental/api/EvaluationResult;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 1, 13})
@DebugMetadata(m32125c = "kotlin/script/experimental/host/BasicScriptingHost$eval$1", m32126f = "BasicScriptingHost.kt", m32127l = {45, 48, 45}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BasicScriptingHost$eval$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResultWithDiagnostics<? extends EvaluationResult>>, Object> {

    /* renamed from: f */
    public CoroutineScope f66626f;

    /* renamed from: g */
    public int f66627g;

    /* renamed from: h */
    public final /* synthetic */ BasicScriptingHost f66628h;

    /* renamed from: i */
    public final /* synthetic */ SourceCode f66629i;

    /* renamed from: j */
    public final /* synthetic */ ScriptCompilationConfiguration f66630j;

    /* renamed from: k */
    public final /* synthetic */ ScriptEvaluationConfiguration f66631k;

    /* compiled from: BasicScriptingHost.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\u008a@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "Lkotlin/script/experimental/api/ResultWithDiagnostics;", "Lkotlin/script/experimental/api/EvaluationResult;", "it", "Lkotlin/script/experimental/api/CompiledScript;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 1, 13})
    @DebugMetadata(m32125c = "kotlin/script/experimental/host/BasicScriptingHost$eval$1$1", m32126f = "BasicScriptingHost.kt", m32127l = {46, 46}, m32128m = "invokeSuspend")
    /* renamed from: kotlin.script.experimental.host.BasicScriptingHost$eval$1$1 */
    public static final class C67651 extends SuspendLambda implements Function2<CompiledScript<?>, Continuation<? super ResultWithDiagnostics<? extends EvaluationResult>>, Object> {

        /* renamed from: f */
        public CompiledScript f66632f;

        /* renamed from: g */
        public int f66633g;

        public C67651(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        /* renamed from: a */
        public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.m32180i(completion, "completion");
            C67651 c67651 = BasicScriptingHost$eval$1.this.new C67651(completion);
            c67651.f66632f = (CompiledScript) obj;
            return c67651;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CompiledScript<?> compiledScript, Continuation<? super ResultWithDiagnostics<? extends EvaluationResult>> continuation) {
            Continuation<? super ResultWithDiagnostics<? extends EvaluationResult>> completion = continuation;
            Intrinsics.m32180i(completion, "completion");
            C67651 c67651 = BasicScriptingHost$eval$1.this.new C67651(completion);
            c67651.f66632f = compiledScript;
            Unit unit = Unit.f63088a;
            c67651.mo2379m(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /* renamed from: m */
        public final Object mo2379m(@NotNull Object obj) {
            int i2 = this.f66633g;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (obj instanceof Result.Failure) {
                    throw ((Result.Failure) obj).f63061b;
                }
                return obj;
            }
            if (obj instanceof Result.Failure) {
                throw ((Result.Failure) obj).f63061b;
            }
            Objects.requireNonNull(BasicScriptingHost$eval$1.this.f66628h);
            ScriptEvaluationConfiguration scriptEvaluationConfiguration = BasicScriptingHost$eval$1.this.f66631k;
            this.f66633g = 1;
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicScriptingHost$eval$1(BasicScriptingHost basicScriptingHost, SourceCode sourceCode, ScriptCompilationConfiguration scriptCompilationConfiguration, ScriptEvaluationConfiguration scriptEvaluationConfiguration, Continuation continuation) {
        super(2, continuation);
        this.f66628h = basicScriptingHost;
        this.f66629i = sourceCode;
        this.f66630j = scriptCompilationConfiguration;
        this.f66631k = scriptEvaluationConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.m32180i(completion, "completion");
        BasicScriptingHost$eval$1 basicScriptingHost$eval$1 = new BasicScriptingHost$eval$1(this.f66628h, this.f66629i, this.f66630j, this.f66631k, completion);
        basicScriptingHost$eval$1.f66626f = (CoroutineScope) obj;
        return basicScriptingHost$eval$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResultWithDiagnostics<? extends EvaluationResult>> continuation) {
        return ((BasicScriptingHost$eval$1) mo2378a(coroutineScope, continuation)).mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f66627g;
        if (i2 == 0) {
            if (obj instanceof Result.Failure) {
                throw ((Result.Failure) obj).f63061b;
            }
            Objects.requireNonNull(this.f66628h);
            this.f66627g = 1;
            throw null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj instanceof Result.Failure) {
                throw ((Result.Failure) obj).f63061b;
            }
        } else {
            if (obj instanceof Result.Failure) {
                throw ((Result.Failure) obj).f63061b;
            }
            C67651 c67651 = new C67651(null);
            this.f66627g = 2;
            obj = ErrorHandlingKt.m33813a((ResultWithDiagnostics) obj, c67651, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
