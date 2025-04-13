package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivTransitionTrigger.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivTransitionTrigger;", "", "Converter", "DATA_CHANGE", "STATE_CHANGE", "VISIBILITY_CHANGE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivTransitionTrigger {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");


    /* renamed from: c */
    @NotNull
    public static final Converter f40582c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivTransitionTrigger> f40583d = new Function1<String, DivTransitionTrigger>() { // from class: com.yandex.div2.DivTransitionTrigger$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivTransitionTrigger invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivTransitionTrigger divTransitionTrigger = DivTransitionTrigger.DATA_CHANGE;
            if (Intrinsics.m32174c(string, "data_change")) {
                return divTransitionTrigger;
            }
            DivTransitionTrigger divTransitionTrigger2 = DivTransitionTrigger.STATE_CHANGE;
            if (Intrinsics.m32174c(string, "state_change")) {
                return divTransitionTrigger2;
            }
            DivTransitionTrigger divTransitionTrigger3 = DivTransitionTrigger.VISIBILITY_CHANGE;
            if (Intrinsics.m32174c(string, "visibility_change")) {
                return divTransitionTrigger3;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f40588b;

    /* compiled from: DivTransitionTrigger.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTransitionTrigger$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17723a(@NotNull DivTransitionTrigger divTransitionTrigger) {
            return divTransitionTrigger.f40588b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivTransitionTrigger(String str) {
        this.f40588b = str;
    }
}
