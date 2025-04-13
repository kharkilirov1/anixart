package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.firebase.components.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2061b implements Provider {

    /* renamed from: a */
    public final /* synthetic */ int f22524a;

    /* renamed from: b */
    public final /* synthetic */ Object f22525b;

    public /* synthetic */ C2061b(Object obj, int i2) {
        this.f22524a = i2;
        this.f22525b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f22524a) {
            case 0:
                String str = (String) this.f22525b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
                    return null;
                } catch (IllegalAccessException e2) {
                    throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
                } catch (InstantiationException e3) {
                    throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e3);
                } catch (NoSuchMethodException e4) {
                    throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
                } catch (InvocationTargetException e5) {
                    throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e5);
                }
            default:
                return (ComponentRegistrar) this.f22525b;
        }
    }
}
