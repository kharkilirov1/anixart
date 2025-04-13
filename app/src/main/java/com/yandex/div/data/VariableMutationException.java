package com.yandex.div.data;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: VariableMutationException.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/data/VariableMutationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class VariableMutationException extends RuntimeException {
    public VariableMutationException() {
        this(null, null, 3);
    }

    public VariableMutationException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public VariableMutationException(String str, Throwable th, int i2) {
        super((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : th);
    }
}
