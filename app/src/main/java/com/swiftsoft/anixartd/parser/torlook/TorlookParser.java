package com.swiftsoft.anixartd.parser.torlook;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TorlookParser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/torlook/TorlookParser;", "", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TorlookParser {

    /* compiled from: TorlookParser.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/parser/torlook/TorlookParser$Companion;", "", "", "SORT_BY_DATE", "I", "SORT_BY_SEED", "SORT_BY_SIZE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final String m14186a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_PLAIN, Locale.ENGLISH);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy");
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.m32177f(parse, "null cannot be cast to non-null type java.util.Date");
            String format = simpleDateFormat2.format(parse);
            Intrinsics.m32178g(format, "targetFormat.format(date)");
            return format;
        } catch (Exception unused) {
            return str;
        }
    }
}
