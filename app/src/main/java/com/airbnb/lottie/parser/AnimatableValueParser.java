package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class AnimatableValueParser {
    @Nullable
    /* renamed from: a */
    public static <T> List<Keyframe<T>> m4769a(JsonReader jsonReader, LottieComposition lottieComposition, ValueParser<T> valueParser) throws IOException {
        return KeyframesParser.m4782a(jsonReader, lottieComposition, 1.0f, valueParser);
    }

    /* renamed from: b */
    public static AnimatableColorValue m4770b(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new AnimatableColorValue(m4769a(jsonReader, lottieComposition, ColorParser.f7730a));
    }

    /* renamed from: c */
    public static AnimatableFloatValue m4771c(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return m4772d(jsonReader, lottieComposition, true);
    }

    /* renamed from: d */
    public static AnimatableFloatValue m4772d(JsonReader jsonReader, LottieComposition lottieComposition, boolean z) throws IOException {
        return new AnimatableFloatValue(KeyframesParser.m4782a(jsonReader, lottieComposition, z ? Utils.m4853c() : 1.0f, FloatParser.f7734a));
    }

    /* renamed from: e */
    public static AnimatableIntegerValue m4773e(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new AnimatableIntegerValue(m4769a(jsonReader, lottieComposition, IntegerParser.f7744a));
    }

    /* renamed from: f */
    public static AnimatablePointValue m4774f(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return new AnimatablePointValue(KeyframesParser.m4782a(jsonReader, lottieComposition, Utils.m4853c(), PointFParser.f7760a));
    }
}
