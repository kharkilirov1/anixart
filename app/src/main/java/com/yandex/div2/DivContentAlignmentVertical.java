package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivContentAlignmentVertical.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div2/DivContentAlignmentVertical;", "", "Converter", "TOP", "CENTER", "BOTTOM", "BASELINE", "SPACE_BETWEEN", "SPACE_AROUND", "SPACE_EVENLY", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivContentAlignmentVertical {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    /* renamed from: c */
    @NotNull
    public static final Converter f35204c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivContentAlignmentVertical> f35205d = new Function1<String, DivContentAlignmentVertical>() { // from class: com.yandex.div2.DivContentAlignmentVertical$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivContentAlignmentVertical invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
            if (Intrinsics.m32174c(string, "top")) {
                return divContentAlignmentVertical;
            }
            DivContentAlignmentVertical divContentAlignmentVertical2 = DivContentAlignmentVertical.CENTER;
            if (Intrinsics.m32174c(string, "center")) {
                return divContentAlignmentVertical2;
            }
            DivContentAlignmentVertical divContentAlignmentVertical3 = DivContentAlignmentVertical.BOTTOM;
            if (Intrinsics.m32174c(string, "bottom")) {
                return divContentAlignmentVertical3;
            }
            DivContentAlignmentVertical divContentAlignmentVertical4 = DivContentAlignmentVertical.BASELINE;
            if (Intrinsics.m32174c(string, "baseline")) {
                return divContentAlignmentVertical4;
            }
            DivContentAlignmentVertical divContentAlignmentVertical5 = DivContentAlignmentVertical.SPACE_BETWEEN;
            if (Intrinsics.m32174c(string, "space-between")) {
                return divContentAlignmentVertical5;
            }
            DivContentAlignmentVertical divContentAlignmentVertical6 = DivContentAlignmentVertical.SPACE_AROUND;
            if (Intrinsics.m32174c(string, "space-around")) {
                return divContentAlignmentVertical6;
            }
            DivContentAlignmentVertical divContentAlignmentVertical7 = DivContentAlignmentVertical.SPACE_EVENLY;
            if (Intrinsics.m32174c(string, "space-evenly")) {
                return divContentAlignmentVertical7;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f35214b;

    /* compiled from: DivContentAlignmentVertical.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivContentAlignmentVertical$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivContentAlignmentVertical(String str) {
        this.f35214b = str;
    }
}
