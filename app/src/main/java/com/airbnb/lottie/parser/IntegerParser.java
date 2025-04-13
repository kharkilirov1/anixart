package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class IntegerParser implements ValueParser<Integer> {

    /* renamed from: a */
    public static final IntegerParser f7744a = new IntegerParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* renamed from: a */
    public Integer mo4775a(JsonReader jsonReader, float f2) throws IOException {
        return Integer.valueOf(Math.round(JsonUtils.m4780d(jsonReader) * f2));
    }
}
