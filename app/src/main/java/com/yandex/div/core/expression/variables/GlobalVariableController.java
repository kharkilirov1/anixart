package com.yandex.div.core.expression.variables;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.internal.util.SynchronizedList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GlobalVariableController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/variables/GlobalVariableController;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GlobalVariableController {

    /* renamed from: a */
    @NotNull
    public final SynchronizedList<Function1<String, Unit>> f31242a;

    /* renamed from: b */
    @NotNull
    public final Function1<String, Unit> f31243b;

    /* renamed from: c */
    @NotNull
    public final VariableSource f31244c;

    public GlobalVariableController() {
        new Handler(Looper.getMainLooper());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        SynchronizedList synchronizedList = new SynchronizedList();
        new LinkedHashSet();
        new LinkedHashSet();
        this.f31242a = new SynchronizedList<>();
        Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.yandex.div.core.expression.variables.GlobalVariableController$requestsObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(String str) {
                List m32027j0;
                String variableName = str;
                Intrinsics.m32179h(variableName, "variableName");
                SynchronizedList<Function1<String, Unit>> synchronizedList2 = GlobalVariableController.this.f31242a;
                synchronized (synchronizedList2.f33902a) {
                    m32027j0 = CollectionsKt.m32027j0(synchronizedList2.f33902a);
                }
                Iterator it = m32027j0.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(variableName);
                }
                return Unit.f63088a;
            }
        };
        this.f31243b = function1;
        this.f31244c = new VariableSource(concurrentHashMap, function1, synchronizedList);
    }
}
