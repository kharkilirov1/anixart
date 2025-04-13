package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackground.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivNinePatchBackground;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivNinePatchBackground implements JSONSerializable {

    /* renamed from: c */
    @NotNull
    public static final Companion f37726c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final DivAbsoluteEdgeInsets f37727d = new DivAbsoluteEdgeInsets(null, null, null, null, 15);

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Expression<Uri> f37728a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final DivAbsoluteEdgeInsets f37729b;

    /* compiled from: DivNinePatchBackground.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div2/DivNinePatchBackground$Companion;", "", "Lcom/yandex/div2/DivAbsoluteEdgeInsets;", "INSETS_DEFAULT_VALUE", "Lcom/yandex/div2/DivAbsoluteEdgeInsets;", "", "TYPE", "Ljava/lang/String;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmName
        @NotNull
        /* renamed from: a */
        public final DivNinePatchBackground m17657a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
            Expression m17317i = JsonParser.m17317i(jSONObject, "image_url", ParsingConvertersKt.f33828b, f34328a, parsingEnvironment, TypeHelpersKt.f33852e);
            DivAbsoluteEdgeInsets.Companion companion = DivAbsoluteEdgeInsets.f34437e;
            DivAbsoluteEdgeInsets divAbsoluteEdgeInsets = (DivAbsoluteEdgeInsets) JsonParser.m17322n(jSONObject, "insets", DivAbsoluteEdgeInsets.f34446n, f34328a, parsingEnvironment);
            if (divAbsoluteEdgeInsets == null) {
                divAbsoluteEdgeInsets = DivNinePatchBackground.f37727d;
            }
            Intrinsics.m32178g(divAbsoluteEdgeInsets, "JsonParser.readOptional(…) ?: INSETS_DEFAULT_VALUE");
            return new DivNinePatchBackground(m17317i, divAbsoluteEdgeInsets);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        DivNinePatchBackground$Companion$CREATOR$1 divNinePatchBackground$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivNinePatchBackground>() { // from class: com.yandex.div2.DivNinePatchBackground$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivNinePatchBackground invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                return DivNinePatchBackground.f37726c.m17657a(env, it);
            }
        };
    }

    @DivModelInternalApi
    public DivNinePatchBackground(@NotNull Expression<Uri> imageUrl, @NotNull DivAbsoluteEdgeInsets insets) {
        Intrinsics.m32179h(imageUrl, "imageUrl");
        Intrinsics.m32179h(insets, "insets");
        this.f37728a = imageUrl;
        this.f37729b = insets;
    }
}
