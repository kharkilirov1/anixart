package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* loaded from: classes3.dex */
public class Reflection {

    /* renamed from: a */
    public static final ReflectionFactory f63352a;

    /* renamed from: b */
    public static final KClass[] f63353b;

    static {
        ReflectionFactory reflectionFactory;
        try {
            reflectionFactory = (ReflectionFactory) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            reflectionFactory = null;
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f63352a = reflectionFactory;
        f63353b = new KClass[0];
    }

    /* renamed from: a */
    public static KClass m32193a(Class cls) {
        return f63352a.mo32200b(cls);
    }

    /* renamed from: b */
    public static KDeclarationContainer m32194b(Class cls, String str) {
        return f63352a.mo32201c(cls, str);
    }

    /* renamed from: c */
    public static KMutableProperty1 m32195c(MutablePropertyReference1 mutablePropertyReference1) {
        return f63352a.mo32203e(mutablePropertyReference1);
    }

    /* renamed from: d */
    public static KProperty0 m32196d(PropertyReference0 propertyReference0) {
        return f63352a.mo32205g(propertyReference0);
    }

    /* renamed from: e */
    public static KProperty1 m32197e(PropertyReference1 propertyReference1) {
        return f63352a.mo32206h(propertyReference1);
    }

    @SinceKotlin
    /* renamed from: f */
    public static String m32198f(FunctionBase functionBase) {
        return f63352a.mo32208j(functionBase);
    }
}
