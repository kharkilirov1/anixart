package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivVideoSource;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivVideoSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div2/DivVideoSource;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Resolution", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivVideoSource implements JSONSerializable {

    /* renamed from: e */
    @NotNull
    public static final Companion f40720e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivVideoSource> f40721f = new Function2<ParsingEnvironment, JSONObject, DivVideoSource>() { // from class: com.yandex.div2.DivVideoSource$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivVideoSource invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivVideoSource.Companion companion = DivVideoSource.f40720e;
            ParsingErrorLogger f33097d = env.getF33097d();
            Expression m17329u = JsonParser.m17329u(it, "bitrate", ParsingConvertersKt.f33831e, f33097d, env, TypeHelpersKt.f33849b);
            Expression<String> m17315g = JsonParser.m17315g(it, "mime_type", f33097d, env, TypeHelpersKt.f33850c);
            DivVideoSource.Resolution.Companion companion2 = DivVideoSource.Resolution.f40727c;
            return new DivVideoSource(m17329u, m17315g, (DivVideoSource.Resolution) JsonParser.m17322n(it, "resolution", DivVideoSource.Resolution.f40728d, f33097d, env), JsonParser.m17317i(it, "url", ParsingConvertersKt.f33828b, f33097d, env, TypeHelpersKt.f33852e));
        }
    };

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<Long> f40722a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Expression<String> f40723b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final Resolution f40724c;

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Expression<Uri> f40725d;

    /* compiled from: DivVideoSource.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivVideoSource$Companion;", "", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivVideoSource.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivVideoSource$Resolution;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Resolution implements JSONSerializable {

        /* renamed from: c */
        @NotNull
        public static final Companion f40727c = new Companion(null);

        /* renamed from: d */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, Resolution> f40728d = new Function2<ParsingEnvironment, JSONObject, Resolution>() { // from class: com.yandex.div2.DivVideoSource$Resolution$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivVideoSource.Resolution invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivVideoSource.Resolution.Companion companion = DivVideoSource.Resolution.f40727c;
                ParsingErrorLogger f33097d = env.getF33097d();
                Function1<Number, Long> function1 = ParsingConvertersKt.f33831e;
                DivVideoSource.Resolution.Companion companion2 = DivVideoSource.Resolution.f40727c;
                C3064p0 c3064p0 = C3064p0.f41885j;
                TypeHelper<Long> typeHelper = TypeHelpersKt.f33849b;
                return new DivVideoSource.Resolution(JsonParser.m17316h(it, "height", function1, c3064p0, f33097d, typeHelper), JsonParser.m17316h(it, "width", function1, C3064p0.f41886k, f33097d, typeHelper));
            }
        };

        /* renamed from: a */
        @JvmField
        @NotNull
        public final Expression<Long> f40729a;

        /* renamed from: b */
        @JvmField
        @NotNull
        public final Expression<Long> f40730b;

        /* compiled from: DivVideoSource.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\f"}, m31884d2 = {"Lcom/yandex/div2/DivVideoSource$Resolution$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "HEIGHT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "HEIGHT_VALIDATOR", "", "TYPE", "Ljava/lang/String;", "WIDTH_TEMPLATE_VALIDATOR", "WIDTH_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        @DivModelInternalApi
        public Resolution(@NotNull Expression<Long> height, @NotNull Expression<Long> width) {
            Intrinsics.m32179h(height, "height");
            Intrinsics.m32179h(width, "width");
            this.f40729a = height;
            this.f40730b = width;
        }
    }

    @DivModelInternalApi
    public DivVideoSource(@Nullable Expression<Long> expression, @NotNull Expression<String> mimeType, @Nullable Resolution resolution, @NotNull Expression<Uri> url) {
        Intrinsics.m32179h(mimeType, "mimeType");
        Intrinsics.m32179h(url, "url");
        this.f40722a = expression;
        this.f40723b = mimeType;
        this.f40724c = resolution;
        this.f40725d = url;
    }
}
