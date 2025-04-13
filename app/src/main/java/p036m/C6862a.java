package p036m;

import com.yandex.div.internal.util.JsonObject;
import com.yandex.div.internal.util.JsonUtilsKt;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.templates.TemplateProvider;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: TemplateProvider.kt */
/* renamed from: m.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6862a<T extends JsonTemplate<?>> {
    @NotNull
    /* renamed from: a */
    public static JsonTemplate m34502a(TemplateProvider templateProvider, @NotNull String templateId, @NotNull JSONObject json) throws ParsingException {
        Intrinsics.m32179h(templateId, "templateId");
        Intrinsics.m32179h(json, "json");
        JsonTemplate jsonTemplate = templateProvider.get(templateId);
        if (jsonTemplate != null) {
            return jsonTemplate;
        }
        throw new ParsingException(ParsingExceptionReason.MISSING_TEMPLATE, C0000a.m16m("Template '", templateId, "' is missing!"), null, new JsonObject(json), JsonUtilsKt.m17390b(json, 0, 1), 4);
    }
}
