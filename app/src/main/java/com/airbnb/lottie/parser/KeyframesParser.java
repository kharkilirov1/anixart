package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class KeyframesParser {

    /* renamed from: a */
    public static JsonReader.Options f7750a = JsonReader.Options.m4804a("k");

    /* renamed from: a */
    public static <T> List<Keyframe<T>> m4782a(JsonReader jsonReader, LottieComposition lottieComposition, float f2, ValueParser<T> valueParser) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo4797n() == JsonReader.Token.STRING) {
            lottieComposition.m4646a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.mo4788b();
        while (jsonReader.mo4791g()) {
            if (jsonReader.mo4799p(f7750a) != 0) {
                jsonReader.mo4802u();
            } else if (jsonReader.mo4797n() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.mo4787a();
                if (jsonReader.mo4797n() == JsonReader.Token.NUMBER) {
                    arrayList.add(KeyframeParser.m4781a(jsonReader, lottieComposition, f2, valueParser, false));
                } else {
                    while (jsonReader.mo4791g()) {
                        arrayList.add(KeyframeParser.m4781a(jsonReader, lottieComposition, f2, valueParser, true));
                    }
                }
                jsonReader.mo4789c();
            } else {
                arrayList.add(KeyframeParser.m4781a(jsonReader, lottieComposition, f2, valueParser, false));
            }
        }
        jsonReader.mo4790e();
        m4783b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m4783b(List<? extends Keyframe<T>> list) {
        int i2;
        T t;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            Keyframe<T> keyframe = list.get(i3);
            i3++;
            Keyframe<T> keyframe2 = list.get(i3);
            keyframe.f7858f = Float.valueOf(keyframe2.f7857e);
            if (keyframe.f7855c == null && (t = keyframe2.f7854b) != null) {
                keyframe.f7855c = t;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).m4721e();
                }
            }
        }
        Keyframe<T> keyframe3 = list.get(i2);
        if ((keyframe3.f7854b == null || keyframe3.f7855c == null) && list.size() > 1) {
            list.remove(keyframe3);
        }
    }
}
