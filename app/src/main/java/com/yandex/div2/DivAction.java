package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivDownloadCallbacks;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivAction.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivAction;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "MenuItem", "Target", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAction implements JSONSerializable {

    /* renamed from: g */
    @NotNull
    public static final Companion f34546g = new Companion(null);

    /* renamed from: h */
    @NotNull
    public static final TypeHelper<Target> f34547h;

    /* renamed from: i */
    @NotNull
    public static final ValueValidator<String> f34548i;

    /* renamed from: j */
    @NotNull
    public static final ListValidator<MenuItem> f34549j;

    /* renamed from: k */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAction> f34550k;

    /* renamed from: a */
    @JvmField
    @Nullable
    public final DivDownloadCallbacks f34551a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final Expression<Uri> f34552b;

    /* renamed from: c */
    @JvmField
    @Nullable
    public final List<MenuItem> f34553c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final JSONObject f34554d;

    /* renamed from: e */
    @JvmField
    @Nullable
    public final Expression<Uri> f34555e;

    /* renamed from: f */
    @JvmField
    @Nullable
    public final Expression<Uri> f34556f;

    /* compiled from: DivAction.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div2/DivAction$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "LOG_ID_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "LOG_ID_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction$MenuItem;", "MENU_ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div/internal/parser/TypeHelper;", "Lcom/yandex/div2/DivAction$Target;", "TYPE_HELPER_TARGET", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivAction.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivAction$MenuItem;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class MenuItem implements JSONSerializable {

        /* renamed from: d */
        @NotNull
        public static final Companion f34559d = new Companion(null);

        /* renamed from: e */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, MenuItem> f34560e = new Function2<ParsingEnvironment, JSONObject, MenuItem>() { // from class: com.yandex.div2.DivAction$MenuItem$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivAction.MenuItem invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivAction.MenuItem.Companion companion = DivAction.MenuItem.f34559d;
                ParsingErrorLogger f33097d = env.getF33097d();
                DivAction.Companion companion2 = DivAction.f34546g;
                Function2<ParsingEnvironment, JSONObject, DivAction> function2 = DivAction.f34550k;
                DivAction divAction = (DivAction) JsonParser.m17322n(it, "action", function2, f33097d, env);
                DivAction.MenuItem.Companion companion3 = DivAction.MenuItem.f34559d;
                return new DivAction.MenuItem(divAction, JsonParser.m17333y(it, "actions", function2, C3037c.f41158c, f33097d, env), JsonParser.m17314f(it, "text", C3035b.f41114m, f33097d, env, TypeHelpersKt.f33850c));
            }
        };

        /* renamed from: a */
        @JvmField
        @Nullable
        public final DivAction f34561a;

        /* renamed from: b */
        @JvmField
        @Nullable
        public final List<DivAction> f34562b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final Expression<String> f34563c;

        /* compiled from: DivAction.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivAction$MenuItem$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivAction;", "ACTIONS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "TEXT_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "TEXT_VALIDATOR", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @DivModelInternalApi
        public MenuItem(@Nullable DivAction divAction, @Nullable List<? extends DivAction> list, @NotNull Expression<String> text) {
            Intrinsics.m32179h(text, "text");
            this.f34561a = divAction;
            this.f34562b = list;
            this.f34563c = text;
        }
    }

    /* compiled from: DivAction.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivAction$Target;", "", "Converter", "SELF", "BLANK", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Target {
        SELF("_self"),
        BLANK("_blank");


        /* renamed from: c */
        @NotNull
        public static final Converter f34565c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Target> f34566d = new Function1<String, Target>() { // from class: com.yandex.div2.DivAction$Target$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivAction.Target invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivAction.Target target = DivAction.Target.SELF;
                if (Intrinsics.m32174c(string, "_self")) {
                    return target;
                }
                DivAction.Target target2 = DivAction.Target.BLANK;
                if (Intrinsics.m32174c(string, "_blank")) {
                    return target2;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f34570b;

        /* compiled from: DivAction.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAction$Target$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Target(String str) {
            this.f34570b = str;
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f34547h = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(Target.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivAction$Companion$TYPE_HELPER_TARGET$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAction.Target);
            }
        });
        f34548i = C3035b.f41113l;
        f34549j = C3037c.f41157b;
        f34550k = new Function2<ParsingEnvironment, JSONObject, DivAction>() { // from class: com.yandex.div2.DivAction$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivAction invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivAction.Companion companion = DivAction.f34546g;
                ParsingErrorLogger f33097d = env.getF33097d();
                DivDownloadCallbacks.Companion companion2 = DivDownloadCallbacks.f35585c;
                DivDownloadCallbacks divDownloadCallbacks = (DivDownloadCallbacks) JsonParser.m17322n(it, "download_callbacks", DivDownloadCallbacks.f35586d, f33097d, env);
                String str = (String) JsonParser.m17311c(it, "log_id", DivAction.f34548i, f33097d, env);
                Function1<String, Uri> function1 = ParsingConvertersKt.f33828b;
                TypeHelper<Uri> typeHelper = TypeHelpersKt.f33852e;
                Expression m17329u = JsonParser.m17329u(it, "log_url", function1, f33097d, env, typeHelper);
                DivAction.MenuItem.Companion companion3 = DivAction.MenuItem.f34559d;
                List m17333y = JsonParser.m17333y(it, "menu_items", DivAction.MenuItem.f34560e, DivAction.f34549j, f33097d, env);
                Object m17310b = JsonParser.m17310b(it, "payload");
                if (m17310b == null) {
                    m17310b = null;
                }
                JSONObject jSONObject2 = (JSONObject) m17310b;
                Expression m17329u2 = JsonParser.m17329u(it, "referer", function1, f33097d, env, typeHelper);
                DivAction.Target.Converter converter = DivAction.Target.f34565c;
                return new DivAction(divDownloadCallbacks, str, m17329u, m17333y, jSONObject2, m17329u2, JsonParser.m17329u(it, "target", DivAction.Target.f34566d, f33097d, env, DivAction.f34547h), JsonParser.m17329u(it, "url", function1, f33097d, env, typeHelper));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivAction(@Nullable DivDownloadCallbacks divDownloadCallbacks, @NotNull String logId, @Nullable Expression<Uri> expression, @Nullable List<? extends MenuItem> list, @Nullable JSONObject jSONObject, @Nullable Expression<Uri> expression2, @Nullable Expression<Target> expression3, @Nullable Expression<Uri> expression4) {
        Intrinsics.m32179h(logId, "logId");
        this.f34551a = divDownloadCallbacks;
        this.f34552b = expression;
        this.f34553c = list;
        this.f34554d = jSONObject;
        this.f34555e = expression2;
        this.f34556f = expression4;
    }
}
