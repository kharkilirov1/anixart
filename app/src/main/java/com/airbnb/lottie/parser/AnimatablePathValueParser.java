package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AnimatablePathValueParser {

    /* renamed from: a */
    public static JsonReader.Options f7724a = JsonReader.Options.m4804a("k", "x", "y");

    /* renamed from: a */
    public static AnimatablePathValue m4766a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo4797n() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo4787a();
            while (jsonReader.mo4791g()) {
                arrayList.add(new PathKeyframe(lottieComposition, KeyframeParser.m4781a(jsonReader, lottieComposition, Utils.m4853c(), PathParser.f7759a, jsonReader.mo4797n() == JsonReader.Token.BEGIN_OBJECT)));
            }
            jsonReader.mo4789c();
            KeyframesParser.m4783b(arrayList);
        } else {
            arrayList.add(new Keyframe(JsonUtils.m4778b(jsonReader, Utils.m4853c())));
        }
        return new AnimatablePathValue(arrayList);
    }

    /* renamed from: b */
    public static AnimatableValue<PointF, PointF> m4767b(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        JsonReader.Token token = JsonReader.Token.STRING;
        jsonReader.mo4788b();
        AnimatablePathValue animatablePathValue = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        boolean z = false;
        while (jsonReader.mo4797n() != JsonReader.Token.END_OBJECT) {
            int mo4799p = jsonReader.mo4799p(f7724a);
            if (mo4799p == 0) {
                animatablePathValue = m4766a(jsonReader, lottieComposition);
            } else if (mo4799p != 1) {
                if (mo4799p != 2) {
                    jsonReader.mo4800q();
                    jsonReader.mo4802u();
                } else if (jsonReader.mo4797n() == token) {
                    jsonReader.mo4802u();
                    z = true;
                } else {
                    animatableFloatValue2 = AnimatableValueParser.m4771c(jsonReader, lottieComposition);
                }
            } else if (jsonReader.mo4797n() == token) {
                jsonReader.mo4802u();
                z = true;
            } else {
                animatableFloatValue = AnimatableValueParser.m4771c(jsonReader, lottieComposition);
            }
        }
        jsonReader.mo4790e();
        if (z) {
            lottieComposition.m4646a("Lottie doesn't support expressions.");
        }
        return animatablePathValue != null ? animatablePathValue : new AnimatableSplitDimensionPathValue(animatableFloatValue, animatableFloatValue2);
    }
}
