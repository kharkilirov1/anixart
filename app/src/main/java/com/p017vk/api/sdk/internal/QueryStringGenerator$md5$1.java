package com.p017vk.api.sdk.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: QueryStringGenerator.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "it", "", "invoke"}, m31885k = 3, m31886mv = {1, 1, 16})
/* loaded from: classes2.dex */
final class QueryStringGenerator$md5$1 extends Lambda implements Function1<Byte, String> {

    /* renamed from: b */
    public static final QueryStringGenerator$md5$1 f30706b = new QueryStringGenerator$md5$1();

    public QueryStringGenerator$md5$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public String invoke(Byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b.byteValue())}, 1));
        Intrinsics.m32175d(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
