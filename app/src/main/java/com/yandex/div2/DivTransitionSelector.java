package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTransitionSelector.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivTransitionSelector;", "", "Converter", "NONE", "DATA_CHANGE", "STATE_CHANGE", "ANY_CHANGE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivTransitionSelector {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");


    /* renamed from: c */
    @NotNull
    public static final Converter f40573c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivTransitionSelector> f40574d = new Function1<String, DivTransitionSelector>() { // from class: com.yandex.div2.DivTransitionSelector$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivTransitionSelector invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
            if (Intrinsics.m32174c(string, "none")) {
                return divTransitionSelector;
            }
            DivTransitionSelector divTransitionSelector2 = DivTransitionSelector.DATA_CHANGE;
            if (Intrinsics.m32174c(string, "data_change")) {
                return divTransitionSelector2;
            }
            DivTransitionSelector divTransitionSelector3 = DivTransitionSelector.STATE_CHANGE;
            if (Intrinsics.m32174c(string, "state_change")) {
                return divTransitionSelector3;
            }
            DivTransitionSelector divTransitionSelector4 = DivTransitionSelector.ANY_CHANGE;
            if (Intrinsics.m32174c(string, "any_change")) {
                return divTransitionSelector4;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f40580b;

    /* compiled from: DivTransitionSelector.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTransitionSelector$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17722a(@NotNull DivTransitionSelector divTransitionSelector) {
            return divTransitionSelector.f40580b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivTransitionSelector(String str) {
        this.f40580b = str;
    }
}
