package com.airbnb.lottie.parser;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.CircleShape;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.GradientFill;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
class ContentModelParser {

    /* renamed from: a */
    public static JsonReader.Options f7731a = JsonReader.Options.m4804a("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    /* renamed from: a */
    public static ContentModel m4776a(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        String str;
        char c2;
        ContentModel circleShape;
        char c3;
        ShapeTrimPath.Type type;
        GradientType gradientType = GradientType.LINEAR;
        GradientType gradientType2 = GradientType.RADIAL;
        jsonReader.mo4788b();
        int i2 = 2;
        while (true) {
            if (!jsonReader.mo4791g()) {
                str = null;
                break;
            }
            int mo4799p = jsonReader.mo4799p(f7731a);
            if (mo4799p == 0) {
                str = jsonReader.mo4796l();
                break;
            }
            if (mo4799p != 1) {
                jsonReader.mo4800q();
                jsonReader.mo4802u();
            } else {
                i2 = jsonReader.mo4794j();
            }
        }
        if (str == null) {
            return null;
        }
        boolean z = false;
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3295:
                if (str.equals("gf")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3307:
                if (str.equals("gr")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                JsonReader.Options options = CircleShapeParser.f7729a;
                boolean z2 = i2 == 3;
                String str2 = null;
                AnimatableValue<PointF, PointF> animatableValue = null;
                AnimatablePointValue animatablePointValue = null;
                boolean z3 = false;
                while (jsonReader.mo4791g()) {
                    int mo4799p2 = jsonReader.mo4799p(CircleShapeParser.f7729a);
                    if (mo4799p2 == 0) {
                        str2 = jsonReader.mo4796l();
                    } else if (mo4799p2 == 1) {
                        animatableValue = AnimatablePathValueParser.m4767b(jsonReader, lottieComposition);
                    } else if (mo4799p2 == 2) {
                        animatablePointValue = AnimatableValueParser.m4774f(jsonReader, lottieComposition);
                    } else if (mo4799p2 == 3) {
                        z3 = jsonReader.mo4792h();
                    } else if (mo4799p2 != 4) {
                        jsonReader.mo4800q();
                        jsonReader.mo4802u();
                    } else {
                        z2 = jsonReader.mo4794j() == 3;
                    }
                }
                circleShape = new CircleShape(str2, animatableValue, animatablePointValue, z2, z3);
                break;
            case 1:
                JsonReader.Options options2 = ShapeFillParser.f7767a;
                int i3 = 1;
                String str3 = null;
                AnimatableColorValue animatableColorValue = null;
                AnimatableIntegerValue animatableIntegerValue = null;
                boolean z4 = false;
                boolean z5 = false;
                while (jsonReader.mo4791g()) {
                    int mo4799p3 = jsonReader.mo4799p(ShapeFillParser.f7767a);
                    if (mo4799p3 == 0) {
                        str3 = jsonReader.mo4796l();
                    } else if (mo4799p3 == 1) {
                        animatableColorValue = AnimatableValueParser.m4770b(jsonReader, lottieComposition);
                    } else if (mo4799p3 == 2) {
                        animatableIntegerValue = AnimatableValueParser.m4773e(jsonReader, lottieComposition);
                    } else if (mo4799p3 == 3) {
                        z4 = jsonReader.mo4792h();
                    } else if (mo4799p3 == 4) {
                        i3 = jsonReader.mo4794j();
                    } else if (mo4799p3 != 5) {
                        jsonReader.mo4800q();
                        jsonReader.mo4802u();
                    } else {
                        z5 = jsonReader.mo4792h();
                    }
                }
                circleShape = new ShapeFill(str3, z4, i3 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, animatableColorValue, animatableIntegerValue, z5);
                break;
            case 2:
                JsonReader.Options options3 = GradientFillParser.f7739a;
                Path.FillType fillType = Path.FillType.WINDING;
                String str4 = null;
                GradientType gradientType3 = null;
                AnimatableGradientColorValue animatableGradientColorValue = null;
                AnimatableIntegerValue animatableIntegerValue2 = null;
                AnimatablePointValue animatablePointValue2 = null;
                AnimatablePointValue animatablePointValue3 = null;
                boolean z6 = false;
                while (jsonReader.mo4791g()) {
                    switch (jsonReader.mo4799p(GradientFillParser.f7739a)) {
                        case 0:
                            str4 = jsonReader.mo4796l();
                            break;
                        case 1:
                            jsonReader.mo4788b();
                            int i4 = -1;
                            while (jsonReader.mo4791g()) {
                                int mo4799p4 = jsonReader.mo4799p(GradientFillParser.f7740b);
                                if (mo4799p4 == 0) {
                                    i4 = jsonReader.mo4794j();
                                } else if (mo4799p4 != 1) {
                                    jsonReader.mo4800q();
                                    jsonReader.mo4802u();
                                } else {
                                    animatableGradientColorValue = new AnimatableGradientColorValue(AnimatableValueParser.m4769a(jsonReader, lottieComposition, new GradientColorParser(i4)));
                                }
                            }
                            jsonReader.mo4790e();
                            break;
                        case 2:
                            animatableIntegerValue2 = AnimatableValueParser.m4773e(jsonReader, lottieComposition);
                            break;
                        case 3:
                            if (jsonReader.mo4794j() != 1) {
                                gradientType3 = gradientType2;
                                break;
                            } else {
                                gradientType3 = gradientType;
                                break;
                            }
                        case 4:
                            animatablePointValue2 = AnimatableValueParser.m4774f(jsonReader, lottieComposition);
                            break;
                        case 5:
                            animatablePointValue3 = AnimatableValueParser.m4774f(jsonReader, lottieComposition);
                            break;
                        case 6:
                            fillType = jsonReader.mo4794j() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            z6 = jsonReader.mo4792h();
                            break;
                        default:
                            jsonReader.mo4800q();
                            jsonReader.mo4802u();
                            break;
                    }
                }
                circleShape = new GradientFill(str4, gradientType3, fillType, animatableGradientColorValue, animatableIntegerValue2, animatablePointValue2, animatablePointValue3, null, null, z6);
                break;
            case 3:
                JsonReader.Options options4 = ShapeGroupParser.f7768a;
                ArrayList arrayList = new ArrayList();
                String str5 = null;
                boolean z7 = false;
                while (jsonReader.mo4791g()) {
                    int mo4799p5 = jsonReader.mo4799p(ShapeGroupParser.f7768a);
                    if (mo4799p5 == 0) {
                        str5 = jsonReader.mo4796l();
                    } else if (mo4799p5 == 1) {
                        z7 = jsonReader.mo4792h();
                    } else if (mo4799p5 != 2) {
                        jsonReader.mo4802u();
                    } else {
                        jsonReader.mo4787a();
                        while (jsonReader.mo4791g()) {
                            ContentModel m4776a = m4776a(jsonReader, lottieComposition);
                            if (m4776a != null) {
                                arrayList.add(m4776a);
                            }
                        }
                        jsonReader.mo4789c();
                    }
                }
                circleShape = new ShapeGroup(str5, arrayList, z7);
                break;
            case 4:
                JsonReader.Options options5 = GradientStrokeParser.f7741a;
                ArrayList arrayList2 = new ArrayList();
                GradientType gradientType4 = null;
                AnimatableIntegerValue animatableIntegerValue3 = null;
                AnimatablePointValue animatablePointValue4 = null;
                AnimatablePointValue animatablePointValue5 = null;
                AnimatableFloatValue animatableFloatValue = null;
                ShapeStroke.LineCapType lineCapType = null;
                ShapeStroke.LineJoinType lineJoinType = null;
                AnimatableFloatValue animatableFloatValue2 = null;
                float f2 = 0.0f;
                boolean z8 = false;
                String str6 = null;
                AnimatableGradientColorValue animatableGradientColorValue2 = null;
                while (jsonReader.mo4791g()) {
                    switch (jsonReader.mo4799p(GradientStrokeParser.f7741a)) {
                        case 0:
                            str6 = jsonReader.mo4796l();
                            break;
                        case 1:
                            jsonReader.mo4788b();
                            int i5 = -1;
                            while (jsonReader.mo4791g()) {
                                int mo4799p6 = jsonReader.mo4799p(GradientStrokeParser.f7742b);
                                if (mo4799p6 == 0) {
                                    i5 = jsonReader.mo4794j();
                                } else if (mo4799p6 != 1) {
                                    jsonReader.mo4800q();
                                    jsonReader.mo4802u();
                                } else {
                                    animatableGradientColorValue2 = new AnimatableGradientColorValue(AnimatableValueParser.m4769a(jsonReader, lottieComposition, new GradientColorParser(i5)));
                                }
                            }
                            jsonReader.mo4790e();
                            break;
                        case 2:
                            animatableIntegerValue3 = AnimatableValueParser.m4773e(jsonReader, lottieComposition);
                            break;
                        case 3:
                            if (jsonReader.mo4794j() != 1) {
                                gradientType4 = gradientType2;
                                break;
                            } else {
                                gradientType4 = gradientType;
                                break;
                            }
                        case 4:
                            animatablePointValue4 = AnimatableValueParser.m4774f(jsonReader, lottieComposition);
                            break;
                        case 5:
                            animatablePointValue5 = AnimatableValueParser.m4774f(jsonReader, lottieComposition);
                            break;
                        case 6:
                            animatableFloatValue = AnimatableValueParser.m4771c(jsonReader, lottieComposition);
                            break;
                        case 7:
                            lineCapType = ShapeStroke.LineCapType.values()[jsonReader.mo4794j() - 1];
                            break;
                        case 8:
                            lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.mo4794j() - 1];
                            break;
                        case 9:
                            f2 = (float) jsonReader.mo4793i();
                            break;
                        case 10:
                            z8 = jsonReader.mo4792h();
                            break;
                        case 11:
                            jsonReader.mo4787a();
                            while (jsonReader.mo4791g()) {
                                jsonReader.mo4788b();
                                AnimatableFloatValue animatableFloatValue3 = null;
                                String str7 = null;
                                while (jsonReader.mo4791g()) {
                                    int mo4799p7 = jsonReader.mo4799p(GradientStrokeParser.f7743c);
                                    if (mo4799p7 == 0) {
                                        str7 = jsonReader.mo4796l();
                                    } else if (mo4799p7 != 1) {
                                        jsonReader.mo4800q();
                                        jsonReader.mo4802u();
                                    } else {
                                        animatableFloatValue3 = AnimatableValueParser.m4771c(jsonReader, lottieComposition);
                                    }
                                }
                                jsonReader.mo4790e();
                                if (str7.equals("o")) {
                                    animatableFloatValue2 = animatableFloatValue3;
                                } else if (str7.equals("d") || str7.equals("g")) {
                                    lottieComposition.f7152n = true;
                                    arrayList2.add(animatableFloatValue3);
                                }
                            }
                            jsonReader.mo4789c();
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                arrayList2.add(arrayList2.get(0));
                                break;
                            }
                        default:
                            jsonReader.mo4800q();
                            jsonReader.mo4802u();
                            break;
                    }
                }
                circleShape = new GradientStroke(str6, gradientType4, animatableGradientColorValue2, animatableIntegerValue3, animatablePointValue4, animatablePointValue5, animatableFloatValue, lineCapType, lineJoinType, f2, arrayList2, animatableFloatValue2, z8);
                break;
            case 5:
                JsonReader.Options options6 = MergePathsParser.f7758a;
                MergePaths.MergePathsMode mergePathsMode = null;
                String str8 = null;
                boolean z9 = false;
                while (jsonReader.mo4791g()) {
                    int mo4799p8 = jsonReader.mo4799p(MergePathsParser.f7758a);
                    if (mo4799p8 == 0) {
                        str8 = jsonReader.mo4796l();
                    } else if (mo4799p8 == 1) {
                        int mo4794j = jsonReader.mo4794j();
                        MergePaths.MergePathsMode mergePathsMode2 = MergePaths.MergePathsMode.MERGE;
                        if (mo4794j != 1) {
                            if (mo4794j == 2) {
                                mergePathsMode = MergePaths.MergePathsMode.ADD;
                            } else if (mo4794j == 3) {
                                mergePathsMode = MergePaths.MergePathsMode.SUBTRACT;
                            } else if (mo4794j == 4) {
                                mergePathsMode = MergePaths.MergePathsMode.INTERSECT;
                            } else if (mo4794j == 5) {
                                mergePathsMode = MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS;
                            }
                        }
                        mergePathsMode = mergePathsMode2;
                    } else if (mo4799p8 != 2) {
                        jsonReader.mo4800q();
                        jsonReader.mo4802u();
                    } else {
                        z9 = jsonReader.mo4792h();
                    }
                }
                MergePaths mergePaths = new MergePaths(str8, mergePathsMode, z9);
                lottieComposition.m4646a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                circleShape = mergePaths;
                break;
            case 6:
                JsonReader.Options options7 = RectangleShapeParser.f7762a;
                String str9 = null;
                AnimatableValue<PointF, PointF> animatableValue2 = null;
                AnimatablePointValue animatablePointValue6 = null;
                AnimatableFloatValue animatableFloatValue4 = null;
                boolean z10 = false;
                while (jsonReader.mo4791g()) {
                    int mo4799p9 = jsonReader.mo4799p(RectangleShapeParser.f7762a);
                    if (mo4799p9 == 0) {
                        str9 = jsonReader.mo4796l();
                    } else if (mo4799p9 == 1) {
                        animatableValue2 = AnimatablePathValueParser.m4767b(jsonReader, lottieComposition);
                    } else if (mo4799p9 == 2) {
                        animatablePointValue6 = AnimatableValueParser.m4774f(jsonReader, lottieComposition);
                    } else if (mo4799p9 == 3) {
                        animatableFloatValue4 = AnimatableValueParser.m4771c(jsonReader, lottieComposition);
                    } else if (mo4799p9 != 4) {
                        jsonReader.mo4802u();
                    } else {
                        z10 = jsonReader.mo4792h();
                    }
                }
                circleShape = new RectangleShape(str9, animatableValue2, animatablePointValue6, animatableFloatValue4, z10);
                break;
            case 7:
                JsonReader.Options options8 = RepeaterParser.f7763a;
                String str10 = null;
                AnimatableFloatValue animatableFloatValue5 = null;
                AnimatableFloatValue animatableFloatValue6 = null;
                AnimatableTransform animatableTransform = null;
                boolean z11 = false;
                while (jsonReader.mo4791g()) {
                    int mo4799p10 = jsonReader.mo4799p(RepeaterParser.f7763a);
                    if (mo4799p10 == 0) {
                        str10 = jsonReader.mo4796l();
                    } else if (mo4799p10 == 1) {
                        animatableFloatValue5 = AnimatableValueParser.m4772d(jsonReader, lottieComposition, false);
                    } else if (mo4799p10 == 2) {
                        animatableFloatValue6 = AnimatableValueParser.m4772d(jsonReader, lottieComposition, false);
                    } else if (mo4799p10 == 3) {
                        animatableTransform = AnimatableTransformParser.m4768a(jsonReader, lottieComposition);
                    } else if (mo4799p10 != 4) {
                        jsonReader.mo4802u();
                    } else {
                        z11 = jsonReader.mo4792h();
                    }
                }
                circleShape = new Repeater(str10, animatableFloatValue5, animatableFloatValue6, animatableTransform, z11);
                break;
            case '\b':
                JsonReader.Options options9 = ShapePathParser.f7769a;
                AnimatableShapeValue animatableShapeValue = null;
                boolean z12 = false;
                String str11 = null;
                int i6 = 0;
                while (jsonReader.mo4791g()) {
                    int mo4799p11 = jsonReader.mo4799p(ShapePathParser.f7769a);
                    if (mo4799p11 == 0) {
                        str11 = jsonReader.mo4796l();
                    } else if (mo4799p11 == 1) {
                        i6 = jsonReader.mo4794j();
                    } else if (mo4799p11 == 2) {
                        animatableShapeValue = new AnimatableShapeValue(KeyframesParser.m4782a(jsonReader, lottieComposition, Utils.m4853c(), ShapeDataParser.f7765a));
                    } else if (mo4799p11 != 3) {
                        jsonReader.mo4802u();
                    } else {
                        z12 = jsonReader.mo4792h();
                    }
                }
                circleShape = new ShapePath(str11, i6, animatableShapeValue, z12);
                break;
            case '\t':
                JsonReader.Options options10 = PolystarShapeParser.f7761a;
                String str12 = null;
                PolystarShape.Type type2 = null;
                AnimatableFloatValue animatableFloatValue7 = null;
                AnimatableValue<PointF, PointF> animatableValue3 = null;
                AnimatableFloatValue animatableFloatValue8 = null;
                AnimatableFloatValue animatableFloatValue9 = null;
                AnimatableFloatValue animatableFloatValue10 = null;
                AnimatableFloatValue animatableFloatValue11 = null;
                AnimatableFloatValue animatableFloatValue12 = null;
                boolean z13 = false;
                while (jsonReader.mo4791g()) {
                    switch (jsonReader.mo4799p(PolystarShapeParser.f7761a)) {
                        case 0:
                            str12 = jsonReader.mo4796l();
                            break;
                        case 1:
                            int mo4794j2 = jsonReader.mo4794j();
                            PolystarShape.Type[] values = PolystarShape.Type.values();
                            int length = values.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    type2 = null;
                                    break;
                                } else {
                                    PolystarShape.Type type3 = values[i7];
                                    if (type3.f7578b == mo4794j2) {
                                        type2 = type3;
                                        break;
                                    } else {
                                        i7++;
                                    }
                                }
                            }
                        case 2:
                            animatableFloatValue7 = AnimatableValueParser.m4772d(jsonReader, lottieComposition, z);
                            continue;
                        case 3:
                            animatableValue3 = AnimatablePathValueParser.m4767b(jsonReader, lottieComposition);
                            continue;
                        case 4:
                            animatableFloatValue8 = AnimatableValueParser.m4772d(jsonReader, lottieComposition, z);
                            continue;
                        case 5:
                            animatableFloatValue10 = AnimatableValueParser.m4771c(jsonReader, lottieComposition);
                            continue;
                        case 6:
                            animatableFloatValue12 = AnimatableValueParser.m4772d(jsonReader, lottieComposition, z);
                            continue;
                        case 7:
                            animatableFloatValue9 = AnimatableValueParser.m4771c(jsonReader, lottieComposition);
                            continue;
                        case 8:
                            animatableFloatValue11 = AnimatableValueParser.m4772d(jsonReader, lottieComposition, z);
                            continue;
                        case 9:
                            z13 = jsonReader.mo4792h();
                            continue;
                        default:
                            jsonReader.mo4800q();
                            jsonReader.mo4802u();
                            break;
                    }
                    z = false;
                }
                circleShape = new PolystarShape(str12, type2, animatableFloatValue7, animatableValue3, animatableFloatValue8, animatableFloatValue9, animatableFloatValue10, animatableFloatValue11, animatableFloatValue12, z13);
                break;
            case '\n':
                JsonReader.Options options11 = ShapeStrokeParser.f7770a;
                ArrayList arrayList3 = new ArrayList();
                String str13 = null;
                AnimatableFloatValue animatableFloatValue13 = null;
                AnimatableColorValue animatableColorValue2 = null;
                AnimatableIntegerValue animatableIntegerValue4 = null;
                AnimatableFloatValue animatableFloatValue14 = null;
                ShapeStroke.LineCapType lineCapType2 = null;
                ShapeStroke.LineJoinType lineJoinType2 = null;
                float f3 = 0.0f;
                boolean z14 = false;
                while (jsonReader.mo4791g()) {
                    switch (jsonReader.mo4799p(ShapeStrokeParser.f7770a)) {
                        case 0:
                            str13 = jsonReader.mo4796l();
                            break;
                        case 1:
                            animatableColorValue2 = AnimatableValueParser.m4770b(jsonReader, lottieComposition);
                            break;
                        case 2:
                            animatableFloatValue14 = AnimatableValueParser.m4771c(jsonReader, lottieComposition);
                            break;
                        case 3:
                            animatableIntegerValue4 = AnimatableValueParser.m4773e(jsonReader, lottieComposition);
                            break;
                        case 4:
                            lineCapType2 = ShapeStroke.LineCapType.values()[jsonReader.mo4794j() - 1];
                            break;
                        case 5:
                            lineJoinType2 = ShapeStroke.LineJoinType.values()[jsonReader.mo4794j() - 1];
                            break;
                        case 6:
                            f3 = (float) jsonReader.mo4793i();
                            break;
                        case 7:
                            z14 = jsonReader.mo4792h();
                            break;
                        case 8:
                            jsonReader.mo4787a();
                            while (jsonReader.mo4791g()) {
                                jsonReader.mo4788b();
                                AnimatableFloatValue animatableFloatValue15 = null;
                                String str14 = null;
                                while (jsonReader.mo4791g()) {
                                    int mo4799p12 = jsonReader.mo4799p(ShapeStrokeParser.f7771b);
                                    if (mo4799p12 == 0) {
                                        str14 = jsonReader.mo4796l();
                                    } else if (mo4799p12 != 1) {
                                        jsonReader.mo4800q();
                                        jsonReader.mo4802u();
                                    } else {
                                        animatableFloatValue15 = AnimatableValueParser.m4771c(jsonReader, lottieComposition);
                                    }
                                }
                                jsonReader.mo4790e();
                                Objects.requireNonNull(str14);
                                int hashCode = str14.hashCode();
                                if (hashCode == 100) {
                                    if (str14.equals("d")) {
                                        c3 = 0;
                                    }
                                    c3 = 65535;
                                } else if (hashCode != 103) {
                                    if (hashCode == 111 && str14.equals("o")) {
                                        c3 = 2;
                                    }
                                    c3 = 65535;
                                } else {
                                    if (str14.equals("g")) {
                                        c3 = 1;
                                    }
                                    c3 = 65535;
                                }
                                if (c3 == 0 || c3 == 1) {
                                    lottieComposition.f7152n = true;
                                    arrayList3.add(animatableFloatValue15);
                                } else if (c3 == 2) {
                                    animatableFloatValue13 = animatableFloatValue15;
                                }
                            }
                            jsonReader.mo4789c();
                            if (arrayList3.size() != 1) {
                                break;
                            } else {
                                arrayList3.add(arrayList3.get(0));
                                break;
                            }
                            break;
                        default:
                            jsonReader.mo4802u();
                            break;
                    }
                }
                circleShape = new ShapeStroke(str13, animatableFloatValue13, arrayList3, animatableColorValue2, animatableIntegerValue4, animatableFloatValue14, lineCapType2, lineJoinType2, f3, z14);
                break;
            case 11:
                JsonReader.Options options12 = ShapeTrimPathParser.f7772a;
                String str15 = null;
                ShapeTrimPath.Type type4 = null;
                AnimatableFloatValue animatableFloatValue16 = null;
                AnimatableFloatValue animatableFloatValue17 = null;
                AnimatableFloatValue animatableFloatValue18 = null;
                boolean z15 = false;
                while (jsonReader.mo4791g()) {
                    int mo4799p13 = jsonReader.mo4799p(ShapeTrimPathParser.f7772a);
                    if (mo4799p13 == 0) {
                        animatableFloatValue16 = AnimatableValueParser.m4772d(jsonReader, lottieComposition, false);
                    } else if (mo4799p13 == 1) {
                        animatableFloatValue17 = AnimatableValueParser.m4772d(jsonReader, lottieComposition, false);
                    } else if (mo4799p13 == 2) {
                        animatableFloatValue18 = AnimatableValueParser.m4772d(jsonReader, lottieComposition, false);
                    } else if (mo4799p13 == 3) {
                        str15 = jsonReader.mo4796l();
                    } else if (mo4799p13 == 4) {
                        int mo4794j3 = jsonReader.mo4794j();
                        if (mo4794j3 == 1) {
                            type = ShapeTrimPath.Type.SIMULTANEOUSLY;
                        } else {
                            if (mo4794j3 != 2) {
                                throw new IllegalArgumentException(C0000a.m7d("Unknown trim path type ", mo4794j3));
                            }
                            type = ShapeTrimPath.Type.INDIVIDUALLY;
                        }
                        type4 = type;
                    } else if (mo4799p13 != 5) {
                        jsonReader.mo4802u();
                    } else {
                        z15 = jsonReader.mo4792h();
                    }
                }
                circleShape = new ShapeTrimPath(str15, type4, animatableFloatValue16, animatableFloatValue17, animatableFloatValue18, z15);
                break;
            case '\f':
                circleShape = AnimatableTransformParser.m4768a(jsonReader, lottieComposition);
                break;
            default:
                Logger.m4833a("Unknown shape type " + str);
                circleShape = null;
                break;
        }
        while (jsonReader.mo4791g()) {
            jsonReader.mo4802u();
        }
        jsonReader.mo4790e();
        return circleShape;
    }
}
