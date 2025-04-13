package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;

/* loaded from: classes3.dex */
public class ReflectionFactory {
    /* renamed from: a */
    public KFunction mo32199a(FunctionReference functionReference) {
        return functionReference;
    }

    /* renamed from: b */
    public KClass mo32200b(Class cls) {
        return new ClassReference(cls);
    }

    /* renamed from: c */
    public KDeclarationContainer mo32201c(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    /* renamed from: d */
    public KMutableProperty0 mo32202d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* renamed from: e */
    public KMutableProperty1 mo32203e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* renamed from: f */
    public KMutableProperty2 mo32204f(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    /* renamed from: g */
    public KProperty0 mo32205g(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* renamed from: h */
    public KProperty1 mo32206h(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* renamed from: i */
    public KProperty2 mo32207i(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    @SinceKotlin
    /* renamed from: j */
    public String mo32208j(FunctionBase functionBase) {
        String obj = functionBase.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    @SinceKotlin
    /* renamed from: k */
    public String mo32209k(Lambda lambda) {
        return mo32208j(lambda);
    }
}
