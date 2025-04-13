package com.yandex.metrica.push.common.utils;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface ConsumerWithThrowable<T> {
    void consume(@NonNull T t) throws Throwable;
}
