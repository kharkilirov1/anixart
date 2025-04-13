package com.yandex.div2;

import android.content.SharedPreferences;
import com.swiftsoft.anixartd.dagger.module.AppModule;
import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParser;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingEnvironment;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import moxy.C6863a;
import moxy.OnDestroyListener;
import org.json.JSONObject;
import retrofit2.Retrofit;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.yandex.div2.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3033a implements OnDestroyListener {

    /* renamed from: b */
    public static final /* synthetic */ C3033a f41081b = new C3033a();

    /* renamed from: a */
    public static Integer m17739a(HashMap hashMap, Integer num, String str, int i2, String str2) {
        hashMap.put(num, str);
        Integer valueOf = Integer.valueOf(i2);
        hashMap.put(valueOf, str2);
        return valueOf;
    }

    /* renamed from: b */
    public static Object m17740b(AppModule appModule, Retrofit retrofit, String str, Class cls, String str2) {
        Objects.requireNonNull(appModule);
        Intrinsics.m32179h(retrofit, str);
        Object m35035b = retrofit.m35035b(cls);
        Intrinsics.m32178g(m35035b, str2);
        return m35035b;
    }

    /* renamed from: c */
    public static Object m17741c(ParsingEnvironment parsingEnvironment, String str, JSONObject jSONObject, String str2, JSONObject jSONObject2, String str3, ValueValidator valueValidator, ParsingEnvironment parsingEnvironment2, int i2) {
        Object m17338a;
        Intrinsics.m32179h(parsingEnvironment, str);
        Intrinsics.m32179h(jSONObject, str2);
        m17338a = JsonParserKt.m17338a(jSONObject2, str3, (r5 & 2) != 0 ? C2904b.f33860g : null, parsingEnvironment.getF33840b(), parsingEnvironment2);
        return m17338a;
    }

    /* renamed from: d */
    public static Object m17742d(String str, String str2, JSONObject jSONObject, String str3, ParsingEnvironment parsingEnvironment, String str4, JSONObject jSONObject2, String str5) {
        Intrinsics.m32179h(str, str2);
        Intrinsics.m32179h(jSONObject, str3);
        Intrinsics.m32179h(parsingEnvironment, str4);
        parsingEnvironment.getF33840b();
        return JsonParser.m17310b(jSONObject2, str5);
    }

    /* renamed from: e */
    public static String m17743e(Class cls, StringBuilder sb, String str, String str2) {
        sb.append(cls.getSimpleName());
        sb.append(str);
        sb.append(cls.getSimpleName());
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    public static String m17744f(String str, Type type) {
        return str + type;
    }

    /* renamed from: g */
    public static String m17745g(Object[] objArr, int i2, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i2));
        Intrinsics.m32178g(format, str2);
        return format;
    }

    /* renamed from: h */
    public static Ref.ObjectRef m17746h(Object obj) {
        ResultKt.m31892b(obj);
        return new Ref.ObjectRef();
    }

    /* renamed from: i */
    public static ProtoBuf.Type m17747i(ProtoBuf.Type type, ProtoBuf.Type type2) {
        ProtoBuf.Type.Builder m33055y = ProtoBuf.Type.m33055y(type);
        m33055y.mo32967j(type2);
        return m33055y.m33069m();
    }

    /* renamed from: j */
    public static void m17748j(SharedPreferences sharedPreferences, String str, long j2) {
        sharedPreferences.edit().putLong(str, j2).apply();
    }

    /* renamed from: k */
    public static void m17749k(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(str, z).apply();
    }

    /* renamed from: l */
    public static void m17750l(String str, String str2, JSONObject jSONObject, String str3, ParsingEnvironment parsingEnvironment, String str4) {
        Intrinsics.m32179h(str, str2);
        Intrinsics.m32179h(jSONObject, str3);
        Intrinsics.m32179h(parsingEnvironment, str4);
    }

    /* renamed from: m */
    public static boolean m17751m(Flags.BooleanFlagField booleanFlagField, int i2, String str) {
        Boolean mo33113b = booleanFlagField.mo33113b(i2);
        Intrinsics.m32175d(mo33113b, str);
        return mo33113b.booleanValue();
    }

    @Override // moxy.OnDestroyListener
    public void onDestroy() {
        C6863a.m34504a();
    }
}
