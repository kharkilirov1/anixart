package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class PathParser implements ValueParser<PointF> {

    /* renamed from: a */
    public static final PathParser f7759a = new PathParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* renamed from: a */
    public PointF mo4775a(JsonReader jsonReader, float f2) throws IOException {
        return JsonUtils.m4778b(jsonReader, f2);
    }
}
