package io.ashdavies.p030rx.rxtasks;

import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: CompletableTask.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\b\u0002"}, m31884d2 = {"<anonymous>", "Ljava/lang/Void;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class CompletableTaskKt$asCompletable$1 extends FunctionReference implements Function0<Void> {
    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "asResult";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32194b(TaskKt.class, "rx-tasks_release");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "asResult(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;";
    }

    @Override // kotlin.jvm.functions.Function0
    public Void invoke() {
        return (Void) TaskKt.m30798b((Task) this.receiver);
    }
}
