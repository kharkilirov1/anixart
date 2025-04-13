package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "window_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SafeWindowLayoutComponentProvider {

    /* renamed from: a */
    @NotNull
    public static final SafeWindowLayoutComponentProvider f6753a = new SafeWindowLayoutComponentProvider();

    /* renamed from: b */
    @NotNull
    public static final Lazy f6754b = LazyKt.m31881b(new Function0<WindowLayoutComponent>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$windowLayoutComponent$2
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent invoke() {
            final ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
            if (classLoader != null) {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.f6753a;
                boolean z = false;
                if (Build.VERSION.SDK_INT >= 24 && safeWindowLayoutComponentProvider.m4444c(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Boolean invoke() {
                        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.f6753a;
                        boolean z2 = false;
                        Method getWindowExtensionsMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", new Class[0]);
                        Class<?> windowExtensionsClass = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                        Intrinsics.m32178g(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                        Intrinsics.m32178g(windowExtensionsClass, "windowExtensionsClass");
                        if (getWindowExtensionsMethod.getReturnType().equals(windowExtensionsClass) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }) && safeWindowLayoutComponentProvider.m4444c(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Boolean invoke() {
                        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.f6753a;
                        boolean z2 = false;
                        Method getWindowLayoutComponentMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", new Class[0]);
                        Class<?> windowLayoutComponentClass = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                        Intrinsics.m32178g(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                        if (Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers())) {
                            Intrinsics.m32178g(windowLayoutComponentClass, "windowLayoutComponentClass");
                            if (getWindowLayoutComponentMethod.getReturnType().equals(windowLayoutComponentClass)) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    }
                }) && safeWindowLayoutComponentProvider.m4444c(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Boolean invoke() {
                        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.f6753a;
                        Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                        boolean z2 = false;
                        Method addListenerMethod = loadClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
                        Method removeListenerMethod = loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                        Intrinsics.m32178g(addListenerMethod, "addListenerMethod");
                        if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                            Intrinsics.m32178g(removeListenerMethod, "removeListenerMethod");
                            if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                                z2 = true;
                            }
                        }
                        return Boolean.valueOf(z2);
                    }
                }) && safeWindowLayoutComponentProvider.m4444c(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Boolean invoke() {
                        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.f6753a;
                        Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
                        boolean z2 = false;
                        Method getBoundsMethod = loadClass.getMethod("getBounds", new Class[0]);
                        Method getTypeMethod = loadClass.getMethod("getType", new Class[0]);
                        Method getStateMethod = loadClass.getMethod("getState", new Class[0]);
                        Intrinsics.m32178g(getBoundsMethod, "getBoundsMethod");
                        if (SafeWindowLayoutComponentProvider.m4442a(safeWindowLayoutComponentProvider2, getBoundsMethod, Reflection.m32193a(Rect.class)) && Modifier.isPublic(getBoundsMethod.getModifiers())) {
                            Intrinsics.m32178g(getTypeMethod, "getTypeMethod");
                            Class cls = Integer.TYPE;
                            if (SafeWindowLayoutComponentProvider.m4442a(safeWindowLayoutComponentProvider2, getTypeMethod, Reflection.m32193a(cls)) && Modifier.isPublic(getTypeMethod.getModifiers())) {
                                Intrinsics.m32178g(getStateMethod, "getStateMethod");
                                if (SafeWindowLayoutComponentProvider.m4442a(safeWindowLayoutComponentProvider2, getStateMethod, Reflection.m32193a(cls)) && Modifier.isPublic(getStateMethod.getModifiers())) {
                                    z2 = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z2);
                    }
                })) {
                    z = true;
                }
                if (z) {
                    try {
                        return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                    } catch (UnsupportedOperationException unused) {
                        return null;
                    }
                }
            }
            return null;
        }
    });

    /* renamed from: a */
    public static final boolean m4442a(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, Method method, KClass kClass) {
        return method.getReturnType().equals(JvmClassMappingKt.m32147b(kClass));
    }

    @Nullable
    /* renamed from: b */
    public final WindowLayoutComponent m4443b() {
        return (WindowLayoutComponent) f6754b.getValue();
    }

    /* renamed from: c */
    public final boolean m4444c(Function0<Boolean> function0) {
        try {
            return function0.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
