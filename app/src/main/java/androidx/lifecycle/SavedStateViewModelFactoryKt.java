package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SavedStateViewModelFactory.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"lifecycle-viewmodel-savedstate_release"}, m31885k = 2, m31886mv = {1, 6, 0})
@RestrictTo
/* loaded from: classes.dex */
public final class SavedStateViewModelFactoryKt {

    /* renamed from: a */
    @NotNull
    public static final List<Class<?>> f4681a = CollectionsKt.m31994G(Application.class, SavedStateHandle.class);

    /* renamed from: b */
    @NotNull
    public static final List<Class<?>> f4682b = CollectionsKt.m31993F(SavedStateHandle.class);

    @Nullable
    /* renamed from: a */
    public static final <T> Constructor<T> m3240a(@NotNull Class<T> cls, @NotNull List<? extends Class<?>> signature) {
        Intrinsics.m32179h(signature, "signature");
        Object[] constructors = cls.getConstructors();
        Intrinsics.m32178g(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.m32178g(parameterTypes, "constructor.parameterTypes");
            List m31952b0 = ArraysKt.m31952b0(parameterTypes);
            if (Intrinsics.m32174c(signature, m31952b0)) {
                return constructor;
            }
            if (signature.size() == m31952b0.size() && m31952b0.containsAll(signature)) {
                StringBuilder m24u = C0000a.m24u("Class ");
                m24u.append(cls.getSimpleName());
                m24u.append(" must have parameters in the proper order: ");
                m24u.append(signature);
                throw new UnsupportedOperationException(m24u.toString());
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final <T extends ViewModel> T m3241b(@NotNull Class<T> cls, @NotNull Constructor<T> constructor, @NotNull Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
        }
    }
}
