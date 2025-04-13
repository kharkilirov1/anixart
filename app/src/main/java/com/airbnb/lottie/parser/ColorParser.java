package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class ColorParser implements ValueParser<Integer> {

    /* renamed from: a */
    public static final ColorParser f7730a = new ColorParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* renamed from: a */
    public Integer mo4775a(JsonReader jsonReader, float f2) throws IOException {
        boolean z = jsonReader.mo4797n() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.mo4787a();
        }
        double mo4793i = jsonReader.mo4793i();
        double mo4793i2 = jsonReader.mo4793i();
        double mo4793i3 = jsonReader.mo4793i();
        double mo4793i4 = jsonReader.mo4793i();
        if (z) {
            jsonReader.mo4789c();
        }
        if (mo4793i <= 1.0d && mo4793i2 <= 1.0d && mo4793i3 <= 1.0d && mo4793i4 <= 1.0d) {
            mo4793i *= 255.0d;
            mo4793i2 *= 255.0d;
            mo4793i3 *= 255.0d;
            mo4793i4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) mo4793i4, (int) mo4793i, (int) mo4793i2, (int) mo4793i3));
    }
}
