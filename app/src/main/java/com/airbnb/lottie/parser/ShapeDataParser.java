package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeDataParser implements ValueParser<ShapeData> {

    /* renamed from: a */
    public static final ShapeDataParser f7765a = new ShapeDataParser();

    /* renamed from: b */
    public static final JsonReader.Options f7766b = JsonReader.Options.m4804a("c", "v", "i", "o");

    @Override // com.airbnb.lottie.parser.ValueParser
    /* renamed from: a */
    public ShapeData mo4775a(JsonReader jsonReader, float f2) throws IOException {
        if (jsonReader.mo4797n() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo4787a();
        }
        jsonReader.mo4788b();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.mo4791g()) {
            int mo4799p = jsonReader.mo4799p(f7766b);
            if (mo4799p == 0) {
                z = jsonReader.mo4792h();
            } else if (mo4799p == 1) {
                list = JsonUtils.m4779c(jsonReader, f2);
            } else if (mo4799p == 2) {
                list2 = JsonUtils.m4779c(jsonReader, f2);
            } else if (mo4799p != 3) {
                jsonReader.mo4800q();
                jsonReader.mo4802u();
            } else {
                list3 = JsonUtils.m4779c(jsonReader, f2);
            }
        }
        jsonReader.mo4790e();
        if (jsonReader.mo4797n() == JsonReader.Token.END_ARRAY) {
            jsonReader.mo4789c();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new ShapeData(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 1; i2 < size; i2++) {
            PointF pointF2 = list.get(i2);
            int i3 = i2 - 1;
            arrayList.add(new CubicCurveData(MiscUtils.m4844a(list.get(i3), list3.get(i3)), MiscUtils.m4844a(pointF2, list2.get(i2)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i4 = size - 1;
            arrayList.add(new CubicCurveData(MiscUtils.m4844a(list.get(i4), list3.get(i4)), MiscUtils.m4844a(pointF3, list2.get(0)), pointF3));
        }
        return new ShapeData(pointF, z, arrayList);
    }
}
