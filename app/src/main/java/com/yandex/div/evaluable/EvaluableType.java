package com.yandex.div.evaluable;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EvaluableType.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div/evaluable/EvaluableType;", "", "Companion", "INTEGER", "NUMBER", "BOOLEAN", "STRING", "DATETIME", "COLOR", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum EvaluableType {
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean"),
    STRING("String"),
    DATETIME("DateTime"),
    COLOR("Color");


    /* renamed from: b */
    @NotNull
    public final String f33162b;

    /* compiled from: EvaluableType.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/EvaluableType$Companion;", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    EvaluableType(String str) {
        this.f33162b = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f33162b;
    }
}
