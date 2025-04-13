package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.ScaleXY;
import java.io.IOException;

/* loaded from: classes.dex */
public class ScaleXYParser implements ValueParser<ScaleXY> {

    /* renamed from: a */
    public static final ScaleXYParser f7764a = new ScaleXYParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* renamed from: a */
    public ScaleXY mo4775a(JsonReader jsonReader, float f2) throws IOException {
        boolean z = jsonReader.mo4797n() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.mo4787a();
        }
        float mo4793i = (float) jsonReader.mo4793i();
        float mo4793i2 = (float) jsonReader.mo4793i();
        while (jsonReader.mo4791g()) {
            jsonReader.mo4802u();
        }
        if (z) {
            jsonReader.mo4789c();
        }
        return new ScaleXY((mo4793i / 100.0f) * f2, (mo4793i2 / 100.0f) * f2);
    }
}
