package com.yandex.div.core.expression.variables;

import com.yandex.div2.DivVariable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: DivVariablesParser.kt */
@Metadata(m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31884d2 = {"<anonymous>", "", "it", "", "Lcom/yandex/div2/DivVariable;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m31885k = 3, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
final class DivVariablesParser$parse$listValidator$1 extends Lambda implements Function1<List<? extends DivVariable>, Boolean> {
    static {
        new DivVariablesParser$parse$listValidator$1();
    }

    public DivVariablesParser$parse$listValidator$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Boolean invoke(List<? extends DivVariable> list) {
        List<? extends DivVariable> it = list;
        Intrinsics.m32179h(it, "it");
        return Boolean.TRUE;
    }
}
