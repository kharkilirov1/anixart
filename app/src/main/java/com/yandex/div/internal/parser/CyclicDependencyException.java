package com.yandex.div.internal.parser;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonTopologicalSorting.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/parser/CyclicDependencyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CyclicDependencyException extends Exception {
    public CyclicDependencyException(@NotNull String str) {
        super(str);
    }
}
