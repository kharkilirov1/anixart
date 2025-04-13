package io.ashdavies.p030rx.rxtasks;

import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

/* compiled from: SingleTask.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, m31884d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class SingleTaskKt$asSingle$1 extends FunctionReference implements Function0<Object> {
    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "asRequired";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32194b(TaskKt.class, "rx-tasks_release");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "asRequired(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;";
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Object invoke() {
        return TaskKt.m30797a((Task) this.receiver);
    }
}
