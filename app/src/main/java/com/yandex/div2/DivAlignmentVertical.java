package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivAlignmentVertical.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivAlignmentVertical;", "", "Converter", "TOP", "CENTER", "BOTTOM", "BASELINE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivAlignmentVertical {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");


    /* renamed from: c */
    @NotNull
    public static final Converter f34625c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivAlignmentVertical> f34626d = new Function1<String, DivAlignmentVertical>() { // from class: com.yandex.div2.DivAlignmentVertical$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivAlignmentVertical invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
            if (Intrinsics.m32174c(string, "top")) {
                return divAlignmentVertical;
            }
            DivAlignmentVertical divAlignmentVertical2 = DivAlignmentVertical.CENTER;
            if (Intrinsics.m32174c(string, "center")) {
                return divAlignmentVertical2;
            }
            DivAlignmentVertical divAlignmentVertical3 = DivAlignmentVertical.BOTTOM;
            if (Intrinsics.m32174c(string, "bottom")) {
                return divAlignmentVertical3;
            }
            DivAlignmentVertical divAlignmentVertical4 = DivAlignmentVertical.BASELINE;
            if (Intrinsics.m32174c(string, "baseline")) {
                return divAlignmentVertical4;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f34632b;

    /* compiled from: DivAlignmentVertical.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAlignmentVertical$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17559a(@NotNull DivAlignmentVertical divAlignmentVertical) {
            return divAlignmentVertical.f34632b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivAlignmentVertical(String str) {
        this.f34632b = str;
    }
}
