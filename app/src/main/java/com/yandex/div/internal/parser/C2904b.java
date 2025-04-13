package com.yandex.div.internal.parser;

import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div.internal.parser.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2904b implements JsonParser.ErrorHandler, ValueValidator {

    /* renamed from: c */
    public static final /* synthetic */ C2904b f33856c = new C2904b(0);

    /* renamed from: d */
    public static final /* synthetic */ C2904b f33857d = new C2904b(1);

    /* renamed from: e */
    public static final /* synthetic */ C2904b f33858e = new C2904b(2);

    /* renamed from: f */
    public static final /* synthetic */ C2904b f33859f = new C2904b(3);

    /* renamed from: g */
    public static final /* synthetic */ C2904b f33860g = new C2904b(4);

    /* renamed from: h */
    public static final /* synthetic */ C2904b f33861h = new C2904b(5);

    /* renamed from: i */
    public static final /* synthetic */ C2904b f33862i = new C2904b(6);

    /* renamed from: b */
    public final /* synthetic */ int f33863b;

    public /* synthetic */ C2904b(int i2) {
        this.f33863b = i2;
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    /* renamed from: a */
    public boolean mo17302a(Object it) {
        switch (this.f33863b) {
            case 2:
                ExpressionList<?> expressionList = JsonParser.f33823a;
                return true;
            case 3:
                ExpressionList<?> expressionList2 = JsonParser.f33823a;
                return true;
            case 4:
                Intrinsics.m32179h(it, "it");
                return true;
            case 5:
                ValueValidator<String> valueValidator = JsonTemplateParser.f33825a;
                return !((String) it).isEmpty();
            case 6:
                String it2 = (String) it;
                Intrinsics.m32179h(it2, "it");
                return it2.length() > 0;
            default:
                String it3 = (String) it;
                Intrinsics.m32179h(it3, "it");
                return it3.length() > 0;
        }
    }

    /* renamed from: b */
    public void m17373b(ParsingException parsingException) {
        switch (this.f33863b) {
            case 0:
                int i2 = C2905c.f33864a;
                throw parsingException;
            default:
                int i3 = C2905c.f33864a;
                return;
        }
    }
}
