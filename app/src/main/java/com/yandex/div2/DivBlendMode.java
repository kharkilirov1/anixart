package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivBlendMode.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivBlendMode;", "", "Converter", "SOURCE_IN", "SOURCE_ATOP", "DARKEN", "LIGHTEN", "MULTIPLY", "SCREEN", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivBlendMode {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");


    /* renamed from: c */
    @NotNull
    public static final Converter f34766c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivBlendMode> f34767d = new Function1<String, DivBlendMode>() { // from class: com.yandex.div2.DivBlendMode$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivBlendMode invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
            if (Intrinsics.m32174c(string, "source_in")) {
                return divBlendMode;
            }
            DivBlendMode divBlendMode2 = DivBlendMode.SOURCE_ATOP;
            if (Intrinsics.m32174c(string, "source_atop")) {
                return divBlendMode2;
            }
            DivBlendMode divBlendMode3 = DivBlendMode.DARKEN;
            if (Intrinsics.m32174c(string, "darken")) {
                return divBlendMode3;
            }
            DivBlendMode divBlendMode4 = DivBlendMode.LIGHTEN;
            if (Intrinsics.m32174c(string, "lighten")) {
                return divBlendMode4;
            }
            DivBlendMode divBlendMode5 = DivBlendMode.MULTIPLY;
            if (Intrinsics.m32174c(string, "multiply")) {
                return divBlendMode5;
            }
            DivBlendMode divBlendMode6 = DivBlendMode.SCREEN;
            if (Intrinsics.m32174c(string, "screen")) {
                return divBlendMode6;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f34775b;

    /* compiled from: DivBlendMode.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivBlendMode$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17589a(@NotNull DivBlendMode divBlendMode) {
            return divBlendMode.f34775b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivBlendMode(String str) {
        this.f34775b = str;
    }
}
