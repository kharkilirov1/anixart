package com.yandex.div.internal.parser;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeHelpers.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div-json_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TypeHelpersKt {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final TypeHelper<Boolean> f33848a = new TypeHelper<Boolean>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_BOOLEAN$1
        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Boolean getF33854b() {
            return Boolean.FALSE;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: b */
        public boolean mo17371b(@NotNull Object value) {
            Intrinsics.m32179h(value, "value");
            return value instanceof Boolean;
        }
    };

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final TypeHelper<Long> f33849b = new TypeHelper<Long>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_INT$1
        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: a */
        public Long getF33854b() {
            return 0L;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: b */
        public boolean mo17371b(@NotNull Object value) {
            Intrinsics.m32179h(value, "value");
            return value instanceof Long;
        }
    };

    /* renamed from: c */
    @JvmField
    @NotNull
    public static final TypeHelper<String> f33850c = new TypeHelper<String>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_STRING$1
        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: a */
        public /* bridge */ /* synthetic */ String getF33854b() {
            return "";
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: b */
        public boolean mo17371b(@NotNull Object value) {
            Intrinsics.m32179h(value, "value");
            return value instanceof String;
        }
    };

    /* renamed from: d */
    @JvmField
    @NotNull
    public static final TypeHelper<Double> f33851d = new TypeHelper<Double>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_DOUBLE$1
        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: a */
        public Double getF33854b() {
            return Double.valueOf(0.0d);
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: b */
        public boolean mo17371b(@NotNull Object value) {
            Intrinsics.m32179h(value, "value");
            return value instanceof Double;
        }
    };

    /* renamed from: e */
    @JvmField
    @NotNull
    public static final TypeHelper<Uri> f33852e = new TypeHelper<Uri>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_URI$1

        /* renamed from: b */
        public final Uri f33854b = Uri.EMPTY;

        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: a, reason: from getter */
        public Uri getF33854b() {
            return this.f33854b;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: b */
        public boolean mo17371b(@NotNull Object value) {
            Intrinsics.m32179h(value, "value");
            return value instanceof Uri;
        }
    };

    /* renamed from: f */
    @JvmField
    @NotNull
    public static final TypeHelper<Integer> f33853f = new TypeHelper<Integer>() { // from class: com.yandex.div.internal.parser.TypeHelpersKt$TYPE_HELPER_COLOR$1
        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: a */
        public Integer getF33854b() {
            return -16777216;
        }

        @Override // com.yandex.div.internal.parser.TypeHelper
        /* renamed from: b */
        public boolean mo17371b(@NotNull Object value) {
            Intrinsics.m32179h(value, "value");
            return value instanceof Integer;
        }
    };
}
