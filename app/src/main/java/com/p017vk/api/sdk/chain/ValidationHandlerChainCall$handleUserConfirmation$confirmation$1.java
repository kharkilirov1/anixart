package com.p017vk.api.sdk.chain;

import com.p017vk.api.sdk.VKApiValidationHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: ValidationHandlerChainCall.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t2\u001b\u0010\n\u001a\u0017\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r¢\u0006\u0002\b\u000e"}, m31884d2 = {"<anonymous>", "", "T", "p1", "Lcom/vk/api/sdk/VKApiValidationHandler;", "p2", "", "Lkotlin/ParameterName;", "name", "confirmationText", "p3", "Lcom/vk/api/sdk/VKApiValidationHandler$Callback;", "", "cb", "invoke"}, m31885k = 3, m31886mv = {1, 1, 16})
/* loaded from: classes2.dex */
final /* synthetic */ class ValidationHandlerChainCall$handleUserConfirmation$confirmation$1 extends FunctionReference implements Function3<VKApiValidationHandler, String, VKApiValidationHandler.Callback<Boolean>, Unit> {

    /* renamed from: d */
    public static final ValidationHandlerChainCall$handleUserConfirmation$confirmation$1 f30695d = new ValidationHandlerChainCall$handleUserConfirmation$confirmation$1();

    public ValidationHandlerChainCall$handleUserConfirmation$confirmation$1() {
        super(3);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "handleConfirm";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(VKApiValidationHandler.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "handleConfirm(Ljava/lang/String;Lcom/vk/api/sdk/VKApiValidationHandler$Callback;)V";
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Unit mo16505k(VKApiValidationHandler vKApiValidationHandler, String str, VKApiValidationHandler.Callback<Boolean> callback) {
        VKApiValidationHandler p1 = vKApiValidationHandler;
        String p2 = str;
        VKApiValidationHandler.Callback<Boolean> p3 = callback;
        Intrinsics.m32180i(p1, "p1");
        Intrinsics.m32180i(p2, "p2");
        Intrinsics.m32180i(p3, "p3");
        p1.mo16493b(p2, p3);
        return Unit.f63088a;
    }
}
