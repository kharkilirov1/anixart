package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import p000a.C0000a;

/* loaded from: classes.dex */
public class FragmentFactory {

    /* renamed from: a */
    public static final SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> f4310a = new SimpleArrayMap<>();

    @NonNull
    /* renamed from: b */
    public static Class<?> m2975b(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> simpleArrayMap = f4310a;
        SimpleArrayMap<String, Class<?>> orDefault = simpleArrayMap.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new SimpleArrayMap<>();
            simpleArrayMap.put(classLoader, orDefault);
        }
        Class<?> cls = orDefault.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    @NonNull
    /* renamed from: c */
    public static Class<? extends Fragment> m2976c(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return m2975b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new Fragment.InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new Fragment.InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    @NonNull
    /* renamed from: a */
    public Fragment mo2977a(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return m2976c(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new Fragment.InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new Fragment.InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new Fragment.InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new Fragment.InstantiationException(C0000a.m16m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
