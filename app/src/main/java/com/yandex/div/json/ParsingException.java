package com.yandex.div.json;

import com.yandex.div.internal.util.JsonNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ParsingException.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/json/ParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class ParsingException extends RuntimeException {

    /* renamed from: b */
    @NotNull
    public final ParsingExceptionReason f34318b;

    /* renamed from: c */
    @Nullable
    public final JsonNode f34319c;

    /* renamed from: d */
    @Nullable
    public final String f34320d;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th, JsonNode jsonNode, String str2, int i2) {
        this(parsingExceptionReason, str, (i2 & 4) != 0 ? null : th, (i2 & 8) != 0 ? null : jsonNode, (i2 & 16) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParsingException(@NotNull ParsingExceptionReason reason, @NotNull String message, @Nullable Throwable th, @Nullable JsonNode jsonNode, @Nullable String str) {
        super(message, th);
        Intrinsics.m32179h(reason, "reason");
        Intrinsics.m32179h(message, "message");
        this.f34318b = reason;
        this.f34319c = jsonNode;
        this.f34320d = str;
    }
}
