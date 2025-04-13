package io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: flowable.kt */
@Metadata(m31882bv = {1, 0, 2}, m31883d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005\"\b\b\u0002\u0010\u0004*\u00020\u00052\u0015\u0010\u0006\u001a\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u0011H\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r¢\u0006\u0004\b\u000e\u0010\u000f"}, m31884d2 = {"<anonymous>", "Lkotlin/Triple;", "T", "R", "U", "", "p1", "Lkotlin/ParameterName;", "name", "first", "p2", "second", "p3", "third", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m31885k = 3, m31886mv = {1, 1, 11})
/* loaded from: classes3.dex */
final class FlowableKt$combineLatest$3 extends FunctionReference implements Function3<Object, Object, Object, Triple<Object, Object, Object>> {
    static {
        new FlowableKt$combineLatest$3();
    }

    public FlowableKt$combineLatest$3() {
        super(3);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(Triple.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Triple<Object, Object, Object> mo16505k(Object p1, Object p2, Object p3) {
        Intrinsics.m32180i(p1, "p1");
        Intrinsics.m32180i(p2, "p2");
        Intrinsics.m32180i(p3, "p3");
        return new Triple<>(p1, p2, p3);
    }
}
