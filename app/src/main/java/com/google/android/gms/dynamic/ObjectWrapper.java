package com.google.android.gms.dynamic;

import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@RetainForClient
@KeepForSdk
/* loaded from: classes.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {

    /* renamed from: a */
    public final T f15954a;

    public ObjectWrapper(T t) {
        this.f15954a = t;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: t */
    public static <T> T m8284t(@NonNull IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).f15954a;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 != 1) {
            throw new IllegalArgumentException(C0576a.m4111j(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        Objects.requireNonNull(field, "null reference");
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException("Binder object is null.", e3);
        }
    }
}
