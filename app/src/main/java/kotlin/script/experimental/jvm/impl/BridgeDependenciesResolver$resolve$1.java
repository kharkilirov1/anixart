package kotlin.script.experimental.jvm.impl;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.script.dependencies.ScriptContents;
import kotlin.script.experimental.api.ScriptCollectedData;
import kotlin.script.experimental.api.ScriptCompilationKt;
import kotlin.script.experimental.api.ScriptDataKt;
import kotlin.script.experimental.dependencies.DependenciesResolver;
import kotlin.script.experimental.dependencies.ScriptReport;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BridgeDependenciesResolver.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, m31884d2 = {"<anonymous>", "Lkotlin/script/experimental/dependencies/DependenciesResolver$ResolveResult;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 1, 13})
@DebugMetadata(m32125c = "kotlin/script/experimental/jvm/impl/BridgeDependenciesResolver$resolve$1", m32126f = "BridgeDependenciesResolver.kt", m32127l = {28, 28}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BridgeDependenciesResolver$resolve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DependenciesResolver.ResolveResult>, Object> {

    /* renamed from: f */
    public CoroutineScope f66646f;

    /* renamed from: g */
    public int f66647g;

    /* renamed from: h */
    public final /* synthetic */ BridgeDependenciesResolver f66648h;

    /* renamed from: i */
    public final /* synthetic */ ScriptContents f66649i;

    /* renamed from: j */
    public final /* synthetic */ Map f66650j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgeDependenciesResolver$resolve$1(BridgeDependenciesResolver bridgeDependenciesResolver, ScriptContents scriptContents, Map map, Continuation continuation) {
        super(2, continuation);
        this.f66648h = bridgeDependenciesResolver;
        this.f66649i = scriptContents;
        this.f66650j = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.m32180i(completion, "completion");
        BridgeDependenciesResolver$resolve$1 bridgeDependenciesResolver$resolve$1 = new BridgeDependenciesResolver$resolve$1(this.f66648h, this.f66649i, this.f66650j, completion);
        bridgeDependenciesResolver$resolve$1.f66646f = (CoroutineScope) obj;
        return bridgeDependenciesResolver$resolve$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DependenciesResolver.ResolveResult> continuation) {
        Continuation<? super DependenciesResolver.ResolveResult> completion = continuation;
        Intrinsics.m32180i(completion, "completion");
        BridgeDependenciesResolver$resolve$1 bridgeDependenciesResolver$resolve$1 = new BridgeDependenciesResolver$resolve$1(this.f66648h, this.f66649i, this.f66650j, completion);
        bridgeDependenciesResolver$resolve$1.f66646f = coroutineScope;
        return bridgeDependenciesResolver$resolve$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f66647g;
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
        BridgeDependenciesResolver bridgeDependenciesResolver = this.f66648h;
        ScriptContents scriptContents = this.f66649i;
        this.f66647g = 1;
        Objects.requireNonNull(bridgeDependenciesResolver);
        try {
            new ArrayList();
            KProperty[] kPropertyArr = ScriptDataKt.f66601a;
            new ScriptCollectedData(MapsKt.m32063h(new Pair(ScriptDataKt.f66602b.m33821a(ScriptDataKt.f66601a[0]), scriptContents.getAnnotations())));
            KProperty[] kPropertyArr2 = ScriptCompilationKt.f66594a;
            ScriptCompilationKt.f66600g.m33821a(ScriptCompilationKt.f66594a[9]);
            throw null;
        } catch (Throwable th) {
            ScriptReport[] scriptReportArr = new ScriptReport[1];
            String message = th.getMessage();
            if (message == null) {
                message = "unknown error " + th;
            }
            scriptReportArr[0] = new ScriptReport(message, null, null, 6);
            DependenciesResolver.ResolveResult.Failure failure = new DependenciesResolver.ResolveResult.Failure(scriptReportArr);
            return failure == coroutineSingletons ? coroutineSingletons : failure;
        }
    }
}
