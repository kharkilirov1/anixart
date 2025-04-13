package com.yandex.div.core.expression;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.data.Variable;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.core.expression.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2826a implements Disposable {

    /* renamed from: b */
    public final /* synthetic */ int f31202b;

    /* renamed from: c */
    public final /* synthetic */ Object f31203c;

    /* renamed from: d */
    public final /* synthetic */ Object f31204d;

    /* renamed from: e */
    public final /* synthetic */ Object f31205e;

    public /* synthetic */ C2826a(Object obj, Object obj2, Function function, int i2) {
        this.f31202b = i2;
        this.f31204d = obj;
        this.f31203c = obj2;
        this.f31205e = function;
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.f31202b) {
            case 0:
                ExpressionResolverImpl this$0 = (ExpressionResolverImpl) this.f31204d;
                String rawExpression = (String) this.f31203c;
                Function0<Unit> callback = (Function0) this.f31205e;
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(rawExpression, "$rawExpression");
                Intrinsics.m32179h(callback, "$callback");
                ObserverList<Function0<Unit>> observerList = this$0.f31188g.get(rawExpression);
                if (observerList != null) {
                    observerList.m16614e(callback);
                    break;
                }
                break;
            case 1:
                VariableController this$02 = (VariableController) this.f31204d;
                String name = (String) this.f31203c;
                Function1<Variable, Unit> observer = (Function1) this.f31205e;
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(name, "$name");
                Intrinsics.m32179h(observer, "$observer");
                ObserverList<Function1<Variable, Unit>> observerList2 = this$02.f31261c.get(name);
                if (observerList2 != null) {
                    observerList2.m16614e(observer);
                    break;
                }
                break;
            default:
                List names = (List) this.f31204d;
                VariableController this$03 = (VariableController) this.f31203c;
                Function1<Variable, Unit> observer2 = (Function1) this.f31205e;
                Intrinsics.m32179h(names, "$names");
                Intrinsics.m32179h(this$03, "this$0");
                Intrinsics.m32179h(observer2, "$observer");
                Iterator it = names.iterator();
                while (it.hasNext()) {
                    ObserverList<Function1<Variable, Unit>> observerList3 = this$03.f31261c.get((String) it.next());
                    if (observerList3 != null) {
                        observerList3.m16614e(observer2);
                    }
                }
                break;
        }
    }
}
