package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.VariableProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: VariableFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/GetNumberValue;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GetNumberValue extends Function {

    /* renamed from: c */
    @NotNull
    public final VariableProvider f33405c;

    /* renamed from: d */
    @NotNull
    public final String f33406d;

    /* renamed from: e */
    @NotNull
    public final List<FunctionArgument> f33407e;

    /* renamed from: f */
    @NotNull
    public final EvaluableType f33408f;

    public GetNumberValue(@NotNull VariableProvider variableProvider) {
        super(variableProvider);
        this.f33405c = variableProvider;
        this.f33406d = "getNumberValue";
        EvaluableType evaluableType = EvaluableType.NUMBER;
        this.f33407e = CollectionsKt.m31994G(new FunctionArgument(EvaluableType.STRING, false), new FunctionArgument(evaluableType, false));
        this.f33408f = evaluableType;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @Override // com.yandex.div.evaluable.Function
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo17230a(@org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.m32179h(r3, r0)
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            java.lang.Object r3 = r3.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            com.yandex.div.evaluable.VariableProvider r1 = r2.f33405c
            java.lang.Object r1 = r1.get(r0)
            boolean r1 = r1 instanceof java.lang.Long
            if (r1 == 0) goto L1e
            goto L2b
        L1e:
            com.yandex.div.evaluable.VariableProvider r1 = r2.f33405c
            java.lang.Object r0 = r1.get(r0)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L2b
            java.lang.Number r0 = (java.lang.Number) r0
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L2f
            goto L30
        L2f:
            r3 = r0
        L30:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.function.GetNumberValue.mo17230a(java.util.List):java.lang.Object");
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return this.f33407e;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c, reason: from getter */
    public String getF33414d() {
        return this.f33406d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d, reason: from getter */
    public EvaluableType getF33416f() {
        return this.f33408f;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return false;
    }
}
