package com.yandex.div2;

import com.yandex.div.data.DivModelInternalApi;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
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

/* compiled from: DivAccessibility.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivAccessibility;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Mode", "Type", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class DivAccessibility implements JSONSerializable {

    /* renamed from: f */
    @NotNull
    public static final Companion f34479f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final Expression<Mode> f34480g;

    /* renamed from: h */
    @NotNull
    public static final Expression<Boolean> f34481h;

    /* renamed from: i */
    @NotNull
    public static final TypeHelper<Mode> f34482i;

    /* renamed from: j */
    @NotNull
    public static final ValueValidator<String> f34483j;

    /* renamed from: k */
    @NotNull
    public static final ValueValidator<String> f34484k;

    /* renamed from: l */
    @NotNull
    public static final ValueValidator<String> f34485l;

    /* renamed from: m */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivAccessibility> f34486m;

    /* renamed from: a */
    @JvmField
    @Nullable
    public final Expression<String> f34487a;

    /* renamed from: b */
    @JvmField
    @Nullable
    public final Expression<String> f34488b;

    /* renamed from: c */
    @JvmField
    @NotNull
    public final Expression<Mode> f34489c;

    /* renamed from: d */
    @JvmField
    @Nullable
    public final Expression<String> f34490d;

    /* renamed from: e */
    @JvmField
    @Nullable
    public final Type f34491e;

    /* compiled from: DivAccessibility.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31884d2 = {"Lcom/yandex/div2/DivAccessibility$Companion;", "", "Lcom/yandex/div/internal/parser/ValueValidator;", "", "DESCRIPTION_TEMPLATE_VALIDATOR", "Lcom/yandex/div/internal/parser/ValueValidator;", "DESCRIPTION_VALIDATOR", "HINT_TEMPLATE_VALIDATOR", "HINT_VALIDATOR", "Lcom/yandex/div/json/expressions/Expression;", "Lcom/yandex/div2/DivAccessibility$Mode;", "MODE_DEFAULT_VALUE", "Lcom/yandex/div/json/expressions/Expression;", "", "MUTE_AFTER_ACTION_DEFAULT_VALUE", "STATE_DESCRIPTION_TEMPLATE_VALIDATOR", "STATE_DESCRIPTION_VALIDATOR", "Lcom/yandex/div/internal/parser/TypeHelper;", "TYPE_HELPER_MODE", "Lcom/yandex/div/internal/parser/TypeHelper;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivAccessibility.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivAccessibility$Mode;", "", "Converter", "DEFAULT", "MERGE", "EXCLUDE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Mode {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE("exclude");


        /* renamed from: c */
        @NotNull
        public static final Converter f34494c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Mode> f34495d = new Function1<String, Mode>() { // from class: com.yandex.div2.DivAccessibility$Mode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivAccessibility.Mode invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivAccessibility.Mode mode = DivAccessibility.Mode.DEFAULT;
                if (Intrinsics.m32174c(string, "default")) {
                    return mode;
                }
                DivAccessibility.Mode mode2 = DivAccessibility.Mode.MERGE;
                if (Intrinsics.m32174c(string, "merge")) {
                    return mode2;
                }
                DivAccessibility.Mode mode3 = DivAccessibility.Mode.EXCLUDE;
                if (Intrinsics.m32174c(string, "exclude")) {
                    return mode3;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f34500b;

        /* compiled from: DivAccessibility.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAccessibility$Mode$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Mode(String str) {
            this.f34500b = str;
        }
    }

    /* compiled from: DivAccessibility.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div2/DivAccessibility$Type;", "", "Converter", "NONE", "BUTTON", "IMAGE", "TEXT", "EDIT_TEXT", "HEADER", "TAB_BAR", "LIST", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public enum Type {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar"),
        LIST("list");


        /* renamed from: c */
        @NotNull
        public static final Converter f34502c = new Converter(null);

        /* renamed from: d */
        @NotNull
        public static final Function1<String, Type> f34503d = new Function1<String, Type>() { // from class: com.yandex.div2.DivAccessibility$Type$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            public DivAccessibility.Type invoke(String str) {
                String string = str;
                Intrinsics.m32179h(string, "string");
                DivAccessibility.Type type = DivAccessibility.Type.NONE;
                if (Intrinsics.m32174c(string, "none")) {
                    return type;
                }
                DivAccessibility.Type type2 = DivAccessibility.Type.BUTTON;
                if (Intrinsics.m32174c(string, "button")) {
                    return type2;
                }
                DivAccessibility.Type type3 = DivAccessibility.Type.IMAGE;
                if (Intrinsics.m32174c(string, "image")) {
                    return type3;
                }
                DivAccessibility.Type type4 = DivAccessibility.Type.TEXT;
                if (Intrinsics.m32174c(string, "text")) {
                    return type4;
                }
                DivAccessibility.Type type5 = DivAccessibility.Type.EDIT_TEXT;
                if (Intrinsics.m32174c(string, "edit_text")) {
                    return type5;
                }
                DivAccessibility.Type type6 = DivAccessibility.Type.HEADER;
                if (Intrinsics.m32174c(string, "header")) {
                    return type6;
                }
                DivAccessibility.Type type7 = DivAccessibility.Type.TAB_BAR;
                if (Intrinsics.m32174c(string, "tab_bar")) {
                    return type7;
                }
                DivAccessibility.Type type8 = DivAccessibility.Type.LIST;
                if (Intrinsics.m32174c(string, "list")) {
                    return type8;
                }
                return null;
            }
        };

        /* renamed from: b */
        @NotNull
        public final String f34513b;

        /* compiled from: DivAccessibility.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAccessibility$Type$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Converter {
            public Converter() {
            }

            public Converter(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        Type(String str) {
            this.f34513b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.f34334a;
        f34480g = companion.m17539a(Mode.DEFAULT);
        f34481h = companion.m17539a(Boolean.FALSE);
        int i2 = TypeHelper.f33843a;
        f34482i = TypeHelper.Companion.f33844a.m17372a(ArraysKt.m31926B(Mode.values()), new Function1<Object, Boolean>() { // from class: com.yandex.div2.DivAccessibility$Companion$TYPE_HELPER_MODE$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object it) {
                Intrinsics.m32179h(it, "it");
                return Boolean.valueOf(it instanceof DivAccessibility.Mode);
            }
        });
        f34483j = C3035b.f41104c;
        f34484k = C3035b.f41105d;
        f34485l = C3035b.f41106e;
        f34486m = new Function2<ParsingEnvironment, JSONObject, DivAccessibility>() { // from class: com.yandex.div2.DivAccessibility$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            public DivAccessibility invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                ParsingEnvironment env = parsingEnvironment;
                JSONObject it = jSONObject;
                Intrinsics.m32179h(env, "env");
                Intrinsics.m32179h(it, "it");
                DivAccessibility.Companion companion2 = DivAccessibility.f34479f;
                ParsingErrorLogger f33097d = env.getF33097d();
                ValueValidator<String> valueValidator = DivAccessibility.f34483j;
                TypeHelper<String> typeHelper = TypeHelpersKt.f33850c;
                Expression m17325q = JsonParser.m17325q(it, "description", valueValidator, f33097d, env, typeHelper);
                Expression m17325q2 = JsonParser.m17325q(it, "hint", DivAccessibility.f34484k, f33097d, env, typeHelper);
                DivAccessibility.Mode.Converter converter = DivAccessibility.Mode.f34494c;
                Function1<String, DivAccessibility.Mode> function1 = DivAccessibility.Mode.f34495d;
                Expression<DivAccessibility.Mode> expression = DivAccessibility.f34480g;
                Expression<DivAccessibility.Mode> m17330v = JsonParser.m17330v(it, "mode", function1, f33097d, env, expression, DivAccessibility.f34482i);
                if (m17330v != null) {
                    expression = m17330v;
                }
                Function1<Object, Boolean> function12 = ParsingConvertersKt.f33829c;
                Expression<Boolean> expression2 = DivAccessibility.f34481h;
                Expression<Boolean> m17330v2 = JsonParser.m17330v(it, "mute_after_action", function12, f33097d, env, expression2, TypeHelpersKt.f33848a);
                if (m17330v2 != null) {
                    expression2 = m17330v2;
                }
                Expression m17325q3 = JsonParser.m17325q(it, "state_description", DivAccessibility.f34485l, f33097d, env, typeHelper);
                DivAccessibility.Type.Converter converter2 = DivAccessibility.Type.f34502c;
                return new DivAccessibility(m17325q, m17325q2, expression, expression2, m17325q3, (DivAccessibility.Type) JsonParser.m17324p(it, "type", DivAccessibility.Type.f34503d, C2904b.f33858e, f33097d));
            }
        };
    }

    @DivModelInternalApi
    public DivAccessibility() {
        this(null, null, null, null, null, null, 63);
    }

    @DivModelInternalApi
    public DivAccessibility(@Nullable Expression<String> expression, @Nullable Expression<String> expression2, @NotNull Expression<Mode> mode, @NotNull Expression<Boolean> muteAfterAction, @Nullable Expression<String> expression3, @Nullable Type type) {
        Intrinsics.m32179h(mode, "mode");
        Intrinsics.m32179h(muteAfterAction, "muteAfterAction");
        this.f34487a = expression;
        this.f34488b = expression2;
        this.f34489c = mode;
        this.f34490d = expression3;
        this.f34491e = type;
    }

    public /* synthetic */ DivAccessibility(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Type type, int i2) {
        this(null, null, (i2 & 4) != 0 ? f34480g : null, (i2 & 8) != 0 ? f34481h : null, null, null);
    }
}
