package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpecificationComputer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/window/core/ValidSpecification;", "", "T", "Landroidx/window/core/SpecificationComputer;", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ValidSpecification<T> extends SpecificationComputer<T> {

    /* renamed from: b */
    @NotNull
    public final T f6695b;

    /* renamed from: c */
    @NotNull
    public final String f6696c;

    /* renamed from: d */
    @NotNull
    public final SpecificationComputer.VerificationMode f6697d;

    /* renamed from: e */
    @NotNull
    public final Logger f6698e;

    public ValidSpecification(@NotNull T t, @NotNull String str, @NotNull SpecificationComputer.VerificationMode verificationMode, @NotNull Logger logger) {
        this.f6695b = t;
        this.f6696c = str;
        this.f6697d = verificationMode;
        this.f6698e = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    /* renamed from: a */
    public T mo4417a() {
        return this.f6695b;
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    /* renamed from: c */
    public SpecificationComputer<T> mo4418c(@NotNull String str, @NotNull Function1<? super T, Boolean> condition) {
        Intrinsics.m32179h(condition, "condition");
        return condition.invoke(this.f6695b).booleanValue() ? this : new FailedSpecification(this.f6695b, this.f6696c, str, this.f6698e, this.f6697d);
    }
}
