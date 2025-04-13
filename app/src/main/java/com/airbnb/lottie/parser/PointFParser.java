package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class PointFParser implements ValueParser<PointF> {

    /* renamed from: a */
    public static final PointFParser f7760a = new PointFParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* renamed from: a */
    public PointF mo4775a(JsonReader jsonReader, float f2) throws IOException {
        JsonReader.Token mo4797n = jsonReader.mo4797n();
        if (mo4797n == JsonReader.Token.BEGIN_ARRAY) {
            return JsonUtils.m4778b(jsonReader, f2);
        }
        if (mo4797n == JsonReader.Token.BEGIN_OBJECT) {
            return JsonUtils.m4778b(jsonReader, f2);
        }
        if (mo4797n == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.mo4793i()) * f2, ((float) jsonReader.mo4793i()) * f2);
            while (jsonReader.mo4791g()) {
                jsonReader.mo4802u();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + mo4797n);
    }
}
