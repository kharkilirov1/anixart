package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivFontWeight.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivFontWeight;", "", "Converter", "LIGHT", "MEDIUM", "REGULAR", "BOLD", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivFontWeight {
    LIGHT("light"),
    MEDIUM("medium"),
    REGULAR("regular"),
    BOLD("bold");


    /* renamed from: c */
    @NotNull
    public static final Converter f35883c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivFontWeight> f35884d = new Function1<String, DivFontWeight>() { // from class: com.yandex.div2.DivFontWeight$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivFontWeight invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivFontWeight divFontWeight = DivFontWeight.LIGHT;
            if (Intrinsics.m32174c(string, "light")) {
                return divFontWeight;
            }
            DivFontWeight divFontWeight2 = DivFontWeight.MEDIUM;
            if (Intrinsics.m32174c(string, "medium")) {
                return divFontWeight2;
            }
            DivFontWeight divFontWeight3 = DivFontWeight.REGULAR;
            if (Intrinsics.m32174c(string, "regular")) {
                return divFontWeight3;
            }
            DivFontWeight divFontWeight4 = DivFontWeight.BOLD;
            if (Intrinsics.m32174c(string, "bold")) {
                return divFontWeight4;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f35890b;

    /* compiled from: DivFontWeight.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivFontWeight$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17623a(@NotNull DivFontWeight divFontWeight) {
            return divFontWeight.f35890b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivFontWeight(String str) {
        this.f35890b = str;
    }
}
