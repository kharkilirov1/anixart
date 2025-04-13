package kotlin.script.experimental.host;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: configurationFromTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-scripting-common"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ConfigurationFromTemplateKt {
    @NotNull
    /* renamed from: a */
    public static final Object m33815a(@NotNull KClass kClass) {
        Constructor<?>[] constructors = JvmClassMappingKt.m32147b(kClass).getConstructors();
        Intrinsics.m32175d(constructors, "java.constructors");
        int length = constructors.length;
        Constructor<?> constructor = null;
        Constructor<?> constructor2 = null;
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 < length) {
                Constructor<?> it = constructors[i2];
                Intrinsics.m32175d(it, "it");
                Parameter[] parameters = it.getParameters();
                Intrinsics.m32175d(parameters, "it.parameters");
                if (parameters.length == 0) {
                    if (z) {
                        break;
                    }
                    constructor2 = it;
                    z = true;
                }
                i2++;
            } else if (z) {
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            Object newInstance = constructor.newInstance(new Object[0]);
            if (newInstance != null) {
                return newInstance;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        }
        throw new IllegalArgumentException("Class should have a single no-arg constructor: " + kClass);
    }
}
