package com.yandex.div2;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonTemplateParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.DivDownloadCallbacksTemplate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivDownloadCallbacksTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivDownloadCallbacks;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivDownloadCallbacksTemplate implements JSONSerializable, JsonTemplate<DivDownloadCallbacks> {

    /* renamed from: c */
    @NotNull
    public static final Companion f35590c = new Companion(null);

    /* renamed from: d */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f35591d = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivDownloadCallbacksTemplate$Companion$ON_FAIL_ACTIONS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivAction.Companion companion = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            DivDownloadCallbacksTemplate.Companion companion2 = DivDownloadCallbacksTemplate.f35590c;
            return JsonParser.m17333y(jSONObject2, str2, function2, C3047h.f41425B, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: e */
    @NotNull
    public static final Function3<String, JSONObject, ParsingEnvironment, List<DivAction>> f35592e = new Function3<String, JSONObject, ParsingEnvironment, List<DivAction>>() { // from class: com.yandex.div2.DivDownloadCallbacksTemplate$Companion$ON_SUCCESS_ACTIONS_READER$1
        @Override // kotlin.jvm.functions.Function3
        /* renamed from: k */
        public List<DivAction> mo16505k(String str, JSONObject jSONObject, ParsingEnvironment parsingEnvironment) {
            String str2 = str;
            JSONObject jSONObject2 = jSONObject;
            ParsingEnvironment parsingEnvironment2 = parsingEnvironment;
            C3033a.m17750l(str2, "key", jSONObject2, "json", parsingEnvironment2, "env");
            DivAction.Companion companion = DivAction.f34546g;
            Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
            DivDownloadCallbacksTemplate.Companion companion2 = DivDownloadCallbacksTemplate.f35590c;
            return JsonParser.m17333y(jSONObject2, str2, function2, C3047h.f41427D, parsingEnvironment2.getF34328a(), parsingEnvironment2);
        }
    };

    /* renamed from: f */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivDownloadCallbacksTemplate> f35593f = new Function2<ParsingEnvironment, JSONObject, DivDownloadCallbacksTemplate>() { // from class: com.yandex.div2.DivDownloadCallbacksTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivDownloadCallbacksTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return new DivDownloadCallbacksTemplate(env, null, false, it, 6);
        }
    };

    /* renamed from: a */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f35594a;

    /* renamed from: b */
    @JvmField
    @NotNull
    public final Field<List<DivActionTemplate>> f35595b;

    /* compiled from: DivDownloadCallbacksTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div2/DivDownloadCallbacksTemplate$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivActionTemplate;", "ON_FAIL_ACTIONS_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ON_FAIL_ACTIONS_VALIDATOR", "ON_SUCCESS_ACTIONS_TEMPLATE_VALIDATOR", "ON_SUCCESS_ACTIONS_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DivDownloadCallbacksTemplate(ParsingEnvironment parsingEnvironment, DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, boolean z, JSONObject jSONObject, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        ParsingErrorLogger f34328a = parsingEnvironment.getF34328a();
        DivActionTemplate.Companion companion = DivActionTemplate.f34572i;
        Function2<ParsingEnvironment, JSONObject, DivActionTemplate> function2 = DivActionTemplate.f34586w;
        this.f35594a = JsonTemplateParser.m17360u(jSONObject, "on_fail_actions", z, null, function2, C3047h.f41426C, f34328a, parsingEnvironment);
        this.f35595b = JsonTemplateParser.m17360u(jSONObject, "on_success_actions", z, null, function2, C3047h.f41428E, f34328a, parsingEnvironment);
    }

    @Override // com.yandex.div.json.JsonTemplate
    /* renamed from: a */
    public DivDownloadCallbacks mo17514a(ParsingEnvironment env, JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        return new DivDownloadCallbacks(FieldKt.m17382h(this.f35594a, env, "on_fail_actions", data, C3047h.f41425B, f35591d), FieldKt.m17382h(this.f35595b, env, "on_success_actions", data, C3047h.f41427D, f35592e));
    }
}
