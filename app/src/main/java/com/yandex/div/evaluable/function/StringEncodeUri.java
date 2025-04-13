package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: StringFunctions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/StringEncodeUri;", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StringEncodeUri extends Function {

    /* renamed from: c */
    @NotNull
    public static final StringEncodeUri f33544c = new StringEncodeUri();

    /* renamed from: d */
    @NotNull
    public static final List<FunctionArgument> f33545d;

    /* renamed from: e */
    @NotNull
    public static final EvaluableType f33546e;

    /* renamed from: f */
    public static final boolean f33547f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f33545d = CollectionsKt.m31993F(new FunctionArgument(evaluableType, false));
        f33546e = evaluableType;
        f33547f = true;
    }

    public StringEncodeUri() {
        super(null, 1);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: a */
    public Object mo17230a(@NotNull List<? extends Object> args) {
        Intrinsics.m32179h(args, "args");
        String encode = URLEncoder.encode((String) args.get(0), Charsets.f66855b.name());
        Intrinsics.m32178g(encode, "encode(str, Charsets.UTF_8.name())");
        return StringsKt.m33891Q(StringsKt.m33891Q(StringsKt.m33891Q(StringsKt.m33891Q(StringsKt.m33891Q(StringsKt.m33891Q(encode, "+", "%20", false, 4, null), "%21", "!", false, 4, null), "%7E", "~", false, 4, null), "%27", "'", false, 4, null), "%28", "(", false, 4, null), "%29", ")", false, 4, null);
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: b */
    public List<FunctionArgument> mo17231b() {
        return f33545d;
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: c */
    public String getF33342d() {
        return "encodeUri";
    }

    @Override // com.yandex.div.evaluable.Function
    @NotNull
    /* renamed from: d */
    public EvaluableType getF33344f() {
        return f33546e;
    }

    @Override // com.yandex.div.evaluable.Function
    /* renamed from: f */
    public boolean getF33249f() {
        return f33547f;
    }
}
