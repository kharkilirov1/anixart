package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivSizeUnit.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivSizeUnit;", "", "Converter", "DP", "SP", "PX", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivSizeUnit {
    DP("dp"),
    SP("sp"),
    PX("px");


    /* renamed from: c */
    @NotNull
    public static final Converter f38845c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivSizeUnit> f38846d = new Function1<String, DivSizeUnit>() { // from class: com.yandex.div2.DivSizeUnit$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivSizeUnit invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivSizeUnit divSizeUnit = DivSizeUnit.DP;
            if (Intrinsics.m32174c(string, "dp")) {
                return divSizeUnit;
            }
            DivSizeUnit divSizeUnit2 = DivSizeUnit.SP;
            if (Intrinsics.m32174c(string, "sp")) {
                return divSizeUnit2;
            }
            DivSizeUnit divSizeUnit3 = DivSizeUnit.PX;
            if (Intrinsics.m32174c(string, "px")) {
                return divSizeUnit3;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f38851b;

    /* compiled from: DivSizeUnit.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivSizeUnit$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17700a(@NotNull DivSizeUnit divSizeUnit) {
            return divSizeUnit.f38851b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivSizeUnit(String str) {
        this.f38851b = str;
    }
}
