package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivImageScale.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivImageScale;", "", "Converter", "FILL", "NO_SCALE", "FIT", "STRETCH", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivImageScale {
    FILL("fill"),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");


    /* renamed from: c */
    @NotNull
    public static final Converter f36808c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivImageScale> f36809d = new Function1<String, DivImageScale>() { // from class: com.yandex.div2.DivImageScale$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivImageScale invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivImageScale divImageScale = DivImageScale.FILL;
            if (Intrinsics.m32174c(string, "fill")) {
                return divImageScale;
            }
            DivImageScale divImageScale2 = DivImageScale.NO_SCALE;
            if (Intrinsics.m32174c(string, "no_scale")) {
                return divImageScale2;
            }
            DivImageScale divImageScale3 = DivImageScale.FIT;
            if (Intrinsics.m32174c(string, "fit")) {
                return divImageScale3;
            }
            DivImageScale divImageScale4 = DivImageScale.STRETCH;
            if (Intrinsics.m32174c(string, "stretch")) {
                return divImageScale4;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f36815b;

    /* compiled from: DivImageScale.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivImageScale$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17633a(@NotNull DivImageScale divImageScale) {
            return divImageScale.f36815b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivImageScale(String str) {
        this.f36815b = str;
    }
}
