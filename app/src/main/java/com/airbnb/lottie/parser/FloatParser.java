package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class FloatParser implements ValueParser<Float> {

    /* renamed from: a */
    public static final FloatParser f7734a = new FloatParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* renamed from: a */
    public Float mo4775a(JsonReader jsonReader, float f2) throws IOException {
        return Float.valueOf(JsonUtils.m4780d(jsonReader) * f2);
    }
}
