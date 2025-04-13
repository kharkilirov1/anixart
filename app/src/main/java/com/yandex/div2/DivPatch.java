package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.Div;
import com.yandex.div2.DivPatch;
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

/* compiled from: DivPatch.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPatch;", "Lcom/yandex/div/json/JSONSerializable;", "Change", "Companion", "Mode", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivPatch implements JSONSerializable {

    /* renamed from: b */
    @NotNull
    public static final Companion f37978b = new Companion(null);

    /* renamed from: c */
    @NotNull
    public static final Expression<Mode> f37979c = Expression.f34334a.m17539a(Mode.PARTIAL);

    /* renamed from: d */
    @NotNull
    public static final TypeHelper<Mode> f37980d;

    /* renamed from: e */
    @NotNull
    public static final ListValidator<Change> f37981e;

    /* renamed from: a */
    @JvmField
    @NotNull
    public final List<Change> f37982a;

    /* compiled from: DivPatch.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div2/DivPatch$Change;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Change implements JSONSerializable {

        /* renamed from: b */
        @NotNull
        public static final Companion f37983b = new Companion(null);

        /* renamed from: c */
        @NotNull
        public static final Function2<ParsingEnvironment, JSONObject, Change> f37984c = new Function2<ParsingEnvironment, JSONObject, Change>() { // from class: com.yandex.div2.DivPatch$Change$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivPatch.Change invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivPatch.Change.Companion companion = DivPatch.Change.f37983b;
                ParsingErrorLogger f33097d = env.getF33097d();
                Object m17310b = JsonParser.m17310b(it, "id");
                if (m17310b == null) {
                    throw ParsingExceptionKt.m17523h(it, "id");
                }
                String str = (String) m17310b;
                Div.Companion companion2 = Div.f34418a;
                Function2<ParsingEnvironment, JSONObject, Div> function2 = Div.f34419b;
                DivPatch.Change.Companion companion3 = DivPatch.Change.f37983b;
                return new DivPatch.Change(str, JsonParser.m17333y(it, "items", function2, C3075x.f42144D, f33097d, env));
            }
        };

        /* renamed from: a */
        @JvmField
        @Nullable
        public final List<Div> f37985a;

        /* compiled from: DivPatch.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivPatch$Change$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/Div;", "ITEMS_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @DivModelInternalApi
        public Change(@NotNull String id2, @Nullable List<? extends Div> list) {
            Intrinsics.m32179h(id2, "id");
            this.f37985a = list;
        }
    }

    /* compiled from: DivPatch.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m31884d2 = {"Lcom/yandex/div2/DivPatch$Companion;", "", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div2/DivPatch$Change;", "CHANGES_VALIDATOR", "Lcom/yandex/div/internal/parser/ListValidator;", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivPatch$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivPatch.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivPatch$Mode;", "", "Converter", "TRANSACTIONAL", "PARTIAL", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Mode {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");


        /* renamed from: c */
        @NotNull
        public static final Converter f37989c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Mode> f37990d = new Function1<String, Mode>() { // from class: com.yandex.div2.DivPatch$Mode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivPatch.Mode invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivPatch.Mode mode = DivPatch.Mode.TRANSACTIONAL;
                if (Intrinsics.m32174c(string, "transactional")) {
                    return mode;
                }
                DivPatch.Mode mode2 = DivPatch.Mode.PARTIAL;
                if (Intrinsics.m32174c(string, "partial")) {
                    return mode2;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f37994b;

        /* compiled from: DivPatch.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivPatch$Mode$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Mode(String str) {
            this.f37994b = str;
        }
    }

    static {
        int i2 = TypeHelper.f33843a;
        f37980d = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(Mode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivPatch$Companion$TYPE_HELPER_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivPatch.Mode);
            }
        });
        f37981e = C3075x.f42143C;
        DivPatch$Companion$CREATOR$1 divPatch$Companion$CREATOR$1 = new Function2<ParsingEnvironment, JSONObject, DivPatch>() { // from class: com.yandex.div2.DivPatch$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivPatch invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivPatch.Companion companion = DivPatch.f37978b;
                ParsingErrorLogger f33097d = env.getF33097d();
                DivPatch.Change.Companion companion2 = DivPatch.Change.f37983b;
                List m17321m = JsonParser.m17321m(it, "changes", DivPatch.Change.f37984c, DivPatch.f37981e, f33097d, env);
                Intrinsics.m32178g(m17321m, "readList(json, \"changes\"…S_VALIDATOR, logger, env)");
                DivPatch.Mode.Converter converter = DivPatch.Mode.f37989c;
                Function1<String, DivPatch.Mode> function1 = DivPatch.Mode.f37990d;
                Expression<DivPatch.Mode> expression = DivPatch.f37979c;
                Expression<DivPatch.Mode> m17330v = JsonParser.m17330v(it, "mode", function1, f33097d, env, expression, DivPatch.f37980d);
                if (m17330v != null) {
                    expression = m17330v;
                }
                return new DivPatch(m17321m, expression);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @DivModelInternalApi
    public DivPatch(@NotNull List<? extends Change> changes, @NotNull Expression<Mode> mode) {
        Intrinsics.m32179h(changes, "changes");
        Intrinsics.m32179h(mode, "mode");
        this.f37982a = changes;
    }
}
